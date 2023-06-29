package by.motoluha.digitalchief.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fio;

    private String phoneNumber;

    private EnglishLevel level;

    private String cityLocation;

    private Boolean readyToRelocate;

    private String skypeLogin;
}
