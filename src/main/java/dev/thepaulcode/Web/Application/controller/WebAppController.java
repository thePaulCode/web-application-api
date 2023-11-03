package dev.thepaulcode.Web.Application.controller;

import dev.thepaulcode.Web.Application.WebApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
    // This class is marked as a Controller, which means it handles HTTP requests and returns responses.

    // This method handles HTTP GET requests to the "/hello" endpoint.
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        // The 'hello' method takes a 'name' parameter from the request, with a default value of "World" if not provided.

        // It returns a formatted string with a greeting, including the 'name' parameter.
        return String.format("Hello %s!", name);
    }
}

