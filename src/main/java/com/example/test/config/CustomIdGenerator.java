package com.example.test.config;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class CustomIdGenerator {
    private final AtomicLong LocalGameSaveIdAI = new AtomicLong(1);
    private final AtomicLong LocalAnswerIdAI = new AtomicLong(1);
    private final AtomicLong LocalRoundIdAI = new AtomicLong(1);
    private final AtomicLong LocalUserAnswerCheckIdAI = new AtomicLong(1);

    public Long generateGameSaveId() {
        return LocalGameSaveIdAI.incrementAndGet();
    }

    public Long generateAnswerId() {
        return LocalAnswerIdAI.incrementAndGet();
    }

    public Long generateRoundId() {
        return  LocalRoundIdAI.incrementAndGet();
    }

    public Long generateUserAnswerCheckId() {
        return LocalUserAnswerCheckIdAI.incrementAndGet();
    }

}
