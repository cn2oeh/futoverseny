package cn2oeh.futoverseny.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Eredmeny {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long futoId;
    private String eredmenyFutoName;
    private Integer eredmenyVersenyName;
    private long eredmenyTime;

}
