package The_Golf_Club.Info;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InfoController {
    private static final String template = "Here is your membership info %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/info")
    public Info info(@RequestParam(value = "name", defaultValue = "World") String Name) {
        return new Info(counter.incrementAndGet(), String.format(template, Name));
    }

}
