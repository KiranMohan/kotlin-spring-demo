package org.ktest.study.kotlin.spring.demo

import org.springframework.boot.autoconfigure.SpringBootApplication

// TODO: HIGH PRIORITY: Get rid of this class.
//       Check Spring Testing documentation.
@SpringBootApplication(
    scanBasePackages = [
        "org.ktest.study.kotlin.spring.demo",
        "org.ktest.study.kotlin.spring.blog",
        "org.ktest.study.kotlin.spring.controller"
    ]
)
class KotlinSpringDemoTestApplication




