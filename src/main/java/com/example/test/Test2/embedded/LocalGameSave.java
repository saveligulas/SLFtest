package com.example.test.Test2.embedded;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class LocalGameSave {
    private Long id;
    private Long gameId;
    private Integer roundInteger;
    private List<Character> characters;
    private List<Long> playersIds;
    private Map<Long, Round> playerIdRoundMap = new HashMap<>();
}
