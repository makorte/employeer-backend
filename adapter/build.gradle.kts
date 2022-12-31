plugins {
    id("java-config")
}

dependencies {
    implementation(project(":service"))
    implementation(project(":configuration"))
}