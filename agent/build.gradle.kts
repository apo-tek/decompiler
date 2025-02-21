plugins {
    id("java")
}

group = "moe.sota"

tasks.jar {
    archiveExtension = "zip"
    manifest {
        attributes("Agent-Class" to "${project.group}.${rootProject.name.lowercase()}.Main")
    }
}