package com.example.test.Test2.embedded.repo;

import com.example.test.Test2.embedded.LocalGameSave;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LocalGameSaveRepository implements ObjectRepository<LocalGameSave> {

    private final Map<Long, LocalGameSave> repository;

    public LocalGameSaveRepository() {
        this.repository = new HashMap<>();
    }


    @Override
    public void store(Long id, LocalGameSave localGameSave) {
        localGameSave.setId(id);
        repository.put(id, localGameSave);
    }

    @Override
    public LocalGameSave retrieve(Long id) {
        return repository.get(id);
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }
}
