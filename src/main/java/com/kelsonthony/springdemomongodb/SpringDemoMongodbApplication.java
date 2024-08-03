package com.kelsonthony.springdemomongodb;

import com.kelsonthony.springdemomongodb.domain.repository.RiceProductionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = RiceProductionRepository.class)
@SpringBootApplication
public class SpringDemoMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoMongodbApplication.class, args);
    }

}
