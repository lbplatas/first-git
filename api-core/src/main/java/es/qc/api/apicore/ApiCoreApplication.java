package es.qc.api.apicore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:META-INF/**/applicationContext.xml")
public class ApiCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCoreApplication.class, args);
    }
}
