plugins {
    id("java-config")
    id("org.springframework.boot") version "3.0.1"
    id("io.spring.dependency-management") version "1.1.0"
}

dependencies {
    implementation(project(":adapter"))
    implementation(project(":configuration"))
    implementation("org.springframework.boot:spring-boot-starter")
}