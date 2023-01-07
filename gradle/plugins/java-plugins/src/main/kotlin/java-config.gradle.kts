plugins {
    java
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.0.1"))
    implementation("org.mapstruct:mapstruct:1.5.2.Final")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.2.Final")
    annotationProcessor(platform("org.springframework.boot:spring-boot-dependencies:3.0.1"))
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(19))
}