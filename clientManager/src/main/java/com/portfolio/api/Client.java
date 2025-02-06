package com.portfolio.api;

import lombok.Value;

import java.time.Instant;
import java.util.UUID;

@Value                  // Create a private constructor, equals, hasCode, toString and make the class final
public class Client {

    UUID idClient;
    String name;
    String surname;
    int number;
    String email;
    Instant creationDate;
    Instant updateDate;

}
