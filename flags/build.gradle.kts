plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.android.launcher3.flags"
    compileSdk = 36
    defaultConfig {
        minSdk = 30
    }
    sourceSets {
        named("main") {
            java.directories.add("src")
            kotlin.directories.add("src")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}
//addFrameworkJar("framework-15.jar")
dependencies{
    implementation(libs.kotlin.stdlib.jdk7)
    implementation(project(":hidden-api"))
}