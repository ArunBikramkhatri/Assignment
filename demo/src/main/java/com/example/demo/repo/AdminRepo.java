package com.example.demo.repo;

import com.example.demo.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AdminRepo extends JpaRepository<Client, String> {

    @Query("SELECT * FROM Client")
    List<Client> findAllClients();


    @Modifying
    @Transactional
    @Query("DELETE FROM Client c")
    void deleteAllClients();
}
