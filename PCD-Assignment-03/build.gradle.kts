plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation(platform("com.typesafe.akka:akka-bom_2.13:2.8.2"))
    implementation("com.typesafe.akka:akka-actor-typed_2.13")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}