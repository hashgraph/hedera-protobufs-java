# Hedera Hashgraph Protocol Buffer API Message Definitions

The Hedera Hashgraph API is implemented with protocol buffers, Google's language-neutral, platform-neutral, extensible mechanism for serializing structured data. This repository is responsable for building the Java libraries for the Hedera HAPI protobufs. The source proto files are in https://github.com/hashgraph/hedera-protobufs , this repo just pulls a copy of the source from there and build Java Libraries.

## Configure
 - In `gradle.properties` you can set the version for the build artifacts.
 - In `settings.gradle.kts` you can choose the **branch** or **tag** version of HAPI repo, who's source you would like to use in the build.

## Build


 - `gradle assemble` will build the new jars
 - `gradle publishToMavanLocal` will build and publish into your local maven repo

## Additional resources

If you are unfamiliar with protocol buffers (or need a refresher), you may consult the following web resources:

- Protocol Buffers : https://developers.google.com/protocol-buffers/
- gRPC : https://grpc.io

