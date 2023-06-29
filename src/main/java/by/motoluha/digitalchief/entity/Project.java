package by.motoluha.digitalchief.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String version;

    private String domain;

    private String documentationLink;

    private Boolean released;

    @ManyToOne
    private Developer projectManager;
}
