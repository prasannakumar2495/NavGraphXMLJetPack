buildscript {
	repositories {
		google()
	}
	dependencies {
		val navVersion = "2.7.4"
		classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
	}
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
	id("com.android.application") version "8.1.2" apply false
	id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}