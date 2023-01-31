package com.example.fileToDatabase.entity.json;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HistoricIndividualShareHolder {
    @Id
    @GeneratedValue
    private UUID id;
    private String firstname;
    private String fullName;
    private String lastname;
    private String middleNames;
}
