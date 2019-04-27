plugins {
    java
    application
}

repositories {
    mavenCentral()
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("com.google.dagger:dagger:2.22.1")
    annotationProcessor("com.google.dagger:dagger-compiler:2.22.1")
}

application {
    mainClassName = "com.github.natros.mcp.Main"
}
