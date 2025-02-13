package com.portfolio.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.time.Instant;
import java.util.UUID;

@Builder(toBuilder = true)  // Builder replaces the constructor / toBuilder allows to modify the objects
@Value                      // Create a private constructor, equals, hasCode, toString and make the class final
@Jacksonized                // Allows jackson to deserialize the object sent from Postman
public class Client {

    @JsonProperty(value = "idClient")
    @Valid
    UUID idClient;

    //@JsonProperty(value = "name_diff")   // When the name in POSTMAN is different then here, if it is the same you have to put it anyway
    @JsonProperty(value = "name")
    @NotNull
    @Valid
    String name;

    @JsonProperty(value = "surname")
    @Valid
    String surname;

    @JsonProperty(value = "number", required = true)
    @Valid
    int number;

    @JsonProperty(value = "email", required = true)   // required is used to mark the attribute as mandatory to send or receive
    @NotNull
    @Valid
    String email;

    @JsonProperty(value = "creationDate")
    @Valid
    @EqualsAndHashCode.Exclude    // Always with Instant because the us will never match
    Instant creationDate;         // Instant returns with us

    @JsonProperty(value = "updateDate")
    @Valid
    @EqualsAndHashCode.Exclude
    Instant updateDate;

}
