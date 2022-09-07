package com.itachay.docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DockerController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("test-docker")
    public ResponseEntity<String> testDocker () {
        return ResponseEntity.ok().body("Docker application is up and running on port: " + serverPort);
    }

}
