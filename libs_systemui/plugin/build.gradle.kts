plugins{
    alias(libs.plugins.android.library)
}
android {
    compileSdk = 36
    namespace = "com.android.systemui.plugins"

    defaultConfig {
        minSdk = 30
    }

    sourceSets {
        getByName("main") {
            java.directories.add("src")
            kotlin.directories.add("src")
            aidl.directories.add("src")
            res.directories.add("res")
            manifest.srcFile("AndroidManifest.xml")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    
    buildFeatures {
        viewBinding = true
        aidl = true
    }
}

dependencies{
    implementation(project(":plugincore"))
    implementation(project(":animationlib"))
    implementation(libs.core.animation)
    implementation(libs.core.ktx)
    implementation(libs.constraint.layout)
    implementation(libs.kotlin.stdlib.jdk7)
}