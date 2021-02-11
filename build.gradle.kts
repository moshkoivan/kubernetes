plugins {
    id("org.springframework.boot") version "2.2.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    java
}

group = "by.kubernetes"
version = "0.0.1"

val developmentOnly: Configuration by configurations.creating

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter:2.2.1.RELEASE")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:2.2.1.RELEASE")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("io.jsonwebtoken:jjwt:0.9.1")
    implementation("org.liquibase:liquibase-core")
    implementation("io.springfox:springfox-swagger2:2.9.2")
    implementation("io.springfox:springfox-swagger-ui:2.9.2")
    implementation("org.apache.commons:commons-lang3:3.10")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_14
}