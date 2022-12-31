pluginManagement {
    repositories.gradlePluginPortal()

    includeBuild("gradle/plugins")
}

dependencyResolutionManagement {
    repositories.mavenCentral()
}

rootProject.name="employeer-backend"

include("application")
include("configuration")
include("adapter")
include("service")
include("domain")