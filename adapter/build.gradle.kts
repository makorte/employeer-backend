plugins {
    id("java-config")
}

dependencies {
    implementation(project(":service"))
    implementation(project(":domain"))
    implementation("org.postgresql:postgresql:42.5.1")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
}
