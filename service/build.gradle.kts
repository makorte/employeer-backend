plugins {
    id("java-config")
}

dependencies {
    implementation(project(":domain"))
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
}