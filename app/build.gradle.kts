plugins {
    `kotlin-convention`
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.deps)
}

group = "com.zadziarnouski"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":user"))

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-test")
}

project.layout.buildDirectory = file("../build")

tasks.jar {
    enabled = false
}
