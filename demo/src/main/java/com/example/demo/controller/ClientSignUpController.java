package com.example.demo.controller;


import com.example.demo.models.Client;
import com.example.demo.services.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ClientSignUpController {
    Logger logger = LoggerFactory.getLogger(ClientSignUpController.class);
    @Autowired
    private ClientService userService;

    @RequestMapping("/register")
    public ResponseEntity<String> register(@RequestBody Client client) {
        try {
            logger.info("add user " + client.toString());
            userService.addUser(client);
            return ResponseEntity.ok("ok");
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
           e.printStackTrace();
        }
        return ResponseEntity.ok("Error");
    }

    @RequestMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("login");
    }
}
