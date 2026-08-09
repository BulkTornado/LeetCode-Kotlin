plugins {
    kotlin("jvm") version "2.4.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(25)
}

application {
    mainClass.set("MainKt")
}

tasks.test {
    useJUnitPlatform()
}