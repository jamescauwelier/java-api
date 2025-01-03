package dev.accelerated.example.api.http.application.greeting;

import dev.accelerated.example.api.http.application.greeting.resource.GreetingResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("greeting")
    public GreetingResource greeting(@RequestParam(value = "name") String name) {
        return new GreetingResource(1, "Hello, " + name + "!");
    }
}
