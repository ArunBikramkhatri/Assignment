package com.example.demo.services;

import com.example.demo.dto.UserDTO;
import com.example.demo.models.Client;
import com.example.demo.repo.ClientRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    Logger logger = LoggerFactory.getLogger(ClientService.class);
    private final String TAG = ClientService.class.getSimpleName();
    @Autowired
    private ClientRepo clientRepo;

    public void addUser(Client client) {
        try {
            logger.info("add user " + client.toString());
            clientRepo.save(client);
        } catch (Exception ex) {
            logger.error(ex.getLocalizedMessage());
            ex.printStackTrace();
        }
    }

    public UserDTO getUserByUsername(String username) {

        return null;
    }
}
