plugins {
    alias(libs.plugins.android)
    alias(libs.plugins.kotlin)
}

android {
    namespace = "xyz.teamgravity.supportedgetoedgeview"
    compileSdk = libs.versions.sdk.compile.get().toInt()

    defaultConfig {
        applicationId = "xyz.teamgravity.supportedgetoedgeview"
        minSdk = libs.versions.sdk.min.get().toInt()
        targetSdk = libs.versions.sdk.target.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = libs.versions.java.target.get()
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // core
    implementation(libs.core)

    // appcompat
    implementation(libs.appcompat)

    // material
    implementation(libs.material)

    // constraint layout
    implementation(libs.constraintlayout)

    // activity
    implementation(libs.activity)
}