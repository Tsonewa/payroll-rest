package com.example.payrollrest.config;

import com.example.payrollrest.models.Employee;
import com.example.payrollrest.repos.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadConfiguration {

    private static final Logger log = LoggerFactory.getLogger(LoadConfiguration.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee(1L, "Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee(2L, "Frodo Baggins", "thief")));
        };
    }

}
