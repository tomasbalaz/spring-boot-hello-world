package sk.balaz.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("api/hello-world")
public class HelloWorldController {

    @GetMapping
    public List<String> sayHello() {
        return List.of("hello", "world");
    }
}