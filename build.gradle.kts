plugins {
    kotlin("jvm") version "2.1.21"
}

group = "io.msdousti"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.vertx:vertx-web-openapi-router:5.0.1")
    implementation("io.vertx:vertx-lang-kotlin-coroutines:5.0.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
