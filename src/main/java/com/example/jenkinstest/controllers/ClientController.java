package com.example.jenkinstest.controllers;

import com.example.jenkinstest.repositories.ClientRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final ClientRepo clientRepo;
    public ClientController(ClientRepo repo){
        this.clientRepo = repo;

    }
    @GetMapping(path = "/Clients")
    public ResponseEntity<?> getClient(){
        return ResponseEntity.ok(clientRepo.findAll());
    }
}
