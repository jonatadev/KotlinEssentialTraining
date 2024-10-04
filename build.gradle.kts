import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("io.ktor:ktor-server-core:2.3.12")
    implementation("io.ktor:ktor-server-netty:2.3.12")

    testImplementation(kotlin("test"))
    testImplementation ("io.kotest:kotest-assertions-core-jvm:5.9.1")
    testImplementation ("io.mockk:mockk:1.13.12")

    testImplementation("org.mockito:mockito-core:5.14.1")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")

    runtimeOnly("io.arrow-kt:arrow-core:1.2.4") // https://arrow-kt.io/
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}