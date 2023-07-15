package com.university_recommend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.university_recommend.dao")
@SpringBootApplication
public class UniversityRecommendApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversityRecommendApplication.class, args);
    }

}
