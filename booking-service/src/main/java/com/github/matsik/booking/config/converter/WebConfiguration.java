package com.github.matsik.booking.config.converter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class WebConfiguration implements WebMvcConfigurer {

    private final StringToObjectIdConverter stringToObjectIdConverter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(stringToObjectIdConverter);
    }

}
