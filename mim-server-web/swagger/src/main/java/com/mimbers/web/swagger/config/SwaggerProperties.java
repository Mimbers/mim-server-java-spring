package com.mimbers.web.swagger.config;

import lombok.*;
import lombok.experimental.*;
import org.springframework.context.annotation.*;

@Getter
@Accessors(fluent = true)
@Configuration
public class SwaggerProperties {

    private final String BASE_PACKAGE;
    private final String TITLE;
    private final String VERSION;

    private final String DESCRIPTION;
    private final String TERMS_OF_SERVICE_URL;
    private final String LICENSE;
    private final String LICENSE_URL;

    public SwaggerProperties() {
        this.BASE_PACKAGE = "com.mimbers";
        this.TITLE = "Meeting In MBTI";
        this.VERSION = "ver 1.0";
        this.DESCRIPTION = "DESCRIPTION";
        this.TERMS_OF_SERVICE_URL = "TERMS_OF_SERVICE_URL";
        this.LICENSE = "LICENSE";
        this.LICENSE_URL = "LICENSE_URL";
    }
}
