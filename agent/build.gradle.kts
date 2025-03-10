plugins {
    id("java")
    id("io.freefair.lombok") version "8.12.1"
}

group = "moe.sota"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
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