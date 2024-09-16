package com.zainab.practice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.zainab.practice.beans",
"com.zainab.practice.service", "com.zainab.practice.implementation"} )

public class Config {
}
