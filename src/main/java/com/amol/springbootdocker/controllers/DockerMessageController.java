package com.amol.springbootdocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DockerMessageController {
	@GetMapping("/")
    public String getMessage() {
        return "Hello World from Docker!";
    }
}
