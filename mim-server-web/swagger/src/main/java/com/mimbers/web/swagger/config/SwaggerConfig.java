package com.mimbers.web.swagger.config;

import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;
import springfox.documentation.builders.*;
import springfox.documentation.service.*;
import springfox.documentation.spi.*;
import springfox.documentation.spring.web.plugins.*;

import javax.annotation.*;

@Slf4j
@Data
@Configuration
@ConfigurationProperties("swagger")
public class SwaggerConfig {

    @PostConstruct
    private void dump() {
        log.info("( dump ) $config.swagger={}", this);
    }

    private SwaggerProperties swaggerProperties = new SwaggerProperties();

    /**
     * Default docket
     *
     * @return docket
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("v1")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(swaggerProperties.BASE_PACKAGE()))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(swaggerProperties.TITLE())
                .version(swaggerProperties.VERSION())
                .description(swaggerProperties.DESCRIPTION())
                .termsOfServiceUrl(swaggerProperties.TERMS_OF_SERVICE_URL())
                .license(swaggerProperties.LICENSE())
                .licenseUrl(swaggerProperties.LICENSE_URL())
                .build();
    }
}
