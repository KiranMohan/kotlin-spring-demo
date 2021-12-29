import java.io.*
import java.util.*

val gradleProps = Properties()
FileInputStream(file("gradle.properties")).use {
    gradleProps.load(it)
}

rootProject.name = "kotlin-spring-demo"

include("app-spring-demo-lib")
include("app-main")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {

            val kotlinVersion = gradleProps.getProperty("kotlin.version")

            alias("springboot").toPluginId("org.springframework.boot").version(gradleProps.getProperty("springboot.version"))
            alias("spring.deps.mgmt").toPluginId("io.spring.dependency-management").version(gradleProps.getProperty("spring.deps.mgmt.version"))
            alias("kotlin.spring").toPluginId("org.jetbrains.kotlin.plugin.spring").version(kotlinVersion)
            alias("kotlin.allopen").toPluginId("org.jetbrains.kotlin.plugin.allopen").version(kotlinVersion)
            alias("kotlin.jpa").toPluginId("org.jetbrains.kotlin.plugin.jpa").version(kotlinVersion)
        }
    }
}