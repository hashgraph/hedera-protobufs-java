# hedera-protobuf
The protobuf (protocol buffers) message files defining the Hedera Hashgraph API

# structure
The protobuf files are organised in folders representing the domain they pertain to, the folders are:

* Common - messages that form part of the core API and are used within other messages
* Contract - messages related to the Hedera Hashgraph Smart Contract service
* Crypto - messages related to the Hedera Hashgraph Crypto Currency service
* File - messages related to the Hedera Hashgraph File service
* Query - messages related to querying the Hedera Hashgraph network
* Services - the gRPC definitions which detail which responses should be expected as a result of a request

# documentation
The protobuf files themselves contain detailed comments which help understand not only the message itself but also some of the features and capabilities of the Hedera Hashgraph network.

Also available is a HAPI.html document which is a HTML version of the protocol buffers file with hyperlinks to help navigate through the message definitions. It is also nested such that you can easily follow a complete message structure.

__Note__: the HAPI.html document is a large document and may take a few seconds to load in a browser.
