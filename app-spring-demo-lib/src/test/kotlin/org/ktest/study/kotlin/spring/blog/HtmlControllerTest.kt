package org.ktest.study.kotlin.spring.blog

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.ktest.study.kotlin.spring.demo.KotlinSpringDemoTestApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus
import org.springframework.test.context.ContextConfiguration

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = [KotlinSpringDemoTestApplication::class])
class HtmlControllerTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `Assert blog page title, content and status code`() {
        val entity = restTemplate.getForEntity<String>("/")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body).contains("<h1>Blog</h1>")
    }

    @Test
    fun `Test HelloWorld REST call`() {
        val entity = restTemplate.getForEntity<String>("/hello")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body).isEqualTo("Hello World!")
    }


}
