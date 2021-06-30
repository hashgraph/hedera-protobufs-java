# HAPI Documentation
<a name="top"></a>

## Table of Contents


- [AccountBalanceFile.proto](#AccountBalanceFile.proto)
  - [AllAccountBalances](#AllAccountBalances)
  - [SingleAccountBalances](#SingleAccountBalances)
  - [TokenUnitBalance](#TokenUnitBalance)

- [BasicTypes.proto](#BasicTypes.proto)
  - [AccountAmount](#AccountAmount)
  - [AccountID](#AccountID)
  - [ContractID](#ContractID)
  - [CurrentAndNextFeeSchedule](#CurrentAndNextFeeSchedule)
  - [FeeComponents](#FeeComponents)
  - [FeeData](#FeeData)
  - [FeeSchedule](#FeeSchedule)
  - [FileID](#FileID)
  - [Fraction](#Fraction)
  - [HederaFunctionality](#HederaFunctionality) (Enum)
  - [Key](#Key)
  - [KeyList](#KeyList)
  - [NftTransfer](#NftTransfer)
  - [NodeAddress](#NodeAddress)
  - [NodeAddressBook](#NodeAddressBook)
  - [RealmID](#RealmID)
  - [ScheduleID](#ScheduleID)
  - [SemanticVersion](#SemanticVersion)
  - [ServiceEndpoint](#ServiceEndpoint)
  - [ServicesConfigurationList](#ServicesConfigurationList)
  - [Setting](#Setting)
  - [ShardID](#ShardID)
  - [Signature](#Signature)
  - [SignatureList](#SignatureList)
  - [SignatureMap](#SignatureMap)
  - [SignaturePair](#SignaturePair)
  - [SubType](#SubType) (Enum)
  - [ThresholdKey](#ThresholdKey)
  - [ThresholdSignature](#ThresholdSignature)
  - [TokenBalance](#TokenBalance)
  - [TokenBalances](#TokenBalances)
  - [TokenFreezeStatus](#TokenFreezeStatus) (Enum)
  - [TokenID](#TokenID)
  - [TokenKycStatus](#TokenKycStatus) (Enum)
  - [TokenRelationship](#TokenRelationship)
  - [TokenSupplyType](#TokenSupplyType) (Enum)
  - [TokenTransferList](#TokenTransferList)
  - [TokenType](#TokenType) (Enum)
  - [TopicID](#TopicID)
  - [TransactionFeeSchedule](#TransactionFeeSchedule)
  - [TransactionID](#TransactionID)
  - [TransferList](#TransferList)

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
  - [ConsensusMessageChunkInfo](#ConsensusMessageChunkInfo)
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

- [CryptoAddLiveHash.proto](#CryptoAddLiveHash.proto)
  - [CryptoAddLiveHashTransactionBody](#CryptoAddLiveHashTransactionBody)
  - [LiveHash](#LiveHash)

- [CryptoCreate.proto](#CryptoCreate.proto)
  - [CryptoCreateTransactionBody](#CryptoCreateTransactionBody)

- [CryptoDelete.proto](#CryptoDelete.proto)
  - [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody)

- [CryptoDeleteLiveHash.proto](#CryptoDeleteLiveHash.proto)
  - [CryptoDeleteLiveHashTransactionBody](#CryptoDeleteLiveHashTransactionBody)

- [CryptoGetAccountBalance.proto](#CryptoGetAccountBalance.proto)
  - [CryptoGetAccountBalanceQuery](#CryptoGetAccountBalanceQuery)
  - [CryptoGetAccountBalanceResponse](#CryptoGetAccountBalanceResponse)

- [CryptoGetAccountRecords.proto](#CryptoGetAccountRecords.proto)
  - [CryptoGetAccountRecordsQuery](#CryptoGetAccountRecordsQuery)
  - [CryptoGetAccountRecordsResponse](#CryptoGetAccountRecordsResponse)

- [CryptoGetInfo.proto](#CryptoGetInfo.proto)
  - [CryptoGetInfoQuery](#CryptoGetInfoQuery)
  - [CryptoGetInfoResponse](#CryptoGetInfoResponse)
  - [CryptoGetInfoResponse.AccountInfo](#CryptoGetInfoResponse.AccountInfo)

- [CryptoGetLiveHash.proto](#CryptoGetLiveHash.proto)
  - [CryptoGetLiveHashQuery](#CryptoGetLiveHashQuery)
  - [CryptoGetLiveHashResponse](#CryptoGetLiveHashResponse)

- [CryptoGetStakers.proto](#CryptoGetStakers.proto)
  - [AllProxyStakers](#AllProxyStakers)
  - [CryptoGetStakersQuery](#CryptoGetStakersQuery)
  - [CryptoGetStakersResponse](#CryptoGetStakersResponse)
  - [ProxyStaker](#ProxyStaker)

- [CryptoService.proto](#CryptoService.proto)
  - [CryptoService](#CryptoService) (Service)

- [CryptoTransfer.proto](#CryptoTransfer.proto)
  - [CryptoTransferTransactionBody](#CryptoTransferTransactionBody)

- [CryptoUpdate.proto](#CryptoUpdate.proto)
  - [CryptoUpdateTransactionBody](#CryptoUpdateTransactionBody)

- [CustomFees.proto](#CustomFees.proto)
  - [AssessedCustomFee](#AssessedCustomFee)
  - [CustomFee](#CustomFee)
  - [CustomFees](#CustomFees)
  - [FixedFee](#FixedFee)
  - [FractionalFee](#FractionalFee)

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

- [NetworkGetVersionInfo.proto](#NetworkGetVersionInfo.proto)
  - [NetworkGetVersionInfoQuery](#NetworkGetVersionInfoQuery)
  - [NetworkGetVersionInfoResponse](#NetworkGetVersionInfoResponse)

- [NetworkService.proto](#NetworkService.proto)
  - [NetworkService](#NetworkService) (Service)

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

- [SchedulableTransactionBody.proto](#SchedulableTransactionBody.proto)
  - [SchedulableTransactionBody](#SchedulableTransactionBody)

- [ScheduleCreate.proto](#ScheduleCreate.proto)
  - [ScheduleCreateTransactionBody](#ScheduleCreateTransactionBody)

- [ScheduleDelete.proto](#ScheduleDelete.proto)
  - [ScheduleDeleteTransactionBody](#ScheduleDeleteTransactionBody)

- [ScheduleGetInfo.proto](#ScheduleGetInfo.proto)
  - [ScheduleGetInfoQuery](#ScheduleGetInfoQuery)
  - [ScheduleGetInfoResponse](#ScheduleGetInfoResponse)
  - [ScheduleInfo](#ScheduleInfo)

- [ScheduleService.proto](#ScheduleService.proto)
  - [ScheduleService](#ScheduleService) (Service)

- [ScheduleSign.proto](#ScheduleSign.proto)
  - [ScheduleSignTransactionBody](#ScheduleSignTransactionBody)

- [SmartContractService.proto](#SmartContractService.proto)
  - [SmartContractService](#SmartContractService) (Service)

- [SystemDelete.proto](#SystemDelete.proto)
  - [SystemDeleteTransactionBody](#SystemDeleteTransactionBody)

- [SystemUndelete.proto](#SystemUndelete.proto)
  - [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody)

- [ThrottleDefinitions.proto](#ThrottleDefinitions.proto)
  - [ThrottleBucket](#ThrottleBucket)
  - [ThrottleDefinitions](#ThrottleDefinitions)
  - [ThrottleGroup](#ThrottleGroup)

- [Timestamp.proto](#Timestamp.proto)
  - [Timestamp](#Timestamp)
  - [TimestampSeconds](#TimestampSeconds)

- [TokenAssociate.proto](#TokenAssociate.proto)
  - [TokenAssociateTransactionBody](#TokenAssociateTransactionBody)

- [TokenBurn.proto](#TokenBurn.proto)
  - [TokenBurnTransactionBody](#TokenBurnTransactionBody)

- [TokenCreate.proto](#TokenCreate.proto)
  - [TokenCreateTransactionBody](#TokenCreateTransactionBody)

- [TokenDelete.proto](#TokenDelete.proto)
  - [TokenDeleteTransactionBody](#TokenDeleteTransactionBody)

- [TokenDissociate.proto](#TokenDissociate.proto)
  - [TokenDissociateTransactionBody](#TokenDissociateTransactionBody)

- [TokenFreezeAccount.proto](#TokenFreezeAccount.proto)
  - [TokenFreezeAccountTransactionBody](#TokenFreezeAccountTransactionBody)

- [TokenGetAccountNftInfos.proto](#TokenGetAccountNftInfos.proto)
  - [TokenGetAccountNftInfosQuery](#TokenGetAccountNftInfosQuery)
  - [TokenGetAccountNftInfosResponse](#TokenGetAccountNftInfosResponse)

- [TokenGetInfo.proto](#TokenGetInfo.proto)
  - [TokenGetInfoQuery](#TokenGetInfoQuery)
  - [TokenGetInfoResponse](#TokenGetInfoResponse)
  - [TokenInfo](#TokenInfo)

- [TokenGetNftInfo.proto](#TokenGetNftInfo.proto)
  - [NftID](#NftID)
  - [TokenGetNftInfoQuery](#TokenGetNftInfoQuery)
  - [TokenGetNftInfoResponse](#TokenGetNftInfoResponse)
  - [TokenNftInfo](#TokenNftInfo)

- [TokenGetNftInfos.proto](#TokenGetNftInfos.proto)
  - [TokenGetNftInfosQuery](#TokenGetNftInfosQuery)
  - [TokenGetNftInfosResponse](#TokenGetNftInfosResponse)

- [TokenGrantKyc.proto](#TokenGrantKyc.proto)
  - [TokenGrantKycTransactionBody](#TokenGrantKycTransactionBody)

- [TokenMint.proto](#TokenMint.proto)
  - [TokenMintTransactionBody](#TokenMintTransactionBody)

- [TokenRevokeKyc.proto](#TokenRevokeKyc.proto)
  - [TokenRevokeKycTransactionBody](#TokenRevokeKycTransactionBody)

- [TokenService.proto](#TokenService.proto)
  - [TokenService](#TokenService) (Service)

- [TokenUnfreezeAccount.proto](#TokenUnfreezeAccount.proto)
  - [TokenUnfreezeAccountTransactionBody](#TokenUnfreezeAccountTransactionBody)

- [TokenUpdate.proto](#TokenUpdate.proto)
  - [TokenUpdateTransactionBody](#TokenUpdateTransactionBody)

- [TokenWipeAccount.proto](#TokenWipeAccount.proto)
  - [TokenWipeAccountTransactionBody](#TokenWipeAccountTransactionBody)

- [Transaction.proto](#Transaction.proto)
  - [Transaction](#Transaction)

- [TransactionBody.proto](#TransactionBody.proto)
  - [TransactionBody](#TransactionBody)

- [TransactionContents.proto](#TransactionContents.proto)
  - [SignedTransaction](#SignedTransaction)

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

- [UncheckedSubmit.proto](#UncheckedSubmit.proto)
  - [UncheckedSubmitBody](#UncheckedSubmitBody)

<a name="AccountBalanceFile.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## AccountBalanceFile.proto

-<BR>‌<BR>Hedera Network Services Protobuf<BR>​<BR>Copyright (C) 2018 - 2021 Hedera Hashgraph, LLC<BR>​<BR>Licensed under the Apache License, Version 2.0 (the "License");<BR>you may not use this file except in compliance with the License.<BR>You may obtain a copy of the License at<BR>http:www.apache.org/licenses/LICENSE-2.0<BR>Unless required by applicable law or agreed to in writing, software<BR>distributed under the License is distributed on an "AS IS" BASIS,<BR>WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<BR>See the License for the specific language governing permissions and<BR>limitations under the License.<BR>‍

<a name="AllAccountBalances"></a>

### AllAccountBalances
 Includes all currency balances (both hbar and token) of all accounts in the ledger. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| consensusTimestamp | [Timestamp](#Timestamp) | An instant in consensus time | |
| allAccounts | [SingleAccountBalances](#SingleAccountBalances) | The list of account balances for all accounts, after handling all transactions with consensus timestamp up to and including the above instant | |


<a name="SingleAccountBalances"></a>

### SingleAccountBalances
 Includes all currency balances (both hbar and token) of a single account in the ledger. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountID | [AccountID](#AccountID) | The account | |
| hbarBalance |  | The account's hbar balance | |
| tokenUnitBalances | [TokenUnitBalance](#TokenUnitBalance) | The list of the account's token balances | |


<a name="TokenUnitBalance"></a>

### TokenUnitBalance


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| tokenId | [TokenID](#TokenID) | A unique token id | |
| balance |  | Number of transferable units of the identified token. For token of type FUNGIBLE_COMMON - balance in the smallest denomination. For token of type NON_FUNGIBLE_UNIQUE - the number of NFTs held by the account | |


<a name="BasicTypes.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## BasicTypes.proto

 Each shard has a nonnegative shard number. Each realm within a given shard has a nonnegative realm number (that number might be reused in other shards). And each account, file, and smart contract instance within a given realm has a nonnegative number (which might be reused in other realms). Every account, file, and smart contract instance is within exactly one realm. So a FileID is a triplet of numbers, like 0.1.2 for entity number 2 within realm 1  within shard 0.  Each realm maintains a single counter for assigning numbers,  so if there is a file with ID 0.1.2, then there won't be an account or smart  contract instance with ID 0.1.2.

<a name="AccountAmount"></a>

### AccountAmount
 An account, and the amount that it sends or receives during a cryptocurrency or token transfer. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountID | [AccountID](#AccountID) | The Account ID that sends/receives cryptocurrency or tokens | |
| amount | [sint64](#sint64) | The amount of tinybars (for Crypto transfers) or in the lowest denomination (for Token transfers) that the account sends(negative) or receives(positive) | |


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


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| min |  | A minimum, the calculated fee must be greater than this value | |
| max |  | A maximum, the calculated fee must be less than this value | |
| constant |  | A constant contribution to the fee | |
| bpt |  | The price of bandwidth consumed by a transaction, measured in bytes | |
| vpt |  | The price per signature verification for a transaction | |
| rbh |  | The price of RAM consumed by a transaction, measured in byte-hours | |
| sbh |  | The price of storage consumed by a transaction, measured in byte-hours | |
| gas |  | The price of computation for a smart contract transaction, measured in gas | |
| tv |  | The price per hbar transferred for a transfer | |
| bpr |  | The price of bandwidth for data retrieved from memory for a response, measured in bytes | |
| sbpr |  | The price of bandwidth for data retrieved from disk for a response, measured in bytes | |


<a name="FeeData"></a>

### FeeData


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nodedata | [FeeComponents](#FeeComponents) |  Fee paid to the submitting node | |
| networkdata | [FeeComponents](#FeeComponents) |  Fee paid to the network for processing a transaction into consensus | |
| servicedata | [FeeComponents](#FeeComponents) |  Fee paid to the network for providing the service associated with the transaction; for instance, storing a file | |
| subType | [SubType](#SubType) |  SubType distinguishing between different types of FeeData, correlating to the same HederaFunctionality | |


<a name="FeeSchedule"></a>

### FeeSchedule


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transactionFeeSchedule | [TransactionFeeSchedule](#TransactionFeeSchedule) |  List of price coefficients for network resources | |
| expiryTime | [TimestampSeconds](#TimestampSeconds) |  FeeSchedule expiry time | |


<a name="FileID"></a>

### FileID
 The ID for a file  

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | The shard number (nonnegative) | |
| realmNum |  | The realm number (nonnegative) | |
| fileNum |  | A nonnegative File number unique within its realm | |


<a name="Fraction"></a>

### Fraction
 A rational number, used to set the amount of a value transfer to collect as a custom fee 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| numerator |  | The rational's numerator | |
| denominator |  | The rational's denominator; a zero value will result in FRACTION_DIVIDES_BY_ZERO | |


<a name="HederaFunctionality"></a>

### HederaFunctionality


| Enum Name | Description |
| --------- | ----------- |
| NONE | UNSPECIFIED - Need to keep first value as unspecified because first element is ignored and not parsed (0 is ignored by parser) |
| CryptoTransfer | crypto transfer |
| CryptoUpdate | crypto update account |
| CryptoDelete | crypto delete account |
| CryptoAddLiveHash |  Add a livehash to a crypto account |
| CryptoDeleteLiveHash |  Delete a livehash from a crypto account |
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
| CryptoGetLiveHash |  Get a live hash from a crypto account |
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
| GetVersionInfo | Get Version |
| TransactionGetReceipt | Transaction Get Receipt |
| ConsensusCreateTopic | Create Topic |
| ConsensusUpdateTopic | Update Topic |
| ConsensusDeleteTopic | Delete Topic |
| ConsensusGetTopicInfo | Get Topic information |
| ConsensusSubmitMessage | Submit message to topic |
| UncheckedSubmit |  |
| TokenCreate | Create Token |
| TokenGetInfo | Get Token information |
| TokenFreezeAccount | Freeze Account |
| TokenUnfreezeAccount | Unfreeze Account |
| TokenGrantKycToAccount | Grant KYC to Account |
| TokenRevokeKycFromAccount | Revoke KYC from Account |
| TokenDelete | Delete Token |
| TokenUpdate | Update Token |
| TokenMint | Mint tokens to treasury |
| TokenBurn | Burn tokens from treasury |
| TokenAccountWipe | Wipe token amount from Account holder |
| TokenAssociateToAccount | Associate tokens to an account |
| TokenDissociateFromAccount | Dissociate tokens from an account |
| ScheduleCreate | Create Scheduled Transaction |
| ScheduleDelete | Delete Scheduled Transaction |
| ScheduleSign | Sign Scheduled Transaction |
| ScheduleGetInfo | Get Scheduled Transaction Information |
| TokenGetAccountNftInfos | Get Token Account Nft Information |
| TokenGetNftInfo | Get Token Nft Information |
| TokenGetNftInfos | Get Token Nft List Information |


<a name="Key"></a>

### Key
 A Key can be a public key from one of the three supported systems (ed25519, RSA-3072,  ECDSA with p384). Or, it can be the ID of a smart contract instance, which is authorized to act as if it had a key. If an account has an ed25519 key associated with it, then the corresponding private key must sign any transaction to transfer cryptocurrency out of it. And similarly for RSA and ECDSA.<BR>A Key can be a smart contract ID, which means that smart contract is to authorize operations as if it had signed with a key that it owned. The smart contract doesn't actually have a key, and  doesn't actually sign a transaction. But it's as if a virtual transaction were created, and the smart contract signed it with a private key.<BR>A Key can be a "threshold key", which means a list of M keys, any N of which must sign in order for the threshold signature to be considered valid. The keys within a threshold signature may themselves be threshold signatures, to allow complex signature requirements.<BR>A Key can be a "key list" where all keys in the list must sign unless specified otherwise in the documentation for a specific transaction type (e.g. FileDeleteTransactionBody).  Their use is dependent on context. For example, a Hedera file is created with a list of keys, where all of them must sign a transaction to create or modify the file, but only one of them is needed to sign a transaction to delete the file. So it's a single list that sometimes acts as a 1-of-M threshold key, and sometimes acts as an M-of-M threshold key. A key list is always an M-of-M, unless specified otherwise in documentation. A key list can have nested key lists or threshold keys. Nested key lists are always M-of-M. A key list can have repeated Ed25519 public keys, but all repeated keys are only required to sign once.<BR>A Key can contain a ThresholdKey or KeyList, which in turn contain a Key, so this mutual recursion would allow nesting arbitrarily deep. A ThresholdKey which contains a list of primitive keys (e.g., ed25519) has 3 levels: ThresholdKey -> KeyList -> Key. A KeyList which contains several primitive keys (e.g., ed25519) has 2 levels: KeyList -> Key. A Key with 2 levels of nested ThresholdKeys has 7 levels: Key -> ThresholdKey -> KeyList -> Key -> ThresholdKey -> KeyList -> Key.<BR>Each Key should not have more than 46 levels, which implies 15 levels of nested ThresholdKeys. Only ed25519 primitive keys are currently supported.

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
 A list of keys that requires all keys (M-of-M) to sign unless otherwise specified in documentation. A KeyList may contain repeated keys, but all repeated keys are only required to sign once. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| keys | [Key](#Key) | list of keys | |


<a name="NftTransfer"></a>

### NftTransfer
 A sender account, a receiver account, and the serial number of an NFT of a Token with NON_FUNGIBLE_UNIQUE type. When minting NFTs the sender will be the default AccountID instance (0.0.0) and when burning NFTs, the receiver will be the default AccountID instance. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| senderAccountID | [AccountID](#AccountID) | The accountID of the sender | |
| receiverAccountID | [AccountID](#AccountID) | The accountID of the receiver | |
| serialNumber |  | The serial number of the NFT | |


<a name="NodeAddress"></a>

### NodeAddress


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| ipAddress |  | The IP address of the Node with separator & octets encoded in UTF-8. Usage is deprecated, ServiceEndpoint is preferred to retrieve a node's list of IP addresses and ports | |
| portno |  | The port number of the grpc server for the node.  Usage is deprecated, ServiceEndpoint is preferred to retrieve a node's list of IP addresses and ports | |
| memo |  | Usage is deprecated, nodeAccountId is preferred to retrieve a node's account ID | |
| RSA_PubKey |  | The node's hex-encoded X509 RSA public key | |
| nodeId |  | # A non-sequential identifier for the node | |
| nodeAccountId | [AccountID](#AccountID) | # The account to be paid for queries and transactions sent to this node | |
| nodeCertHash |  | # The hex-encoded SHA-384 hash of the X509 cert used to encrypt gRPC traffic to the node | |
| serviceEndpoint | [ServiceEndpoint](#ServiceEndpoint) | # A node's service IP addresses and ports | |
| description |  | A description of the node, with UTF-8 encoding up to 100 bytes | |
| stake |  | The amount of tinybars staked to the node | |


<a name="NodeAddressBook"></a>

### NodeAddressBook


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nodeAddress | [NodeAddress](#NodeAddress) | Metadata of all nodes in the network | |


<a name="RealmID"></a>

### RealmID
 The ID for a realm. Within a given shard, every realm has a unique ID. Each account, file, and contract instance belongs to exactly one realm. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | The shard number (nonnegative) | |
| realmNum |  | The realm number (nonnegative) | |


<a name="ScheduleID"></a>

### ScheduleID
 Unique identifier for a Schedule 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | A nonnegative shard number | |
| realmNum |  | A nonnegative realm number | |
| scheduleNum |  | A nonnegative schedule number | |


<a name="SemanticVersion"></a>

### SemanticVersion
 Hedera follows semantic versioning (https:semver.org/) for both the HAPI protobufs and the Services software.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| major |  | Increases with incompatible API changes | |
| minor |  | Increases with backwards-compatible new functionality | |
| patch |  | Increases with backwards-compatible bug fixes | |
| pre |  | A pre-release version MAY be denoted by appending a hyphen and a series of dot separated identifiers (https:semver.org/#spec-item-9); so given a semver 0.14.0-alpha.1+21AF26D3, this field would contain 'alpha.1' | |
| build |  | Build metadata MAY be denoted by appending a plus sign and a series of dot separated identifiers immediately following the patch or pre-release version (https:semver.org/#spec-item-10); so given a semver 0.14.0-alpha.1+21AF26D3, this field would contain '21AF26D3' | |


<a name="ServiceEndpoint"></a>

### ServiceEndpoint


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| ipAddressV4 |  | The 32-bit IPv4 address of the node encoded in left to right order (e.g. 127.0.0.1 has 127 as its first byte) | |
| port |  | The port of the node | |


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
| option | [deprecated=true](#deprecated=true) |  | |
| signature | oneof |  | |
| | contract |  | smart contract virtual signature (always length zero) | |
| | ed25519 |  | ed25519 signature bytes | |
| | RSA_3072 |  | RSA-3072 signature bytes | |
| | ECDSA_384 |  | ECDSA p-384 signature bytes | |
| | thresholdSignature | [ThresholdSignature](#ThresholdSignature) | A list of signatures for a single N-of-M threshold Key. This must be a list of exactly M signatures, at least N of which are non-null. | |
| | signatureList | [SignatureList](#SignatureList) | A list of M signatures, each corresponding to a Key in a KeyList of the same length. | |


<a name="SignatureList"></a>

### SignatureList


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
| sigs | [Signature](#Signature) | each signature corresponds to a Key in the KeyList | |


<a name="SignatureMap"></a>

### SignatureMap


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| sigPair | [SignaturePair](#SignaturePair) | Each signature pair corresponds to a unique Key required to sign the transaction. | |


<a name="SignaturePair"></a>

### SignaturePair


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| pubKeyPrefix |  | First few bytes of the public key | |
| signature | oneof |  | |
| | contract |  | smart contract virtual signature (always length zero) | |
| | ed25519 |  | ed25519 signature | |
| | RSA_3072 |  | RSA-3072 signature | |
| | ECDSA_384 |  | ECDSA p-384 signature | |


<a name="SubType"></a>

### SubType
<BR>Possible FeeData Object SubTypes. Supplementary to the main HederaFunctionality Type.<BR>When not explicitly specified, DEFAULT is used.

| Enum Name | Description |
| --------- | ----------- |
| DEFAULT |  |
| TOKEN_FUNGIBLE_COMMON |  |
| TOKEN_NON_FUNGIBLE_UNIQUE |  |


<a name="ThresholdKey"></a>

### ThresholdKey
 A set of public keys that are used together to form a threshold signature. If the threshold is N and there are M keys, then this is an N of M threshold signature. If an account is associated with ThresholdKeys, then a transaction to move cryptocurrency out of it must be signed by a list of M signatures, where at most M-N of them are blank, and the other at least N of them are valid signatures corresponding to at least N of the public keys listed here. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| threshold |  | A valid signature set must have at least this many signatures | |
| keys | [KeyList](#KeyList) | List of all the keys that can sign | |


<a name="ThresholdSignature"></a>

### ThresholdSignature


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
| sigs | [SignatureList](#SignatureList) | for an N-of-M threshold key, this is a list of M signatures, at least N of which must be non-null | |


<a name="TokenBalance"></a>

### TokenBalance
 A number of <i>transferable units</i> of a certain token.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| tokenId | [TokenID](#TokenID) | A unique token id | |
| balance |  | Number of transferable units of the identified token. For token of type FUNGIBLE_COMMON - balance in the smallest denomination. For token of type NON_FUNGIBLE_UNIQUE - the number of NFTs held by the account | |
| decimals |  | Tokens divide into <tt>10<sup>decimals</sup></tt> pieces | |


<a name="TokenBalances"></a>

### TokenBalances
 A sequence of token balances 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| tokenBalances | [TokenBalance](#TokenBalance) |  | |


<a name="TokenFreezeStatus"></a>

### TokenFreezeStatus
 Possible Freeze statuses returned on TokenGetInfoQuery or CryptoGetInfoResponse in TokenRelationship 

| Enum Name | Description |
| --------- | ----------- |
| FreezeNotApplicable |  |
| Frozen |  |
| Unfrozen |  |


<a name="TokenID"></a>

### TokenID
 Unique identifier for a token 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| shardNum |  | A nonnegative shard number | |
| realmNum |  | A nonnegative realm number | |
| tokenNum |  | A nonnegative token number | |


<a name="TokenKycStatus"></a>

### TokenKycStatus
 Possible KYC statuses returned on TokenGetInfoQuery or CryptoGetInfoResponse in TokenRelationship 

| Enum Name | Description |
| --------- | ----------- |
| KycNotApplicable |  |
| Granted |  |
| Revoked |  |


<a name="TokenRelationship"></a>

### TokenRelationship
 Token's information related to the given Account 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| tokenId | [TokenID](#TokenID) | The ID of the token | |
| symbol |  | The Symbol of the token | |
| balance |  | For token of type FUNGIBLE_COMMON - the balance that the Account holds in the smallest denomination. For token of type NON_FUNGIBLE_UNIQUE - the number of NFTs held by the account | |
| kycStatus | [TokenKycStatus](#TokenKycStatus) | The KYC status of the account (KycNotApplicable, Granted or Revoked). If the token does not have KYC key, KycNotApplicable is returned | |
| freezeStatus | [TokenFreezeStatus](#TokenFreezeStatus) | The Freeze status of the account (FreezeNotApplicable, Frozen or Unfrozen). If the token does not have Freeze key, FreezeNotApplicable is returned | |
| decimals |  | Tokens divide into <tt>10<sup>decimals</sup></tt> pieces | |


<a name="TokenSupplyType"></a>

### TokenSupplyType
<BR>Possible Token Supply Types (IWA Compatibility).<BR>Indicates how many tokens can have during its lifetime.

| Enum Name | Description |
| --------- | ----------- |
| INFINITE | Indicates that tokens of that type have an upper bound of Long.MAX_VALUE. |
| FINITE | Indicates that tokens of that type have an upper bound of maxSupply, provided on token creation. |


<a name="TokenTransferList"></a>

### TokenTransferList
 A list of token IDs and amounts representing the transferred out (negative) or into (positive) amounts, represented in the lowest denomination of the token 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The ID of the token | |
| transfers | [AccountAmount](#AccountAmount) | Applicable to tokens of type FUNGIBLE_COMMON. Multiple list of AccountAmounts, each of which has an account and amount | |
| nftTransfers | [NftTransfer](#NftTransfer) | Applicable to tokens of type NON_FUNGIBLE_UNIQUE. Multiple list of NftTransfers, each of which has a sender and receiver account, including the serial number of the NFT | |


<a name="TokenType"></a>

### TokenType
<BR>Possible Token Types (IWA Compatibility).<BR>Apart from fungible and non-fungible, Tokens can have either a common or unique representation. This distinction might seem subtle, but it is important when considering<BR>how tokens can be traced and if they can have isolated and unique properties.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
|  |  |
| FUNGIBLE_COMMON |  |
| * |  |
| * |  |
|  |  |
| NON_FUNGIBLE_UNIQUE |  |


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
| hederaFunctionality | [HederaFunctionality](#HederaFunctionality) |  A particular transaction or query | |
| feeData | [FeeData](#FeeData) |  Resource price coefficients | |
| fees | [FeeData](#FeeData) |  Resource price coefficients. Supports subtype price definition. | |


<a name="TransactionID"></a>

### TransactionID


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transactionValidStart | [Timestamp](#Timestamp) | The transaction is invalid if consensusTimestamp < transactionID.transactionStartValid | |
| accountID | [AccountID](#AccountID) | The Account ID that paid for this transaction | |
| scheduled |  | Whether the Transaction is of type Scheduled or no | |


<a name="TransferList"></a>

### TransferList
 A list of accounts and amounts to transfer out of each account (negative) or into it (positive). 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountAmounts | [AccountAmount](#AccountAmount) | Multiple list of AccountAmount pairs, each of which has an account and an amount to transfer into it (positive) or out of it (negative) | |


<a name="ConsensusCreateTopic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusCreateTopic.proto

 See [ConsensusService.createTopic()](#proto.ConsensusService)

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

 See [ConsensusService.deleteTopic()](#proto.ConsensusService)

<a name="ConsensusDeleteTopicTransactionBody"></a>

### ConsensusDeleteTopicTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| topicID | [TopicID](#TopicID) | Topic identifier. | |


<a name="ConsensusGetTopicInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusGetTopicInfo.proto

 See [ConsensusService.getTopicInfo()](#proto.ConsensusService)

<a name="ConsensusGetTopicInfoQuery"></a>

### ConsensusGetTopicInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) |  Standard info sent from client to node, including the signed payment, and what kind of response is requested<BR>(cost, state proof, both, or neither). | |
| topicID | [TopicID](#TopicID) |  The Topic for which information is being requested | |


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

 The Consensus Service provides the ability for Hedera Hashgraph to provide aBFT consensus as to the order and<BR>validity of messages submitted to a topic, as well as a consensus timestamp for those messages.<BR>Automatic renewal can be configured via an autoRenewAccount.<BR>Any time an autoRenewAccount is added to a topic, that createTopic/updateTopic transaction must be signed by<BR>the autoRenewAccount.<BR>The autoRenewPeriod on an account must currently be set a value in createTopic between MIN_AUTORENEW_PERIOD (6999999<BR>seconds) and MAX_AUTORENEW_PERIOD (8000001 seconds). During creation this sets the initial expirationTime of the<BR>topic (see more below).<BR>If no adminKey is on a topic, there may not be an autoRenewAccount on the topic, deleteTopic is not allowed,<BR>and the only change allowed via an updateTopic is to extend the expirationTime.<BR>If an adminKey is on a topic, every updateTopic and deleteTopic transaction must be signed by the adminKey, except<BR>for updateTopics which only extend the topic's expirationTime (no adminKey authorization required).<BR>If an updateTopic modifies the adminKey of a topic, the transaction signatures on the updateTopic must fulfill both<BR>the pre-update and post-update adminKey signature requirements.<BR>Mirrornet ConsensusService may be used to subscribe to changes on the topic, including changes to the topic<BR>definition and the consensus ordering and timestamp of submitted messages.<BR>Until autoRenew functionality is supported by HAPI, the topic will not expire, the autoRenewAccount will not be<BR>charged, and the topic will not automatically be deleted.<BR>Once autoRenew functionality is supported by HAPI:<BR>1. Once the expirationTime is encountered, if an autoRenewAccount is configured on the topic, the account will be<BR>charged automatically at the expirationTime, to extend the expirationTime of the topic up to the topic's<BR>autoRenewPeriod (or as much extension as the account's balance will supply).<BR>2. If the topic expires and is not automatically renewed, the topic will enter the EXPIRED state. All transactions<BR>on the topic will fail with TOPIC_EXPIRED, except an updateTopic() call that modifies only the expirationTime.<BR>getTopicInfo() will succeed. This state will be available for a AUTORENEW_GRACE_PERIOD grace period (7 days).<BR>3. After the grace period, if the topic's expirationTime is not extended, the topic will be automatically<BR>deleted and no transactions or queries on the topic will succeed after that point.

<a name="ConsensusService"></a>

### ConsensusService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createTopic  | Transaction | TransactionResponse |  Create a topic to be used for consensus.<BR>If an autoRenewAccount is specified, that account must also sign this transaction.<BR>If an adminKey is specified, the adminKey must sign the transaction.<BR>On success, the resulting TransactionReceipt contains the newly created TopicId.<BR>Request is [ConsensusCreateTopicTransactionBody](#proto.ConsensusCreateTopicTransactionBody) |
| updateTopic  | Transaction | TransactionResponse |  Update a topic.<BR>If there is no adminKey, the only authorized update (available to anyone) is to extend the expirationTime.<BR>Otherwise transaction must be signed by the adminKey.<BR>If an adminKey is updated, the transaction must be signed by the pre-update adminKey and post-update adminKey.<BR>If a new autoRenewAccount is specified (not just being removed), that account must also sign the transaction.<BR>Request is [ConsensusUpdateTopicTransactionBody](#proto.ConsensusUpdateTopicTransactionBody) |
| deleteTopic  | Transaction | TransactionResponse |  Delete a topic. No more transactions or queries on the topic (via HAPI) will succeed.<BR>If an adminKey is set, this transaction must be signed by that key.<BR>If there is no adminKey, this transaction will fail UNAUTHORIZED.<BR>Request is [ConsensusDeleteTopicTransactionBody](#proto.ConsensusDeleteTopicTransactionBody) |
| getTopicInfo  | Query | Response |  Retrieve the latest state of a topic. This method is unrestricted and allowed on any topic by any payer account.<BR>Deleted accounts will not be returned.<BR>Request is [ConsensusGetTopicInfoQuery](#proto.ConsensusGetTopicInfoQuery)<BR>Response is [ConsensusGetTopicInfoResponse](#proto.ConsensusGetTopicInfoResponse) |
| submitMessage  | Transaction | TransactionResponse |  Submit a message for consensus.<BR>Valid and authorized messages on valid topics will be ordered by the consensus service, gossipped to the<BR>mirror net, and published (in order) to all subscribers (from the mirror net) on this topic.<BR>The submitKey (if any) must sign this transaction.<BR>On success, the resulting TransactionReceipt contains the topic's updated topicSequenceNumber and<BR>topicRunningHash.<BR>Request is [ConsensusSubmitMessageTransactionBody](#proto.ConsensusSubmitMessageTransactionBody) |


<a name="ConsensusSubmitMessage.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusSubmitMessage.proto

-<BR>‌<BR>Hedera Network Services Protobuf<BR>​<BR>Copyright (C) 2018 - 2021 Hedera Hashgraph, LLC<BR>​<BR>Licensed under the Apache License, Version 2.0 (the "License");<BR>you may not use this file except in compliance with the License.<BR>You may obtain a copy of the License at<BR>http:www.apache.org/licenses/LICENSE-2.0<BR>Unless required by applicable law or agreed to in writing, software<BR>distributed under the License is distributed on an "AS IS" BASIS,<BR>WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<BR>See the License for the specific language governing permissions and<BR>limitations under the License.<BR>‍

<a name="ConsensusMessageChunkInfo"></a>

### ConsensusMessageChunkInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| initialTransactionID | [TransactionID](#TransactionID) | TransactionID of the first chunk, gets copied to every subsequent chunk in a fragmented message. | |
| total |  | The total number of chunks in the message. | |
| number |  | The sequence number (from 1 to total) of the current chunk in the message. | |


<a name="ConsensusSubmitMessageTransactionBody"></a>

### ConsensusSubmitMessageTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| topicID | [TopicID](#TopicID) | Topic to submit message to. | |
| message |  | Message to be submitted. Max size of the Transaction (including signatures) is 6KiB. | |
| chunkInfo | [ConsensusMessageChunkInfo](#ConsensusMessageChunkInfo) | Optional information of the current chunk in a fragmented message. | |


<a name="ConsensusTopicInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusTopicInfo.proto

 Current state of a topic.

<a name="ConsensusTopicInfo"></a>

### ConsensusTopicInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| memo |  | The memo associated with the topic (UTF-8 encoding max 100 bytes) | |
| runningHash |  |  When a topic is created, its running hash is initialized to 48 bytes of binary zeros.<BR>For each submitted message, the topic's running hash is then updated to the output<BR>of a particular SHA-384 digest whose input data include the previous running hash.<BR><BR>See the TransactionReceipt.proto documentation for an exact description of the<BR>data included in the SHA-384 digest used for the update. | |
| sequenceNumber |  |  Sequence number (starting at 1 for the first submitMessage) of messages on the topic. | |
| expirationTime | [Timestamp](#Timestamp) |  Effective consensus timestamp at (and after) which submitMessage calls will no longer succeed on the topic<BR>and the topic will expire and after AUTORENEW_GRACE_PERIOD be automatically deleted. | |
| adminKey | [Key](#Key) | Access control for update/delete of the topic. Null if there is no key. | |
| submitKey | [Key](#Key) | Access control for ConsensusService.submitMessage. Null if there is no key. | |
| autoRenewPeriod | [Duration](#Duration) | If an auto-renew account is specified, when the topic expires, its lifetime will be extended by up to this duration (depending on the solvency of the auto-renew account). If the auto-renew account has no funds at all, the topic will be deleted instead. | |
| autoRenewAccount | [AccountID](#AccountID) | The account, if any, to charge for automatic renewal of the topic's lifetime upon expiry. | |


<a name="ConsensusUpdateTopic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ConsensusUpdateTopic.proto

 All fields left null will not be updated.<BR>See [ConsensusService.updateTopic()](#proto.ConsensusService)

<a name="ConsensusUpdateTopicTransactionBody"></a>

### ConsensusUpdateTopicTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| topicID | [TopicID](#TopicID) |  | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) | If set, the new memo to be associated with the topic (UTF-8 encoding max 100 bytes) | |
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

 The log information for an event returned by a smart contract function call. One function call may return several such events. 

<a name="ContractCallLocalQuery"></a>

### ContractCallLocalQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). The payment must cover the fees and all of the gas offered. | |
| contractID | [ContractID](#ContractID) | the contract instance to call, in the format used in transactions | |
| gas |  | The amount of gas to use for the call; all of the gas offered will be used and charged a corresponding fee | |
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
| gasUsed |  | units of gas used to execute contract | |
| logInfo | [ContractLoginfo](#ContractLoginfo) | the log info for events returned by the function | |
| createdContractIDs | [ContractID](#ContractID) | the list of smart contracts that were created by the function call | |


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
| contractID | [ContractID](#ContractID) |  The id of the contract to be deleted | |
| obtainers | oneof |  | |
| | transferAccountID | [AccountID](#AccountID) |  The id of an account to receive any remaining hBars from the deleted contract | |
| | transferContractID | [ContractID](#ContractID) |  The id of a contract to receive any remaining hBars from the deleted contract | |


<a name="ContractGetBytecode.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractGetBytecode.proto

 Get the bytecode for a smart contract instance 

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

 Get information about a smart contract instance. This includes the account that it uses, the file containing its bytecode, and the time when it will expire. 

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
| deleted |  | Whether the contract has been deleted | |
| tokenRelationships | [TokenRelationship](#TokenRelationship) | The tokens associated to the contract | |


<a name="ContractGetRecords.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ContractGetRecords.proto

 Before v0.9.0, requested records of all transactions against the given contract in the last 25 hours.

<a name="ContractGetRecordsQuery"></a>

### ContractGetRecordsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| contractID | [ContractID](#ContractID) | The smart contract instance for which the records should be retrieved | |


<a name="ContractGetRecordsResponse"></a>

### ContractGetRecordsResponse
 Before v0.9.0, returned records of all transactions against the given contract in the last 25 hours.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
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
| contractID | [ContractID](#ContractID) |  The id of the contract to be updated | |
| expirationTime | [Timestamp](#Timestamp) |  The new expiry of the contract, no earlier than the current expiry (resolves to EXPIRATION_REDUCTION_NOT_ALLOWED otherwise) | |
| adminKey | [Key](#Key) |  The new key to control updates to the contract | |
| proxyAccountID | [AccountID](#AccountID) |  (NOT YET IMPLEMENTED) The new id of the account to which the contract is proxy staked | |
| autoRenewPeriod | [Duration](#Duration) |  (NOT YET IMPLEMENTED) The new interval at which the contract will pay to extend its expiry (by the same interval) | |
| fileID | [FileID](#FileID) |  The new id of the file asserted to contain the bytecode of the Solidity transaction that created this contract | |
| memoField | oneof |  | |
| | memo |  | [Deprecated] If set with a non-zero length, the new memo to be associated with the account (UTF-8 encoding max 100 bytes) | |
| | memoWrapper | [google.protobuf.StringValue](#google.protobuf.StringValue) | If set, the new memo to be associated with the account (UTF-8 encoding max 100 bytes) | |


<a name="CryptoAddLiveHash.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoAddLiveHash.proto

 A hash---presumably of some kind of credential or certificate---along with a list of keys, each of which may be either a primitive or a threshold key. 

<a name="CryptoAddLiveHashTransactionBody"></a>

### CryptoAddLiveHashTransactionBody
 At consensus, attaches the given livehash to the given account.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| liveHash | [LiveHash](#LiveHash) |  A hash of some credential or certificate, along with the keys of the entities that asserted it validity | |


<a name="LiveHash"></a>

### LiveHash


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountId | [AccountID](#AccountID) |  The account to which the livehash is attached | |
| hash |  |  The SHA-384 hash of a credential or certificate | |
| keys | [KeyList](#KeyList) |  A list of keys (primitive or threshold), all of which must sign to attach the livehash to an account, and any one of which can later delete it. | |
| duration | [Duration](#Duration) |  The duration for which the livehash will remain valid | |


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
| sendRecordThreshold |  | [Deprecated]. The threshold amount (in tinybars) for which an account record is created for any send/withdraw transaction | |
| receiveRecordThreshold |  | [Deprecated]. The threshold amount (in tinybars) for which an account record is created for any receive/deposit transaction | |
| receiverSigRequired |  | If true, this account's key must sign any transaction depositing into this account (in addition to all withdrawals) | |
| autoRenewPeriod | [Duration](#Duration) | The account is charged to extend its expiration date every this many seconds. If it doesn't have enough balance, it extends as long as possible. If it is empty when it expires, then it is deleted. | |
| shardID | [ShardID](#ShardID) | The shard in which this account is created | |
| realmID | [RealmID](#RealmID) | The realm in which this account is created (leave this null to create a new realm) | |
| newRealmAdminKey | [Key](#Key) | If realmID is null, then this the admin key for the new realm that will be created | |
| memo |  | The memo associated with the account (UTF-8 encoding max 100 bytes) | |


<a name="CryptoDelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoDelete.proto

 Mark an account as deleted, moving all its current hbars to another account. It will remain in the ledger, marked as deleted, until it expires. Transfers into it a deleted account fail. But a deleted account can still have its expiration extended in the normal way. 

<a name="CryptoDeleteTransactionBody"></a>

### CryptoDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transferAccountID | [AccountID](#AccountID) | The account ID which will receive all remaining hbars | |
| deleteAccountID | [AccountID](#AccountID) | The account ID which should be deleted | |


<a name="CryptoDeleteLiveHash.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoDeleteLiveHash.proto

 At consensus, deletes a livehash associated to the given account. The transaction must be signed by either the key of the owning account, or at least one of the keys associated to the livehash. 

<a name="CryptoDeleteLiveHashTransactionBody"></a>

### CryptoDeleteLiveHashTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| accountOfLiveHash | [AccountID](#AccountID) |  The account owning the livehash | |
| liveHashToDelete |  |  The SHA-384 livehash to delete from the account | |


<a name="CryptoGetAccountBalance.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetAccountBalance.proto

 Get the balance of a cryptocurrency account. This returns only the balance, so it is a smaller

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
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither. | |
| accountID | [AccountID](#AccountID) | The account ID that is being described (this is useful with state proofs, for proving to a third party) | |
| balance |  | The current balance, in tinybars. | |
| tokenBalances | [TokenBalance](#TokenBalance) | The token balances possessed by the target account. | |


<a name="CryptoGetAccountRecords.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetAccountRecords.proto

 Requests records of all transactions for which the given account was the effective payer in the last 3 minutes of consensus time and <tt>ledger.keepRecordsInState=true</tt> was true during <tt>handleTransaction</tt>.

<a name="CryptoGetAccountRecordsQuery"></a>

### CryptoGetAccountRecordsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| accountID | [AccountID](#AccountID) | The account ID for which the records should be retrieved | |


<a name="CryptoGetAccountRecordsResponse"></a>

### CryptoGetAccountRecordsResponse
 Returns records of all transactions for which the given account was the effective payer in the last 3 minutes of consensus time and <tt>ledger.keepRecordsInState=true</tt> was true during <tt>handleTransaction</tt>.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| accountID | [AccountID](#AccountID) | The account that this record is for | |
| records | [TransactionRecord](#TransactionRecord) | List of records | |


<a name="CryptoGetInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetInfo.proto

 Get all the information about an account, including the balance. This does not get the list of account records. 

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
| generateSendRecordThreshold |  |  [Deprecated]. The threshold amount, in tinybars, at which a record is created of any transaction that decreases the balance of this account by more than the threshold | |
| generateReceiveRecordThreshold |  |  [Deprecated]. The threshold amount, in tinybars, at which a record is created of any transaction that increases the balance of this account by more than the threshold | |
| receiverSigRequired |  | If true, no transaction can transfer to this account unless signed by this account's key | |
| expirationTime | [Timestamp](#Timestamp) | The TimeStamp time at which this account is set to expire | |
| autoRenewPeriod | [Duration](#Duration) | The duration for expiration time will extend every this many seconds. If there are insufficient funds, then it extends as long as possible. If it is empty when it expires, then it is deleted. | |
| liveHashes | [LiveHash](#LiveHash) | All of the livehashes attached to the account (each of which is a hash along with the keys that authorized it and can delete it) | |
| tokenRelationships | [TokenRelationship](#TokenRelationship) | All tokens related to this account | |
| memo |  | The memo associated with the account | |
| ownedNfts |  | The number of NFTs owned by this account | |


<a name="CryptoGetLiveHash.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetLiveHash.proto

 Requests a livehash associated to an account. 

<a name="CryptoGetLiveHashQuery"></a>

### CryptoGetLiveHashQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) |  Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| accountID | [AccountID](#AccountID) |  The account to which the livehash is associated | |
| hash |  |  The SHA-384 data in the livehash | |


<a name="CryptoGetLiveHashResponse"></a>

### CryptoGetLiveHashResponse
 Returns the full livehash associated to an account, if it is present. Note that the only way to obtain a state proof exhibiting the absence of a livehash from an account is to retrieve a state proof of the entire account with its list of livehashes. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) |  Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| liveHash | [LiveHash](#LiveHash) |  The livehash, if present | |


<a name="CryptoGetStakers.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoGetStakers.proto

 Get all the accounts that are proxy staking to this account. For each of them, give the amount currently staked. This is not yet implemented, but will be in a future version of the API. 

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
| createAccount  | Transaction | TransactionResponse |  Creates a new account by submitting the transaction |
| updateAccount  | Transaction | TransactionResponse |  Updates an account by submitting the transaction |
| cryptoTransfer  | Transaction | TransactionResponse |  Initiates a transfer by submitting the transaction |
| cryptoDelete  | Transaction | TransactionResponse |  Deletes and account by submitting the transaction |
| addLiveHash  | Transaction | TransactionResponse |  (NOT CURRENTLY SUPPORTED) Adds a livehash |
| deleteLiveHash  | Transaction | TransactionResponse |  (NOT CURRENTLY SUPPORTED) Deletes a livehash |
| getLiveHash  | Query | Response |  (NOT CURRENTLY SUPPORTED) Retrieves a livehash for an account |
| getAccountRecords  | Query | Response |  Returns all transactions in the last 180s of consensus time for which the given account was the effective payer <b>and</b> network property <tt>ledger.keepRecordsInState</tt> was <tt>true</tt>. |
| cryptoGetBalance  | Query | Response |  Retrieves the balance of an account |
| getAccountInfo  | Query | Response |  Retrieves the metadata of an account |
| getTransactionReceipts  | Query | Response |  Retrieves the latest receipt for a transaction that is either awaiting consensus, or reached consensus in the last 180 seconds |
| getFastTransactionRecord  | Query | Response |  (NOT CURRENTLY SUPPORTED) Returns the records of transactions recently funded by an account |
| getTxRecordByTxID  | Query | Response |  Retrieves the record of a transaction that is either awaiting consensus, or reached consensus in the last 180 seconds |
| getStakersByAccountID  | Query | Response |  (NOT CURRENTLY SUPPORTED) Retrieves the stakers for a node by account id |


<a name="CryptoTransfer.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CryptoTransfer.proto

 Transfers cryptocurrency among two or more accounts by making the desired adjustments to their balances. Each transfer list can specify up to 10 adjustments. Each negative amount is withdrawn from the corresponding account (a sender), and each positive one is added to the corresponding account (a receiver). The amounts list must sum to zero. Each amount is a number of tinybars (there are 100,000,000 tinybars in one hbar).

<a name="CryptoTransferTransactionBody"></a>

### CryptoTransferTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transfers | [TransferList](#TransferList) | The desired hbar balance adjustments | |
| tokenTransfers | [TokenTransferList](#TokenTransferList) | The desired token unit balance adjustments; if any custom fees are assessed, the ledger will try to deduct them from the payer of this CryptoTransfer, resolving the transaction to INSUFFICIENT_PAYER_BALANCE_FOR_CUSTOM_FEE if this is not possible | |


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
| proxyFraction |  | [Deprecated]. Payments earned from proxy staking are shared between the node and this account, with proxyFraction / 10000 going to this account | |
| sendRecordThresholdField | oneof |  | |
| | sendRecordThreshold |  | [Deprecated]. The new threshold amount (in tinybars) for which an account record is created for any send/withdraw transaction | |
| | sendRecordThresholdWrapper | [google.protobuf.UInt64Value](#google.protobuf.UInt64Value) | [Deprecated]. The new threshold amount (in tinybars) for which an account record is created for any send/withdraw transaction | |
| receiveRecordThresholdField | oneof |  | |
| | receiveRecordThreshold |  | [Deprecated]. The new threshold amount (in tinybars) for which an account record is created for any receive/deposit transaction. | |
| | receiveRecordThresholdWrapper | [google.protobuf.UInt64Value](#google.protobuf.UInt64Value) | [Deprecated]. The new threshold amount (in tinybars) for which an account record is created for any receive/deposit transaction. | |
| autoRenewPeriod | [Duration](#Duration) | The duration in which it will automatically extend the expiration period. If it doesn't have enough balance, it extends as long as possible. If it is empty when it expires, then it is deleted. | |
| expirationTime | [Timestamp](#Timestamp) | The new expiration time to extend to (ignored if equal to or before the current one) | |
| receiverSigRequiredField | oneof |  | |
| | receiverSigRequired |  | [Deprecated] Do NOT use this field to set a false value because the server cannot distinguish from the default value. Use receiverSigRequiredWrapper field for this purpose. | |
| | receiverSigRequiredWrapper | [google.protobuf.BoolValue](#google.protobuf.BoolValue) | If true, this account's key must sign any transaction depositing into this account (in addition to all withdrawals) | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) | If set, the new memo to be associated with the account (UTF-8 encoding max 100 bytes) | |


<a name="CustomFees.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## CustomFees.proto

 A fraction of the transferred units of a token to assess as a fee. The amount assessed

<a name="AssessedCustomFee"></a>

### AssessedCustomFee
 A custom transfer fee that was assessed during handling of a CryptoTransfer. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| amount |  | The number of units assessed for the fee | |
| token_id | [TokenID](#TokenID) | The denomination of the fee; taken as hbar if left unset | |
| fee_collector_account_id | [AccountID](#AccountID) | The account to receive the assessed fee | |


<a name="CustomFee"></a>

### CustomFee
 A transfer fee to assess during a CryptoTransfer that transfers units of the token

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fee | oneof |  | |
| | fixed_fee | [FixedFee](#FixedFee) | Fixed fee to be charged | |
| | fractional_fee | [FractionalFee](#FractionalFee) | Fractional fee to be charged | |
| fee_collector_account_id | [AccountID](#AccountID) | The account to receive the custom fee | |


<a name="CustomFees"></a>

### CustomFees
 The custom fees attached to a token; may be marked as mutable or immutable. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| can_update_with_admin_key |  | Whether the fees can be updated with the token's admin key; once this is false, it can never be made true again | |
| custom_fees | [CustomFee](#CustomFee) | All the custom fees attached to the token | |


<a name="FixedFee"></a>

### FixedFee
 A fixed number of units (hbar or token) to asssess as a fee during a CryptoTransfer

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| amount |  | The number of units to assess as a fee | |
| denominating_token_id | [TokenID](#TokenID) | The denomination of the fee; taken as hbar if left unset | |


<a name="FractionalFee"></a>

### FractionalFee


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fractional_amount | [Fraction](#Fraction) | The fraction of the transferred units to assess as a fee | |
| minimum_amount |  | The minimum amount to assess | |
| maximum_amount |  | The maximum amount to assess (zero implies no maximum) | |


<a name="Duration.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Duration.proto

 A length of time in seconds. 

<a name="Duration"></a>

### Duration


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| seconds |  | The number of seconds | |


<a name="ExchangeRate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ExchangeRate.proto

<a name="ExchangeRate"></a>

### ExchangeRate


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| hbarEquiv |  |  Denominator in calculation of exchange rate between hbar and cents | |
| centEquiv |  |  Numerator in calculation of exchange rate between hbar and cents | |
| expirationTime | [TimestampSeconds](#TimestampSeconds) |  Expiration time in seconds for this exchange rate | |


<a name="ExchangeRateSet"></a>

### ExchangeRateSet
 Two sets of exchange rates 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| currentRate | [ExchangeRate](#ExchangeRate) |  Current exchange rate | |
| nextRate | [ExchangeRate](#ExchangeRate) |  Next exchange rate which will take effect when current rate expires | |


<a name="FileAppend.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileAppend.proto

<a name="FileAppendTransactionBody"></a>

### FileAppendTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) |  The file to which the bytes will be appended | |
| contents |  |  The bytes that will be appended to the end of the specified file | |


<a name="FileCreate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileCreate.proto

 Create a new file, containing the given contents.

<a name="FileCreateTransactionBody"></a>

### FileCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| expirationTime | [Timestamp](#Timestamp) | The time at which this file should expire (unless FileUpdateTransaction is used before then to extend its life) | |
| keys | [KeyList](#KeyList) | All keys at the top level of a key list must sign to create or modify the file. Any one of the keys at the top level key list can sign to delete the file. | |
| contents |  | The bytes that are the contents of the file | |
| shardID | [ShardID](#ShardID) | Shard in which this file is created | |
| realmID | [RealmID](#RealmID) | The Realm in which to the file is created (leave this null to create a new realm) | |
| newRealmAdminKey | [Key](#Key) | If realmID is null, then this the admin key for the new realm that will be created | |
| memo |  | The memo associated with the file (UTF-8 encoding max 100 bytes) | |


<a name="FileDelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileDelete.proto

 Delete the given file. After deletion, it will be marked as deleted and will have no contents. But information about it will continue to exist until it expires. A list of keys was given when the file was created. All the top level keys on that list must sign transactions to create or modify the file, but any single one of the top level keys can be used to delete the file. This transaction must be signed by 1-of-M KeyList keys. If keys contains additional KeyList or ThresholdKey then 1-of-M secondary KeyList or ThresholdKey signing requirements must be meet. 

<a name="FileDeleteTransactionBody"></a>

### FileDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | The file to delete. It will be marked as deleted until it expires. Then it will disappear. | |


<a name="FileGetContents.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileGetContents.proto

 Get the contents of a file. The content field is empty (no bytes) if the file is empty. 

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

 Get all of the information about a file, except for its contents. When a file expires, it no longer exists, and there will be no info about it, and the fileInfo field will be blank. If a transaction or smart contract deletes the file, but it has not yet expired, then the fileInfo field will be non-empty, the deleted field will be true, its size will be 0, and its contents will be empty. 

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
| fileInfo | [FileGetInfoResponse.FileInfo](#FileGetInfoResponse.FileInfo) | The information about the file | |


<a name="FileGetInfoResponse.FileInfo"></a>

### FileGetInfoResponse.FileInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | The file ID of the file for which information is requested | |
| size |  | Number of bytes in contents | |
| expirationTime | [Timestamp](#Timestamp) | The current time at which this account is set to expire | |
| deleted |  | True if deleted but not yet expired | |
| keys | [KeyList](#KeyList) | One of these keys must sign in order to modify or delete the file | |
| memo |  | The memo associated with the file | |


<a name="FileService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileService.proto

<a name="FileService"></a>

### FileService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createFile  | Transaction | TransactionResponse |  Creates a file |
| updateFile  | Transaction | TransactionResponse |  Updates a file |
| deleteFile  | Transaction | TransactionResponse |  Deletes a file |
| appendContent  | Transaction | TransactionResponse |  Appends to a file |
| getFileContent  | Query | Response |  Retrieves the file contents |
| getFileInfo  | Query | Response |  Retrieves the file information |
| systemDelete  | Transaction | TransactionResponse |  Deletes a file if the submitting account has network admin privileges |
| systemUndelete  | Transaction | TransactionResponse |  Undeletes a file if the submitting account has network admin privileges |


<a name="FileUpdate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FileUpdate.proto

<a name="FileUpdateTransactionBody"></a>

### FileUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fileID | [FileID](#FileID) | The ID of the file to update | |
| expirationTime | [Timestamp](#Timestamp) | The new expiry time (ignored if not later than the current expiry) | |
| keys | [KeyList](#KeyList) | The new list of keys that can modify or delete the file | |
| contents |  | The new contents that should overwrite the file's current contents | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) | If set, the new memo to be associated with the file (UTF-8 encoding max 100 bytes) | |


<a name="Freeze.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Freeze.proto

 Set the freezing period in which the platform will stop creating events and accepting transactions. This is used before safely shut down the platform for maintenance. 

<a name="FreezeTransactionBody"></a>

### FreezeTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| startHour |  | The start hour (in UTC time), a value between 0 and 23 | |
| startMin |  | The start minute (in UTC time), a value between 0 and 59 | |
| endHour |  | The end hour (in UTC time), a value between 0 and 23 | |
| endMin |  | The end minute (in UTC time), a value between 0 and 59 | |
| updateFile | [FileID](#FileID) | The ID of the file needs to be updated during a freeze transaction | |
| fileHash |  | The hash value of the file, used to verify file content before performing freeze and update | |


<a name="FreezeService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## FreezeService.proto

 The request and responses for freeze service. 

<a name="FreezeService"></a>

### FreezeService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| freeze  | Transaction | TransactionResponse | Freezes the nodes by submitting the transaction. The grpc server returns the TransactionResponse |


<a name="GetByKey.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## GetByKey.proto

 Get all accounts, claims, files, and smart contract instances whose associated keys include the given Key. The given Key must not be a contractID or a ThresholdKey. This is not yet implemented in the API, but will be in the future. 

<a name="EntityID"></a>

### EntityID
 the ID for a single entity (account, livehash, file, or smart contract instance) 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| entity | oneof |  | |
| | accountID | [AccountID](#AccountID) | The Account ID for the cryptocurrency account | |
| | liveHash | [LiveHash](#LiveHash) | A uniquely identifying livehash of an acount | |
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

 Get the IDs in the format used by transactions, given the ID in the format used by Solidity. If the Solidity ID is for a smart contract instance, then both the ContractID and associated AccountID will be returned. 

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


<a name="NetworkGetVersionInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## NetworkGetVersionInfo.proto

 Get the deployed versions of Hedera Services and the HAPI proto in semantic version format 

<a name="NetworkGetVersionInfoQuery"></a>

### NetworkGetVersionInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |


<a name="NetworkGetVersionInfoResponse"></a>

### NetworkGetVersionInfoResponse
 Response when the client sends the node NetworkGetVersionInfoQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| hapiProtoVersion | [SemanticVersion](#SemanticVersion) | The Hedera API (HAPI) protobuf version recognized by the responding node. | |
| hederaServicesVersion | [SemanticVersion](#SemanticVersion) | The version of the Hedera Services software deployed on the responding node. | |


<a name="NetworkService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## NetworkService.proto

 The requests and responses for different network services. 

<a name="NetworkService"></a>

### NetworkService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| getVersionInfo  | Query | Response | Retrieves the active versions of Hedera Services and HAPI proto |
| uncheckedSubmit  | Transaction | TransactionResponse | Submits a "wrapped" transaction to the network, skipping its standard prechecks. (Note that the "wrapper" <tt>UncheckedSubmit</tt> transaction is still subject to normal prechecks, including an authorization requirement that its payer be either the treasury or system admin account.) |


<a name="Query.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Query.proto

 A single query, which is sent from the client to a node. This includes all possible queries. Each Query should not have more than 50 levels. 

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
| | cryptoGetLiveHash | [CryptoGetLiveHashQuery](#CryptoGetLiveHashQuery) | Get a single livehash from a single account, if present | |
| | cryptoGetProxyStakers | [CryptoGetStakersQuery](#CryptoGetStakersQuery) | Get all the accounts that proxy stake to a given account, and how much they proxy stake (not yet implemented in the current API) | |
| | fileGetContents | [FileGetContentsQuery](#FileGetContentsQuery) | Get the contents of a file (the bytes stored in it) | |
| | fileGetInfo | [FileGetInfoQuery](#FileGetInfoQuery) | Get information about a file, such as its expiration date | |
| | transactionGetReceipt | [TransactionGetReceiptQuery](#TransactionGetReceiptQuery) | Get a receipt for a transaction (lasts 180 seconds) | |
| | transactionGetRecord | [TransactionGetRecordQuery](#TransactionGetRecordQuery) | Get a record for a transaction | |
| | transactionGetFastRecord | [TransactionGetFastRecordQuery](#TransactionGetFastRecordQuery) | Get a record for a transaction (lasts 180 seconds) | |
| | consensusGetTopicInfo | [ConsensusGetTopicInfoQuery](#ConsensusGetTopicInfoQuery) | Get the parameters of and state of a consensus topic. | |
| | networkGetVersionInfo | [NetworkGetVersionInfoQuery](#NetworkGetVersionInfoQuery) | Get the versions of the HAPI protobuf and Hedera Services software deployed on the responding node. | |
| | tokenGetInfo | [TokenGetInfoQuery](#TokenGetInfoQuery) | Get all information about a token | |
| | scheduleGetInfo | [ScheduleGetInfoQuery](#ScheduleGetInfoQuery) | Get all information about a scheduled entity | |
| | tokenGetAccountNftInfos | [TokenGetAccountNftInfosQuery](#TokenGetAccountNftInfosQuery) | Get a list of NFTs associated with the account | |
| | tokenGetNftInfo | [TokenGetNftInfoQuery](#TokenGetNftInfoQuery) | Get all information about a NFT | |
| | tokenGetNftInfos | [TokenGetNftInfosQuery](#TokenGetNftInfosQuery) | Get a list of NFTs for the token | |


<a name="QueryHeader.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## QueryHeader.proto

<a name="QueryHeader"></a>

### QueryHeader


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| payment | [Transaction](#Transaction) | A signed CryptoTransferTransaction to pay the node a fee for handling this query | |
| responseType | [ResponseType](#ResponseType) | The requested response, asking for cost, state proof, both, or neither | |


<a name="ResponseType"></a>

### ResponseType


| Enum Name | Description |
| --------- | ----------- |
| ANSWER_ONLY |  Response returns answer |
| ANSWER_STATE_PROOF |  (NOT YET SUPPORTED) Response returns both answer and state proof |
| COST_ANSWER |  Response returns the cost of answer |
| COST_ANSWER_STATE_PROOF |  (NOT YET SUPPORTED) Response returns the total cost of answer and state proof |


<a name="Response.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Response.proto

 A single response, which is returned from the node to the client, after the client sent the node a query. This includes all responses. 

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
| | cryptoGetLiveHash | [CryptoGetLiveHashResponse](#CryptoGetLiveHashResponse) | Contains a livehash associated to an account | |
| | cryptoGetProxyStakers | [CryptoGetStakersResponse](#CryptoGetStakersResponse) | Get all the accounts that proxy stake to a given account, and how much they proxy stake | |
| | fileGetContents | [FileGetContentsResponse](#FileGetContentsResponse) | Get the contents of a file (the bytes stored in it) | |
| | fileGetInfo | [FileGetInfoResponse](#FileGetInfoResponse) | Get information about a file, such as its expiration date | |
| | transactionGetReceipt | [TransactionGetReceiptResponse](#TransactionGetReceiptResponse) | Get a receipt for a transaction | |
| | transactionGetRecord | [TransactionGetRecordResponse](#TransactionGetRecordResponse) | Get a record for a transaction | |
| | transactionGetFastRecord | [TransactionGetFastRecordResponse](#TransactionGetFastRecordResponse) | Get a record for a transaction (lasts 180 seconds) | |
| | consensusGetTopicInfo | [ConsensusGetTopicInfoResponse](#ConsensusGetTopicInfoResponse) | Parameters of and state of a consensus topic.. | |
| | networkGetVersionInfo | [NetworkGetVersionInfoResponse](#NetworkGetVersionInfoResponse) | Semantic versions of Hedera Services and HAPI proto | |
| | tokenGetInfo | [TokenGetInfoResponse](#TokenGetInfoResponse) | Get all information about a token | |
| | scheduleGetInfo | [ScheduleGetInfoResponse](#ScheduleGetInfoResponse) | Get all information about a schedule entity | |
| | tokenGetAccountNftInfos | [TokenGetAccountNftInfosResponse](#TokenGetAccountNftInfosResponse) | A list of the NFTs associated with the account | |
| | tokenGetNftInfo | [TokenGetNftInfoResponse](#TokenGetNftInfoResponse) | All information about an NFT | |
| | tokenGetNftInfos | [TokenGetNftInfosResponse](#TokenGetNftInfosResponse) | A list of the NFTs for the token | |


<a name="ResponseCode.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ResponseCode.proto

-<BR>‌<BR>Hedera Network Services Protobuf<BR>​<BR>Copyright (C) 2018 - 2021 Hedera Hashgraph, LLC<BR>​<BR>Licensed under the Apache License, Version 2.0 (the "License");<BR>you may not use this file except in compliance with the License.<BR>You may obtain a copy of the License at<BR>http:www.apache.org/licenses/LICENSE-2.0<BR>Unless required by applicable law or agreed to in writing, software<BR>distributed under the License is distributed on an "AS IS" BASIS,<BR>WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<BR>See the License for the specific language governing permissions and<BR>limitations under the License.<BR>‍

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
| UNKNOWN | The responding node has submitted the transaction to the network. Its final status is still unknown. |
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
| EMPTY_LIVE_HASH_BODY | the livehash body is empty |
| EMPTY_LIVE_HASH | the livehash data is missing |
| EMPTY_LIVE_HASH_KEYS | the keys for a livehash are missing |
| INVALID_LIVE_HASH_SIZE | the livehash data is not the output of a SHA-384 digest |
| EMPTY_QUERY_BODY | the query body is empty |
| EMPTY_LIVE_HASH_QUERY | the crypto livehash query is empty |
| LIVE_HASH_NOT_FOUND | the livehash is not present |
| ACCOUNT_ID_DOES_NOT_EXIST | the account id passed has not yet been created. |
| LIVE_HASH_ALREADY_EXISTS | the livehash already exists for a given account |
| INVALID_FILE_WACL | File WACL keys are invalid |
| SERIALIZATION_FAILED | Serialization failure |
| TRANSACTION_OVERSIZE | The size of the Transaction is greater than transactionMaxBytes |
| TRANSACTION_TOO_MANY_LAYERS | The Transaction has more than 50 levels |
| CONTRACT_DELETED | Contract is marked as deleted |
| PLATFORM_NOT_ACTIVE | the platform node is either disconnected or lagging behind. |
| KEY_PREFIX_MISMATCH | one public key matches more than one prefixes on the signature map |
| PLATFORM_TRANSACTION_NOT_CREATED | transaction not created by platform due to large backlog |
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
| INVALID_RECEIVE_RECORD_THRESHOLD | [Deprecated]. attempt to set negative receive record threshold |
| INVALID_SEND_RECORD_THRESHOLD | [Deprecated]. attempt to set negative send record threshold |
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
| RECEIVER_SIG_REQUIRED | When a valid signature is not provided for operations on account with receiverSigRequired=true |
| INVALID_TOPIC_ID | The Topic ID specified is not in the system. |
| INVALID_ADMIN_KEY | A provided admin key was invalid. |
| INVALID_SUBMIT_KEY | A provided submit key was invalid. |
| UNAUTHORIZED | An attempted operation was not authorized (ie - a deleteTopic for a topic with no adminKey). |
| INVALID_TOPIC_MESSAGE | A ConsensusService message is empty. |
| INVALID_AUTORENEW_ACCOUNT | The autoRenewAccount specified is not a valid, active account. |
| AUTORENEW_ACCOUNT_NOT_ALLOWED | An adminKey was not specified on the topic, so there must not be an autoRenewAccount. |
| TOPIC_EXPIRED |  The topic has expired, was not automatically renewed, and is in a 7 day grace period before the topic will be<BR>deleted unrecoverably. This error response code will not be returned until autoRenew functionality is supported<BR>by HAPI. |
| INVALID_CHUNK_NUMBER | chunk number must be from 1 to total (chunks) inclusive. |
| INVALID_CHUNK_TRANSACTION_ID | For every chunk, the payer account that is part of initialTransactionID must match the Payer Account of this transaction. The entire initialTransactionID should match the transactionID of the first chunk, but this is not checked or enforced by Hedera except when the chunk number is 1. |
| ACCOUNT_FROZEN_FOR_TOKEN | Account is frozen and cannot transact with the token |
| TOKENS_PER_ACCOUNT_LIMIT_EXCEEDED | An involved account already has more than <tt>tokens.maxPerAccount</tt> associations with non-deleted tokens. |
| INVALID_TOKEN_ID | The token is invalid or does not exist |
| INVALID_TOKEN_DECIMALS | Invalid token decimals |
| INVALID_TOKEN_INITIAL_SUPPLY | Invalid token initial supply |
| INVALID_TREASURY_ACCOUNT_FOR_TOKEN | Treasury Account does not exist or is deleted |
| INVALID_TOKEN_SYMBOL | Token Symbol is not UTF-8 capitalized alphabetical string |
| TOKEN_HAS_NO_FREEZE_KEY | Freeze key is not set on token |
| TRANSFERS_NOT_ZERO_SUM_FOR_TOKEN | Amounts in transfer list are not net zero |
| MISSING_TOKEN_SYMBOL | A token symbol was not provided |
| TOKEN_SYMBOL_TOO_LONG | The provided token symbol was too long |
| ACCOUNT_KYC_NOT_GRANTED_FOR_TOKEN | KYC must be granted and account does not have KYC granted |
| TOKEN_HAS_NO_KYC_KEY | KYC key is not set on token |
| INSUFFICIENT_TOKEN_BALANCE | Token balance is not sufficient for the transaction |
| TOKEN_WAS_DELETED | Token transactions cannot be executed on deleted token |
| TOKEN_HAS_NO_SUPPLY_KEY | Supply key is not set on token |
| TOKEN_HAS_NO_WIPE_KEY | Wipe key is not set on token |
| INVALID_TOKEN_MINT_AMOUNT | The requested token mint amount would cause an invalid total supply |
| INVALID_TOKEN_BURN_AMOUNT | The requested token burn amount would cause an invalid total supply |
| TOKEN_NOT_ASSOCIATED_TO_ACCOUNT | A required token-account relationship is missing |
| CANNOT_WIPE_TOKEN_TREASURY_ACCOUNT | The target of a wipe operation was the token treasury account |
| INVALID_KYC_KEY | The provided KYC key was invalid. |
| INVALID_WIPE_KEY | The provided wipe key was invalid. |
| INVALID_FREEZE_KEY | The provided freeze key was invalid. |
| INVALID_SUPPLY_KEY | The provided supply key was invalid. |
| MISSING_TOKEN_NAME | Token Name is not provided |
| TOKEN_NAME_TOO_LONG | Token Name is too long |
| INVALID_WIPING_AMOUNT | The provided wipe amount must not be negative, zero or bigger than the token holder balance |
| TOKEN_IS_IMMUTABLE | Token does not have Admin key set, thus update/delete transactions cannot be performed |
| TOKEN_ALREADY_ASSOCIATED_TO_ACCOUNT | An <tt>associateToken</tt> operation specified a token already associated to the account |
| TRANSACTION_REQUIRES_ZERO_TOKEN_BALANCES | An attempted operation is invalid until all token balances for the target account are zero |
| ACCOUNT_IS_TREASURY | An attempted operation is invalid because the account is a treasury |
| TOKEN_ID_REPEATED_IN_TOKEN_LIST | Same TokenIDs present in the token list |
| TOKEN_TRANSFER_LIST_SIZE_LIMIT_EXCEEDED | Exceeded the number of token transfers (both from and to) allowed for token transfer list |
| EMPTY_TOKEN_TRANSFER_BODY | TokenTransfersTransactionBody has no TokenTransferList |
| EMPTY_TOKEN_TRANSFER_ACCOUNT_AMOUNTS | TokenTransfersTransactionBody has a TokenTransferList with no AccountAmounts |
| INVALID_SCHEDULE_ID | The Scheduled entity does not exist; or has now expired, been deleted, or been executed |
| SCHEDULE_IS_IMMUTABLE | The Scheduled entity cannot be modified. Admin key not set |
| INVALID_SCHEDULE_PAYER_ID | The provided Scheduled Payer does not exist |
| INVALID_SCHEDULE_ACCOUNT_ID | The Schedule Create Transaction TransactionID account does not exist |
| NO_NEW_VALID_SIGNATURES | The provided sig map did not contain any new valid signatures from required signers of the scheduled transaction |
| UNRESOLVABLE_REQUIRED_SIGNERS | The required signers for a scheduled transaction cannot be resolved, for example because they do not exist or have been deleted |
| SCHEDULED_TRANSACTION_NOT_IN_WHITELIST | Only whitelisted transaction types may be scheduled |
| SOME_SIGNATURES_WERE_INVALID | At least one of the signatures in the provided sig map did not represent a valid signature for any required signer |
| TRANSACTION_ID_FIELD_NOT_ALLOWED | The scheduled field in the TransactionID may not be set to true |
| IDENTICAL_SCHEDULE_ALREADY_CREATED | A schedule already exists with the same identifying fields of an attempted ScheduleCreate (that is, all fields other than scheduledPayerAccountID) |
| INVALID_ZERO_BYTE_IN_STRING | A string field in the transaction has a UTF-8 encoding with the prohibited zero byte |
| SCHEDULE_ALREADY_DELETED | A schedule being signed or deleted has already been deleted |
| SCHEDULE_ALREADY_EXECUTED | A schedule being signed or deleted has already been executed |
| MESSAGE_SIZE_TOO_LARGE | ConsensusSubmitMessage request's message size is larger than allowed. |
| OPERATION_REPEATED_IN_BUCKET_GROUPS | An operation was assigned to more than one throttle group in a given bucket |
| BUCKET_CAPACITY_OVERFLOW | The capacity needed to satisfy all opsPerSec groups in a bucket overflowed a signed 8-byte integral type |
| NODE_CAPACITY_NOT_SUFFICIENT_FOR_OPERATION | Given the network size in the address book, the node-level capacity for an operation would never be enough to accept a single request; usually means a bucket burstPeriod should be increased |
| BUCKET_HAS_NO_THROTTLE_GROUPS | A bucket was defined without any throttle groups |
| THROTTLE_GROUP_HAS_ZERO_OPS_PER_SEC | A throttle group was granted zero opsPerSec |
| SUCCESS_BUT_MISSING_EXPECTED_OPERATION | The throttle definitions file was updated, but some supported operations were not assigned a bucket |
| UNPARSEABLE_THROTTLE_DEFINITIONS | The new contents for the throttle definitions system file were not valid protobuf |
| INVALID_THROTTLE_DEFINITIONS | The new throttle definitions system file were invalid, and no more specific error could be divined |
| ACCOUNT_EXPIRED_AND_PENDING_REMOVAL | The transaction references an account which has passed its expiration without renewal funds available, and currently remains in the ledger only because of the grace period given to expired entities |
| INVALID_TOKEN_MAX_SUPPLY | Invalid token max supply |
| INVALID_TOKEN_NFT_SERIAL_NUMBER | Invalid token nft serial number |
| INVALID_NFT_ID | Invalid nft id |
| METADATA_TOO_LONG | Nft metadata is too long |
| BATCH_SIZE_LIMIT_EXCEEDED | Repeated operations count exceeds the limit |
| QUERY_RANGE_LIMIT_EXCEEDED | The range of data to be gathered exceeds the limit |
| FRACTION_DIVIDES_BY_ZERO | A custom fractional fee set a denominator of zero |
| INSUFFICIENT_PAYER_BALANCE_FOR_CUSTOM_FEE | The transaction payer could not afford a custom fee |
| CUSTOM_FEES_LIST_TOO_LONG | The customFees list is longer than allowed limit 10 |
| INVALID_CUSTOM_FEE_COLLECTOR | Any of the feeCollector accounts for customFees is invalid |
| INVALID_TOKEN_ID_IN_CUSTOM_FEES | Any of the token Ids in customFees is invalid |
| TOKEN_NOT_ASSOCIATED_TO_FEE_COLLECTOR | Any of the token Ids in customFees are not associated to feeCollector |
| TOKEN_MAX_SUPPLY_REACHED | A token cannot have more units minted due to its configured supply ceiling |
| SENDER_DOES_NOT_OWN_NFT_SERIAL_NO | The transaction attempted to move an NFT serial number from an account other than its owner |
| CUSTOM_FEE_NOT_FULLY_SPECIFIED | A custom fee schedule entry did not specify either a fixed or fractional fee |
| CUSTOM_FEE_MUST_BE_POSITIVE | Only positive fees may be assessed at this time |
| CUSTOM_FEES_ARE_MARKED_IMMUTABLE | Once custom fees are marked as immutable, they can never be changed (or made mutable again) |
| CUSTOM_FEE_OUTSIDE_NUMERIC_RANGE | A fractional custom fee exceeded the range of a 64-bit signed integer |
| INVALID_CUSTOM_FRACTIONAL_FEES_SUM | The sum of all custom fractional fees must be strictly less than 1 |
| FRACTIONAL_FEE_MAX_AMOUNT_LESS_THAN_MIN_AMOUNT | Each fractional custom fee must have its maximum_amount, if specified, at least its minimum_amount |


<a name="ResponseHeader.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ResponseHeader.proto

 Every query receives a response containing the QueryResponseHeader. Either or both of the cost and stateProof fields may be blank, if the responseType didn't ask for the cost or stateProof. 

<a name="ResponseHeader"></a>

### ResponseHeader


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nodeTransactionPrecheckCode | [ResponseCodeEnum](#ResponseCodeEnum) | Result of fee transaction precheck, saying it passed, or why it failed | |
| responseType | [ResponseType](#ResponseType) | The requested response is repeated back here, for convenience | |
| cost |  | The fee that would be charged to get the requested information (if a cost was requested). Note: This cost only includes the query fee and does not include the transfer fee(which is required to execute the transfer transaction to debit the payer account and credit the node account with query fee) | |
| stateProof |  | The state proof for this information (if a state proof was requested, and is available) | |


<a name="SchedulableTransactionBody.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## SchedulableTransactionBody.proto

 A schedulable transaction. Note that the global/dynamic system property

<a name="SchedulableTransactionBody"></a>

### SchedulableTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transactionFee |  | The maximum transaction fee the client is willing to pay | |
| memo |  | A memo to include the execution record; the UTF-8 encoding may be up to 100 bytes and must not include the zero byte | |
| data | oneof |  | |
| | contractCall | [ContractCallTransactionBody](#ContractCallTransactionBody) | Calls a function of a contract instance | |
| | contractCreateInstance | [ContractCreateTransactionBody](#ContractCreateTransactionBody) | Creates a contract instance | |
| | contractUpdateInstance | [ContractUpdateTransactionBody](#ContractUpdateTransactionBody) | Updates a contract | |
| | contractDeleteInstance | [ContractDeleteTransactionBody](#ContractDeleteTransactionBody) | Delete contract and transfer remaining balance into specified account | |
| | cryptoCreateAccount | [CryptoCreateTransactionBody](#CryptoCreateTransactionBody) | Create a new cryptocurrency account | |
| | cryptoDelete | [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody) | Delete a cryptocurrency account (mark as deleted, and transfer hbars out) | |
| | cryptoTransfer | [CryptoTransferTransactionBody](#CryptoTransferTransactionBody) | Transfer amount between accounts | |
| | cryptoUpdateAccount | [CryptoUpdateTransactionBody](#CryptoUpdateTransactionBody) | Modify information such as the expiration date for an account | |
| | fileAppend | [FileAppendTransactionBody](#FileAppendTransactionBody) | Add bytes to the end of the contents of a file | |
| | fileCreate | [FileCreateTransactionBody](#FileCreateTransactionBody) | Create a new file | |
| | fileDelete | [FileDeleteTransactionBody](#FileDeleteTransactionBody) | Delete a file (remove contents and mark as deleted until it expires) | |
| | fileUpdate | [FileUpdateTransactionBody](#FileUpdateTransactionBody) | Modify information such as the expiration date for a file | |
| | systemDelete | [SystemDeleteTransactionBody](#SystemDeleteTransactionBody) | Hedera administrative deletion of a file or smart contract | |
| | systemUndelete | [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody) | To undelete an entity deleted by SystemDelete | |
| | freeze | [FreezeTransactionBody](#FreezeTransactionBody) | Freeze the nodes | |
| | consensusCreateTopic | [ConsensusCreateTopicTransactionBody](#ConsensusCreateTopicTransactionBody) | Creates a topic | |
| | consensusUpdateTopic | [ConsensusUpdateTopicTransactionBody](#ConsensusUpdateTopicTransactionBody) | Updates a topic | |
| | consensusDeleteTopic | [ConsensusDeleteTopicTransactionBody](#ConsensusDeleteTopicTransactionBody) | Deletes a topic | |
| | consensusSubmitMessage | [ConsensusSubmitMessageTransactionBody](#ConsensusSubmitMessageTransactionBody) | Submits message to a topic | |
| | tokenCreation | [TokenCreateTransactionBody](#TokenCreateTransactionBody) | Creates a token instance | |
| | tokenFreeze | [TokenFreezeAccountTransactionBody](#TokenFreezeAccountTransactionBody) | Freezes account not to be able to transact with a token | |
| | tokenUnfreeze | [TokenUnfreezeAccountTransactionBody](#TokenUnfreezeAccountTransactionBody) | Unfreezes account for a token | |
| | tokenGrantKyc | [TokenGrantKycTransactionBody](#TokenGrantKycTransactionBody) | Grants KYC to an account for a token | |
| | tokenRevokeKyc | [TokenRevokeKycTransactionBody](#TokenRevokeKycTransactionBody) | Revokes KYC of an account for a token | |
| | tokenDeletion | [TokenDeleteTransactionBody](#TokenDeleteTransactionBody) | Deletes a token instance | |
| | tokenUpdate | [TokenUpdateTransactionBody](#TokenUpdateTransactionBody) | Updates a token instance | |
| | tokenMint | [TokenMintTransactionBody](#TokenMintTransactionBody) | Mints new tokens to a token's treasury account | |
| | tokenBurn | [TokenBurnTransactionBody](#TokenBurnTransactionBody) | Burns tokens from a token's treasury account | |
| | tokenWipe | [TokenWipeAccountTransactionBody](#TokenWipeAccountTransactionBody) | Wipes amount of tokens from an account | |
| | tokenAssociate | [TokenAssociateTransactionBody](#TokenAssociateTransactionBody) | Associate tokens to an account | |
| | tokenDissociate | [TokenDissociateTransactionBody](#TokenDissociateTransactionBody) | Dissociate tokens from an account | |
| | scheduleDelete | [ScheduleDeleteTransactionBody](#ScheduleDeleteTransactionBody) | Marks a schedule in the network's action queue as deleted, preventing it from executing | |


<a name="ScheduleCreate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ScheduleCreate.proto

<a name="ScheduleCreateTransactionBody"></a>

### ScheduleCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| scheduledTransactionBody | [SchedulableTransactionBody](#SchedulableTransactionBody) | The scheduled transaction | |
| memo |  | An optional memo with a UTF-8 encoding of no more than 100 bytes which does not contain the zero byte | |
| adminKey | [Key](#Key) | An optional Hedera key which can be used to sign a ScheduleDelete and remove the schedule | |
| payerAccountID | [AccountID](#AccountID) | An optional id of the account to be charged the service fee for the scheduled transaction at the consensus time that it executes (if ever); defaults to the ScheduleCreate payer if not given | |


<a name="ScheduleDelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ScheduleDelete.proto

<a name="ScheduleDeleteTransactionBody"></a>

### ScheduleDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| scheduleID | [ScheduleID](#ScheduleID) | The ID of the Scheduled Entity | |


<a name="ScheduleGetInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ScheduleGetInfo.proto

<a name="ScheduleGetInfoQuery"></a>

### ScheduleGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | standard info sent from client to node including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| scheduleID | [ScheduleID](#ScheduleID) | The id of the schedule to interrogate | |


<a name="ScheduleGetInfoResponse"></a>

### ScheduleGetInfoResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| scheduleInfo | [ScheduleInfo](#ScheduleInfo) | The information requested about this schedule instance | |


<a name="ScheduleInfo"></a>

### ScheduleInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| scheduleID | [ScheduleID](#ScheduleID) | The id of the schedule | |
| data | oneof |  | |
| | deletion_time | [Timestamp](#Timestamp) | If the schedule has been deleted, the consensus time when this occurred | |
| | execution_time | [Timestamp](#Timestamp) | If the schedule has been executed, the consensus time when this occurred | |
| expirationTime | [Timestamp](#Timestamp) | The time at which the schedule will expire | |
| scheduledTransactionBody | [SchedulableTransactionBody](#SchedulableTransactionBody) | The scheduled transaction | |
| memo |  | The publicly visible memo of the schedule | |
| adminKey | [Key](#Key) | The key used to delete the schedule from state | |
| signers | [KeyList](#KeyList) | The Ed25519 keys the network deems to have signed the scheduled transaction | |
| creatorAccountID | [AccountID](#AccountID) | The id of the account that created the schedule | |
| payerAccountID | [AccountID](#AccountID) | The id of the account responsible for the service fee of the scheduled transaction | |
| scheduledTransactionID | [TransactionID](#TransactionID) | The transaction id that will be used in the record of the scheduled transaction (if it executes) | |


<a name="ScheduleService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ScheduleService.proto

<a name="ScheduleService"></a>

### ScheduleService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createSchedule  | Transaction | TransactionResponse |  Creates a new Schedule by submitting the transaction |
| signSchedule  | Transaction | TransactionResponse |  Signs a new Schedule by submitting the transaction |
| deleteSchedule  | Transaction | TransactionResponse |  Deletes a new Schedule by submitting the transaction |
| getScheduleInfo  | Query | Response |  Retrieves the metadata of a schedule entity |


<a name="ScheduleSign.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ScheduleSign.proto

<a name="ScheduleSignTransactionBody"></a>

### ScheduleSignTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| scheduleID | [ScheduleID](#ScheduleID) | The id of the schedule to add signing keys to | |


<a name="SmartContractService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## SmartContractService.proto

<a name="SmartContractService"></a>

### SmartContractService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createContract  | Transaction | TransactionResponse |  Creates a contract |
| updateContract  | Transaction | TransactionResponse |  Updates a contract with the content |
| contractCallMethod  | Transaction | TransactionResponse |  Calls a contract |
| getContractInfo  | Query | Response |  Retrieves the contract information |
| contractCallLocalMethod  | Query | Response |  Calls a smart contract to be run on a single node |
| ContractGetBytecode  | Query | Response |  Retrieves the byte code of a contract |
| getBySolidityID  | Query | Response |  Retrieves a contract by its Solidity address |
| getTxRecordByContractID  | Query | Response) { Always returns an empty record list, as contract accounts are never effective payers for transactions |
| option deprecated  =  true; |


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


<a name="ThrottleDefinitions.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ThrottleDefinitions.proto

 A set of operations which should be collectively throttled at a given milli-ops-per-second limit. 

<a name="ThrottleBucket"></a>

### ThrottleBucket
 A list of throttle groups that should all compete for the same internal bucket. 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| name |  | A name for this bucket (primarily for use in logs) | |
| burstPeriodMs |  | The number of milliseconds required for this bucket to drain completely when full. The product of this number and the least common multiple of the milliOpsPerSec values in this bucket must not exceed 9223372036. | |
| throttleGroups | [ThrottleGroup](#ThrottleGroup) | The throttle groups competing for this bucket | |


<a name="ThrottleDefinitions"></a>

### ThrottleDefinitions
 A list of throttle buckets which, simultaneously enforced, define the system's throttling policy.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| throttleBuckets | [ThrottleBucket](#ThrottleBucket) |  | |


<a name="ThrottleGroup"></a>

### ThrottleGroup


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| operations | [HederaFunctionality](#HederaFunctionality) | The operations to be throttled | |
| milliOpsPerSec |  | The number of total operations per second across the entire network, multiplied by 1000. So, to choose 3 operations per second (which on a network of 30 nodes is a tenth of an operation per second for each node), set milliOpsPerSec = 3000. And to choose 3.6 ops per second, use milliOpsPerSec = 3600. Minimum allowed value is 1, and maximum allowed value is 9223372. | |


<a name="Timestamp.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Timestamp.proto

 An exact date and time. This is the same data structure as the protobuf Timestamp.proto (see the comments in https:github.com/google/protobuf/blob/master/src/google/protobuf/timestamp.proto) 

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


<a name="TokenAssociate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenAssociate.proto

 Associates the provided account with the provided tokens. Must be signed by the provided Account's key.

<a name="TokenAssociateTransactionBody"></a>

### TokenAssociateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| account | [AccountID](#AccountID) | The account to be associated with the provided tokens | |
| tokens | [TokenID](#TokenID) | The tokens to be associated with the provided account. In the case of NON_FUNGIBLE_UNIQUE Type, once an account is associated, it can hold any number of NFTs (serial numbers) of that token type | |


<a name="TokenBurn.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenBurn.proto

<a name="TokenBurnTransactionBody"></a>

### TokenBurnTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The token for which to burn tokens. If token does not exist, transaction results in INVALID_TOKEN_ID | |
| amount |  | Applicable to tokens of type FUNGIBLE_COMMON. The amount to burn from the Treasury Account. Amount must be a positive non-zero number, not bigger than the token balance of the treasury account (0; balance], represented in the lowest denomination. | |
| serialNumbers |  | Applicable to tokens of type NON_FUNGIBLE_UNIQUE. The list of serial numbers to be burned. | |


<a name="TokenCreate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenCreate.proto

<a name="TokenCreateTransactionBody"></a>

### TokenCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| name |  | The publicly visible name of the token, limited to a UTF-8 encoding of length <tt>tokens.maxSymbolUtf8Bytes</tt>. | |
| symbol |  | The publicly visible token symbol, limited to a UTF-8 encoding of length <tt>tokens.maxTokenNameUtf8Bytes</tt>. | |
| decimals |  | For tokens of type FUNGIBLE_COMMON - the number of decimal places a token is divisible by. For tokens of type NON_FUNGIBLE_UNIQUE - value must be 0 | |
| initialSupply |  | Specifies the initial supply of tokens to be put in circulation. The initial supply is sent to the Treasury Account. The supply is in the lowest denomination possible. In the case for NON_FUNGIBLE_UNIQUE Type the value must be 0 | |
| treasury | [AccountID](#AccountID) | The account which will act as a treasury for the token. This account will receive the specified initial supply or the newly minted NFTs in the case for NON_FUNGIBLE_UNIQUE Type | |
| adminKey | [Key](#Key) | The key which can perform update/delete operations on the token. If empty, the token can be perceived as immutable (not being able to be updated/deleted) | |
| kycKey | [Key](#Key) | The key which can grant or revoke KYC of an account for the token's transactions. If empty, KYC is not required, and KYC grant or revoke operations are not possible. | |
| freezeKey | [Key](#Key) | The key which can sign to freeze or unfreeze an account for token transactions. If empty, freezing is not possible | |
| wipeKey | [Key](#Key) | The key which can wipe the token balance of an account. If empty, wipe is not possible | |
| supplyKey | [Key](#Key) | The key which can change the supply of a token. The key is used to sign Token Mint/Burn operations | |
| freezeDefault |  | The default Freeze status (frozen or unfrozen) of Hedera accounts relative to this token. If true, an account must be unfrozen before it can receive the token | |
| expiry | [Timestamp](#Timestamp) | The epoch second at which the token should expire; if an auto-renew account and period are specified, this is coerced to the current epoch second plus the autoRenewPeriod | |
| autoRenewAccount | [AccountID](#AccountID) | An account which will be automatically charged to renew the token's expiration, at autoRenewPeriod interval | |
| autoRenewPeriod | [Duration](#Duration) | The interval at which the auto-renew account will be charged to extend the token's expiry | |
| memo |  | The memo associated with the token (UTF-8 encoding max 100 bytes) | |
| tokenType | [TokenType](#TokenType) | IWA compatibility. Specifies the token type. Defaults to FUNGIBLE_COMMON | |
| supplyType | [TokenSupplyType](#TokenSupplyType) | IWA compatibility. Specified the token supply type. Defaults to INFINITE | |
| maxSupply |  | IWA Compatibility. Depends on TokenSupplyType. For tokens of type FUNGIBLE_COMMON - the maximum number of tokens that can be in circulation. For tokens of type NON_FUNGIBLE_UNIQUE - the maximum number of NFTs (serial numbers) that can be minted. This field can never be changed! | |
| custom_fees | [CustomFees](#CustomFees) | Custom fees to be assessed during a CryptoTransfer that transfers units of this token | |


<a name="TokenDelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenDelete.proto

<a name="TokenDeleteTransactionBody"></a>

### TokenDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The token to be deleted. If invalid token is specified, transaction will result in INVALID_TOKEN_ID | |


<a name="TokenDissociate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenDissociate.proto

 Dissociates the provided account with the provided tokens. Must be signed by the provided Account's key.

<a name="TokenDissociateTransactionBody"></a>

### TokenDissociateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| account | [AccountID](#AccountID) | The account to be dissociated with the provided tokens | |
| tokens | [TokenID](#TokenID) | The tokens to be dissociated with the provided account | |


<a name="TokenFreezeAccount.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenFreezeAccount.proto

 Freezes transfers of the specified token for the account. Must be signed by the Token's freezeKey.

<a name="TokenFreezeAccountTransactionBody"></a>

### TokenFreezeAccountTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The token for which this account will be frozen. If token does not exist, transaction results in INVALID_TOKEN_ID | |
| account | [AccountID](#AccountID) | The account to be frozen | |


<a name="TokenGetAccountNftInfos.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenGetAccountNftInfos.proto

 Applicable only to tokens of type NON_FUNGIBLE_UNIQUE. Gets info on NFTs N through M owned by the specified accountId.<BR>Example: If Account A owns 5 NFTs (might be of different Token Entity), having start=0 and end=5 will return all of the NFTs

<a name="TokenGetAccountNftInfosQuery"></a>

### TokenGetAccountNftInfosQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| accountID | [AccountID](#AccountID) | The Account for which information is requested | |
| start |  | Specifies the start index (inclusive) of the range of NFTs to query for. Value must be in the range [0; ownedNFTs-1] | |
| end |  | Specifies the end index (exclusive) of the range of NFTs to query for. Value must be in the range (start; ownedNFTs] | |


<a name="TokenGetAccountNftInfosResponse"></a>

### TokenGetAccountNftInfosResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| nfts | [TokenNftInfo](#TokenNftInfo) | List of NFTs associated to the account | |


<a name="TokenGetInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenGetInfo.proto

 Gets information about Token instance 

<a name="TokenGetInfoQuery"></a>

### TokenGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither) | |
| token | [TokenID](#TokenID) | The token for which information is requested. If invalid token is provided, INVALID_TOKEN_ID response is returned. | |


<a name="TokenGetInfoResponse"></a>

### TokenGetInfoResponse
 Response when the client sends the node TokenGetInfoQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| tokenInfo | [TokenInfo](#TokenInfo) | The information requested about this token instance | |


<a name="TokenInfo"></a>

### TokenInfo
 The metadata about a Token instance 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| tokenId | [TokenID](#TokenID) | ID of the token instance | |
| name |  | The name of the token. It is a string of ASCII only characters | |
| symbol |  | The symbol of the token. It is a UTF-8 capitalized alphabetical string | |
| decimals |  | The number of decimal places a token is divisible by. Always 0 for tokens of type NON_FUNGIBLE_UNIQUE | |
| totalSupply |  | For tokens of type FUNGIBLE_COMMON - the total supply of tokens that are currently in circulation. For tokens of type NON_FUNGIBLE_UNIQUE - the number of NFTs created of this token instance | |
| treasury | [AccountID](#AccountID) | The ID of the account which is set as Treasury | |
| adminKey | [Key](#Key) | The key which can perform update/delete operations on the token. If empty, the token can be perceived as immutable (not being able to be updated/deleted) | |
| kycKey | [Key](#Key) | The key which can grant or revoke KYC of an account for the token's transactions. If empty, KYC is not required, and KYC grant or revoke operations are not possible. | |
| freezeKey | [Key](#Key) | The key which can freeze or unfreeze an account for token transactions. If empty, freezing is not possible | |
| wipeKey | [Key](#Key) | The key which can wipe token balance of an account. If empty, wipe is not possible | |
| supplyKey | [Key](#Key) | The key which can change the supply of a token. The key is used to sign Token Mint/Burn operations | |
| defaultFreezeStatus | [TokenFreezeStatus](#TokenFreezeStatus) | The default Freeze status (not applicable, frozen or unfrozen) of Hedera accounts relative to this token. FreezeNotApplicable is returned if Token Freeze Key is empty. Frozen is returned if Token Freeze Key is set and defaultFreeze is set to true. Unfrozen is returned if Token Freeze Key is set and defaultFreeze is set to false | |
| defaultKycStatus | [TokenKycStatus](#TokenKycStatus) | The default KYC status (KycNotApplicable or Revoked) of Hedera accounts relative to this token. KycNotApplicable is returned if KYC key is not set, otherwise Revoked | |
| deleted |  | Specifies whether the token was deleted or not | |
| autoRenewAccount | [AccountID](#AccountID) | An account which will be automatically charged to renew the token's expiration, at autoRenewPeriod interval | |
| autoRenewPeriod | [Duration](#Duration) | The interval at which the auto-renew account will be charged to extend the token's expiry | |
| expiry | [Timestamp](#Timestamp) | The epoch second at which the token will expire | |
| memo |  | The memo associated with the token | |
| tokenType | [TokenType](#TokenType) | The token type | |
| supplyType | [TokenSupplyType](#TokenSupplyType) | The token supply type | |
| maxSupply |  | For tokens of type FUNGIBLE_COMMON - The Maximum number of fungible tokens that can be in circulation. For tokens of type NON_FUNGIBLE_UNIQUE - the maximum number of NFTs (serial numbers) that can be in circulation | |
| custom_fees | [CustomFees](#CustomFees) | Custom fees to be assessed during a CryptoTransfer that transfers units of this token | |


<a name="TokenGetNftInfo.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenGetNftInfo.proto

 Represents an NFT on the Ledger 

<a name="NftID"></a>

### NftID


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| tokenID | [TokenID](#TokenID) | The (non-fungible) token of which this NFT is an instance | |
| serialNumber |  | The unique identifier of this instance | |


<a name="TokenGetNftInfoQuery"></a>

### TokenGetNftInfoQuery
 Applicable only to tokens of type NON_FUNGIBLE_UNIQUE. Gets info on a NFT for a given TokenID (of type NON_FUNGIBLE_UNIQUE) and serial number 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| nftID | [NftID](#NftID) | The ID of the NFT | |


<a name="TokenGetNftInfoResponse"></a>

### TokenGetNftInfoResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| nft | [TokenNftInfo](#TokenNftInfo) | The information about this NFT | |


<a name="TokenNftInfo"></a>

### TokenNftInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nftID | [NftID](#NftID) | The ID of the NFT | |
| accountID | [AccountID](#AccountID) | The current owner of the NFT | |
| creationTime | [Timestamp](#Timestamp) | The effective consensus timestamp at which the NFT was minted | |
| metadata |  | Represents the unique metadata of the NFT | |


<a name="TokenGetNftInfos.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenGetNftInfos.proto

 Applicable only to tokens of type NON_FUNGIBLE_UNIQUE. Gets info on NFTs N through M on the list of NFTs associated with a given NON_FUNGIBLE_UNIQUE Token.<BR>Example: If there are 10 NFTs issued, having start=0 and end=5 will query for the first 5 NFTs. Querying +all 10 NFTs will require start=0 and end=10

<a name="TokenGetNftInfosQuery"></a>

### TokenGetNftInfosQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| tokenID | [TokenID](#TokenID) | The ID of the token for which information is requested | |
| start |  | Specifies the start index (inclusive) of the range of NFTs to query for. Value must be in the range [0; ownedNFTs-1] | |
| end |  | Specifies the end index (exclusive) of the range of NFTs to query for. Value must be in the range (start; ownedNFTs] | |


<a name="TokenGetNftInfosResponse"></a>

### TokenGetNftInfosResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| tokenID | [TokenID](#TokenID) | The Token with type NON_FUNGIBLE that this record is for | |
| nfts | [TokenNftInfo](#TokenNftInfo) | List of NFTs associated to the specified token | |


<a name="TokenGrantKyc.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenGrantKyc.proto

 Grants KYC to the account for the given token. Must be signed by the Token's kycKey.

<a name="TokenGrantKycTransactionBody"></a>

### TokenGrantKycTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The token for which this account will be granted KYC. If token does not exist, transaction results in INVALID_TOKEN_ID | |
| account | [AccountID](#AccountID) | The account to be KYCed | |


<a name="TokenMint.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenMint.proto

<a name="TokenMintTransactionBody"></a>

### TokenMintTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The token for which to mint tokens. If token does not exist, transaction results in INVALID_TOKEN_ID | |
| amount |  | Applicable to tokens of type FUNGIBLE_COMMON. The amount to mint to the Treasury Account. Amount must be a positive non-zero number represented in the lowest denomination of the token. The new supply must be lower than 2^63. | |
| metadata |  | Applicable to tokens of type NON_FUNGIBLE_UNIQUE. A list of metadata that are being created. Maximum allowed size of each metadata is 100 bytes | |


<a name="TokenRevokeKyc.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenRevokeKyc.proto

 Revokes KYC to the account for the given token. Must be signed by the Token's kycKey.

<a name="TokenRevokeKycTransactionBody"></a>

### TokenRevokeKycTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The token for which this account will get his KYC revoked. If token does not exist, transaction results in INVALID_TOKEN_ID | |
| account | [AccountID](#AccountID) | The account to be KYC Revoked | |


<a name="TokenService.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenService.proto

 Transactions and queries for the Token Service 

<a name="TokenService"></a>

### TokenService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createToken  | Transaction | TransactionResponse |  Creates a new Token by submitting the transaction |
| updateToken  | Transaction | TransactionResponse |  Updates the account by submitting the transaction |
| mintToken  | Transaction | TransactionResponse |  Mints an amount of the token to the defined treasury account |
| burnToken  | Transaction | TransactionResponse |  Burns an amount of the token from the defined treasury account |
| deleteToken  | Transaction | TransactionResponse |  Deletes a Token |
| wipeTokenAccount  | Transaction | TransactionResponse |  Wipes the provided amount of tokens from the specified Account ID |
| freezeTokenAccount  | Transaction | TransactionResponse |  Freezes the transfer of tokens to or from the specified Account ID |
| unfreezeTokenAccount  | Transaction | TransactionResponse |  Unfreezes the transfer of tokens to or from the specified Account ID |
| grantKycToTokenAccount  | Transaction | TransactionResponse |  Flags the provided Account ID as having gone through KYC |
| revokeKycFromTokenAccount  | Transaction | TransactionResponse |  Removes the KYC flag of the provided Account ID |
| associateTokens  | Transaction | TransactionResponse |  Associates tokens to an account |
| dissociateTokens  | Transaction | TransactionResponse |  Dissociates tokens from an account |
| getTokenInfo  | Query | Response |  Retrieves the metadata of a token |
| getAccountNftInfos  | Query | Response |  Gets info on NFTs N through M on the list of NFTs associated with a given account |
| getTokenNftInfo  | Query | Response |  Retrieves the metadata of an NFT by TokenID and serial number |
| getTokenNftInfos  | Query | Response |  Gets info on NFTs N through M on the list of NFTs associated with a given Token of type NON_FUNGIBLE |


<a name="TokenUnfreezeAccount.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenUnfreezeAccount.proto

 Unfreezes transfers of the specified token for the account. Must be signed by the Token's freezeKey.

<a name="TokenUnfreezeAccountTransactionBody"></a>

### TokenUnfreezeAccountTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The token for which this account will be unfrozen. If token does not exist, transaction results in INVALID_TOKEN_ID | |
| account | [AccountID](#AccountID) | The account to be unfrozen | |


<a name="TokenUpdate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenUpdate.proto

 At consensus, updates an already created token to the given values.

<a name="TokenUpdateTransactionBody"></a>

### TokenUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The Token to be updated | |
| symbol |  | The new publicly visible Token symbol, limited to a UTF-8 encoding of length <tt>tokens.maxTokenNameUtf8Bytes</tt>. | |
| name |  | The new publicly visible name of the Token, limited to a UTF-8 encoding of length <tt>tokens.maxSymbolUtf8Bytes</tt>. | |
| treasury | [AccountID](#AccountID) | The new Treasury account of the Token. If the provided treasury account is not existing or deleted, the response will be INVALID_TREASURY_ACCOUNT_FOR_TOKEN. If successful, the Token balance held in the previous Treasury Account is transferred to the new one. | |
| adminKey | [Key](#Key) | The new admin key of the Token. If Token is immutable, transaction will resolve to TOKEN_IS_IMMUTABlE. | |
| kycKey | [Key](#Key) | The new KYC key of the Token. If Token does not have currently a KYC key, transaction will resolve to TOKEN_HAS_NO_KYC_KEY. | |
| freezeKey | [Key](#Key) | The new Freeze key of the Token. If the Token does not have currently a Freeze key, transaction will resolve to TOKEN_HAS_NO_FREEZE_KEY. | |
| wipeKey | [Key](#Key) | The new Wipe key of the Token. If the Token does not have currently a Wipe key, transaction will resolve to TOKEN_HAS_NO_WIPE_KEY. | |
| supplyKey | [Key](#Key) | The new Supply key of the Token. If the Token does not have currently a Supply key, transaction will resolve to TOKEN_HAS_NO_SUPPLY_KEY. | |
| autoRenewAccount | [AccountID](#AccountID) | The new account which will be automatically charged to renew the token's expiration, at autoRenewPeriod interval. | |
| autoRenewPeriod | [Duration](#Duration) | The new interval at which the auto-renew account will be charged to extend the token's expiry. | |
| expiry | [Timestamp](#Timestamp) | The new expiry time of the token. Expiry can be updated even if admin key is not set. If the provided expiry is earlier than the current token expiry, transaction wil resolve to INVALID_EXPIRATION_TIME | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) | If set, the new memo to be associated with the token (UTF-8 encoding max 100 bytes) | |
| custom_fees | [CustomFees](#CustomFees) | If set, the new custom fees to be assessed during a CryptoTransfer that transfers units of this token. If the can_update_with_admin_key field is already set to false for the token, this TokenUpdate will resolve to CUSTOM_FEES_ARE_MARKED_IMMUTABLE. If the can_update_with_admin_key field is set to false in this TokenUpdate, the new custom fees will take effect and stay immutable afterwards. | |


<a name="TokenWipeAccount.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TokenWipeAccount.proto

 Wipes the provided amount of tokens from the specified Account. Must be signed by the Token's Wipe key.

<a name="TokenWipeAccountTransactionBody"></a>

### TokenWipeAccountTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token | [TokenID](#TokenID) | The token for which the account will be wiped. If token does not exist, transaction results in INVALID_TOKEN_ID | |
| account | [AccountID](#AccountID) | The account to be wiped | |
| amount |  | Applicable to tokens of type FUNGIBLE_COMMON. The amount of tokens to wipe from the specified account. Amount must be a positive non-zero number in the lowest denomination possible, not bigger than the token balance of the account (0; balance] | |
| serialNumbers |  | Applicable to tokens of type NON_FUNGIBLE_UNIQUE. The list of serial numbers to be wiped. | |


<a name="Transaction.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## Transaction.proto

 A single signed transaction, including all its signatures. The SignatureList will have a Signature for each Key in the transaction, either explicit or implicit, in the order that they appear in the transaction. For example, a CryptoTransfer will first have a Signature corresponding to the Key for the paying account, followed by a Signature corresponding to the Key for each account that is sending or receiving cryptocurrency in the transfer. Each Transaction should not have more than 50 levels.<BR>The SignatureList field is deprecated and succeeded by SignatureMap.

<a name="Transaction"></a>

### Transaction


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| body | [TransactionBody](#TransactionBody) | the body of the transaction, which needs to be signed | |
| sigs | [SignatureList](#SignatureList) | The signatures on the body, to authorize the transaction; deprecated and to be succeeded by SignatureMap field | |
| sigMap | [SignatureMap](#SignatureMap) | The signatures on the body with the new format, to authorize the transaction | |
| bodyBytes |  | TransactionBody serialized into bytes, which needs to be signed | |
| signedTransactionBytes |  | SignedTransaction serialized into bytes | |


<a name="TransactionBody.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionBody.proto

 A single transaction. All transaction types are possible here. 

<a name="TransactionBody"></a>

### TransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transactionID | [TransactionID](#TransactionID) | The ID for this transaction, which includes the payer's account (the account paying the transaction fee). If two transactions have the same transactionID, they won't both have an effect | |
| nodeAccountID | [AccountID](#AccountID) | The account of the node that submits the client's transaction to the network | |
| transactionFee |  | The maximum transaction fee the client is willing to pay | |
| transactionValidDuration | [Duration](#Duration) | The transaction is invalid if consensusTimestamp > transactionID.transactionValidStart + transactionValidDuration | |
| generateRecord |  | Should a record of this transaction be generated? (A receipt is always generated, but the record is optional) | |
| memo |  | Any notes or descriptions that should be put into the record (max length 100) | |
| data | oneof |  | |
| | contractCall | [ContractCallTransactionBody](#ContractCallTransactionBody) | Calls a function of a contract instance | |
| | contractCreateInstance | [ContractCreateTransactionBody](#ContractCreateTransactionBody) | Creates a contract instance | |
| | contractUpdateInstance | [ContractUpdateTransactionBody](#ContractUpdateTransactionBody) | Updates a contract | |
| | contractDeleteInstance | [ContractDeleteTransactionBody](#ContractDeleteTransactionBody) | Delete contract and transfer remaining balance into specified account | |
| | cryptoAddLiveHash | [CryptoAddLiveHashTransactionBody](#CryptoAddLiveHashTransactionBody) | Attach a new livehash to an account | |
| | cryptoCreateAccount | [CryptoCreateTransactionBody](#CryptoCreateTransactionBody) | Create a new cryptocurrency account | |
| | cryptoDelete | [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody) | Delete a cryptocurrency account (mark as deleted, and transfer hbars out) | |
| | cryptoDeleteLiveHash | [CryptoDeleteLiveHashTransactionBody](#CryptoDeleteLiveHashTransactionBody) | Remove a livehash from an account | |
| | cryptoTransfer | [CryptoTransferTransactionBody](#CryptoTransferTransactionBody) | Transfer amount between accounts | |
| | cryptoUpdateAccount | [CryptoUpdateTransactionBody](#CryptoUpdateTransactionBody) | Modify information such as the expiration date for an account | |
| | fileAppend | [FileAppendTransactionBody](#FileAppendTransactionBody) | Add bytes to the end of the contents of a file | |
| | fileCreate | [FileCreateTransactionBody](#FileCreateTransactionBody) | Create a new file | |
| | fileDelete | [FileDeleteTransactionBody](#FileDeleteTransactionBody) | Delete a file (remove contents and mark as deleted until it expires) | |
| | fileUpdate | [FileUpdateTransactionBody](#FileUpdateTransactionBody) | Modify information such as the expiration date for a file | |
| | systemDelete | [SystemDeleteTransactionBody](#SystemDeleteTransactionBody) | Hedera administrative deletion of a file or smart contract | |
| | systemUndelete | [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody) | To undelete an entity deleted by SystemDelete | |
| | freeze | [FreezeTransactionBody](#FreezeTransactionBody) | Freeze the nodes | |
| | consensusCreateTopic | [ConsensusCreateTopicTransactionBody](#ConsensusCreateTopicTransactionBody) | Creates a topic | |
| | consensusUpdateTopic | [ConsensusUpdateTopicTransactionBody](#ConsensusUpdateTopicTransactionBody) | Updates a topic | |
| | consensusDeleteTopic | [ConsensusDeleteTopicTransactionBody](#ConsensusDeleteTopicTransactionBody) | Deletes a topic | |
| | consensusSubmitMessage | [ConsensusSubmitMessageTransactionBody](#ConsensusSubmitMessageTransactionBody) | Submits message to a topic | |
| | uncheckedSubmit | [UncheckedSubmitBody](#UncheckedSubmitBody) |  | |
| | tokenCreation | [TokenCreateTransactionBody](#TokenCreateTransactionBody) | Creates a token instance | |
| | tokenFreeze | [TokenFreezeAccountTransactionBody](#TokenFreezeAccountTransactionBody) | Freezes account not to be able to transact with a token | |
| | tokenUnfreeze | [TokenUnfreezeAccountTransactionBody](#TokenUnfreezeAccountTransactionBody) | Unfreezes account for a token | |
| | tokenGrantKyc | [TokenGrantKycTransactionBody](#TokenGrantKycTransactionBody) | Grants KYC to an account for a token | |
| | tokenRevokeKyc | [TokenRevokeKycTransactionBody](#TokenRevokeKycTransactionBody) | Revokes KYC of an account for a token | |
| | tokenDeletion | [TokenDeleteTransactionBody](#TokenDeleteTransactionBody) | Deletes a token instance | |
| | tokenUpdate | [TokenUpdateTransactionBody](#TokenUpdateTransactionBody) | Updates a token instance | |
| | tokenMint | [TokenMintTransactionBody](#TokenMintTransactionBody) | Mints new tokens to a token's treasury account | |
| | tokenBurn | [TokenBurnTransactionBody](#TokenBurnTransactionBody) | Burns tokens from a token's treasury account | |
| | tokenWipe | [TokenWipeAccountTransactionBody](#TokenWipeAccountTransactionBody) | Wipes amount of tokens from an account | |
| | tokenAssociate | [TokenAssociateTransactionBody](#TokenAssociateTransactionBody) | Associate tokens to an account | |
| | tokenDissociate | [TokenDissociateTransactionBody](#TokenDissociateTransactionBody) | Dissociate tokens from an account | |
| | scheduleCreate | [ScheduleCreateTransactionBody](#ScheduleCreateTransactionBody) | Creates a schedule in the network's action queue | |
| | scheduleDelete | [ScheduleDeleteTransactionBody](#ScheduleDeleteTransactionBody) | Deletes a schedule from the network's action queue | |
| | scheduleSign | [ScheduleSignTransactionBody](#ScheduleSignTransactionBody) | Adds one or more Ed25519 keys to the affirmed signers of a scheduled transaction | |


<a name="TransactionContents.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionContents.proto

-<BR>‌<BR>Hedera Network Services Protobuf<BR>​<BR>Copyright (C) 2018 - 2021 Hedera Hashgraph, LLC<BR>​<BR>Licensed under the Apache License, Version 2.0 (the "License");<BR>you may not use this file except in compliance with the License.<BR>You may obtain a copy of the License at<BR>http:www.apache.org/licenses/LICENSE-2.0<BR>Unless required by applicable law or agreed to in writing, software<BR>distributed under the License is distributed on an "AS IS" BASIS,<BR>WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<BR>See the License for the specific language governing permissions and<BR>limitations under the License.<BR>‍

<a name="SignedTransaction"></a>

### SignedTransaction


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| bodyBytes |  | TransactionBody serialized into bytes, which needs to be signed | |
| sigMap | [SignatureMap](#SignatureMap) | The signatures on the body with the new format, to authorize the transaction | |


<a name="TransactionGetFastRecord.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionGetFastRecord.proto

 Get the tx record of a transaction, given its transaction ID. Once a transaction reaches consensus, then information about whether it succeeded or failed will be available until the end of the receipt period.  Before and after the receipt period, and for a transaction that was never submitted, the receipt is unknown.  This query is free (the payment field is left empty). 

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

 Get the receipt of a transaction, given its transaction ID. Once a transaction reaches consensus, then information about whether it succeeded or failed will be available until the end of the receipt period.  Before and after the receipt period, and for a transaction that was never submitted, the receipt is unknown.  This query is free (the payment field is left empty). No State proof is available for this response

<a name="TransactionGetReceiptQuery"></a>

### TransactionGetReceiptQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| transactionID | [TransactionID](#TransactionID) | The ID of the transaction for which the receipt is requested. | |
| includeDuplicates |  | Whether receipts of processing duplicate transactions should be returned along with the receipt of processing the first consensus transaction with the given id whose status was neither <tt>INVALID_NODE_ACCOUNT</tt> nor <tt>INVALID_PAYER_SIGNATURE</tt>; <b>or</b>, if no such receipt exists, the receipt of processing the first transaction to reach consensus with the given transaction id.. | |


<a name="TransactionGetReceiptResponse"></a>

### TransactionGetReceiptResponse
 Response when the client sends the node TransactionGetReceiptQuery. If it created a new entity (account, file, or smart contract instance) then one of the three ID fields will be filled in with the ID of the new entity. Sometimes a single transaction will create more than one new entity, such as when a new contract instance is created, and this also creates the new account that it owned by that instance. No State proof is available for this response 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither | |
| receipt | [TransactionReceipt](#TransactionReceipt) | Either the receipt of processing the first consensus transaction with the given id whose status was neither <tt>INVALID_NODE_ACCOUNT</tt> nor <tt>INVALID_PAYER_SIGNATURE</tt>; <b>or</b>, if no such receipt exists, the receipt of processing the first transaction to reach consensus with the given transaction id. | |
| duplicateTransactionReceipts | [TransactionReceipt](#TransactionReceipt) | The receipts of processing all consensus transaction with the same id as the distinguished receipt above, in chronological order. | |


<a name="TransactionGetRecord.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionGetRecord.proto

 Get the record for a transaction. If the transaction requested a record, then the record lasts for one hour, and a state proof is available for it. If the transaction created an account, file, or smart contract instance, then the record will contain the ID for what it created. If the transaction called a smart contract function, then the record contains the result of that call. If the transaction was a cryptocurrency transfer, then the record includes the TransferList which gives the details of that transfer. If the transaction didn't return anything that should be in the record, then the results field will be set to nothing. 

<a name="TransactionGetRecordQuery"></a>

### TransactionGetRecordQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [QueryHeader](#QueryHeader) | Standard info sent from client to node, including the signed payment, and what kind of response is requested (cost, state proof, both, or neither). | |
| transactionID | [TransactionID](#TransactionID) | The ID of the transaction for which the record is requested. | |
| includeDuplicates |  | Whether records of processing duplicate transactions should be returned along with the record of processing the first consensus transaction with the given id whose status was neither <tt>INVALID_NODE_ACCOUNT</tt> nor <tt>INVALID_PAYER_SIGNATURE</tt>; <b>or</b>, if no such record exists, the record of processing the first transaction to reach consensus with the given transaction id.. | |


<a name="TransactionGetRecordResponse"></a>

### TransactionGetRecordResponse
 Response when the client sends the node TransactionGetRecordQuery 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| header | [ResponseHeader](#ResponseHeader) | Standard response from node to client, including the requested fields: cost, or state proof, or both, or neither. | |
| transactionRecord | [TransactionRecord](#TransactionRecord) | Either the record of processing the first consensus transaction with the given id whose status was neither <tt>INVALID_NODE_ACCOUNT</tt> nor <tt>INVALID_PAYER_SIGNATURE</tt>; <b>or</b>, if no such record exists, the record of processing the first transaction to reach consensus with the given transaction id. | |
| duplicateTransactionRecords | [TransactionRecord](#TransactionRecord) | The records of processing all consensus transaction with the same id as the distinguished record above, in chronological order. | |


<a name="TransactionReceipt.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionReceipt.proto

<a name="TransactionReceipt"></a>

### TransactionReceipt


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| status | [ResponseCodeEnum](#ResponseCodeEnum) |  The consensus status of the transaction; is UNKNOWN if consensus has not been reached, or if the<BR>associated transaction did not have a valid payer signature | |
| accountID | [AccountID](#AccountID) |  In the receipt of a CryptoCreate, the id of the newly created account | |
| fileID | [FileID](#FileID) |  In the receipt of a FileCreate, the id of the newly created file | |
| contractID | [ContractID](#ContractID) |  In the receipt of a ContractCreate, the id of the newly created contract | |
| exchangeRate | [ExchangeRateSet](#ExchangeRateSet) |  The exchange rates in effect when the transaction reached consensus | |
| topicID | [TopicID](#TopicID) |  In the receipt of a ConsensusCreateTopic, the id of the newly created topic. | |
| topicSequenceNumber |  |  In the receipt of a ConsensusSubmitMessage, the new sequence number of the topic that received the message | |
| topicRunningHash |  |  In the receipt of a ConsensusSubmitMessage, the new running hash of the topic that received the message.<BR>This 48-byte field is the output of a particular SHA-384 digest whose input data are determined by the<BR>value of the topicRunningHashVersion below. The bytes of each uint64 or uint32 are to be in Big-Endian<BR>format.<BR><BR>IF the topicRunningHashVersion is '0' or '1', then the input data to the SHA-384 digest are, in order:<BR>---<BR>1. The previous running hash of the topic (48 bytes)<BR>2. The topic's shard (8 bytes)<BR>3. The topic's realm (8 bytes)<BR>4. The topic's number (8 bytes)<BR>5. The number of seconds since the epoch before the ConsensusSubmitMessage reached consensus (8 bytes)<BR>6. The number of nanoseconds since 5. before the ConsensusSubmitMessage reached consensus (4 bytes)<BR>7. The topicSequenceNumber from above (8 bytes)<BR>8. The message bytes from the ConsensusSubmitMessage (variable).<BR><BR>IF the topicRunningHashVersion is '2', then the input data to the SHA-384 digest are, in order:<BR>---<BR>1. The previous running hash of the topic (48 bytes)<BR>2. The topicRunningHashVersion below (8 bytes)<BR>3. The topic's shard (8 bytes)<BR>4. The topic's realm (8 bytes)<BR>5. The topic's number (8 bytes)<BR>6. The number of seconds since the epoch before the ConsensusSubmitMessage reached consensus (8 bytes)<BR>7. The number of nanoseconds since 6. before the ConsensusSubmitMessage reached consensus (4 bytes)<BR>8. The topicSequenceNumber from above (8 bytes)<BR>9. The output of the SHA-384 digest of the message bytes from the consensusSubmitMessage (48 bytes)<BR><BR>Otherwise, IF the topicRunningHashVersion is '3', then the input data to the SHA-384 digest are, in order:<BR>---<BR>1. The previous running hash of the topic (48 bytes)<BR>2. The topicRunningHashVersion below (8 bytes)<BR>3. The payer account's shard (8 bytes)<BR>4. The payer account's realm (8 bytes)<BR>5. The payer account's number (8 bytes)<BR>6. The topic's shard (8 bytes)<BR>7. The topic's realm (8 bytes)<BR>8. The topic's number (8 bytes)<BR>9. The number of seconds since the epoch before the ConsensusSubmitMessage reached consensus (8 bytes)<BR>10. The number of nanoseconds since 9. before the ConsensusSubmitMessage reached consensus (4 bytes)<BR>11. The topicSequenceNumber from above (8 bytes)<BR>12. The output of the SHA-384 digest of the message bytes from the consensusSubmitMessage (48 bytes) | |
| topicRunningHashVersion |  |  In the receipt of a ConsensusSubmitMessage, the version of the SHA-384 digest used to update the running hash. | |
| tokenID | [TokenID](#TokenID) |  In the receipt of a CreateToken, the id of the newly created token | |
| newTotalSupply |  |  In the receipt of TokenMint, TokenWipe, TokenBurn, the current total supply of this token | |
| scheduleID | [ScheduleID](#ScheduleID) |  In the receipt of a ScheduleCreate, the id of the newly created Scheduled Entity | |
| scheduledTransactionID | [TransactionID](#TransactionID) |  In the receipt of a ScheduleCreate or ScheduleSign that resolves to SUCCESS, the TransactionID that should be used to query for the receipt or record of the relevant scheduled transaction | |
| serialNumbers |  |  In the receipt of TokenMint, TokenWipe, TokenBurn, For fungible tokens - the current total supply of this token. For non fungible tokens - the total number of NFTs issued for a given tokenID | |


<a name="TransactionRecord.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionRecord.proto

 Response when the client sends the node TransactionGetRecordResponse 

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
| tokenTransferLists | [TokenTransferList](#TokenTransferList) | All Token transfers as a result of this transaction | |
| scheduleRef | [ScheduleID](#ScheduleID) | Reference to the scheduled transaction ID that this transaction record represent | |
| assessed_custom_fees | [AssessedCustomFee](#AssessedCustomFee) | All custom fees that were assessed during a CryptoTransfer, and must be paid if the transaction status resolved to SUCCESS | |


<a name="TransactionResponse.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## TransactionResponse.proto

 When the client sends the node a transaction of any kind, the node replies with this, which simply says that the transaction passed the precheck (so the node will submit it to the network) or it failed (so it won't). If the fee offered was insufficient, this will also contain the amount of the required fee. To learn the consensus result, the client should later obtain a receipt (free), or can buy a more detailed record (not free). 

<a name="TransactionResponse"></a>

### TransactionResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| nodeTransactionPrecheckCode | [ResponseCodeEnum](#ResponseCodeEnum) | The response code that indicates the current status of the transaction. | |
| cost |  | If the response code was INSUFFICIENT_TX_FEE, the actual transaction fee that would be required to execute the transaction. | |


<a name="UncheckedSubmit.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## UncheckedSubmit.proto

<a name="UncheckedSubmitBody"></a>

### UncheckedSubmitBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transactionBytes |  | The serialized bytes of the Transaction to be submitted without prechecks | |

