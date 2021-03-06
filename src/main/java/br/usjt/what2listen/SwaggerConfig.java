package br.usjt.what2listen;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build().apiInfo(metaData());
    }

    private ApiInfo metaData() {

        ApiInfo apiInfo = new ApiInfo("Recomendação de Músicas",
                "Sistema de recomendação de músicas desenvolvido pela turma de engenharia da computação", "Alpha", "",
                new Contact("Arcana", "https://github.com/gusVLZ/what2listen", ""), "Source",
                "https://github.com/gusVLZ/what2listen", new ArrayList<>());

        return apiInfo;

    }
}