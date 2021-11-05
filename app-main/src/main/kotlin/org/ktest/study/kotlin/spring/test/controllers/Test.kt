package org.ktest.study.kotlin.spring.test.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Test {

    @GetMapping("/test")
    fun sayHello() = "Test call to localhost:8080/test!"
    // Kotlin function default parameters doesn't work here.
    // You have to use @RequestParam to set the default value.

}