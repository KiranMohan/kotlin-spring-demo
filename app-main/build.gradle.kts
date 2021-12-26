
plugins {
    id("org.springframework.boot") version "2.5.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("kotlin-spring-demo.kotlin-conventions")
    kotlin("plugin.spring") version "1.5.31"
}

group = "org.ktest.study.kotlin.spring"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":app-spring-demo-lib"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}


/*
val copyImplemtations by configurations.creating {
    extendsFrom(configurations.implementation.get())
}

tasks.register<Sync>("copyResources") {
    val regex = Regex(".*[\\\\/]kotlin-spring-demo[\\\\/].*")
    from(copyImplemtations.filter { regex.matches(it.absolutePath) }.map { zipTree(it) }) {
        eachFile {println(this)}
        include("templates/**")
    }
    into(layout.buildDirectory.dir("resources/main"))
}

tasks.named("bootJar") {
    dependsOn(tasks.named("copyResources"))
}
*/
