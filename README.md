# Hedera Hashgraph Protocol Buffer API Message Definitions

The Hedera Hashgraph API is implemented with protocol buffers, Google's language-neutral, platform-neutral, extensible mechanism for serializing structured data. This repository contains the current version of the files used to define the API.

## Documentation

The protobuf files themselves contain detailed comments which help understand not only the message itself but also some of the features and capabilities of the Hedera Hashgraph network.

The `/docs` folder of this project contains automatically generated documents in html and markdown format to help navigate through the message definitions.

[NestedDoc.html](https://github.com/hashgraph/hedera-protobuf/blob/master/docs/NestedDoc.html) - nested HTML document to help navigate messages that contain other message definitions (large document that takes a while to open)
[NotNestedDoc.html](https://github.com/hashgraph/hedera-protobuf/blob/master/docs/NotNestedDoc.html) - flat HTML document
[NotNestedDoc.md](https://github.com/hashgraph/hedera-protobuf/blob/master/docs/NotNestedDoc.md) - flat markdown document

__Note__: the HAPI.html document is a large document and may take a few seconds to load in a browser.

## Additional resources

If you are unfamiliar with protocol buffers (or need a refresher), you may consult the following web resources:

- Protocol Buffers : https://developers.google.com/protocol-buffers/
- gRPC : https://grpc.io

## Deploy to Maven

*You will need the appropriate credentials to do so*

- Update the version number in the `pom.xml` (ensure pom.xml has x.x.x-SNAPSHOT for version)
- Build the project with `mvn clean install`
- Re-generate the documentation

```shell
cd docgenerator
java -jar proto2html.jar "HAPI Documentation" ../src/main/proto/ ../docs
```

Commit all changes to github

`mvn release:clean release:prepare` (you will be prompted for github user and password (or access token if 2FA) and version numbers)

`mvn release:perform`

navigate to Nexus Repository Manager https://oss.sonatype.org/index.html#stagingRepositories and release the newly created repository.
