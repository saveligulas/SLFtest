package com.example.test.Test2.game;

import com.example.test.Test2.User;
import com.example.test.Test2.embedded.repo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Scanner;

@RequiredArgsConstructor
public class Game {

    @Autowired
    private final AnswerRepository answerRepository;
    @Autowired
    private final LocalGameSaveRepository localGameSaveRepository;
    @Autowired
    private final RoundRepository roundRepository;
    @Autowired
    private final UserAnswerCheckRepository userAnswerCheckRepository;
    @Autowired
    private final UserRepository userRepository;

    private final Scanner scanner = new Scanner(System.in);

    @Transactional
    public void testRun() {
        User user = new User("iva");
        User user1 = new User("saveli");
        userRepository.save(user);
        userRepository.save(user1);


    }
}
