package com.example.test.config;

import com.example.test.Test2.embedded.LocalGameSave;
import com.example.test.Test2.embedded.repo.LocalGameSaveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    @Autowired
    private final LocalGameSaveRepository localGameSaveRepository;

    @Autowired
    private final CustomIdGenerator customIdGenerator;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            LocalGameSave test = new LocalGameSave();
            localGameSaveRepository.store(customIdGenerator.generateGameSaveId(), test);
            System.out.println(localGameSaveRepository.retrieve(2L));
        };
    }
}
