package com.example.test.Test2.embedded.repo;

import com.example.test.Test2.embedded.Round;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RoundRepository implements ObjectRepository<Round> {

    private Map<Long, Round> repository;

    public RoundRepository() {
        this.repository = new HashMap<>();

    }

    @Override
    public void store(Long id, Round round) {
        round.setId(id);
        repository.put(id, round);
    }

    @Override
    public Round retrieve(Long id) {
        return repository.get(id);
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }
}
