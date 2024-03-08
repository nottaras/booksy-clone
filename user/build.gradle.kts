plugins {
    `kotlin-convention`
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.deps)
    alias(libs.plugins.flyway)
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation(libs.flyway.core)

    runtimeOnly(libs.kotlin.reflect)
    runtimeOnly(libs.postgresql)
    runtimeOnly("io.micrometer:micrometer-registry-prometheus")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.graphql:spring-graphql-test")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

flyway {
    url = "jdbc:postgresql://db:5432/booksy-clone"
    user = "postgres"
    password = "postgres"
}

tasks {
    bootJar {
        enabled = false
    }
    jar {
        enabled = true
    }
}
