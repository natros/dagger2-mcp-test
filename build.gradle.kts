plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.dagger:dagger:2.22.1")
    annotationProcessor("com.google.dagger:dagger-compiler:2.22.1")
}

application {
    mainClassName = "com.github.natros.mcp.Main"
}
