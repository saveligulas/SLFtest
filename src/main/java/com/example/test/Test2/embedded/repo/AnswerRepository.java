package com.example.test.Test2.embedded.repo;

import com.example.test.Test2.embedded.Answer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AnswerRepository implements ObjectRepository<Answer>{

    private final Map<Long, Answer> repository;

    public AnswerRepository() {
        this.repository = new HashMap<>();
    }

    @Override
    public void store(Long id, Answer answer) {
        answer.setId(id);
        repository.put(id, answer);
    }

    @Override
    public Answer retrieve(Long id) {
        return repository.get(id);
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }
}
