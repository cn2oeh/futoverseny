package cn2oeh.futoverseny.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Verseny {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long versenyId;
    private String versenyName;
    private Integer versenyLength;

}
