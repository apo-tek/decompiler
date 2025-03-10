plugins {
    id("java")
    id("io.freefair.lombok") version "8.12.1"
}

group = "moe.sota"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

tasks.jar {
    archiveExtension = "zip"
    manifest {
        attributes("Agent-Class" to "${project.group}.${rootProject.name.lowercase()}.${project.name}.Main")
    }
}