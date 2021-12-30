package org.ktest.study.kotlin.spring.blog

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@Configuration
@EnableWebMvc
@ComponentScan(basePackages =  ["org.ktest.study.kotlin.spring.blog.controller"])
class WebAutoConfigurationForTest {
}