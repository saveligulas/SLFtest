package com.example.test.Test2.embedded.repo;

public interface ObjectRepository<T> {

    public void store(Long id,T t);

    public T retrieve(Long id);

    public void delete(Long id);
}