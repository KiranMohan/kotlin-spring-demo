package org.ktest.study.kotlin.spring.blog

import org.ktest.study.kotlin.spring.blog.properties.BlogProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@Configuration
@EnableWebMvc
@ComponentScan(basePackages =  ["org.ktest.study.kotlin.spring.blog.controller", "org.ktest.study.kotlin.spring.blog.properties"])
@EnableConfigurationProperties(BlogProperties::class)
class WebAutoConfigurationForTest {
}