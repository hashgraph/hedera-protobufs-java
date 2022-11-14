import me.champeau.gradle.igp.gitRepositories

rootProject.name = "hedera-protobuf-java-api"

// Add local maven build directory to plugin repos
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

// Use GIT plugin to clone HAPI protobuf files
// See documentation https://melix.github.io/includegit-gradle-plugin/latest/index.html
plugins {
    id("me.champeau.includegit") version "0.1.5"
}
gitRepositories {
    include("hedera-protobufs") {
        autoInclude.set(false)
        uri.set("https://github.com/hashgraph/hedera-protobufs.git")
        // ===================================================================================
        // CHANGE ME - choose branch or tag on HAPI you would like to build with
//        branch.set("main")
        tag.set("v0.31.0")
    }
}
