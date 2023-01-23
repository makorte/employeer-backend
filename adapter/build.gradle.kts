plugins {
    id("java-config")
}

dependencies {
    implementation(project(":service"))
    implementation(project(":domain"))
    implementation("org.postgresql:postgresql:42.5.1")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.2")
    implementation("org.hibernate.validator:hibernate-validator:8.0.0.Final")
}
