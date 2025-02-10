package com.robertojavadev.getcabsy.client;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
class Client {

    @Id
    private UUID id;
}
