rootProject.name = "kotlin-spring-demo"

include("app-spring-demo-lib")
include("app-main")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {

            val kotlinVersion = "kotlinVersion"
            // NOTE: also update the kotlin version in buildSrc/build.gradle.kts
            // TODO: avoid specifying kotlin version in buildSrc/build.gradle.kts
            version(kotlinVersion, "1.5.31")

            alias("springboot").toPluginId("org.springframework.boot").version("2.5.5")
            alias("spring.deps.mgmt").toPluginId("io.spring.dependency-management").version("1.0.11.RELEASE")
            alias("kotlin.spring").toPluginId("org.jetbrains.kotlin.plugin.spring").versionRef(kotlinVersion)
            alias("kotlin.allopen").toPluginId("org.jetbrains.kotlin.plugin.allopen").versionRef(kotlinVersion)
            alias("kotlin.jpa").toPluginId("org.jetbrains.kotlin.plugin.jpa").versionRef(kotlinVersion)
        }
    }
}