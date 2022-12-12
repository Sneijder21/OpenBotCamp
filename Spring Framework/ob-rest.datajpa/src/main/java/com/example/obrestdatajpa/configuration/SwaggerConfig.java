package com.example.obrestdatajpa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;
// http://localhost:8081/swagger-ui/index.html#/
@Configuration
public class SwaggerConfig {

    @Bean // a bean that have avaliable in the container of spring boot
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails(){
        return new ApiInfo("Spring boot Book Api rest",
                "Library api rest docs",
                "1.0",
                "www.google.com",
                new Contact("Sneijder", "sneijder.com", "neyser36@outlook.com"),
                "license 1.0",
                "license.com",
                Collections.emptyList());
    }
}
