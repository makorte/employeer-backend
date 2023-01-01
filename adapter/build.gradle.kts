plugins {
    id("java-config")
    id("org.springframework.boot") version "3.0.1"
    id("io.spring.dependency-management") version "1.1.0"
}

dependencies {
    implementation(project(":service"))
    implementation(project(":domain"))
    implementation(project(":configuration"))
    implementation("org.postgresql:postgresql:42.5.1")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.mapstruct:mapstruct:1.5.3.Final")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.3.Final")
}
repositories {
    mavenCentral()
}
