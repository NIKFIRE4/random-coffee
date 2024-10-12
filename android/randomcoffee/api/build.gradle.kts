plugins {
    id("java-library")
//    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("com.diffplug.spotless") version "6.25.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}


//group 'org.openapitools'
//version '1.0.0'
//
////wrapper {
////    gradleVersion = '8.7'
////    distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
////}
//
//buildscript {
//    ext.kotlin_version = '1.9.23'
//    ext.retrofitVersion = '2.10.0'
//    ext.spotless_version = "6.25.0"
//
//    repositories {
//        maven { url "https://repo1.maven.org/maven2" }
//    }
//    dependencies {
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
//        classpath "com.diffplug.spotless:spotless-plugin-gradle:$spotless_version"
//    }
//}
//
//apply plugin: 'kotlin'
//apply plugin: 'maven-publish'
//apply plugin: 'com.diffplug.spotless'
//
//repositories {
//    maven { url "https://repo1.maven.org/maven2" }
//}

// Use spotless plugin to automatically format code, remove unused import, etc
// To apply changes directly to the file, run `gradlew spotlessApply`
// Ref: https://github.com/diffplug/spotless/tree/main/plugin-gradle
//spotless {
//    // comment out below to run spotless as part of the `check` task
//    enforceCheck false
//
//    format 'misc', {
//        // define the files (e.g. '*.gradle', '*.md') to apply `misc` to
//        target '.gitignore'
//
//        // define the steps to apply to those files
//        trimTrailingWhitespace()
//        indentWithSpaces() // Takes an integer argument if you don't like 4
//        endWithNewline()
//    }
//    kotlin {
//        ktfmt()
//    }
//}

//test {
//    useJUnitPlatform()
//}

dependencies {
    implementation(libs.kotlin.stdlib.jdk8)
    implementation( libs.kotlin.reflect)
    implementation( libs.moshi.kotlin)
    implementation( libs.moshi.adapters)
    implementation( libs.logging.interceptor)
    implementation( libs.retrofit)
    implementation( libs.converter.moshi)
    implementation( libs.converter.scalars)
    testImplementation( libs.kotlintest.runner.junit5)
}