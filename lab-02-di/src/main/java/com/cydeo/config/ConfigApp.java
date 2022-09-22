package com.cydeo.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
@ComponentScan(basePackages = {"com.cydeo"})
public class ConfigApp {


}