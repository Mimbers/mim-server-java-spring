package com.mimbers.web.config;

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

    private String basePackage = "com.mimbers";
    private ApiInformation api = new ApiInformation();

    @Data
    public static class ApiInformation {
        private String description;
        private String version;
        private String title;
        private String termsOfServiceUrl;
        private String license;
        private String licenseUrl;
    }

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
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(api.title)
                .version(api.version)
                .description(api.description)
                .termsOfServiceUrl(api.termsOfServiceUrl)
                .license(api.license)
                .licenseUrl(api.licenseUrl)
                .build();
    }
}
