package com.example.demo.repo;

import com.example.demo.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, String> {

    @Query("SELECT c FROM Client c WHERE c.username = :username")
    Client findByUsername(@Param("username") String username);
}
