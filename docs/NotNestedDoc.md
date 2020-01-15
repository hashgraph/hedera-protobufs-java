# HAPI Documentation
<a name="top"></a>

## Table of Contents


- [BasicTypes.proto](#BasicTypes.proto)
  - [AccountID](#AccountID)
  - [ContractID](#ContractID)
  - [CurrentAndNextFeeSchedule](#CurrentAndNextFeeSchedule)
  - [FeeComponents](#FeeComponents)
  - [FeeData](#FeeData)
  - [FeeSchedule](#FeeSchedule)
  - [FileID](#FileID)
  - [HederaFunctionality](#HederaFunctionality) (Enum)
  - [Key](#Key)
  - [KeyList](#KeyList)
  - [NodeAddress](#NodeAddress)
  - [NodeAddressBook](#NodeAddressBook)
  - [RealmID](#RealmID)
  - [ServicesConfigurationList](#ServicesConfigurationList)
  - [Setting](#Setting)
  - [ShardID](#ShardID)
  - [Signature](#Signature)
  - [SignatureList](#SignatureList)
  - [SignatureMap](#SignatureMap)
  - [SignaturePair](#SignaturePair)
  - [ThresholdKey](#ThresholdKey)
  - [ThresholdSignature](#ThresholdSignature)
  - [TopicID](#TopicID)
  - [TransactionFeeSchedule](#TransactionFeeSchedule)
  - [TransactionID](#TransactionID)

- [ConsensusCreateTopic.proto](#ConsensusCreateTopic.proto)
  - [ConsensusCreateTopicTransactionBody](#ConsensusCreateTopicTransactionBody)

- [ConsensusDeleteTopic.proto](#ConsensusDeleteTopic.proto)
  - [ConsensusDeleteTopicTransactionBody](#ConsensusDeleteTopicTransactionBody)

- [ConsensusGetTopicInfo.proto](#ConsensusGetTopicInfo.proto)
  - [ConsensusGetTopicInfoQuery](#ConsensusGetTopicInfoQuery)
  - [ConsensusGetTopicInfoResponse](#ConsensusGetTopicInfoResponse)

- [ConsensusService.proto](#ConsensusService.proto)
  - [ConsensusService](#ConsensusService) (Service)

- [ConsensusSubmitMessage.proto](#ConsensusSubmitMessage.proto)
  - [ConsensusSubmitMessageTransactionBody](#ConsensusSubmitMessageTransactionBody)

- [ConsensusTopicInfo.proto](#ConsensusTopicInfo.proto)
  - [ConsensusTopicInfo](#ConsensusTopicInfo)

- [ConsensusUpdateTopic.proto](#ConsensusUpdateTopic.proto)
  - [ConsensusUpdateTopicTransactionBody](#ConsensusUpdateTopicTransactionBody)

- [ContractCall.proto](#ContractCall.proto)
  - [ContractCallTransactionBody](#ContractCallTransactionBody)

- [ContractCallLocal.proto](#ContractCallLocal.proto)
  - [ContractCallLocalQuery](#ContractCallLocalQuery)
  - [ContractCallLocalResponse](#ContractCallLocalResponse)
  - [ContractFunctionResult](#ContractFunctionResult)
  - [ContractLoginfo](#ContractLoginfo)

- [ContractCreate.proto](#ContractCreate.proto)
  - [ContractCreateTransactionBody](#ContractCreateTransactionBody)

- [ContractDelete.proto](#ContractDelete.proto)
  - [ContractDeleteTransactionBody](#ContractDeleteTransactionBody)

- [ContractGetBytecode.proto](#ContractGetBytecode.proto)
  - [ContractGetBytecodeQuery](#ContractGetBytecodeQuery)
  - [ContractGetBytecodeResponse](#ContractGetBytecodeResponse)

- [ContractGetInfo.proto](#ContractGetInfo.proto)
  - [ContractGetInfoQuery](#ContractGetInfoQuery)
  - [ContractGetInfoResponse](#ContractGetInfoResponse)
  - [ContractGetInfoResponse.ContractInfo](#ContractGetInfoResponse.ContractInfo)

- [ContractGetRecords.proto](#ContractGetRecords.proto)
  - [ContractGetRecordsQuery](#ContractGetRecordsQuery)
  - [ContractGetRecordsResponse](#ContractGetRecordsResponse)

- [ContractUpdate.proto](#ContractUpdate.proto)
  - [ContractUpdateTransactionBody](#ContractUpdateTransactionBody)

- [CryptoAddClaim.proto](#CryptoAddClaim.proto)
  - [Claim](#Claim)
  - [CryptoAddClaimTransactionBody](#CryptoAddClaimTransactionBody)

- [CryptoCreate.proto](#CryptoCreate.proto)
  - [CryptoCreateTransactionBody](#CryptoCreateTransactionBody)

- [CryptoDelete.proto](#CryptoDelete.proto)
  - [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody)

- [CryptoDeleteClaim.proto](#CryptoDeleteClaim.proto)
  - [CryptoDeleteClaimTransactionBody](#CryptoDeleteClaimTransactionBody)

- [CryptoGetAccountBalance.proto](#CryptoGetAccountBalance.proto)
  - [CryptoGetAccountBalanceQuery](#CryptoGetAccountBalanceQuery)
  - [CryptoGetAccountBalanceResponse](#CryptoGetAccountBalanceResponse)

- [CryptoGetAccountRecords.proto](#CryptoGetAccountRecords.proto)
  - [CryptoGetAccountRecordsQuery](#CryptoGetAccountRecordsQuery)
  - [CryptoGetAccountRecordsResponse](#CryptoGetAccountRecordsResponse)

- [CryptoGetClaim.proto](#CryptoGetClaim.proto)
  - [CryptoGetClaimQuery](#CryptoGetClaimQuery)
  - [CryptoGetClaimResponse](#CryptoGetClaimResponse)

- [CryptoGetInfo.proto](#CryptoGetInfo.proto)
  - [CryptoGetInfoQuery](#CryptoGetInfoQuery)
  - [CryptoGetInfoResponse](#CryptoGetInfoResponse)
  - [CryptoGetInfoResponse.AccountInfo](#CryptoGetInfoResponse.AccountInfo)

- [CryptoGetStakers.proto](#CryptoGetStakers.proto)
  - [AllProxyStakers](#AllProxyStakers)
  - [CryptoGetStakersQuery](#CryptoGetStakersQuery)
  - [CryptoGetStakersResponse](#CryptoGetStakersResponse)
  - [ProxyStaker](#ProxyStaker)

- [CryptoService.proto](#CryptoService.proto)
  - [CryptoService](#CryptoService) (Service)

- [CryptoTransfer.proto](#CryptoTransfer.proto)
  - [AccountAmount](#AccountAmount)
  - [CryptoTransferTransactionBody](#CryptoTransferTransactionBody)
  - [TransferList](#TransferList)

- [CryptoUpdate.proto](#CryptoUpdate.proto)
  - [CryptoUpdateTransactionBody](#CryptoUpdateTransactionBody)

- [Duration.proto](#Duration.proto)
  - [Duration](#Duration)

- [ExchangeRate.proto](#ExchangeRate.proto)
  - [ExchangeRate](#ExchangeRate)
  - [ExchangeRateSet](#ExchangeRateSet)

- [FileAppend.proto](#FileAppend.proto)
  - [FileAppendTransactionBody](#FileAppendTransactionBody)

- [FileCreate.proto](#FileCreate.proto)
  - [FileCreateTransactionBody](#FileCreateTransactionBody)

- [FileDelete.proto](#FileDelete.proto)
  - [FileDeleteTransactionBody](#FileDeleteTransactionBody)

- [FileGetContents.proto](#FileGetContents.proto)
  - [FileGetContentsQuery](#FileGetContentsQuery)
  - [FileGetContentsResponse](#FileGetContentsResponse)
  - [FileGetContentsResponse.FileContents](#FileGetContentsResponse.FileContents)

- [FileGetInfo.proto](#FileGetInfo.proto)
  - [FileGetInfoQuery](#FileGetInfoQuery)
  - [FileGetInfoResponse](#FileGetInfoResponse)
  - [FileGetInfoResponse.FileInfo](#FileGetInfoResponse.FileInfo)

- [FileService.proto](#FileService.proto)
  - [FileService](#FileService) (Service)

- [FileUpdate.proto](#FileUpdate.proto)
  - [FileUpdateTransactionBody](#FileUpdateTransactionBody)

- [Freeze.proto](#Freeze.proto)
  - [FreezeTransactionBody](#FreezeTransactionBody)

- [FreezeService.proto](#FreezeService.proto)
  - [FreezeService](#FreezeService) (Service)

- [GetByKey.proto](#GetByKey.proto)
  - [EntityID](#EntityID)
  - [GetByKeyQuery](#GetByKeyQuery)
  - [GetByKeyResponse](#GetByKeyResponse)

- [GetBySolidityID.proto](#GetBySolidityID.proto)
  - [GetBySolidityIDQuery](#GetBySolidityIDQuery)
  - [GetBySolidityIDResponse](#GetBySolidityIDResponse)

- [Query.proto](#Query.proto)
  - [Query](#Query)

- [QueryHeader.proto](#QueryHeader.proto)
  - [QueryHeader](#QueryHeader)
  - [ResponseType](#ResponseType) (Enum)

- [Response.proto](#Response.proto)
  - [Response](#Response)

- [ResponseCode.proto](#ResponseCode.proto)
  - [ResponseCodeEnum](#ResponseCodeEnum) (Enum)

- [ResponseHeader.proto](#ResponseHeader.proto)
  - [ResponseHeader](#ResponseHeader)

- [SmartContractService.proto](#SmartContractService.proto)
  - [SmartContractService](#SmartContractService) (Service)

- [SystemDelete.proto](#SystemDelete.proto)
  - [SystemDeleteTransactionBody](#SystemDeleteTransactionBody)

- [SystemUndelete.proto](#SystemUndelete.proto)
  - [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody)

- [Timestamp.proto](#Timestamp.proto)
  - [Timestamp](#Timestamp)
  - [TimestampSeconds](#TimestampSeconds)

- [Transaction.proto](#Transaction.proto)
  - [Transaction](#Transaction)

- [TransactionBody.proto](#TransactionBody.proto)
  - [TransactionBody](#TransactionBody)

- [TransactionGetFastRecord.proto](#TransactionGetFastRecord.proto)
  - [TransactionGetFastRecordQuery](#TransactionGetFastRecordQuery)
  - [TransactionGetFastRecordResponse](#TransactionGetFastRecordResponse)

- [TransactionGetReceipt.proto](#TransactionGetReceipt.proto)
  - [TransactionGetReceiptQuery](#TransactionGetReceiptQuery)
  - [TransactionGetReceiptResponse](#TransactionGetReceiptResponse)

- [TransactionGetRecord.proto](#TransactionGetRecord.proto)
  - [TransactionGetRecordQuery](#TransactionGetRecordQuery)
  - [TransactionGetRecordResponse](#TransactionGetRecordResponse)

- [TransactionReceipt.proto](#TransactionReceipt.proto)
  - [TransactionReceipt](#TransactionReceipt)

- [TransactionRecord.proto](#TransactionRecord.proto)
  - [TransactionRecord](#TransactionRecord)

- [TransactionResponse.proto](#TransactionResponse.proto)
  - [TransactionResponse](#TransactionResponse)

<a name="BasicTypes.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## BasicTypes.proto

<a name="AccountID"></a>

### AccountID
 The ID for an a cryptocurrency account  

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | The shard number (nonnegative) | |
| realmNum |  | The realm number (nonnegative) | |
| accountNum |  | A nonnegative account number unique within its realm | |


<a name="ContractID"></a>

### ContractID
 The ID for a smart contract instance  

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | The shard number (nonnegative) | |
| realmNum |  | The realm number (nonnegative) | |
| contractNum |  | A nonnegative number unique within its realm | |


<a name="CurrentAndNextFeeSchedule"></a>

### CurrentAndNextFeeSchedule
 This contains two Fee Schedules with expiry timestamp. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| currentFeeSchedule | [FeeSchedule](#FeeSchedule) | Contains current Fee Schedule | |
| nextFeeSchedule | [FeeSchedule](#FeeSchedule) | Contains next Fee Schedule | |


<a name="FeeComponents"></a>

### FeeComponents
 The different components used for fee calculation 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| min |  | The minimum fees that needs to be paid | |
| max |  | The maximum fees that can be submitted | |
| constant |  | A constant determined by the business to calculate the fees | |
| bpt |  | Bytes per transaction | |
| vpt |  | Verifications per transaction | |
| rbh |  | Ram byte seconds | |
| sbh |  | Storage byte seconds | |
| gas |  | Gas for the contract execution | |
| tv |  | Transaction value (crypto transfers amount, tv is in tiny bars divided by 1000, rounded down) | |
| bpr |  | Bytes per response | |
| sbpr |  | Storage bytes per response | |


<a name="FeeData"></a>

### FeeData
 The total fees charged for a transaction. It contains three parts namely node data, network data and service data 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nodedata | [FeeComponents](#FeeComponents) | Fee charged by Node for this functionality | |
| networkdata | [FeeComponents](#FeeComponents) | Fee charged for network operations by Hedera | |
| servicedata | [FeeComponents](#FeeComponents) | Fee charged for providing service by Hedera | |


<a name="FeeSchedule"></a>

### FeeSchedule
 The fee schedule for a specific hedera functionality and the time period this fee schedule will expire  

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transactionFeeSchedule | [TransactionFeeSchedule](#TransactionFeeSchedule) | Contains multiple functionality specific fee schedule. | |
| expiryTime | [TimestampSeconds](#TimestampSeconds) | FeeSchedule expiry time | |


<a name="FileID"></a>

### FileID
 The ID for a file  

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | The shard number (nonnegative) | |
| realmNum |  | The realm number (nonnegative) | |
| fileNum |  | A nonnegative File number unique within its realm | |


<a name="HederaFunctionality"></a>

### HederaFunctionality
 The functionality provided by hedera hashgraph 

| Enum Name | Description |
| --------- | ----------- |
| NONE | UNSPECIFIED - Need to keep first value as unspecified because first element is ignored and not parsed (0 is ignored by parser) |
| CryptoTransfer | crypto transfer |
| CryptoUpdate | crypto update account |
| CryptoDelete | crypto delete account |
| CryptoAddClaim | crypto add claim to the account |
| CryptoDeleteClaim | crypto delete claim to the account |
| ContractCall | Smart Contract Call |
| ContractCreate | Smart Contract Create Contract |
| ContractUpdate | Smart Contract update contract |
| FileCreate | File Operation create file |
| FileAppend | File Operation append file |
| FileUpdate | File Operation update file |
| FileDelete | File Operation delete file |
| CryptoGetAccountBalance | crypto get account balance |
| CryptoGetAccountRecords | crypto get account record |
| CryptoGetInfo | Crypto get info |
| ContractCallLocal | Smart Contract Call |
| ContractGetInfo | Smart Contract get info |
| ContractGetBytecode | Smart Contract, get the byte code |
| GetBySolidityID | Smart Contract, get by solidity ID |
| GetByKey | Smart Contract, get by key |
| CryptoGetClaim | Crypto get the claim |
| CryptoGetStakers | Crypto, get the stakers for the node |
| FileGetContents | File Operations get file contents |
| FileGetInfo | File Operations get the info of the file |
| TransactionGetRecord | Crypto get the transaction records |
| ContractGetRecords | Contract get the transaction records |
| CryptoCreate | crypto create account |
| SystemDelete | system delete file |
| SystemUndelete | system undelete file |
| ContractDelete | delete contract |
| Freeze | freeze |
| CreateTransactionRecord | Create Tx Record |
| CryptoAccountAutoRenew | Crypto Auto Renew |
| ContractAutoRenew | Contract Auto Renew |
| getVersion | Get Version |
| TransactionGetReceipt | Transaction Get Receipt |
| ConsensusCreateTopic |  |
| ConsensusUpdateTopic |  |
| ConsensusDeleteTopic |  |
| ConsensusGetTopicInfo |  |
| ConsensusSubmitMessage |  |


<a name="Key"></a>

### Key
 A Key can be a public key from one of the three supported systems (ed25519, RSA-3072,  ECDSA with p384). Or, it can be the ID of a smart contract instance, which is authorized to act as if it had a key. If an account has an ed25519 key associated with it, then the corresponding private key must sign any transaction to transfer cryptocurrency out of it. And similarly for RSA and ECDSA.<BR>A Key can be a smart contract ID, which means that smart contract is to authorize operations as if it had signed with a key that it owned. The smart contract doesn't actually have a key, and  doesn't actually sign a transaction. But it's as if a virtual transaction were created, and the smart contract signed it with a private key.<BR>A key can be a "threshold key", which means a list of M keys, any N of which must sign in order for the threshold signature to be considered valid. The keys within a threshold signature may themselves be threshold signatures, to allow complex signature requirements.<BR>A Key can be a list of keys. Their use is dependent on context. For example, a Hedera file is created with a list of keys, where all of them must sign a transaction to create or modify the file, but only one of them is needed to sign a transaction to delete the file. So it's a single list that sometimes acts as a 1-of-M threshold key, and sometimes acts as an M-of-M threshold key.<BR>A Key can contain a ThresholdKey or KeyList, which in turn contain a Key, so this mutual recursion would allow nesting arbitrarily deep. A ThresholdKey which contains a list of primitive keys (e.g., ed25519) has 3 levels: ThresholdKey -> KeyList -> Key. A KeyList which contains several primitive keys (e.g., ed25519) has 2 levels: KeyList -> Key. A Key with 2 levels of nested ThresholdKeys has 7 levels: Key -> ThresholdKey -> KeyList -> Key -> ThresholdKey -> KeyList -> Key.<BR>Each Key should not have more than 46 levels, which implies 15 levels of nested ThresholdKeys.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| key | oneof |  | |
| | contractID | [ContractID](#ContractID) | smart contract instance that is authorized as if it had signed with a key | |
| | ed25519 |  | ed25519 public key bytes | |
| | RSA_3072 |  | RSA-3072 public key bytes | |
| | ECDSA_384 |  | ECDSA with the p-384 curve public key bytes | |
| | thresholdKey | [ThresholdKey](#ThresholdKey) | a threshold N followed by a list of M keys, any N of which are required to form a valid signature | |
| | keyList | [KeyList](#KeyList) | A list of Keys of the Key type. | |


<a name="KeyList"></a>

### KeyList
 A list of keys 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| keys | [Key](#Key) | list of keys | |


<a name="NodeAddress"></a>

### NodeAddress
 The information about a node 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| ipAddress |  | The ip address of the Node with separator & octets | |
| portno |  | The port number of the grpc server for the node | |
| memo |  | The memo field of the node | |
| RSA_PubKey |  | The RSA public key of the node. | |


<a name="NodeAddressBook"></a>

### NodeAddressBook
 Gives the node addresses in the address book 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nodeAddress | [NodeAddress](#NodeAddress) | Contains multiple Node Address for the network | |


<a name="RealmID"></a>

### RealmID
 The ID for a realm. Within a given shard, every realm has a unique ID. Each account, file, and contract instance belongs to exactly one realm. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | The shard number (nonnegative) | |
| realmNum |  | The realm number (nonnegative) | |


<a name="ServicesConfigurationList"></a>

### ServicesConfigurationList


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nameValue | [Setting](#Setting) | list of name value pairs of the application properties | |


<a name="Setting"></a>

### Setting


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| name |  | name of the property | |
| value |  | value of the property | |
| data |  | any data associated with property | |


<a name="ShardID"></a>

### ShardID


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | the shard number (nonnegative) | |


<a name="Signature"></a>

### Signature
 A Signature corresponding to a Key. It is a sequence of bytes holding a public key signature from one of the three supported systems (ed25519, RSA-3072,  ECDSA with p384). Or, it can be a list of signatures corresponding to a single threshold key. Or, it can be the ID of a smart contract instance, which is authorized to act as if it had a key. If an account has an ed25519 key associated with it, then the corresponding private key must sign any transaction to transfer cryptocurrency out of it. If it has a smart contract ID associated with it, then that smart contract is allowed to transfer cryptocurrency out of it. The smart contract doesn't actually have a key, and  doesn't actually sign a transaction. But it's as if a virtual transaction were created, and the smart contract signed it with a private key. A key can also be a "threshold key", which means a list of M keys, any N of which must sign in order for the threshold signature to be considered valid. The keys within a threshold signature may themselves be threshold signatures, to allow complex signature requirements (this nesting is not supported in the currently, but will be supported in a future version of API). If a Signature message is missing the "signature" field, then this is considered to be a null signature. That is useful in cases such as threshold signatures, where some of the signatures can be null.<BR>The definition of Key uses mutual recursion, so it allows nesting that is arbitrarily deep. But the current API only accepts Key messages up to 3 levels deep, such as a list of threshold keys, each of which is a list of primitive keys. Therefore, the matching Signature will have the same limitation. This restriction may be relaxed in future versions of the API, to allow deeper nesting.<BR>This message is deprecated and succeeded by SignaturePair and SignatureMap messages.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| deprecated |  |  | |
| signature | oneof |  | |
| | contract |  | smart contract virtual signature (always length zero) | |
| | ed25519 |  | ed25519 signature bytes | |
| | RSA_3072 |  | RSA-3072 signature bytes | |
| | ECDSA_384 |  | ECDSA p-384 signature bytes | |
| | thresholdSignature | [ThresholdSignature](#ThresholdSignature) | A list of signatures for a single N-of-M threshold Key. This must be a list of exactly M signatures, at least N of which are non-null. | |
| | signatureList | [SignatureList](#SignatureList) | A list of M signatures, each corresponding to a Key in a KeyList of the same length. | |


<a name="SignatureList"></a>

### SignatureList
 The signatures corresponding to a KeyList of the same length.<BR>This message is deprecated and succeeded by SignaturePair and SignatureMap messages.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| deprecated |  |  | |
| sigs | [Signature](#Signature) | each signature corresponds to a Key in the KeyList | |


<a name="SignatureMap"></a>

### SignatureMap
 A set of signatures corresponding to every unique public key used to sign a given transaction.<BR>If one public key matches more than one prefixes on the signature map, the transaction containing the map will fail immediately with the response code KEY_PREFIX_MISMATCH.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| sigPair | [SignaturePair](#SignaturePair) | Each signature pair corresponds to a unique Key required to sign the transaction. | |


<a name="SignaturePair"></a>

### SignaturePair
 The client may use any number of bytes from 0 to the whole length of the public key for pubKeyPrefix.<BR>If 0 bytes is used, then it is assumed that only one public key is used to sign.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| pubKeyPrefix |  | First few bytes of the public key | |
| signature | oneof |  | |
| | contract |  | smart contract virtual signature (always length zero) | |
| | ed25519 |  | ed25519 signature | |
| | RSA_3072 |  | RSA-3072 signature | |
| | ECDSA_384 |  | ECDSA p-384 signature | |


<a name="ThresholdKey"></a>

### ThresholdKey
 A set of public keys that are used together to form a threshold signature. If the threshold is N and there are M keys, then this is an N of M threshold signature. If an account is associated with ThresholdKeys, then a transaction to move cryptocurrency out of it must be signed by a list of M signatures, where at most M-N of them are blank, and the other at least N of them are valid signatures corresponding to at least N of the public keys listed here. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| threshold |  | A valid signature set must have at least this many signatures | |
| keys | [KeyList](#KeyList) | List of all the keys that can sign | |


<a name="ThresholdSignature"></a>

### ThresholdSignature
 A signature corresponding to a ThresholdKey. For an N-of-M threshold key, this is a list of M signatures, at least N of which must be non-null.<BR>This message is deprecated and succeeded by SignaturePair and SignatureMap messages.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| deprecated |  |  | |
| sigs | [SignatureList](#SignatureList) | for an N-of-M threshold key, this is a list of M signatures, at least N of which must be non-null | |


<a name="TopicID"></a>

### TopicID
 Unique identifier for a topic (used by the consensus service) 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | The shard number (nonnegative) | |
| realmNum |  | The realm number (nonnegative) | |
| topicNum |  | Unique topic identifier within a realm (nonnegative). | |


<a name="TransactionFeeSchedule"></a>

### TransactionFeeSchedule
 The fees for a specific transaction or query based on the fee data. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| hederaFunctionality | [HederaFunctionality](#HederaFunctionality) | Specific Transaction or Query | |
| feeData | [FeeData](#FeeData) | The fee information about the query/data | |


<a name="TransactionID"></a>

### TransactionID
 The ID for a transaction. This is used for retrieving receipts and records for a transaction, for appending to a file right after creating it, for instantiating a smart contract with bytecode in a file just created, and internally by the network for detecting when duplicate transactions are submitted. A user might get a transaction processed faster by submitting it to N nodes, each with a different node account, but all with the same TransactionID. Then, the transaction will take effect when the first of all those nodes submits the transaction and it reaches consensus. The other transactions will not take effect. So this could make the transaction take effect faster, if any given node might be slow. However, the full transaction fee is charged for each transaction, so the total fee is N times as much if the transaction is sent to N nodes. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transactionValidStart | [Timestamp](#Timestamp) | The transaction is invalid if consensusTimestamp < transactionID.transactionStartValid | |
| accountID | [AccountID](#AccountID) | The Account ID that paid for this transaction | |


<a name="ConsensusCreateTopic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusCreateTopic.proto

<a name="ConsensusCreateTopicTransactionBody"></a>

### ConsensusCreateTopicTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| memo |  | Short publicly visible memo about the topic. No guarantee of uniqueness. | |
| adminKey | [Key](#Key) |  Access control for updateTopic/deleteTopic.<BR>Anyone can increase the topic's expirationTime via ConsensusService.updateTopic(), regardless of the adminKey.<BR>If no adminKey is specified, updateTopic may only be used to extend the topic's expirationTime, and deleteTopic<BR>is disallowed. | |
| submitKey | [Key](#Key) |  Access control for submitMessage.<BR>If unspecified, no access control is performed on ConsensusService.submitMessage (all submissions are allowed). | |
| autoRenewPeriod | [Duration](#Duration) |  The initial lifetime of the topic and the amount of time to attempt to extend the topic's lifetime by<BR>automatically at the topic's expirationTime, if the autoRenewAccount is configured (once autoRenew functionality<BR>is supported by HAPI).<BR>Limited to MIN_AUTORENEW_PERIOD and MAX_AUTORENEW_PERIOD value by server-side configuration.<BR>Required. | |
| autoRenewAccount | [AccountID](#AccountID) |  Optional account to be used at the topic's expirationTime to extend the life of the topic (once autoRenew<BR>functionality is supported by HAPI).<BR>The topic lifetime will be extended up to a maximum of the autoRenewPeriod or however long the topic<BR>can be extended using all funds on the account (whichever is the smaller duration/amount and if any extension<BR>is possible with the account's funds).<BR>If specified, there must be an adminKey and the autoRenewAccount must sign this transaction. | |


<a name="ConsensusDeleteTopic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusDeleteTopic.proto

<a name="ConsensusDeleteTopicTransactionBody"></a>

### ConsensusDeleteTopicTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| topicID | [TopicID](#TopicID) | Topic identifier. | |


<a name="ConsensusGetTopicInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusGetTopicInfo.proto

<a name="ConsensusGetTopicInfoQuery"></a>

### ConsensusGetTopicInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) |  Standard info sent from client to node, including the signed payment, and what kind of response is requested<BR>(cost, state proof, both, or neither). | |
| topicID | [TopicID](#TopicID) | Topic to retrieve info about (the parameters and running state of). | |


<a name="ConsensusGetTopicInfoResponse"></a>

### ConsensusGetTopicInfoResponse
 Retrieve the parameters of and state of a consensus topic.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) |  Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither. | |
| topicID | [TopicID](#TopicID) | Topic identifier. | |
| topicInfo | [ConsensusTopicInfo](#ConsensusTopicInfo) | Current state of the topic | |


<a name="ConsensusService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusService.proto

<a name="ConsensusService"></a>

### ConsensusService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createTopic  | Transaction | TransactionResponse); | 
| updateTopic  | Transaction | TransactionResponse); | 
| deleteTopic  | Transaction | TransactionResponse); | 
| getTopicInfo  | Query | Response); | 
| submitMessage  | Transaction | TransactionResponse); | 


<a name="ConsensusSubmitMessage.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusSubmitMessage.proto

<a name="ConsensusSubmitMessageTransactionBody"></a>

### ConsensusSubmitMessageTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| topicID | [TopicID](#TopicID) | Topic to submit message to. | |
| message |  | Message to be submitted. Max size of the Transaction (including signatures) is 4kB. | |


<a name="ConsensusTopicInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusTopicInfo.proto

<a name="ConsensusTopicInfo"></a>

### ConsensusTopicInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| memo |  | Short publicly visible memo about the topic. No guarantee of uniqueness. | |
| runningHash |  |  SHA-384 running hash <previousRunningHash, topicId, consensusTimestamp, sequenceNumber, message> | |
| sequenceNumber |  |  Sequence number (starting at 1 for the first submitMessage) of messages on the topic. | |
| expirationTime | [Timestamp](#Timestamp) |  Effective consensus timestamp at (and after) which submitMessage calls will no longer succeed on the topic<BR>and the topic will expire and after AUTORENEW_GRACE_PERIOD be automatically deleted. | |
| adminKey | [Key](#Key) | Access control for update/delete of the topic. Null if there is no key. | |
| submitKey | [Key](#Key) | Access control for ConsensusService.submitMessage. Null if there is no key. | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| autoRenewAccount | [AccountID](#AccountID) | Null if there is no autoRenewAccount. | |


<a name="ConsensusUpdateTopic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusUpdateTopic.proto

<a name="ConsensusUpdateTopicTransactionBody"></a>

### ConsensusUpdateTopicTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| topicID | [TopicID](#TopicID) |  | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) |  Short publicly visible memo about the topic. No guarantee of uniqueness. Null for "do not update". | |
| expirationTime | [Timestamp](#Timestamp) |  Effective consensus timestamp at (and after) which all consensus transactions and queries will fail.<BR>The expirationTime may be no longer than MAX_AUTORENEW_PERIOD (8000001 seconds) from the consensus timestamp of<BR>this transaction.<BR>On topics with no adminKey, extending the expirationTime is the only updateTopic option allowed on the topic.<BR>If unspecified, no change. | |
| adminKey | [Key](#Key) |  Access control for update/delete of the topic.<BR>If unspecified, no change.<BR>If empty keyList - the adminKey is cleared. | |
| submitKey | [Key](#Key) |  Access control for ConsensusService.submitMessage.<BR>If unspecified, no change.<BR>If empty keyList - the submitKey is cleared. | |
| autoRenewPeriod | [Duration](#Duration) |  The amount of time to extend the topic's lifetime automatically at expirationTime if the autoRenewAccount is<BR>configured and has funds (once autoRenew functionality is supported by HAPI).<BR>Limited to between MIN_AUTORENEW_PERIOD (6999999 seconds) and MAX_AUTORENEW_PERIOD (8000001 seconds) by<BR>servers-side configuration (which may change).<BR>If unspecified, no change. | |
| autoRenewAccount | [AccountID](#AccountID) |  Optional account to be used at the topic's expirationTime to extend the life of the topic.<BR>Once autoRenew functionality is supported by HAPI, the topic lifetime will be extended up to a maximum of the<BR>autoRenewPeriod or however long the topic can be extended using all funds on the account (whichever is the<BR>smaller duration/amount).<BR>If specified as the default value (0.0.0), the autoRenewAccount will be removed.<BR>If unspecified, no change. | |


<a name="ContractCall.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractCall.proto

<a name="ContractCallTransactionBody"></a>

### ContractCallTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| contractID | [ContractID](#ContractID) | the contract instance to call, in the format used in transactions | |
| gas |  | the maximum amount of gas to use for the call | |
| amount |  | number of tinybars sent (the function must be payable if this is nonzero) | |
| functionParameters |  | which function to call, and the parameters to pass to the function | |


<a name="ContractCallLocal.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractCallLocal.proto

<a name="ContractCallLocalQuery"></a>

### ContractCallLocalQuery
 Call a function of the given smart contract instance, giving it functionParameters as its inputs. It will consume the entire given amount of gas.<BR>This is performed locally on the particular node that the client is communicating with. It cannot change the state of the contract instance (and so, cannot spend anything from the instance's cryptocurrency account). It will not have a consensus timestamp. It cannot generate a record or a receipt. The response will contain the output returned by the function call.  This is useful for calling getter functions, which purely read the state and don't change it. It is faster and cheaper than a normal call, because it is purely local to a single  node.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). The payment must cover the fees and all of the gas offered. | |
| contractID | [ContractID](#ContractID) | the contract instance to call, in the format used in transactions | |
| gas |  | the amount of gas to use for the call. All of the gas offered will be charged for. | |
| functionParameters |  | which function to call, and the parameters to pass to the function | |
| maxResultSize |  | max number of bytes that the result might include. The run will fail if it would have returned more than this number of bytes. | |


<a name="ContractCallLocalResponse"></a>

### ContractCallLocalResponse
 Response when the client sends the node ContractCallLocalQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| functionResult | [ContractFunctionResult](#ContractFunctionResult) | the value returned by the function (if it completed and didn't fail) | |


<a name="ContractFunctionResult"></a>

### ContractFunctionResult
 The result returned by a call to a smart contract function. This is part of the response to a ContractCallLocal query, and is in the record for a ContractCall or ContractCreateInstance transaction. The ContractCreateInstance transaction record has the results of the call to the constructor. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| contractID | [ContractID](#ContractID) | the smart contract instance whose function was called | |
| contractCallResult |  | the result returned by the function | |
| errorMessage |  | message In case there was an error during smart contract execution | |
| bloom |  | bloom filter for record | |
| gasUsed |  | units of gas used  to execute contract | |
| logInfo | [ContractLoginfo](#ContractLoginfo) | the log info for events returned by the function | |


<a name="ContractLoginfo"></a>

### ContractLoginfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| contractID | [ContractID](#ContractID) | address of a contract that emitted the event | |
| bloom |  | bloom filter for a particular log | |
| topic |  | topics of a particular event | |
| data |  | event data | |


<a name="ContractCreate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractCreate.proto

<a name="ContractCreateTransactionBody"></a>

### ContractCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | the file containing the smart contract byte code. A copy will be made and held by the contract instance, and have the same expiration time as the instance. The file is referenced one of two ways: | |
| adminKey | [Key](#Key) | the state of the instance and its fields can be modified arbitrarily if this key signs a transaction to modify it. If this is null, then such modifications are not possible, and there is no administrator that can override the normal operation of this smart contract instance. Note that if it is created with no admin keys, then there is no administrator to authorize changing the admin keys, so there can never be any admin keys for that instance. | |
| gas |  | gas to run the constructor | |
| initialBalance |  | initial number of tinybars to put into the cryptocurrency account associated with and owned by the smart contract | |
| proxyAccountID | [AccountID](#AccountID) | ID of the account to which this account is proxy staked. If proxyAccountID is null, or is an invalid account, or is an account that isn't a node, then this account is automatically proxy staked to a node chosen by the network, but without earning payments. If the proxyAccountID account refuses to accept proxy staking , or if it is not currently running a node, then it will behave as if  proxyAccountID was null. | |
| autoRenewPeriod | [Duration](#Duration) | the instance will charge its account every this many seconds to renew for this long | |
| constructorParameters |  | parameters to pass to the constructor | |
| shardID | [ShardID](#ShardID) | shard in which to create this | |
| realmID | [RealmID](#RealmID) | realm in which to create this (leave this null to create a new realm) | |
| newRealmAdminKey | [Key](#Key) | if realmID is null, then this the admin key for the new realm that will be created | |
| memo |  | the memo that was submitted as part of the contract (max 100 bytes) | |


<a name="ContractDelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractDelete.proto

<a name="ContractDeleteTransactionBody"></a>

### ContractDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| contractID | [ContractID](#ContractID) | The Contract ID instance to delete (this can't be changed) | |
| obtainers | oneof |  | |
| | transferAccountID | [AccountID](#AccountID) | The account ID which will receive all remaining hbars | |
| | transferContractID | [ContractID](#ContractID) | The contract ID which will receive all remaining hbars | |


<a name="ContractGetBytecode.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractGetBytecode.proto

<a name="ContractGetBytecodeQuery"></a>

### ContractGetBytecodeQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| contractID | [ContractID](#ContractID) | the contract for which information is requested | |


<a name="ContractGetBytecodeResponse"></a>

### ContractGetBytecodeResponse
 Response when the client sends the node ContractGetBytecodeQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| bytecode |  | the bytecode | |


<a name="ContractGetInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractGetInfo.proto

<a name="ContractGetInfoQuery"></a>

### ContractGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| contractID | [ContractID](#ContractID) | the contract for which information is requested | |


<a name="ContractGetInfoResponse"></a>

### ContractGetInfoResponse
 Response when the client sends the node ContractGetInfoQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| contractInfo | [ContractGetInfoResponse.ContractInfo](#ContractGetInfoResponse.ContractInfo) | the information about this contract instance (a state proof can be generated for this) | |


<a name="ContractGetInfoResponse.ContractInfo"></a>

### ContractGetInfoResponse.ContractInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| contractID | [ContractID](#ContractID) | ID of the contract instance, in the format used in transactions | |
| accountID | [AccountID](#AccountID) | ID of the cryptocurrency account owned by the contract instance, in the format used in transactions | |
| contractAccountID |  | ID of both the contract instance and the cryptocurrency account owned by the contract instance, in the format used by Solidity | |
| adminKey | [Key](#Key) | the state of the instance and its fields can be modified arbitrarily if this key signs a transaction to modify it. If this is null, then such modifications are not possible, and there is no administrator that can override the normal operation of this smart contract instance. Note that if it is created with no admin keys, then there is no administrator to authorize changing the admin keys, so there can never be any admin keys for that instance. | |
| expirationTime | [Timestamp](#Timestamp) | the current time at which this contract instance (and its account) is set to expire | |
| autoRenewPeriod | [Duration](#Duration) | the expiration time will extend every this many seconds. If there are insufficient funds, then it extends as long as possible. If the account is empty when it expires, then it is deleted. | |
| storage |  | number of bytes of storage being used by this instance (which affects the cost to extend the expiration time) | |
| memo |  | the memo associated with the contract (max 100 bytes) | |
| balance |  | The current balance, in tinybars | |


<a name="ContractGetRecords.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractGetRecords.proto

<a name="ContractGetRecordsQuery"></a>

### ContractGetRecordsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| contractID | [ContractID](#ContractID) | The smart contract instance for which the records should be retrieved | |


<a name="ContractGetRecordsResponse"></a>

### ContractGetRecordsResponse
 Response when the client sends the node ContractGetRecordsQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| contractID | [ContractID](#ContractID) | The smart contract instance that this record is for | |
| records | [TransactionRecord](#TransactionRecord) | List of records, each with contractCreateResult or contractCallResult as its body | |


<a name="ContractUpdate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractUpdate.proto

<a name="ContractUpdateTransactionBody"></a>

### ContractUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| contractID | [ContractID](#ContractID) | The Contract ID instance to update (this can't be changed) | |
| expirationTime | [Timestamp](#Timestamp) | Extend the expiration of the instance and its account to this time (no effect if it already is this time or later) | |
| adminKey | [Key](#Key) | The state of the instance can be modified arbitrarily if this key signs a transaction to modify it. If this is null, then such modifications are not possible, and there is no administrator that can override the normal operation of this smart contract instance. | |
| proxyAccountID | [AccountID](#AccountID) | ID of the account to which this account is proxy staked. If proxyAccountID is null, or is an invalid account, or is an account that isn't a node, then this account is automatically proxy staked to a node chosen by the network, but without earning payments. If the proxyAccountID account refuses to accept proxy staking , or if it is not currently running a node, then it will behave as if proxyAccountID was null. | |
| autoRenewPeriod | [Duration](#Duration) | The instance will charge its account every this many seconds to renew for this long | |
| fileID | [FileID](#FileID) | The file ID of file containing the smart contract byte code. A copy will be made and held by the contract instance, and have the same expiration time as the instance. The file is referenced one of two ways: | |
| memo |  | The memo associated with the contract (max 100 bytes) | |


<a name="CryptoAddClaim.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoAddClaim.proto

<a name="Claim"></a>

### Claim


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountID | [AccountID](#AccountID) | the account to which the claim is attached | |
| hash |  | 48 byte SHA-384 hash (presumably of some kind of credential or certificate) | |
| keys | [KeyList](#KeyList) | list of keys: all must sign the transaction to attach the claim, and any one of them can later delete it. Each "key" can actually be a threshold key containing multiple other keys (including other threshold keys). | |
| claimDuration | [Duration](#Duration) | the duration for which the claim will remain valid | |


<a name="CryptoAddClaimTransactionBody"></a>

### CryptoAddClaimTransactionBody
 Attach the given hash to the given account. The hash can be deleted by the keys used to transfer money from the account. The hash can also be deleted by any one of the deleteKeys (where that one may itself be a threshold key made up of multiple keys). Therefore, this acts as a revocation service for claims about the account. External authorities may issue certificates or credentials of some kind that make a claim about this account. The account owner can then attach a hash of that claim to the account. The transaction that adds the claim will be signed by the owner of the account, and also by all the authorities that are attesting to the truth of that claim. If the claim ever ceases to be true, such as when a certificate is revoked, then any one of the listed authorities has the ability to delete it. The account owner also has the ability to delete it at any time.<BR>In this way, it acts as a revocation server, and the account owner can prove to any third party that the claim is still true for this account, by sending the third party the signed credential, and then having the third party query to discover whether the hash of that credential is still attached to the account.<BR>For a given account, each Claim must contain a different hash. To modify the list of keys in a Claim, the existing Claim should first be deleted, then the Claim with the new list of keys can be added.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| claim | [Claim](#Claim) | A hash of some credential/certificate, along with the keys that authorized it and are allowed to delete it | |


<a name="CryptoCreate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoCreate.proto

<a name="CryptoCreateTransactionBody"></a>

### CryptoCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| key | [Key](#Key) | The key that must sign each transfer out of the account. If receiverSigRequired is true, then it must also sign any transfer into the account. | |
| initialBalance |  | The initial number of tinybars to put into the account | |
| proxyAccountID | [AccountID](#AccountID) | ID of the account to which this account is proxy staked. If proxyAccountID is null, or is an invalid account, or is an account that isn't a node, then this account is automatically proxy staked to a node chosen by the network, but without earning payments. If the proxyAccountID account refuses to accept proxy staking , or if it is not currently running a node, then it will behave as if proxyAccountID was null. | |
| sendRecordThreshold |  | The threshold amount (in tinybars) for which an account record is created for any send/withdraw transaction | |
| receiveRecordThreshold |  | The threshold amount (in tinybars) for which an account record is created for any receive/deposit transaction | |
| receiverSigRequired |  | If true, this account's key must sign any transaction depositing into this account (in addition to all withdrawals) | |
| autoRenewPeriod | [Duration](#Duration) | The account is charged to extend its expiration date every this many seconds. If it doesn't have enough balance, it extends as long as possible. If it is empty when it expires, then it is deleted. | |
| shardID | [ShardID](#ShardID) | The shard in which this account is created | |
| realmID | [RealmID](#RealmID) | The realm in which this account is created (leave this null to create a new realm) | |
| newRealmAdminKey | [Key](#Key) | If realmID is null, then this the admin key for the new realm that will be created | |


<a name="CryptoDelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoDelete.proto

<a name="CryptoDeleteTransactionBody"></a>

### CryptoDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transferAccountID | [AccountID](#AccountID) | The account ID which will receive all remaining hbars | |
| deleteAccountID | [AccountID](#AccountID) | The account ID which should be deleted | |


<a name="CryptoDeleteClaim.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoDeleteClaim.proto

<a name="CryptoDeleteClaimTransactionBody"></a>

### CryptoDeleteClaimTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountIDToDeleteFrom | [AccountID](#AccountID) | The account ID that should have a claim deleted | |
| hashToDelete |  | The hash in the claim to delete (a SHA-384 hash, 48 bytes) | |


<a name="CryptoGetAccountBalance.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetAccountBalance.proto

<a name="CryptoGetAccountBalanceQuery"></a>

### CryptoGetAccountBalanceQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| balanceSource | oneof |  | |
| | accountID | [AccountID](#AccountID) | The account ID for which information is requested | |
| | contractID | [ContractID](#ContractID) | The account ID for which information is requested | |


<a name="CryptoGetAccountBalanceResponse"></a>

### CryptoGetAccountBalanceResponse
 Response when the client sends the node CryptoGetAccountBalanceQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| accountID | [AccountID](#AccountID) | The account ID that is being described (this is useful with state proofs, for proving to a third party) | |
| balance |  | The current balance, in tinybars | |


<a name="CryptoGetAccountRecords.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetAccountRecords.proto

<a name="CryptoGetAccountRecordsQuery"></a>

### CryptoGetAccountRecordsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| accountID | [AccountID](#AccountID) | The account ID for which the records should be retrieved | |


<a name="CryptoGetAccountRecordsResponse"></a>

### CryptoGetAccountRecordsResponse
 Response when the client sends the node CryptoGetAccountRecordsQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| accountID | [AccountID](#AccountID) | The account that this record is for | |
| records | [TransactionRecord](#TransactionRecord) | List of records, each with CryptoRecordBody as their body | |


<a name="CryptoGetClaim.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetClaim.proto

<a name="CryptoGetClaimQuery"></a>

### CryptoGetClaimQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| accountID | [AccountID](#AccountID) | The account ID to which the claim was attached | |
| hash |  | The hash of the claim | |


<a name="CryptoGetClaimResponse"></a>

### CryptoGetClaimResponse
 Response when the client sends the node CryptoGetClaimQuery. If the claim exists, there can be a state proof for that single claim. If the claim doesn't exist, then the state proof must be obtained for the account as a whole, which lists all the attached claims, which then proves that any claim not on the list must not exist. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| claim | [Claim](#Claim) | The claim (account, hash, keys), or null if there is no Claim with the given hash attached to the given account | |


<a name="CryptoGetInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetInfo.proto

<a name="CryptoGetInfoQuery"></a>

### CryptoGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| accountID | [AccountID](#AccountID) | The account ID for which information is requested | |


<a name="CryptoGetInfoResponse"></a>

### CryptoGetInfoResponse
 Response when the client sends the node CryptoGetInfoQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| accountInfo | [CryptoGetInfoResponse.AccountInfo](#CryptoGetInfoResponse.AccountInfo) | Info about the account (a state proof can be generated for this) | |


<a name="CryptoGetInfoResponse.AccountInfo"></a>

### CryptoGetInfoResponse.AccountInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountID | [AccountID](#AccountID) | The account ID for which this information applies | |
| contractAccountID |  | The Contract Account ID comprising of both the contract instance and the cryptocurrency account owned by the contract instance, in the format used by Solidity | |
| deleted |  | If true, then this account has been deleted, it will disappear when it expires, and all transactions for it will fail except the transaction to extend its expiration date | |
| proxyAccountID | [AccountID](#AccountID) | The Account ID of the account to which this is proxy staked. If proxyAccountID is null, or is an invalid account, or is an account that isn't a node, then this account is automatically proxy staked to a node chosen by the network, but without earning payments. If the proxyAccountID account refuses to accept proxy staking , or if it is not currently running a node, then it will behave as if proxyAccountID was null. | |
| proxyReceived |  | The total number of tinybars proxy staked to this account | |
| key | [Key](#Key) | The key for the account, which must sign in order to transfer out, or to modify the account in any way other than extending its expiration date. | |
| balance |  | The current balance of account in tinybars | |
| generateSendRecordThreshold |  | The threshold amount (in tinybars) for which an account record is created (and this account charged for them) for any send/withdraw transaction. | |
| generateReceiveRecordThreshold |  | The threshold amount (in tinybars) for which an account record is created  (and this account charged for them) for any transaction above this amount. | |
| receiverSigRequired |  | If true, no transaction can transfer to this account unless signed by this account's key | |
| expirationTime | [Timestamp](#Timestamp) | The TimeStamp time at which this account is set to expire | |
| autoRenewPeriod | [Duration](#Duration) | The duration for expiration time will extend every this many seconds. If there are insufficient funds, then it extends as long as possible. If it is empty when it expires, then it is deleted. | |
| claims | [Claim](#Claim) | All of the claims attached to the account (each of which is a hash along with the keys that authorized it and can delete it ) | |


<a name="CryptoGetStakers.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetStakers.proto

<a name="AllProxyStakers"></a>

### AllProxyStakers
 all of the accounts proxy staking to a given account, and the amounts proxy staked 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountID | [AccountID](#AccountID) | The Account ID that is being proxy staked to | |
| proxyStaker | [ProxyStaker](#ProxyStaker) | Each of the proxy staking accounts, and the amount they are proxy staking | |


<a name="CryptoGetStakersQuery"></a>

### CryptoGetStakersQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| accountID | [AccountID](#AccountID) | The Account ID for which the records should be retrieved | |


<a name="CryptoGetStakersResponse"></a>

### CryptoGetStakersResponse
 Response when the client sends the node CryptoGetStakersQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| stakers | [AllProxyStakers](#AllProxyStakers) | List of accounts proxy staking to this account, and the amount each is currently proxy staking | |


<a name="ProxyStaker"></a>

### ProxyStaker
 information about a single account that is proxy staking 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountID | [AccountID](#AccountID) | The Account ID that is proxy staking | |
| amount |  | The number of hbars that are currently proxy staked | |


<a name="CryptoService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoService.proto

<a name="CryptoService"></a>

### CryptoService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createAccount  | Transaction | TransactionResponse | Creates a new account by submitting the transaction. The grpc server returns the TransactionResponse | 
| updateAccount  | Transaction | TransactionResponse | Updates an account by submitting the transaction. The grpc server returns the TransactionResponse | 
| cryptoTransfer  | Transaction | TransactionResponse | Initiates a transfer by submitting the transaction. The grpc server returns the TransactionResponse | 
| cryptoDelete  | Transaction | TransactionResponse | Deletes and account by submitting the transaction. The grpc server returns the TransactionResponse | 
| addClaim  | Transaction | TransactionResponse | Adds a claim by submitting the transaction. The grpc server returns the TransactionResponse | 
| deleteClaim  | Transaction | TransactionResponse | Deletes a claim by submitting the transaction. The grpc server returns the TransactionResponse | 
| getClaim  | Query | Response | Retrieves the claim for an account by submitting the query. | 
| getAccountRecords  | Query | Response | Retrieves the record(fetch by AccountID ID) for an account by submitting the query. | 
| cryptoGetBalance  | Query | Response | Retrieves the balance for an account by submitting the query. | 
| getAccountInfo  | Query | Response | Retrieves the account information for an account by submitting the query. | 
| getTransactionReceipts  | Query | Response | Retrieves the transaction receipts for an account by TxId which last for 180sec only for no fee. | 
| getFastTransactionRecord  | Query | Response | Retrieves the transaction record by TxID which last for 180sec only for no fee. | 
| getTxRecordByTxID  | Query | Response | Retrieves the transactions record(fetch by Transaction ID) for an account by submitting the query. | 
| getStakersByAccountID  | Query | Response | Retrieves the stakers for a node by account ID by submitting the query. | 


<a name="CryptoTransfer.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoTransfer.proto

<a name="AccountAmount"></a>

### AccountAmount


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountID | [AccountID](#AccountID) | The Account ID that sends or receives cryptocurrency | |
| amount | [sint64](#sint64) | The amount of tinybars that the account sends(negative) or receives(positive) | |


<a name="CryptoTransferTransactionBody"></a>

### CryptoTransferTransactionBody
 Transfer cryptocurrency from some accounts to other accounts. The accounts list can contain up to 10 accounts. The amounts list must be the same length as the accounts list. Each negative amount is withdrawn from the corresponding account (a sender), and each positive one is added to the corresponding account (a receiver). The amounts list must sum to zero. Each amount is a number of tinyBars (there are 100,000,000 tinyBars in one Hbar). If any sender account fails to have sufficient hbars to do the withdrawal, then the entire transaction fails, and none of those transfers occur, though the transaction fee is still charged. This transaction must be signed by the keys for all the sending accounts, and for any receiving accounts that have receiverSigRequired == true. The signatures are in the same order as the accounts, skipping those accounts that don't need a signature. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transfers | [TransferList](#TransferList) | Accounts and amounts to transfer | |


<a name="TransferList"></a>

### TransferList
 A list of accounts and amounts to transfer out of each account (negative) or into it (positive). 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountAmounts | [AccountAmount](#AccountAmount) | Multiple list of AccountAmount pairs, each of which has an account and an amount to transfer into it (positive) or out of it (negative) | |


<a name="CryptoUpdate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoUpdate.proto

<a name="CryptoUpdateTransactionBody"></a>

### CryptoUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountIDToUpdate | [AccountID](#AccountID) | The account ID which is being updated in this transaction | |
| key | [Key](#Key) | The new key | |
| proxyAccountID | [AccountID](#AccountID) | ID of the account to which this account is proxy staked. If proxyAccountID is null, or is an invalid account, or is an account that isn't a node, then this account is automatically proxy staked to a node chosen by the network, but without earning payments. If the proxyAccountID account refuses to accept proxy staking , or if it is not currently running a node, then it will behave as if proxyAccountID was null. | |
| proxyFraction |  | [Deprecated]. payments earned from proxy staking are shared between the node and this account, with proxyFraction / 10000 going to this account | |
| sendRecordThresholdField | oneof |  | |
| | sendRecordThreshold |  | [Deprecated]. The new threshold amount (in tinybars) for which an account record is created for any send/withdraw transaction | |
| | sendRecordThresholdWrapper | [google.protobuf.UInt64Value](#google.protobuf.UInt64Value) | The new threshold amount (in tinybars) for which an account record is created for any send/withdraw transaction | |
| receiveRecordThresholdField | oneof |  | |
| | receiveRecordThreshold |  | [Deprecated]. The new threshold amount (in tinybars) for which an account record is created for any receive/deposit transaction. | |
| | receiveRecordThresholdWrapper | [google.protobuf.UInt64Value](#google.protobuf.UInt64Value) | The new threshold amount (in tinybars) for which an account record is created for any receive/deposit transaction. | |
| autoRenewPeriod | [Duration](#Duration) | The duration in which it will automatically extend the expiration period. If it doesn't have enough balance, it extends as long as possible. If it is empty when it expires, then it is deleted. | |
| expirationTime | [Timestamp](#Timestamp) | The new expiration time to extend to (ignored if equal to or before the current one) | |
| receiverSigRequiredField | oneof |  | |
| | receiverSigRequired |  | [Deprecated] Do NOT use this field to set a false value because the server cannot distinguish from the default value. Use receiverSigRequiredWrapper field for this purpose. | |
| | receiverSigRequiredWrapper | [google.protobuf.BoolValue](#google.protobuf.BoolValue) | If true, this account's key must sign any transaction depositing into this account (in addition to all withdrawals) | |


<a name="Duration.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Duration.proto

<a name="Duration"></a>

### Duration


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| seconds |  | number of seconds | |


<a name="ExchangeRate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ExchangeRate.proto

<a name="ExchangeRate"></a>

### ExchangeRate


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| hbarEquiv |  | value which denote habar equivalent to cent | |
| centEquiv |  | value which denote cents (USD) equivalent to Hbar} | |
| expirationTime | [TimestampSeconds](#TimestampSeconds) | expired time in seconds for this exchange rate | |


<a name="ExchangeRateSet"></a>

### ExchangeRateSet
 Two sets of exchange rate 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| currentRate | [ExchangeRate](#ExchangeRate) | Current rate of Exchange of Hbar to cents | |
| nextRate | [ExchangeRate](#ExchangeRate) | Next rate exchange of Hbar to cents | |


<a name="FileAppend.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileAppend.proto

<a name="FileAppendTransactionBody"></a>

### FileAppendTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | The file ID of the file to which the bytes are appended to | |
| contents |  | The bytes to append to the contents of the file | |


<a name="FileCreate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileCreate.proto

<a name="FileCreateTransactionBody"></a>

### FileCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| expirationTime | [Timestamp](#Timestamp) | The time at which this file should expire (unless FileUpdateTransaction is used before then to extend its life) | |
| keys | [KeyList](#KeyList) | All these keys must sign to create or modify the file. Any one of them can sign to delete the file. | |
| contents |  | The bytes that are the contents of the file | |
| shardID | [ShardID](#ShardID) | Shard in which this file is created | |
| realmID | [RealmID](#RealmID) | The Realm in which to the file is created (leave this null to create a new realm) | |
| newRealmAdminKey | [Key](#Key) | If realmID is null, then this the admin key for the new realm that will be created | |


<a name="FileDelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileDelete.proto

<a name="FileDeleteTransactionBody"></a>

### FileDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | The file to delete. It will be marked as deleted until it expires. Then it will disappear. | |


<a name="FileGetContents.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileGetContents.proto

<a name="FileGetContentsQuery"></a>

### FileGetContentsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| fileID | [FileID](#FileID) | The file ID of the file whose contents are requested | |


<a name="FileGetContentsResponse"></a>

### FileGetContentsResponse
 Response when the client sends the node FileGetContentsQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| fileContents | [FileGetContentsResponse.FileContents](#FileGetContentsResponse.FileContents) | the file ID and contents (a state proof can be generated for this) | |


<a name="FileGetContentsResponse.FileContents"></a>

### FileGetContentsResponse.FileContents


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | The file ID of the file whose contents are being returned | |
| contents |  | The bytes contained in the file | |


<a name="FileGetInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileGetInfo.proto

<a name="FileGetInfoQuery"></a>

### FileGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| fileID | [FileID](#FileID) | The file ID of the file for which information is requested | |


<a name="FileGetInfoResponse"></a>

### FileGetInfoResponse
 Response when the client sends the node FileGetInfoQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| fileInfo | [FileGetInfoResponse.FileInfo](#FileGetInfoResponse.FileInfo) | The information about the file (a state proof can be generated for this) | |


<a name="FileGetInfoResponse.FileInfo"></a>

### FileGetInfoResponse.FileInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | The file ID of the file for which information is requested | |
| size |  | Number of bytes in contents | |
| expirationTime | [Timestamp](#Timestamp) | The current time at which this account is set to expire | |
| deleted |  | True if deleted but not yet expired | |
| keys | [KeyList](#KeyList) | One of these keys must sign in order to modify or delete the file | |


<a name="FileService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileService.proto

<a name="FileService"></a>

### FileService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createFile  | Transaction | TransactionResponse | Creates a file with the content by submitting the transaction. The grpc server returns the TransactionResponse | 
| updateFile  | Transaction | TransactionResponse | Updates a file by submitting the transaction. The grpc server returns the TransactionResponse | 
| deleteFile  | Transaction | TransactionResponse | Deletes a file by submitting the transaction. The grpc server returns the TransactionResponse | 
| appendContent  | Transaction | TransactionResponse | Appends the file contents(for a given FileID) by submitting the transaction. The grpc server returns the TransactionResponse | 
| getFileContent  | Query | Response | Retrieves the file content by submitting the query. The grpc server returns the Response | 
| getFileInfo  | Query | Response | Retrieves the file information by submitting the query. The grpc server returns the Response | 
| systemDelete  | Transaction | TransactionResponse | Deletes a file by submitting the transaction when the account has admin privileges on the file. The grpc server returns the TransactionResponse | 
| systemUndelete  | Transaction | TransactionResponse | UnDeletes a file by submitting the transaction when the account has admin privileges on the file. The grpc server returns the TransactionResponse | 


<a name="FileUpdate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileUpdate.proto

<a name="FileUpdateTransactionBody"></a>

### FileUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | The file ID of the file to update | |
| expirationTime | [Timestamp](#Timestamp) | The new time at which it should expire (ignored if not later than the current value) | |
| keys | [KeyList](#KeyList) | The keys that can modify or delete the file | |
| contents |  | The new file contents. All the bytes in the old contents are discarded. | |


<a name="Freeze.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Freeze.proto

<a name="FreezeTransactionBody"></a>

### FreezeTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| startHour |  | The start hour (in UTC time), a value between 0 and 23 | |
| startMin |  | The start minute (in UTC time), a value between 0 and 59 | |
| endHour |  | The end hour (in UTC time), a value between 0 and 23 | |
| endMin |  | The end minute (in UTC time), a value between 0 and 59 | |


<a name="FreezeService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FreezeService.proto

<a name="FreezeService"></a>

### FreezeService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| freeze  | Transaction | TransactionResponse | Freezes the nodes by submitting the transaction. The grpc server returns the TransactionResponse | 


<a name="GetByKey.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## GetByKey.proto

<a name="EntityID"></a>

### EntityID
 the ID for a single entity (account, claim, file, or smart contract instance) 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| entity | oneof |  | |
| | accountID | [AccountID](#AccountID) | The Account ID for the cryptocurrency account | |
| | claim | [Claim](#Claim) | The claim details attached to an account | |
| | fileID | [FileID](#FileID) | The file ID of the file | |
| | contractID | [ContractID](#ContractID) | The smart contract ID that identifies instance | |


<a name="GetByKeyQuery"></a>

### GetByKeyQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| key | [Key](#Key) | The key to search for. It must not contain a contractID nor a ThresholdSignature. | |


<a name="GetByKeyResponse"></a>

### GetByKeyResponse
 Response when the client sends the node GetByKeyQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| entities | [EntityID](#EntityID) | The list of entities that include this public key in their associated Key list | |


<a name="GetBySolidityID.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## GetBySolidityID.proto

<a name="GetBySolidityIDQuery"></a>

### GetBySolidityIDQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| solidityID |  | The ID in the format used by Solidity | |


<a name="GetBySolidityIDResponse"></a>

### GetBySolidityIDResponse
 Response when the client sends the node GetBySolidityIDQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| accountID | [AccountID](#AccountID) | The Account ID for the cryptocurrency account | |
| fileID | [FileID](#FileID) | The file Id for the file | |
| contractID | [ContractID](#ContractID) | A smart contract ID for the instance (if this is included, then the associated accountID will also be included) | |


<a name="Query.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Query.proto

<a name="Query"></a>

### Query


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| query | oneof |  | |
| | getByKey | [GetByKeyQuery](#GetByKeyQuery) | Get all entities associated with a given key | |
| | getBySolidityID | [GetBySolidityIDQuery](#GetBySolidityIDQuery) | Get the IDs in the format used in transactions, given the format used in Solidity | |
| | contractCallLocal | [ContractCallLocalQuery](#ContractCallLocalQuery) | Call a function of a smart contract instance | |
| | contractGetInfo | [ContractGetInfoQuery](#ContractGetInfoQuery) | Get information about a smart contract instance | |
| | contractGetBytecode | [ContractGetBytecodeQuery](#ContractGetBytecodeQuery) | Get bytecode used by a smart contract instance | |
| | ContractGetRecords | [ContractGetRecordsQuery](#ContractGetRecordsQuery) | Get Records of the contract instance | |
| | cryptogetAccountBalance | [CryptoGetAccountBalanceQuery](#CryptoGetAccountBalanceQuery) | Get the current balance in a cryptocurrency account | |
| | cryptoGetAccountRecords | [CryptoGetAccountRecordsQuery](#CryptoGetAccountRecordsQuery) | Get all the records that currently exist for transactions involving an account | |
| | cryptoGetInfo | [CryptoGetInfoQuery](#CryptoGetInfoQuery) | Get all information about an account | |
| | cryptoGetClaim | [CryptoGetClaimQuery](#CryptoGetClaimQuery) | Get a single claim from a single account (or null if it doesn't exist) | |
| | cryptoGetProxyStakers | [CryptoGetStakersQuery](#CryptoGetStakersQuery) | Get all the accounts that proxy stake to a given account, and how much they proxy stake (not yet implemented in the current API) | |
| | fileGetContents | [FileGetContentsQuery](#FileGetContentsQuery) | Get the contents of a file (the bytes stored in it) | |
| | fileGetInfo | [FileGetInfoQuery](#FileGetInfoQuery) | Get information about a file, such as its expiration date | |
| | transactionGetReceipt | [TransactionGetReceiptQuery](#TransactionGetReceiptQuery) | Get a receipt for a transaction (lasts 180 seconds) | |
| | transactionGetRecord | [TransactionGetRecordQuery](#TransactionGetRecordQuery) | Get a record for a transaction (lasts 1 hour) | |
| | transactionGetFastRecord | [TransactionGetFastRecordQuery](#TransactionGetFastRecordQuery) | Get a record for a transaction (lasts 180 seconds) | |
| | consensusGetTopicInfo | [ConsensusGetTopicInfoQuery](#ConsensusGetTopicInfoQuery) | Get the parameters of and state of a consensus topic. | |


<a name="QueryHeader.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## QueryHeader.proto

<a name="QueryHeader"></a>

### QueryHeader
 Each query from the client to the node will contain the QueryHeader, which gives the requested response type, and includes a payment for the response. It will sometimes leave payment blank: it is blank for TransactionGetReceiptQuery. It can also be left blank when the responseType is costAnswer or costAnswerStateProof. But it needs to be filled in for all other cases. The idea is that an answer that is only a few bytes (or that was paid for earlier) can be given for free. But if the answer is something that requires many bytes or much computation (like a state proof), then it should be paid for. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| payment | [Transaction](#Transaction) | A signed CryptoTransferTransaction to pay the node a fee for handling this query | |
| responseType | [ResponseType](#ResponseType) | The requested response, asking for cost, state proof, both, or neither | |


<a name="ResponseType"></a>

### ResponseType


| Enum Name | Description |
| --------- | ----------- |
| ANSWER_ONLY | Response returns answer |
| ANSWER_STATE_PROOF | Response returns both answer and state proof |
| COST_ANSWER | Response returns the cost of answer |
| COST_ANSWER_STATE_PROOF | Response returns the total cost of answer and state proof |


<a name="Response.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Response.proto

<a name="Response"></a>

### Response


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| response | oneof |  | |
| | getByKey | [GetByKeyResponse](#GetByKeyResponse) | Get all entities associated with a given key | |
| | getBySolidityID | [GetBySolidityIDResponse](#GetBySolidityIDResponse) | Get the IDs in the format used in transactions, given the format used in Solidity | |
| | contractCallLocal | [ContractCallLocalResponse](#ContractCallLocalResponse) | Response to call a function of a smart contract instance | |
| | contractGetBytecodeResponse | [ContractGetBytecodeResponse](#ContractGetBytecodeResponse) | Get the bytecode for a smart contract instance | |
| | contractGetInfo | [ContractGetInfoResponse](#ContractGetInfoResponse) | Get information about a smart contract instance | |
| | contractGetRecordsResponse | [ContractGetRecordsResponse](#ContractGetRecordsResponse) | Get all existing records for a smart contract instance | |
| | cryptogetAccountBalance | [CryptoGetAccountBalanceResponse](#CryptoGetAccountBalanceResponse) | Get the current balance in a cryptocurrency account | |
| | cryptoGetAccountRecords | [CryptoGetAccountRecordsResponse](#CryptoGetAccountRecordsResponse) | Get all the records that currently exist for transactions involving an account | |
| | cryptoGetInfo | [CryptoGetInfoResponse](#CryptoGetInfoResponse) | Get all information about an account | |
| | cryptoGetClaim | [CryptoGetClaimResponse](#CryptoGetClaimResponse) | Get a single claim from a single account (or null if it doesn't exist) | |
| | cryptoGetProxyStakers | [CryptoGetStakersResponse](#CryptoGetStakersResponse) | Get all the accounts that proxy stake to a given account, and how much they proxy stake | |
| | fileGetContents | [FileGetContentsResponse](#FileGetContentsResponse) | Get the contents of a file (the bytes stored in it) | |
| | fileGetInfo | [FileGetInfoResponse](#FileGetInfoResponse) | Get information about a file, such as its expiration date | |
| | transactionGetReceipt | [TransactionGetReceiptResponse](#TransactionGetReceiptResponse) | Get a receipt for a transaction (lasts 180 seconds) | |
| | transactionGetRecord | [TransactionGetRecordResponse](#TransactionGetRecordResponse) | Get a record for a transaction (lasts 1 hour) | |
| | transactionGetFastRecord | [TransactionGetFastRecordResponse](#TransactionGetFastRecordResponse) | Get a record for a transaction (lasts 180 seconds) | |
| | consensusGetTopicInfo | [ConsensusGetTopicInfoResponse](#ConsensusGetTopicInfoResponse) | Parameters of and state of a consensus topic.. | |


<a name="ResponseCode.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ResponseCode.proto

<a name="ResponseCodeEnum"></a>

### ResponseCodeEnum


| Enum Name | Description |
| --------- | ----------- |
| OK | The transaction passed the precheck validations. |
| INVALID_TRANSACTION | For any error not handled by specific error codes listed below. |
| PAYER_ACCOUNT_NOT_FOUND | Payer account does not exist. |
| INVALID_NODE_ACCOUNT | Node Account provided does not match the node account of the node the transaction was submitted to. |
| TRANSACTION_EXPIRED | Pre-Check error when TransactionValidStart + transactionValidDuration is less than current consensus time. |
| INVALID_TRANSACTION_START | Transaction start time is greater than current consensus time |
| INVALID_TRANSACTION_DURATION | valid transaction duration is a positive non zero number that does not exceed 120 seconds |
| INVALID_SIGNATURE | The transaction signature is not valid |
| MEMO_TOO_LONG | Transaction memo size exceeded 100 bytes |
| INSUFFICIENT_TX_FEE | The fee provided in the transaction is insufficient for this type of transaction |
| INSUFFICIENT_PAYER_BALANCE | The payer account has insufficient cryptocurrency to pay the transaction fee |
| DUPLICATE_TRANSACTION | This transaction ID is a duplicate of one that was submitted to this node or reached consensus in the last 180 seconds (receipt period) |
| BUSY | If API is throttled out |
| NOT_SUPPORTED | The API is not currently supported |
| INVALID_FILE_ID | The file id is invalid or does not exist |
| INVALID_ACCOUNT_ID | The account id is invalid or does not exist |
| INVALID_CONTRACT_ID | The contract id is invalid or does not exist |
| INVALID_TRANSACTION_ID | Transaction id is not valid |
| RECEIPT_NOT_FOUND | Receipt for given transaction id does not exist |
| RECORD_NOT_FOUND | Record for given transaction id does not exist |
| INVALID_SOLIDITY_ID | The solidity id is invalid or entity with this solidity id does not exist |
| UNKNOWN | Transaction hasn't yet reached consensus, or has already expired |
| SUCCESS | The transaction succeeded |
| FAIL_INVALID | There was a system error and the transaction failed because of invalid request parameters. |
| FAIL_FEE | There was a system error while performing fee calculation, reserved for future. |
| FAIL_BALANCE | There was a system error while performing balance checks, reserved for future. |
| KEY_REQUIRED | Key not provided in the transaction body |
| BAD_ENCODING | Unsupported algorithm/encoding used for keys in the transaction |
| INSUFFICIENT_ACCOUNT_BALANCE | When the account balance is not sufficient for the transfer |
| INVALID_SOLIDITY_ADDRESS | During an update transaction when the system is not able to find the Users Solidity address |
| INSUFFICIENT_GAS | Not enough gas was supplied to execute transaction |
| CONTRACT_SIZE_LIMIT_EXCEEDED | contract byte code size is over the limit |
| LOCAL_CALL_MODIFICATION_EXCEPTION | local execution (query) is requested for a function which changes state |
| CONTRACT_REVERT_EXECUTED | Contract REVERT OPCODE executed |
| CONTRACT_EXECUTION_EXCEPTION | For any contract execution related error not handled by specific error codes listed above. |
| INVALID_RECEIVING_NODE_ACCOUNT | In Query validation, account with +ve(amount) value should be Receiving node account, the receiver account should be only one account in the list |
| MISSING_QUERY_HEADER | Header is missing in Query request |
| ACCOUNT_UPDATE_FAILED | The update of the account failed |
| INVALID_KEY_ENCODING | Provided key encoding was not supported by the system |
| NULL_SOLIDITY_ADDRESS | null solidity address |
| CONTRACT_UPDATE_FAILED | update of the contract failed |
| INVALID_QUERY_HEADER | the query header is invalid |
| INVALID_FEE_SUBMITTED | Invalid fee submitted |
| INVALID_PAYER_SIGNATURE | Payer signature is invalid |
| KEY_NOT_PROVIDED | The keys were not provided in the request. |
| INVALID_EXPIRATION_TIME | Expiration time provided in the transaction was invalid. |
| NO_WACL_KEY | WriteAccess Control Keys are not provided for the file |
| FILE_CONTENT_EMPTY | The contents of file are provided as empty. |
| INVALID_ACCOUNT_AMOUNTS | The crypto transfer credit and debit do not sum equal to 0 |
| EMPTY_TRANSACTION_BODY | Transaction body provided is empty |
| INVALID_TRANSACTION_BODY | Invalid transaction body provided |
| INVALID_SIGNATURE_TYPE_MISMATCHING_KEY | the type of key (base ed25519 key, KeyList, or ThresholdKey) does not match the type of signature (base ed25519 signature, SignatureList, or ThresholdKeySignature) |
| INVALID_SIGNATURE_COUNT_MISMATCHING_KEY | the number of key (KeyList, or ThresholdKey) does not match that of signature (SignatureList, or ThresholdKeySignature). e.g. if a keyList has 3 base keys, then the corresponding signatureList should also have 3 base signatures. |
| EMPTY_CLAIM_BODY | the claim body is empty |
| EMPTY_CLAIM_HASH | the hash for the claim is empty |
| EMPTY_CLAIM_KEYS | the key list is empty |
| INVALID_CLAIM_HASH_SIZE | the size of the claim hash is not 48 bytes |
| EMPTY_QUERY_BODY | the query body is empty |
| EMPTY_CLAIM_QUERY | the crypto claim query is empty |
| CLAIM_NOT_FOUND | the crypto claim doesn't exists in the file system. It expired or was never persisted. |
| ACCOUNT_ID_DOES_NOT_EXIST | the account id passed has not yet been created. |
| CLAIM_ALREADY_EXISTS | the claim hash already exists |
| INVALID_FILE_WACL | File WACL keys are invalid |
| SERIALIZATION_FAILED | Serialization failure |
| TRANSACTION_OVERSIZE | The size of the Transaction is greater than transactionMaxBytes |
| TRANSACTION_TOO_MANY_LAYERS | The Transaction has more than 50 levels |
| CONTRACT_DELETED | Contract is marked as deleted |
| PLATFORM_NOT_ACTIVE | the platform node is either disconnected or lagging behind. |
| KEY_PREFIX_MISMATCH | one public key matches more than one prefixes on the signature map |
| PLATFORM_TRANSACTION_NOT_CREATED | transaction not created by platform due to either large backlog or message size exceeded transactionMaxBytes |
| INVALID_RENEWAL_PERIOD | auto renewal period is not a positive number of seconds |
| INVALID_PAYER_ACCOUNT_ID | the response code when a smart contract id is passed for a crypto API request |
| ACCOUNT_DELETED | the account has been marked as deleted |
| FILE_DELETED | the file has been marked as deleted |
| ACCOUNT_REPEATED_IN_ACCOUNT_AMOUNTS | same accounts repeated in the transfer account list |
| SETTING_NEGATIVE_ACCOUNT_BALANCE | attempting to set negative balance value for crypto account |
| OBTAINER_REQUIRED | when deleting smart contract that has crypto balance either transfer account or transfer smart contract is required |
| OBTAINER_SAME_CONTRACT_ID | when deleting smart contract that has crypto balance you can not use the same contract id as transferContractId as the one being deleted |
| OBTAINER_DOES_NOT_EXIST | transferAccountId or transferContractId specified for contract delete does not exist |
| MODIFYING_IMMUTABLE_CONTRACT | attempting to modify (update or delete a immutable smart contract, i.e. one created without a admin key) |
| FILE_SYSTEM_EXCEPTION | Unexpected exception thrown by file system functions |
| AUTORENEW_DURATION_NOT_IN_RANGE | the duration is not a subset of [MINIMUM_AUTORENEW_DURATION,MAXIMUM_AUTORENEW_DURATION] |
| ERROR_DECODING_BYTESTRING | Decoding the smart contract binary to a byte array failed. Check that the input is a valid hex string. |
| CONTRACT_FILE_EMPTY | File to create a smart contract was of length zero |
| CONTRACT_BYTECODE_EMPTY | Bytecode for smart contract is of length zero |
| INVALID_INITIAL_BALANCE | Attempt to set negative initial balance |
| INVALID_RECEIVE_RECORD_THRESHOLD | attempt to set negative receive record threshold |
| INVALID_SEND_RECORD_THRESHOLD | attempt to set negative send record threshold |
| ACCOUNT_IS_NOT_GENESIS_ACCOUNT | Special Account Operations should be performed by only Genesis account, return this code if it is not Genesis Account |
| PAYER_ACCOUNT_UNAUTHORIZED | The fee payer account doesn't have permission to submit such Transaction |
| INVALID_FREEZE_TRANSACTION_BODY | FreezeTransactionBody is invalid |
| FREEZE_TRANSACTION_BODY_NOT_FOUND | FreezeTransactionBody does not exist |
| TRANSFER_LIST_SIZE_LIMIT_EXCEEDED | Exceeded the number of accounts (both from and to) allowed for crypto transfer list |
| RESULT_SIZE_LIMIT_EXCEEDED | Smart contract result size greater than specified maxResultSize |
| NOT_SPECIAL_ACCOUNT | The payer account is not a special account(account 0.0.55) |
| CONTRACT_NEGATIVE_GAS | Negative gas was offered in smart contract call |
| CONTRACT_NEGATIVE_VALUE | Negative value / initial balance was specified in a smart contract call / create |
| INVALID_FEE_FILE | Failed to update fee file |
| INVALID_EXCHANGE_RATE_FILE | Failed to update exchange rate file |
| INSUFFICIENT_LOCAL_CALL_GAS | Payment tendered for contract local call cannot cover both the fee and the gas |
| ENTITY_NOT_ALLOWED_TO_DELETE | Entities with Entity ID below 1000 are not allowed to be deleted |
| AUTHORIZATION_FAILED | Violating one of these rules: 1) treasury account can update all entities below 0.0.1000, 2) account 0.0.50 can update all entities from 0.0.51 - 0.0.80, 3) Network Function Master Account A/c 0.0.50 - Update all Network Function accounts & perform all the Network Functions listed below, 4) Network Function Accounts: i) A/c 0.0.55 - Update Address Book files (0.0.101/102), ii) A/c 0.0.56 - Update Fee schedule (0.0.111), iii) A/c 0.0.57 - Update Exchange Rate (0.0.112). |
| FILE_UPLOADED_PROTO_INVALID | Fee Schedule Proto uploaded but not valid (append or update is required) |
| FILE_UPLOADED_PROTO_NOT_SAVED_TO_DISK | Fee Schedule Proto uploaded but not valid (append or update is required) |
| FEE_SCHEDULE_FILE_PART_UPLOADED | Fee Schedule Proto File Part uploaded |
| EXCHANGE_RATE_CHANGE_LIMIT_EXCEEDED | The change on Exchange Rate exceeds Exchange_Rate_Allowed_Percentage |
| MAX_CONTRACT_STORAGE_EXCEEDED | Contract permanent storage exceeded the currently allowable limit |
| TRANSFER_ACCOUNT_SAME_AS_DELETE_ACCOUNT | Transfer Account should not be same as Account to be deleted |
| TOTAL_LEDGER_BALANCE_INVALID |  |
| EXPIRATION_REDUCTION_NOT_ALLOWED | The expiration date/time on a smart contract may not be reduced |
| MAX_GAS_LIMIT_EXCEEDED | Gas exceeded currently allowable gas limit per transaction |
| MAX_FILE_SIZE_EXCEEDED | File size exceeded the currently allowable limit |
| INVALID_TOPIC_ID | The Topic ID specified is not in the system. |
| INVALID_ADMIN_KEY |  |
| INVALID_SUBMIT_KEY |  |
| UNAUTHORIZED | An attempted operation was not authorized (ie - a deleteTopic for a topic with no adminKey). |
| INVALID_TOPIC_MESSAGE | A ConsensusService message is empty. |
| INVALID_AUTORENEW_ACCOUNT | The autoRenewAccount specified is not a valid, active account. |
| AUTORENEW_ACCOUNT_NOT_ALLOWED |  An adminKey was not specified on the topic, so there must not be an autoRenewAccount. |
| TOPIC_EXPIRED |  The topic has expired, was not automatically renewed, and is in a 7 day grace period before the topic will be<BR>deleted unrecoverably. This error response code will not be returned until autoRenew functionality is supported<BR>by HAPI. |


<a name="ResponseHeader.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ResponseHeader.proto

<a name="ResponseHeader"></a>

### ResponseHeader


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nodeTransactionPrecheckCode | [ResponseCodeEnum](#ResponseCodeEnum) | Result of fee transaction precheck, saying it passed, or why it failed | |
| responseType | [ResponseType](#ResponseType) | The requested response is repeated back here, for convenience | |
| cost |  | The fee that would be charged to get the requested information (if a cost was requested). Note: This cost only includes the query fee and does not include the transfer fee(which is required to execute the transfer transaction to debit the payer account and credit the node account with query fee) | |
| stateProof |  | The state proof for this information (if a state proof was requested, and is available) | |


<a name="SmartContractService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## SmartContractService.proto

<a name="SmartContractService"></a>

### SmartContractService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createContract  | Transaction | TransactionResponse | Creates a contract by submitting the transaction. The grpc server returns the TransactionResponse | 
| updateContract  | Transaction | TransactionResponse | Updates a contract with the content by submitting the transaction. The grpc server returns the TransactionResponse | 
| contractCallMethod  | Transaction | TransactionResponse | Calls a contract by submitting the transaction. The grpc server returns the TransactionResponse | 
| getContractInfo  | Query | Response | Retrieves the contract information by submitting the query. The grpc server returns the Response | 
| contractCallLocalMethod  | Query | Response | Calls a smart contract by submitting the query. The grpc server returns the Response | 
| ContractGetBytecode  | Query | Response | Retrieves the byte code of a contract by submitting the query. The grpc server returns the Response | 
| getBySolidityID  | Query | Response | Retrieves a contract(using Solidity ID) by submitting the query. The grpc server returns the Response | 
| getTxRecordByContractID  | Query | Response | Retrieves a contract(using contract ID) by submitting the query. The grpc server returns the Response | 
| deleteContract  | Transaction | TransactionResponse | Delete a contract instance(mark as deleted until it expires), and transfer hbars to the specified account. The grpc server returns the TransactionResponse | 
| systemDelete  | Transaction | TransactionResponse | Deletes a smart contract by submitting the transaction when the account has admin privileges on the file. The grpc server returns the TransactionResponse | 
| systemUndelete  | Transaction | TransactionResponse | UnDeletes a smart contract by submitting the transaction when the account has admin privileges on the file. The grpc server returns the TransactionResponse | 


<a name="SystemDelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## SystemDelete.proto

<a name="SystemDeleteTransactionBody"></a>

### SystemDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| id | oneof |  | |
| | fileID | [FileID](#FileID) | The file ID of the file to delete, in the format used in transactions | |
| | contractID | [ContractID](#ContractID) | The contract ID instance to delete, in the format used in transactions | |
| expirationTime | [TimestampSeconds](#TimestampSeconds) | The timestamp in seconds at which the "deleted" file should truly be permanently deleted | |


<a name="SystemUndelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## SystemUndelete.proto

<a name="SystemUndeleteTransactionBody"></a>

### SystemUndeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| id | oneof |  | |
| | fileID | [FileID](#FileID) | The file ID to undelete, in the format used in transactions | |
| | contractID | [ContractID](#ContractID) | The contract ID instance to undelete, in the format used in transactions | |


<a name="Timestamp.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Timestamp.proto

<a name="Timestamp"></a>

### Timestamp


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| seconds |  | Number of complete seconds since the start of the epoch | |
| nanos |  | Number of nanoseconds since the start of the last second | |


<a name="TimestampSeconds"></a>

### TimestampSeconds
 An exact date and time,  with a resolution of one second (no nanoseconds). 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| seconds |  | Number of complete seconds since the start of the epoch | |


<a name="Transaction.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Transaction.proto

<a name="Transaction"></a>

### Transaction


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| bodyData | oneof |  | |
| | body | [TransactionBody](#TransactionBody) | the body of the transaction, which needs to be signed | |
| | bodyBytes |  | TransactionBody serialized into bytes , which needs to be signed | |
| sigs | [SignatureList](#SignatureList) | The signatures on the body, to authorize the transaction; deprecated and to be succeeded by SignatureMap field | |
| sigMap | [SignatureMap](#SignatureMap) | The signatures on the body with the new format, to authorize the transaction | |


<a name="TransactionBody.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionBody.proto

<a name="TransactionBody"></a>

### TransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transactionID | [TransactionID](#TransactionID) | The ID for this transaction, which includes the payer's account (the account paying the transaction fee). If two transactions have the same transactionID, they won't both have an effect | |
| nodeAccountID | [AccountID](#AccountID) | The account of the node that submits the client's transaction to the network | |
| transactionFee |  | The maximum transaction fee the client is willing to pay, which is split between the network and the node | |
| transactionValidDuration | [Duration](#Duration) | The transaction is invalid if consensusTimestamp > transactionID.transactionValidStart + transactionValidDuration | |
| generateRecord |  | Should a record of this transaction be generated? (A receipt is always generated, but the record is optional) | |
| memo |  | Any notes or descriptions that should be put into the record (max length 100) | |
| data | oneof |  | |
| | contractCall | [ContractCallTransactionBody](#ContractCallTransactionBody) | Contains the call a function of a contract instance | |
| | contractCreateInstance | [ContractCreateTransactionBody](#ContractCreateTransactionBody) | Contains the create data a contract instance | |
| | contractUpdateInstance | [ContractUpdateTransactionBody](#ContractUpdateTransactionBody) | Contains contract modify info such as expiration date for a contract instance | |
| | contractDeleteInstance | [ContractDeleteTransactionBody](#ContractDeleteTransactionBody) | Delete contract and transfer remaining balance into specified account | |
| | cryptoAddClaim | [CryptoAddClaimTransactionBody](#CryptoAddClaimTransactionBody) | Attach a new claim to an account | |
| | cryptoCreateAccount | [CryptoCreateTransactionBody](#CryptoCreateTransactionBody) | Create a new cryptocurrency account | |
| | cryptoDelete | [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody) | Delete a cryptocurrency account (mark as deleted, and transfer hbars out) | |
| | cryptoDeleteClaim | [CryptoDeleteClaimTransactionBody](#CryptoDeleteClaimTransactionBody) | Remove a claim from an account | |
| | cryptoTransfer | [CryptoTransferTransactionBody](#CryptoTransferTransactionBody) | Transfer amount between accounts | |
| | cryptoUpdateAccount | [CryptoUpdateTransactionBody](#CryptoUpdateTransactionBody) | Modify information such as the expiration date for an account | |
| | fileAppend | [FileAppendTransactionBody](#FileAppendTransactionBody) | Add bytes to the end of the contents of a file | |
| | fileCreate | [FileCreateTransactionBody](#FileCreateTransactionBody) | Create a new file | |
| | fileDelete | [FileDeleteTransactionBody](#FileDeleteTransactionBody) | Delete a file (remove contents and mark as deleted until it expires) | |
| | fileUpdate | [FileUpdateTransactionBody](#FileUpdateTransactionBody) | Modify information such as the expiration date for a file | |
| | systemDelete | [SystemDeleteTransactionBody](#SystemDeleteTransactionBody) | Hedera multisig system deletes a file or smart contract | |
| | systemUndelete | [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody) | To undelete an entity deleted by SystemDelete | |
| | freeze | [FreezeTransactionBody](#FreezeTransactionBody) | Freeze the nodes | |
| | consensusCreateTopic | [ConsensusCreateTopicTransactionBody](#ConsensusCreateTopicTransactionBody) |  | |
| | consensusUpdateTopic | [ConsensusUpdateTopicTransactionBody](#ConsensusUpdateTopicTransactionBody) |  | |
| | consensusDeleteTopic | [ConsensusDeleteTopicTransactionBody](#ConsensusDeleteTopicTransactionBody) |  | |
| | consensusSubmitMessage | [ConsensusSubmitMessageTransactionBody](#ConsensusSubmitMessageTransactionBody) |  | |


<a name="TransactionGetFastRecord.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionGetFastRecord.proto

<a name="TransactionGetFastRecordQuery"></a>

### TransactionGetFastRecordQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| transactionID | [TransactionID](#TransactionID) | The ID of the transaction for which the record is requested. | |


<a name="TransactionGetFastRecordResponse"></a>

### TransactionGetFastRecordResponse
 Response when the client sends the node TransactionGetFastRecordQuery. If it created a new entity (account, file, or smart contract instance) then one of the three ID fields will be filled in with the ID of the new entity. Sometimes a single transaction will create more than one new entity, such as when a new contract instance is created, and this also creates the new account that it owned by that instance. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| transactionRecord | [TransactionRecord](#TransactionRecord) | The requested transaction records | |


<a name="TransactionGetReceipt.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionGetReceipt.proto

<a name="TransactionGetReceiptQuery"></a>

### TransactionGetReceiptQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| transactionID | [TransactionID](#TransactionID) | The ID of the transaction for which the receipt is requested. | |


<a name="TransactionGetReceiptResponse"></a>

### TransactionGetReceiptResponse
 Response when the client sends the node TransactionGetReceiptQuery. If it created a new entity (account, file, or smart contract instance) then one of the three ID fields will be filled in with the ID of the new entity. Sometimes a single transaction will create more than one new entity, such as when a new contract instance is created, and this also creates the new account that it owned by that instance. No State proof is available for this response 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| receipt | [TransactionReceipt](#TransactionReceipt) | The receipt, indicating it reached consensus (and whether it succeeded or failed) or is currently unknown (because it hasn't reached consensus yet, or the transaction has expired already), and including the ID of any new account/file/instance created by that transaction. | |


<a name="TransactionGetRecord.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionGetRecord.proto

<a name="TransactionGetRecordQuery"></a>

### TransactionGetRecordQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| transactionID | [TransactionID](#TransactionID) | The ID of the transaction for which the record is requested. | |


<a name="TransactionGetRecordResponse"></a>

### TransactionGetRecordResponse
 Response when the client sends the node TransactionGetRecordQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither. | |
| transactionRecord | [TransactionRecord](#TransactionRecord) | The requested record | |


<a name="TransactionReceipt.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionReceipt.proto

<a name="TransactionReceipt"></a>

### TransactionReceipt


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| status | [ResponseCodeEnum](#ResponseCodeEnum) | whether the transaction succeeded or failed (or is unknown) | |
| accountID | [AccountID](#AccountID) | The account ID, if a new account was created | |
| fileID | [FileID](#FileID) | The file ID, if a new file was created | |
| contractID | [ContractID](#ContractID) | The contract ID, if a new smart contract instance was created | |
| exchangeRate | [ExchangeRateSet](#ExchangeRateSet) | exchange rate set of Hbar to cents (USD) | |
| topicID | [TopicID](#TopicID) | TopicID of a newly created consensus service topic | |
| topicSequenceNumber |  |  Updated sequence number for a consensus service topic. The result of a ConsensusSubmitMessage. | |
| topicRunningHash |  |  Updated running hash for a consensus service topic. The result of a ConsensusSubmitMessage. | |


<a name="TransactionRecord.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionRecord.proto

<a name="TransactionRecord"></a>

### TransactionRecord


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| receipt | [TransactionReceipt](#TransactionReceipt) | The status (reach consensus, or failed, or is unknown) and the ID of any new account/file/instance created. | |
| transactionHash |  | The hash of the Transaction that executed (not the hash of any Transaction that failed for having a duplicate TransactionID) | |
| consensusTimestamp | [Timestamp](#Timestamp) | The consensus timestamp (or null if didn't reach consensus yet) | |
| transactionID | [TransactionID](#TransactionID) | The ID of the transaction this record represents | |
| memo |  | The memo that was submitted as part of the transaction (max 100 bytes) | |
| transactionFee |  | The actual transaction fee charged, not the original transactionFee value from TransactionBody | |
| body | oneof |  | |
| | contractCallResult | [ContractFunctionResult](#ContractFunctionResult) | Record of the value returned by the smart contract function (if it completed and didn't fail) from ContractCallTransaction | |
| | contractCreateResult | [ContractFunctionResult](#ContractFunctionResult) | Record of the value returned by the smart contract constructor (if it completed and didn't fail) from ContractCreateTransaction | |
| transferList | [TransferList](#TransferList) | All hbar transfers as a result of this transaction, such as fees, or transfers performed by the transaction, or by a smart contract it calls, or by the creation of threshold records that it triggers. | |


<a name="TransactionResponse.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionResponse.proto

<a name="TransactionResponse"></a>

### TransactionResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nodeTransactionPrecheckCode | [ResponseCodeEnum](#ResponseCodeEnum) | The response code that indicates the current status of the transaction. | |
| cost |  | If the response code was INSUFFICIENT_TX_FEE, the actual transaction fee that would be required to execute the transaction. | |

