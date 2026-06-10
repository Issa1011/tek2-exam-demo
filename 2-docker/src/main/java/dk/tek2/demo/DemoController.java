package dk.tek2.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// En meget simpel controller med to endpoints til demoen.
@RestController
public class DemoController {

    @Value("${demo.database.host}")
    private String databaseHost;

    @Value("${demo.database.name}")
    private String databaseName;

    @Value("${demo.database.username}")
    private String databaseUsername;

    // Viser at Spring Boot appen kører.
    @GetMapping("/")
    public String home() {
        return "Hej fra Spring Boot i Docker";
    }

    // Viser de database-indstillinger, som kommer fra Docker Compose.
    @GetMapping("/db")
    public String databaseInfo() {
        return "Database host: " + databaseHost
                + ", database: " + databaseName
                + ", user: " + databaseUsername;
    }
}
