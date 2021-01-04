package com.clients.organiser.models;

import javax.persistence.*;

@Entity
@Table(name="client_records")
public class ClientRecord {
    // Long id used by Hibernate to map database keys
    @Id
    // Identity type uses auto increment value generated by database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public ClientRecord(String name) {
        this.name = name;
    }

    // Empty constructor for Hibernate
    public ClientRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
