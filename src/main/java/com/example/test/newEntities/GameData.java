package com.example.test.newEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GameData {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(mappedBy = "data")
    private Game game;
}
