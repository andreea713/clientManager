package com.portfolio.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Table(name = "Client")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class ClientDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idClient", nullable = false, unique = true)
    UUID idClient;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "number", nullable = false)
    int number;

    @Column(name = "email", nullable = false, unique = true)
    String email;

    @Column(name = "creationDate", updatable = false)
    @CreationTimestamp
    Instant creationDate;

    @Column(name = "updateDate")
    @UpdateTimestamp
    Instant updateDate;
}
