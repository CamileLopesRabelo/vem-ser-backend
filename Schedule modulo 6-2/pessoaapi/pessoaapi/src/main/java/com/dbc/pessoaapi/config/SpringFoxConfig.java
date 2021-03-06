package com.dbc.pessoaapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dbc.pessoaapi"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfoBuilder()
                        .title("PESSOA REST API")
                        .description("Um exemplo de app com spring Boot")
                        .version("1.0.0")
                        .license("Apache License Vesrsion 2.0")
                        .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                        .contact(new Contact("Camile","https://www.dbccompany.com.br","camile.oliveira@dbccompany.com.br"))
                        .build()
                );
    }

}