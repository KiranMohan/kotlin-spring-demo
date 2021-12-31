package org.ktest.study.kotlin.spring.blog.configuration

import org.ktest.study.kotlin.spring.blog.db.Article
import org.ktest.study.kotlin.spring.blog.db.ArticleRepository
import org.ktest.study.kotlin.spring.blog.db.User
import org.ktest.study.kotlin.spring.blog.db.UserRepository
import org.ktest.study.kotlin.spring.blog.properties.BlogProperties
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@ComponentScan(basePackages = ["org.ktest.study.kotlin.spring.blog.controller", "org.ktest.study.kotlin.spring.blog.db"])
@EntityScan(basePackages = ["org.ktest.study.kotlin.spring.blog.db"])
@EnableJpaRepositories(basePackages = ["org.ktest.study.kotlin.spring.blog.db"])
@EnableConfigurationProperties(BlogProperties::class)
class BlogConfiguration {

    @Bean
    fun databaseInitializer(
        userRepository: UserRepository,
        articleRepository: ArticleRepository
    ) = ApplicationRunner {

        val smaldini = userRepository.save(User("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(
            Article(
                title = "Reactor Bismuth is out",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
            )
        )
        articleRepository.save(
            Article(
                title = "Reactor Aluminium has landed",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
            )
        )
    }
}