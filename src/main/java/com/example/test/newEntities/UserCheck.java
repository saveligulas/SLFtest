package com.example.test.newEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserCheck {
    @Id
    @GeneratedValue
    private Long id;
    private List<Boolean> approved;
}
