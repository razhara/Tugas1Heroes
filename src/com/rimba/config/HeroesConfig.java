package com.rimba.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rimba.heroes")
@ComponentScan("com.rimba.weapons")
public class HeroesConfig {

}
