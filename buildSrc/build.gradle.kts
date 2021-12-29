import java.io.*
import java.util.*

val gradleProps = Properties()
FileInputStream(file("../gradle.properties")).use {
    gradleProps.load(it)
}

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${gradleProps.getProperty("kotlin.version")}")
}