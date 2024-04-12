package com.theguardian.convention

import com.android.build.gradle.TestExtension
import com.theguardian.convention.shared.configureAndroidModule
import com.theguardian.convention.shared.configureAndroidTests
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

/**
 * Configures the Android test modules.
 *
 * Core responsibilities:
 * 1. Apply Android, Kotlin and Ktlint plugins
 * 2. Set up SDK & Java versions
 * 3. Add core dependencies
 * 4. Add lint checks
 * 5. Set up Android tests & Gradle managed devices if the module has test sources
 */
class AndroidTestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.test")
                apply("org.jetbrains.kotlin.android")
                apply("org.jmailen.kotlinter")
            }

            extensions.configure<TestExtension> {
                configureAndroidModule(this)

                configureAndroidTests(
                    extension = this,
                    isTestModule = true,
                )
            }
        }
    }
}