package spring.shape.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @GetMapping("/")
    public String helloGradle() {
        return "Hello Gradle!";
    }
}
