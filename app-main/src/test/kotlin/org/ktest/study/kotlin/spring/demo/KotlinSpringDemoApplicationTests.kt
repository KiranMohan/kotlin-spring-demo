package org.ktest.study.kotlin.spring.demo

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KotlinSpringDemoApplicationTests(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `Assert test rest call content and status code`() {
        println("Assert test rest call content and status code")
        val entity = restTemplate.getForEntity<String>("/test")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body).contains("Test call to localhost")
    }

}
