package kz.iitu.anel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AnelApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnelApplication.class, args);
    }

}
