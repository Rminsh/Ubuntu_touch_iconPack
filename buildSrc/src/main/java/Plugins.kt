@file:Suppress("unused")

object Plugins {
    // Android
    const val android = "com.android.tools.build:gradle:${Versions.gradle}"
    // Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    // Jitpack Publisher
    const val jitpack = "com.github.dcendents:android-maven-gradle-plugin:${Versions.jitpack}"
    // GMS
    const val gms = "com.google.gms:google-services:${Versions.gms}"
    // Fabric
    const val fabric = "io.fabric.tools:gradle:${Versions.fabric}"
}