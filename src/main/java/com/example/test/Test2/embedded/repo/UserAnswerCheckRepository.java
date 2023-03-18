package com.example.test.Test2.embedded.repo;

import com.example.test.Test2.embedded.UserAnswerCheck;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserAnswerCheckRepository implements ObjectRepository<UserAnswerCheck> {

    private Map<Long, UserAnswerCheck> repository;

    public UserAnswerCheckRepository() {
        this.repository = new HashMap<>();
    }

    @Override
    public void store(Long id, UserAnswerCheck userAnswerCheck) {
        userAnswerCheck.setId(id);
        repository.put(id, userAnswerCheck);
    }

    @Override
    public UserAnswerCheck retrieve(Long id) {
        return repository.get(id);
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }
}
