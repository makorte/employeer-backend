plugins {
    id("java-config")
    id("io.spring.dependency-management") version "1.1.0"
}

dependencies {
    implementation(project(":service"))
    implementation(project(":configuration"))
    implementation("org.postgresql:postgresql:42.5.1")
    implementation("org.springframework.data:spring-data-jpa")

}
repositories {
    mavenCentral()
}
