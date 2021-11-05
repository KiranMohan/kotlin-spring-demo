package org.ktest.study.kotlin.spring.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
scanBasePackages = ["org.ktest.study.kotlin.spring.demo","org.ktest.study.kotlin.spring.test.controllers"]
)
class KotlinSpringDemoApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringDemoApplication>(*args)
}
