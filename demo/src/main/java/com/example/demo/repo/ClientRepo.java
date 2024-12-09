package com.example.demo.repo;

import com.example.demo.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<Client, String> {

    @Query("SELECT c FROM Client c WHERE c.username = :username")
    Client findByUsername(@Param("username") String username);


    @Modifying
    @Transactional
    @Query("UPDATE Client c SET c.password = :password WHERE c.username = :username")
    int updatePassword(@Param("username") String username,
                       @Param("password") String password);

    @Modifying
    @Transactional
    @Query("DELETE FROM Client c WHERE c.username = :username")
    int deleteByUsername(@Param("username") String username);


}
