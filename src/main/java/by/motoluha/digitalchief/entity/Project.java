package by.motoluha.digitalchief.entity;


import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    private String name;

    private String version;

    private String domain;

    private String documentationLink;

    private Boolean released;

    @ManyToOne
    private Developer projectManager;
}
