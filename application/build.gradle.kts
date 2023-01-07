plugins {
    id("java-config")
    id("org.springframework.boot") version "3.0.1"
}

dependencies {
    implementation(project(":adapter"))
    implementation(project(":configuration"))
    implementation("org.springframework.boot:spring-boot-starter")
}