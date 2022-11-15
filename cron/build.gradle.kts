plugins {
    id("java")
    id("maven-publish")
}

group = "org.springframework"
version = "5.3.14"

dependencies {
    implementation("org.jetbrains:annotations:23.0.0")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifactId = project.name
            groupId = project.group.toString()
            version = project.version.toString()
        }
    }
}