package com.example.test.Test2.embedded;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Round {
    private Long id;
    private Map<Long, List<Answer>> playerIdAnswersMap = new HashMap<>();
    private Map<Long, UserAnswerCheck> answerIdApprovedMap = new HashMap<>();
}
