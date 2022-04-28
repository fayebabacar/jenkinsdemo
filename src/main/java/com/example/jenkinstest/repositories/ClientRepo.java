package com.example.jenkinstest.repositories;

import com.example.jenkinstest.models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientRepo extends JpaRepository<Clients,Integer> {
}
