package es.qc.api.apicore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@ImportResource("classpath:META-INF/**/applicationContext.xml")
@ComponentScan(basePackages = {"es.qc.api.client", "es.qc.api.apicore" , "org.openapitools.configuration"})
public class ApiCoreApplication implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiCoreApplication.class, args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}
