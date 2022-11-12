import com.google.protobuf.gradle.GenerateProtoTask

plugins {
    java
    id("com.google.protobuf") version "0.9.1"
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("io.grpc:protoc-gen-grpc-java:1.50.2")
    implementation("io.grpc:grpc-netty:1.50.2")
    implementation("io.grpc:grpc-protobuf:1.50.2")
    implementation("io.grpc:grpc-stub:1.50.2")
    implementation("io.grpc:grpc-testing:1.50.2")
    implementation("com.google.protobuf:protobuf-java:3.21.9")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("net.i2p.crypto:eddsa:0.3.0")
}

group = "com.hedera.hashgraph"
description = "hedera-protobuf-java-api"
java.sourceCompatibility = JavaVersion.VERSION_1_8

java {
    withSourcesJar()
}

tasks.clean {
    doFirst {
        delete("${rootDir}/src/main/proto")
    }
}

sourceSets {
    main {
        proto {
            srcDir("checkouts/hedera-protobufs/streams")
            srcDir("checkouts/hedera-protobufs/services")
            srcDir("checkouts/hedera-protobufs/mirror")
            exclude { file: FileTreeElement ->
                return@exclude file.file.endsWith("mirror/consensus_service.proto")
            }
        }
    }
}

protobuf {
    plugins {
        create("grpc").artifact = "io.grpc:protoc-gen-grpc-java:1.50.2"
    }

    generateProtoTasks {
        all().forEach { task: GenerateProtoTask ->
//            task.builtins["java"].options.add("lite")
            task.plugins.create("grpc")
//            task.plugins.create("grpc").options.add("lite")
        }
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        pom {
            name.set("hedera-protobuf-java-api")
            description.set("Hedera Protobuf Java API")
            url.set("https://github.com/hashgraph/hedera-protobuf")
            licenses {
                license {
                    name.set("The Apache License, Version 2.0")
                    url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    distribution.set("repo")
                }
            }
            developers {
                developer {
                    organization.set("Hedera Hashgraph")
                    organizationUrl.set("https://www.hedera.com")
                }
            }
            scm {
                connection.set("scm:git:git@github.com:hashgraph/hedera-protobuf.git")
                developerConnection.set("scm:git:git@github.com:hashgraph/hedera-protobuf.git")
                url.set("https://github.com/hashgraph/hedera-protobuf")
            }
        }
    }
    repositories{
        mavenLocal()
    }
}

// Gradle does not create "META-INF/maven" directory in the jar file, not sure if is 100% needed but this creates a
// matching set of files in the jar file.
tasks.register<Copy>("generateMavenMetaInf") {
    dependsOn.add(tasks["generatePomFileForMavenPublication"])
    val mavenMetaInfDir = buildDir.resolve("resources/main/META-INF/maven/${project.group}/${project.name}/")
    doFirst{
        mkdir(mavenMetaInfDir)
        file(mavenMetaInfDir.resolve("pom.properties")).writeText("""
            artifactId=hedera-protobuf-java-api
            groupId=com.hedera.hashgraph
            version=${project.version}
            
        """.trimIndent())
    }
    from(tasks["generatePomFileForMavenPublication"])
    into(mavenMetaInfDir)
    rename("pom-default.xml","pom.xml")
}
tasks.jar {
    dependsOn.add(tasks["generateMavenMetaInf"])
}