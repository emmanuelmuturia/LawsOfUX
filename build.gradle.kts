// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(notation = libs.plugins.android.application) apply false
    alias(notation = libs.plugins.kotlin.android) apply false
    alias(notation = libs.plugins.kotlin.compose) apply false
    alias(notation = libs.plugins.kotlin.serialization) apply false
    alias(notation = libs.plugins.ktlint)
    alias(notation = libs.plugins.detekt)
    alias(notation = libs.plugins.spotless)
}

subprojects {
    apply(plugin = rootProject.libs.plugins.ktlint.get().pluginId)
    ktlint {
        verbose.set(true)
        android.set(true)
        filter {
            exclude("**/generated/**")
        }
    }

    apply(plugin = rootProject.libs.plugins.spotless.get().pluginId)
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        kotlin {
            target("**/*.kt")
            targetExclude("**/build/**/*.kt")
        }

        format("kts") {
            target("**/*.kts")
            targetExclude("**/build/**/*.kts")
        }

        format("xml") {
            target("**/*.xml")
            targetExclude("**/build/**/*.xml")
        }
    }
}

apply(plugin = rootProject.libs.plugins.detekt.get().pluginId)
detekt {
    parallel = true
    config.setFrom(files(paths = arrayOf("${project.rootDir}/config/detekt/detekt.yml")))
}