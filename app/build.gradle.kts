plugins {
    alias(notation = libs.plugins.android.application)
    alias(notation = libs.plugins.kotlin.android)
    alias(notation = libs.plugins.kotlin.compose)
}

android {
    namespace = "emmanuelmuturia.lawsofux"
    compileSdk = 35

    defaultConfig {
        applicationId = "emmanuelmuturia.lawsofux"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                files = arrayOf(
                    getDefaultProguardFile(name = "proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )
        }

        debug {
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(dependencyNotation = libs.androidx.core.ktx)
    implementation(dependencyNotation = libs.androidx.lifecycle.runtime.ktx)
    implementation(dependencyNotation = libs.androidx.activity.compose)
    implementation(dependencyNotation = platform(libs.androidx.compose.bom))
    implementation(dependencyNotation = libs.androidx.ui)
    implementation(dependencyNotation = libs.androidx.ui.graphics)
    implementation(dependencyNotation = libs.androidx.ui.tooling.preview)
    implementation(dependencyNotation = libs.androidx.material3)
    implementation(dependencyNotation = libs.bundles.koin)
    implementation(dependencyNotation = libs.navigation.compose)
    implementation(dependencyNotation = libs.splash)
    implementation(dependencyNotation = libs.kotlinx.coroutines)
    implementation(dependencyNotation = libs.timber)

    testImplementation(dependencyNotation = libs.junit)
    testImplementation(dependencyNotation = libs.bundles.test)

    androidTestImplementation(dependencyNotation = libs.androidx.junit)
    androidTestImplementation(dependencyNotation = libs.androidx.espresso.core)
    androidTestImplementation(dependencyNotation = platform(libs.androidx.compose.bom))
    androidTestImplementation(dependencyNotation = libs.androidx.ui.test.junit4)

    debugImplementation(dependencyNotation = libs.androidx.ui.tooling)
    debugImplementation(dependencyNotation = libs.androidx.ui.test.manifest)
    debugImplementation(dependencyNotation = libs.leakCanary)

}