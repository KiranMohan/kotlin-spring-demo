package org.ktest.study.kotlin.spring.blog.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {

    @GetMapping("/hello")
    fun sayHello(@RequestParam(defaultValue = "World") name: String) = "Hello $name!"
    // Kotlin function default parameters doesn't work here.
    // You have to use @RequestParam to set the default value.

}