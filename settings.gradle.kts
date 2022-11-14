import me.champeau.gradle.igp.gitRepositories

rootProject.name = "hedera-protobuf-java-api"

// Add local maven build directory to plugin repos
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

// The "gradle.properties" file is not loaded before the "settings.gradle.kts" is processed.
// So manually load "hapiBranchOrTag"
val gradleProperties = java.util.Properties()
gradleProperties.load(file("gradle.properties").inputStream())
val hapiBranchOrTag: String = gradleProperties.getProperty("hapiBranchOrTag")
println("hapiBranchOrTag = [$hapiBranchOrTag]")

// Use GIT plugin to clone HAPI protobuf files
// See documentation https://melix.github.io/includegit-gradle-plugin/latest/index.html
plugins {
    id("me.champeau.includegit") version "0.1.5"
}
gitRepositories {
    include("hedera-protobufs") {
        autoInclude.set(false)
        uri.set("https://github.com/hashgraph/hedera-protobufs.git")
        tag.set(hapiBranchOrTag)
    }
}
