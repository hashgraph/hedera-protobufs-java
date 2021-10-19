# HAPI Documentation
<a name="top"></a>

## Table of Contents


- [account_balance_file.proto](#account_balance_file.proto)
  - [AllAccountBalances](#AllAccountBalances)
  - [SingleAccountBalances](#SingleAccountBalances)
  - [TokenUnitBalance](#TokenUnitBalance)

- [basic_types.proto](#basic_types.proto)
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
  - [TokenAssociation](#TokenAssociation)
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

- [consensus_create_topic.proto](#consensus_create_topic.proto)
  - [ConsensusCreateTopicTransactionBody](#ConsensusCreateTopicTransactionBody)

- [consensus_delete_topic.proto](#consensus_delete_topic.proto)
  - [ConsensusDeleteTopicTransactionBody](#ConsensusDeleteTopicTransactionBody)

- [consensus_get_topic_info.proto](#consensus_get_topic_info.proto)
  - [ConsensusGetTopicInfoQuery](#ConsensusGetTopicInfoQuery)
  - [ConsensusGetTopicInfoResponse](#ConsensusGetTopicInfoResponse)

- [consensus_service.proto](#consensus_service.proto)
  - [ConsensusService](#ConsensusService) (Service)

- [consensus_submit_message.proto](#consensus_submit_message.proto)
  - [ConsensusMessageChunkInfo](#ConsensusMessageChunkInfo)
  - [ConsensusSubmitMessageTransactionBody](#ConsensusSubmitMessageTransactionBody)

- [consensus_topic_info.proto](#consensus_topic_info.proto)
  - [ConsensusTopicInfo](#ConsensusTopicInfo)

- [consensus_update_topic.proto](#consensus_update_topic.proto)
  - [ConsensusUpdateTopicTransactionBody](#ConsensusUpdateTopicTransactionBody)

- [contract_call.proto](#contract_call.proto)
  - [ContractCallTransactionBody](#ContractCallTransactionBody)

- [contract_call_local.proto](#contract_call_local.proto)
  - [ContractCallLocalQuery](#ContractCallLocalQuery)
  - [ContractCallLocalResponse](#ContractCallLocalResponse)
  - [ContractFunctionResult](#ContractFunctionResult)
  - [ContractLoginfo](#ContractLoginfo)

- [contract_create.proto](#contract_create.proto)
  - [ContractCreateTransactionBody](#ContractCreateTransactionBody)

- [contract_delete.proto](#contract_delete.proto)
  - [ContractDeleteTransactionBody](#ContractDeleteTransactionBody)

- [contract_get_bytecode.proto](#contract_get_bytecode.proto)
  - [ContractGetBytecodeQuery](#ContractGetBytecodeQuery)
  - [ContractGetBytecodeResponse](#ContractGetBytecodeResponse)

- [contract_get_info.proto](#contract_get_info.proto)
  - [ContractGetInfoQuery](#ContractGetInfoQuery)
  - [ContractGetInfoResponse](#ContractGetInfoResponse)
  - [ContractGetInfoResponse.ContractInfo](#ContractGetInfoResponse.ContractInfo)

- [contract_get_records.proto](#contract_get_records.proto)
  - [ContractGetRecordsQuery](#ContractGetRecordsQuery)
  - [ContractGetRecordsResponse](#ContractGetRecordsResponse)

- [contract_update.proto](#contract_update.proto)
  - [ContractUpdateTransactionBody](#ContractUpdateTransactionBody)

- [crypto_add_live_hash.proto](#crypto_add_live_hash.proto)
  - [CryptoAddLiveHashTransactionBody](#CryptoAddLiveHashTransactionBody)
  - [LiveHash](#LiveHash)

- [crypto_create.proto](#crypto_create.proto)
  - [CryptoCreateTransactionBody](#CryptoCreateTransactionBody)

- [crypto_delete.proto](#crypto_delete.proto)
  - [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody)

- [crypto_delete_live_hash.proto](#crypto_delete_live_hash.proto)
  - [CryptoDeleteLiveHashTransactionBody](#CryptoDeleteLiveHashTransactionBody)

- [crypto_get_account_balance.proto](#crypto_get_account_balance.proto)
  - [CryptoGetAccountBalanceQuery](#CryptoGetAccountBalanceQuery)
  - [CryptoGetAccountBalanceResponse](#CryptoGetAccountBalanceResponse)

- [crypto_get_account_records.proto](#crypto_get_account_records.proto)
  - [CryptoGetAccountRecordsQuery](#CryptoGetAccountRecordsQuery)
  - [CryptoGetAccountRecordsResponse](#CryptoGetAccountRecordsResponse)

- [crypto_get_info.proto](#crypto_get_info.proto)
  - [CryptoGetInfoQuery](#CryptoGetInfoQuery)
  - [CryptoGetInfoResponse](#CryptoGetInfoResponse)
  - [CryptoGetInfoResponse.AccountInfo](#CryptoGetInfoResponse.AccountInfo)

- [crypto_get_live_hash.proto](#crypto_get_live_hash.proto)
  - [CryptoGetLiveHashQuery](#CryptoGetLiveHashQuery)
  - [CryptoGetLiveHashResponse](#CryptoGetLiveHashResponse)

- [crypto_get_stakers.proto](#crypto_get_stakers.proto)
  - [AllProxyStakers](#AllProxyStakers)
  - [CryptoGetStakersQuery](#CryptoGetStakersQuery)
  - [CryptoGetStakersResponse](#CryptoGetStakersResponse)
  - [ProxyStaker](#ProxyStaker)

- [crypto_service.proto](#crypto_service.proto)
  - [CryptoService](#CryptoService) (Service)

- [crypto_transfer.proto](#crypto_transfer.proto)
  - [CryptoTransferTransactionBody](#CryptoTransferTransactionBody)

- [crypto_update.proto](#crypto_update.proto)
  - [CryptoUpdateTransactionBody](#CryptoUpdateTransactionBody)

- [custom_fees.proto](#custom_fees.proto)
  - [AssessedCustomFee](#AssessedCustomFee)
  - [CustomFee](#CustomFee)
  - [FixedFee](#FixedFee)
  - [FractionalFee](#FractionalFee)
  - [RoyaltyFee](#RoyaltyFee)

- [duration.proto](#duration.proto)
  - [Duration](#Duration)

- [exchange_rate.proto](#exchange_rate.proto)
  - [ExchangeRate](#ExchangeRate)
  - [ExchangeRateSet](#ExchangeRateSet)

- [file_append.proto](#file_append.proto)
  - [FileAppendTransactionBody](#FileAppendTransactionBody)

- [file_create.proto](#file_create.proto)
  - [FileCreateTransactionBody](#FileCreateTransactionBody)

- [file_delete.proto](#file_delete.proto)
  - [FileDeleteTransactionBody](#FileDeleteTransactionBody)

- [file_get_contents.proto](#file_get_contents.proto)
  - [FileGetContentsQuery](#FileGetContentsQuery)
  - [FileGetContentsResponse](#FileGetContentsResponse)
  - [FileGetContentsResponse.FileContents](#FileGetContentsResponse.FileContents)

- [file_get_info.proto](#file_get_info.proto)
  - [FileGetInfoQuery](#FileGetInfoQuery)
  - [FileGetInfoResponse](#FileGetInfoResponse)
  - [FileGetInfoResponse.FileInfo](#FileGetInfoResponse.FileInfo)

- [file_service.proto](#file_service.proto)
  - [FileService](#FileService) (Service)

- [file_update.proto](#file_update.proto)
  - [FileUpdateTransactionBody](#FileUpdateTransactionBody)

- [freeze.proto](#freeze.proto)
  - [FreezeTransactionBody](#FreezeTransactionBody)

- [freeze_service.proto](#freeze_service.proto)
  - [FreezeService](#FreezeService) (Service)

- [get_by_key.proto](#get_by_key.proto)
  - [EntityID](#EntityID)
  - [GetByKeyQuery](#GetByKeyQuery)
  - [GetByKeyResponse](#GetByKeyResponse)

- [get_by_solidity_id.proto](#get_by_solidity_id.proto)
  - [GetBySolidityIDQuery](#GetBySolidityIDQuery)
  - [GetBySolidityIDResponse](#GetBySolidityIDResponse)

- [network_get_execution_time.proto](#network_get_execution_time.proto)
  - [NetworkGetExecutionTimeQuery](#NetworkGetExecutionTimeQuery)
  - [NetworkGetExecutionTimeResponse](#NetworkGetExecutionTimeResponse)

- [network_get_version_info.proto](#network_get_version_info.proto)
  - [NetworkGetVersionInfoQuery](#NetworkGetVersionInfoQuery)
  - [NetworkGetVersionInfoResponse](#NetworkGetVersionInfoResponse)

- [network_service.proto](#network_service.proto)
  - [NetworkService](#NetworkService) (Service)

- [query.proto](#query.proto)
  - [Query](#Query)

- [query_header.proto](#query_header.proto)
  - [QueryHeader](#QueryHeader)
  - [ResponseType](#ResponseType) (Enum)

- [response.proto](#response.proto)
  - [Response](#Response)

- [response_code.proto](#response_code.proto)
  - [ResponseCodeEnum](#ResponseCodeEnum) (Enum)

- [response_header.proto](#response_header.proto)
  - [ResponseHeader](#ResponseHeader)

- [schedulable_transaction_body.proto](#schedulable_transaction_body.proto)
  - [SchedulableTransactionBody](#SchedulableTransactionBody)

- [schedule_create.proto](#schedule_create.proto)
  - [ScheduleCreateTransactionBody](#ScheduleCreateTransactionBody)

- [schedule_delete.proto](#schedule_delete.proto)
  - [ScheduleDeleteTransactionBody](#ScheduleDeleteTransactionBody)

- [schedule_get_info.proto](#schedule_get_info.proto)
  - [ScheduleGetInfoQuery](#ScheduleGetInfoQuery)
  - [ScheduleGetInfoResponse](#ScheduleGetInfoResponse)
  - [ScheduleInfo](#ScheduleInfo)

- [schedule_service.proto](#schedule_service.proto)
  - [ScheduleService](#ScheduleService) (Service)

- [schedule_sign.proto](#schedule_sign.proto)
  - [ScheduleSignTransactionBody](#ScheduleSignTransactionBody)

- [smart_contract_service.proto](#smart_contract_service.proto)
  - [SmartContractService](#SmartContractService) (Service)

- [system_delete.proto](#system_delete.proto)
  - [SystemDeleteTransactionBody](#SystemDeleteTransactionBody)

- [system_undelete.proto](#system_undelete.proto)
  - [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody)

- [throttle_definitions.proto](#throttle_definitions.proto)
  - [ThrottleBucket](#ThrottleBucket)
  - [ThrottleDefinitions](#ThrottleDefinitions)
  - [ThrottleGroup](#ThrottleGroup)

- [timestamp.proto](#timestamp.proto)
  - [Timestamp](#Timestamp)
  - [TimestampSeconds](#TimestampSeconds)

- [token_associate.proto](#token_associate.proto)
  - [TokenAssociateTransactionBody](#TokenAssociateTransactionBody)

- [token_burn.proto](#token_burn.proto)
  - [TokenBurnTransactionBody](#TokenBurnTransactionBody)

- [token_create.proto](#token_create.proto)
  - [TokenCreateTransactionBody](#TokenCreateTransactionBody)

- [token_delete.proto](#token_delete.proto)
  - [TokenDeleteTransactionBody](#TokenDeleteTransactionBody)

- [token_dissociate.proto](#token_dissociate.proto)
  - [TokenDissociateTransactionBody](#TokenDissociateTransactionBody)

- [token_fee_schedule_update.proto](#token_fee_schedule_update.proto)
  - [TokenFeeScheduleUpdateTransactionBody](#TokenFeeScheduleUpdateTransactionBody)

- [token_freeze_account.proto](#token_freeze_account.proto)
  - [TokenFreezeAccountTransactionBody](#TokenFreezeAccountTransactionBody)

- [token_get_account_nft_infos.proto](#token_get_account_nft_infos.proto)
  - [TokenGetAccountNftInfosQuery](#TokenGetAccountNftInfosQuery)
  - [TokenGetAccountNftInfosResponse](#TokenGetAccountNftInfosResponse)

- [token_get_info.proto](#token_get_info.proto)
  - [TokenGetInfoQuery](#TokenGetInfoQuery)
  - [TokenGetInfoResponse](#TokenGetInfoResponse)
  - [TokenInfo](#TokenInfo)

- [token_get_nft_info.proto](#token_get_nft_info.proto)
  - [NftID](#NftID)
  - [TokenGetNftInfoQuery](#TokenGetNftInfoQuery)
  - [TokenGetNftInfoResponse](#TokenGetNftInfoResponse)
  - [TokenNftInfo](#TokenNftInfo)

- [token_get_nft_infos.proto](#token_get_nft_infos.proto)
  - [TokenGetNftInfosQuery](#TokenGetNftInfosQuery)
  - [TokenGetNftInfosResponse](#TokenGetNftInfosResponse)

- [token_grant_kyc.proto](#token_grant_kyc.proto)
  - [TokenGrantKycTransactionBody](#TokenGrantKycTransactionBody)

- [token_mint.proto](#token_mint.proto)
  - [TokenMintTransactionBody](#TokenMintTransactionBody)

- [token_revoke_kyc.proto](#token_revoke_kyc.proto)
  - [TokenRevokeKycTransactionBody](#TokenRevokeKycTransactionBody)

- [token_service.proto](#token_service.proto)
  - [TokenService](#TokenService) (Service)

- [token_unfreeze_account.proto](#token_unfreeze_account.proto)
  - [TokenUnfreezeAccountTransactionBody](#TokenUnfreezeAccountTransactionBody)

- [token_update.proto](#token_update.proto)
  - [TokenUpdateTransactionBody](#TokenUpdateTransactionBody)

- [token_wipe_account.proto](#token_wipe_account.proto)
  - [TokenWipeAccountTransactionBody](#TokenWipeAccountTransactionBody)

- [transaction.proto](#transaction.proto)
  - [Transaction](#Transaction)

- [transaction_body.proto](#transaction_body.proto)
  - [TransactionBody](#TransactionBody)

- [transaction_contents.proto](#transaction_contents.proto)
  - [SignedTransaction](#SignedTransaction)

- [transaction_get_fast_record.proto](#transaction_get_fast_record.proto)
  - [TransactionGetFastRecordQuery](#TransactionGetFastRecordQuery)
  - [TransactionGetFastRecordResponse](#TransactionGetFastRecordResponse)

- [transaction_get_receipt.proto](#transaction_get_receipt.proto)
  - [TransactionGetReceiptQuery](#TransactionGetReceiptQuery)
  - [TransactionGetReceiptResponse](#TransactionGetReceiptResponse)

- [transaction_get_record.proto](#transaction_get_record.proto)
  - [TransactionGetRecordQuery](#TransactionGetRecordQuery)
  - [TransactionGetRecordResponse](#TransactionGetRecordResponse)

- [transaction_list.proto](#transaction_list.proto)
  - [TransactionList](#TransactionList)

- [transaction_receipt.proto](#transaction_receipt.proto)
  - [TransactionReceipt](#TransactionReceipt)

- [transaction_record.proto](#transaction_record.proto)
  - [TransactionRecord](#TransactionRecord)

- [transaction_response.proto](#transaction_response.proto)
  - [TransactionResponse](#TransactionResponse)

- [unchecked_submit.proto](#unchecked_submit.proto)
  - [UncheckedSubmitBody](#UncheckedSubmitBody)

<a name="account_balance_file.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## account_balance_file.proto

-<BR>‌<BR>Hedera Network Services Protobuf<BR>​<BR>Copyright (C) 2018 - 2021 Hedera Hashgraph, LLC<BR>​<BR>Licensed under the Apache License, Version 2.0 (the "License");<BR>you may not use this file except in compliance with the License.<BR>You may obtain a copy of the License at<BR>http:www.apache.org/licenses/LICENSE-2.0<BR>Unless required by applicable law or agreed to in writing, software<BR>distributed under the License is distributed on an "AS IS" BASIS,<BR>WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<BR>See the License for the specific language governing permissions and<BR>limitations under the License.<BR>‍

<a name="AllAccountBalances"></a>

### AllAccountBalances
<BR>Includes all currency balances (both hbar and token) of all accounts in the ledger.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| An | [*](#*) |  | |
|  | [](#) |  | |
| consensusTimestamp | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
| timestamp | [*](#*) |  | |
|  | [](#) |  | |
| allAccounts | [SingleAccountBalances](#SingleAccountBalances) |  | |


<a name="SingleAccountBalances"></a>

### SingleAccountBalances
<BR>Includes all currency balances (both hbar and token) of a single account in the ledger.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| hbarBalance |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenUnitBalances | [TokenUnitBalance](#TokenUnitBalance) |  | |


<a name="TokenUnitBalance"></a>

### TokenUnitBalance


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| tokenId | [TokenID](#TokenID) |  | |
| Number | [*](#*) |  | |
| balance | [*](#*) |  | |
| NFTs | [*](#*) |  | |
|  | [](#) |  | |
| balance |  |  | |


<a name="basic_types.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## basic_types.proto

<BR>Each shard has a nonnegative shard number. Each realm within a given shard has a nonnegative<BR>realm number (that number might be reused in other shards). And each account, file, and smart<BR>contract instance within a given realm has a nonnegative number (which might be reused in other<BR>realms).  Every account, file, and smart contract instance is within exactly one realm. So a<BR>FileID is a triplet of numbers, like 0.1.2 for entity number 2 within realm 1  within shard 0.<BR>Each realm maintains a single counter for assigning numbers,  so if there is a file with ID<BR>0.1.2, then there won't be an account or smart  contract instance with ID 0.1.2.<BR>Everything is partitioned into realms so that each Solidity smart contract can  access everything<BR>in just a single realm, locking all those entities while it's  running, but other smart contracts<BR>could potentially run in other realms in  parallel. So realms allow Solidity to be parallelized<BR>somewhat, even though the  language itself assumes everything is serial.

<a name="AccountAmount"></a>

### AccountAmount
<BR>An account, and the amount that it sends or receives during a cryptocurrency or token transfer.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| denomination | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| amount | [sint64](#sint64) |  | |


<a name="AccountID"></a>

### AccountID
<BR>The ID for an a cryptocurrency account

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| shardNum |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| realmNum |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| accountNum |  |  | |


<a name="ContractID"></a>

### ContractID
<BR>The ID for a smart contract instance

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| shardNum |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| realmNum |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| contractNum |  |  | |


<a name="CurrentAndNextFeeSchedule"></a>

### CurrentAndNextFeeSchedule
<BR>This contains two Fee Schedules with expiry timestamp.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Contains | [*](#*) |  | |
|  | [](#) |  | |
| currentFeeSchedule | [FeeSchedule](#FeeSchedule) |  | |
| Contains | [*](#*) |  | |
|  | [](#) |  | |
| nextFeeSchedule | [FeeSchedule](#FeeSchedule) |  | |


<a name="FeeComponents"></a>

### FeeComponents
<BR>A set of prices the nodes use in determining transaction and query fees, and constants involved<BR>in fee calculations.  Nodes multiply the amount of resources consumed by a transaction or query<BR>by the corresponding price to calculate the appropriate fee. Units are one-thousandth of a<BR>tinyCent.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| min |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| max |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| constant |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| bpt |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| vpt |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| rbh |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| sbh |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| gas |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tv |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| bpr |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| sbpr |  |  | |


<a name="FeeData"></a>

### FeeData
<BR>The total fee charged for a transaction. It is composed of three components – a node fee that<BR>compensates the specific node that submitted the transaction, a network fee that compensates the<BR>network for assigning the transaction a consensus timestamp, and a service fee that compensates<BR>the network for the ongoing maintenance of the consequences of the transaction.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Fee | [*](#*) |  | |
|  | [](#) |  | |
| nodedata | [FeeComponents](#FeeComponents) |  | |
| Fee | [*](#*) |  | |
|  | [](#) |  | |
| networkdata | [FeeComponents](#FeeComponents) |  | |
| Fee | [*](#*) |  | |
| transaction; | [*](#*) |  | |
|  | [](#) |  | |
| servicedata | [FeeComponents](#FeeComponents) |  | |
| SubType | [*](#*) |  | |
| to | [*](#*) |  | |
|  | [](#) |  | |
| subType | [SubType](#SubType) |  | |


<a name="FeeSchedule"></a>

### FeeSchedule
<BR>A list of resource prices fee for different transactions and queries and the time period at which<BR>this fee schedule will expire. Nodes use the prices to determine the fees for all transactions<BR>based on how much of those resources each transaction uses.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| List | [*](#*) |  | |
|  | [](#) |  | |
| transactionFeeSchedule | [TransactionFeeSchedule](#TransactionFeeSchedule) |  | |
| FeeSchedule | [*](#*) |  | |
|  | [](#) |  | |
| expiryTime | [TimestampSeconds](#TimestampSeconds) |  | |


<a name="FileID"></a>

### FileID
<BR>The ID for a file

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| shardNum |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| realmNum |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| fileNum |  |  | |


<a name="Fraction"></a>

### Fraction
<BR>A rational number, used to set the amount of a value transfer to collect as a custom fee

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| numerator |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| denominator |  |  | |


<a name="HederaFunctionality"></a>

### HederaFunctionality
<BR>The transactions and queries supported by Hedera Hashgraph.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
|  |  |
| NONE |  |
| * |  |
|  |  |
| CryptoTransfer |  |
| * |  |
|  |  |
| CryptoUpdate |  |
| * |  |
|  |  |
| CryptoDelete |  |
| * |  |
|  |  |
| CryptoAddLiveHash |  |
| * |  |
|  |  |
| CryptoDeleteLiveHash |  |
| * |  |
|  |  |
| ContractCall |  |
| * |  |
|  |  |
| ContractCreate |  |
| * |  |
|  |  |
| ContractUpdate |  |
| * |  |
|  |  |
| FileCreate |  |
| * |  |
|  |  |
| FileAppend |  |
| * |  |
|  |  |
| FileUpdate |  |
| * |  |
|  |  |
| FileDelete |  |
| * |  |
|  |  |
| CryptoGetAccountBalance |  |
| * |  |
|  |  |
| CryptoGetAccountRecords |  |
| * |  |
|  |  |
| CryptoGetInfo |  |
| * |  |
|  |  |
| ContractCallLocal |  |
| * |  |
|  |  |
| ContractGetInfo |  |
| * |  |
|  |  |
| ContractGetBytecode |  |
| * |  |
|  |  |
| GetBySolidityID |  |
| * |  |
|  |  |
| GetByKey |  |
| * |  |
|  |  |
| CryptoGetLiveHash |  |
| * |  |
|  |  |
| CryptoGetStakers |  |
| * |  |
|  |  |
| FileGetContents |  |
| * |  |
|  |  |
| FileGetInfo |  |
| * |  |
|  |  |
| TransactionGetRecord |  |
| * |  |
|  |  |
| ContractGetRecords |  |
| * |  |
|  |  |
| CryptoCreate |  |
| * |  |
|  |  |
| SystemDelete |  |
| * |  |
|  |  |
| SystemUndelete |  |
| * |  |
|  |  |
| ContractDelete |  |
| * |  |
|  |  |
| Freeze |  |
| * |  |
|  |  |
| CreateTransactionRecord |  |
| * |  |
|  |  |
| CryptoAccountAutoRenew |  |
| * |  |
|  |  |
| ContractAutoRenew |  |
| * |  |
|  |  |
| GetVersionInfo |  |
| * |  |
|  |  |
| TransactionGetReceipt |  |
| * |  |
|  |  |
| ConsensusCreateTopic |  |
| * |  |
|  |  |
| ConsensusUpdateTopic |  |
| * |  |
|  |  |
| ConsensusDeleteTopic |  |
| * |  |
|  |  |
| ConsensusGetTopicInfo |  |
| * |  |
|  |  |
| ConsensusSubmitMessage |  |
| UncheckedSubmit |  |
| * |  |
|  |  |
| TokenCreate |  |
| * |  |
|  |  |
| TokenGetInfo |  |
| * |  |
|  |  |
| TokenFreezeAccount |  |
| * |  |
|  |  |
| TokenUnfreezeAccount |  |
| * |  |
|  |  |
| TokenGrantKycToAccount |  |
| * |  |
|  |  |
| TokenRevokeKycFromAccount |  |
| * |  |
|  |  |
| TokenDelete |  |
| * |  |
|  |  |
| TokenUpdate |  |
| * |  |
|  |  |
| TokenMint |  |
| * |  |
|  |  |
| TokenBurn |  |
| * |  |
|  |  |
| TokenAccountWipe |  |
| * |  |
|  |  |
| TokenAssociateToAccount |  |
| * |  |
|  |  |
| TokenDissociateFromAccount |  |
| * |  |
|  |  |
| ScheduleCreate |  |
| * |  |
|  |  |
| ScheduleDelete |  |
| * |  |
|  |  |
| ScheduleSign |  |
| * |  |
|  |  |
| ScheduleGetInfo |  |
| * |  |
|  |  |
| TokenGetAccountNftInfos |  |
| * |  |
|  |  |
| TokenGetNftInfo |  |
| * |  |
|  |  |
| TokenGetNftInfos |  |
| * |  |
|  |  |
| TokenFeeScheduleUpdate |  |
| * |  |
|  |  |
| NetworkGetExecutionTime |  |


<a name="Key"></a>

### Key
<BR>A Key can be a public key from one of the three supported systems (ed25519, RSA-3072,  ECDSA with<BR>p384). Or, it can be the ID of a smart contract instance, which is authorized to act as if it had<BR>a key. If an account has an ed25519 key associated with it, then the corresponding private key<BR>must sign any transaction to transfer cryptocurrency out of it. And similarly for RSA and ECDSA.<BR>A Key can be a smart contract ID, which means that smart contract is to authorize operations as<BR>if it had signed with a key that it owned. The smart contract doesn't actually have a key, and<BR>doesn't actually sign a transaction. But it's as if a virtual transaction were created, and the<BR>smart contract signed it with a private key.<BR>A Key can be a "threshold key", which means a list of M keys, any N of which must sign in order<BR>for the threshold signature to be considered valid. The keys within a threshold signature may<BR>themselves be threshold signatures, to allow complex signature requirements.<BR>A Key can be a "key list" where all keys in the list must sign unless specified otherwise in the<BR>documentation for a specific transaction type (e.g.  FileDeleteTransactionBody).  Their use is<BR>dependent on context. For example, a Hedera file is created with a list of keys, where all of<BR>them must sign a transaction to create or modify the file, but only one of them is needed to sign<BR>a transaction to delete the file. So it's a single list that sometimes acts as a 1-of-M threshold<BR>key, and sometimes acts as an M-of-M threshold key.  A key list is always an M-of-M, unless<BR>specified otherwise in documentation. A key list can have nested key lists or threshold keys.<BR>Nested key lists are always M-of-M. A key list can have repeated Ed25519 public keys, but all<BR>repeated keys are only required to sign once.<BR>A Key can contain a ThresholdKey or KeyList, which in turn contain a Key, so this mutual<BR>recursion would allow nesting arbitrarily deep. A ThresholdKey which contains a list of primitive<BR>keys (e.g., ed25519) has 3 levels: ThresholdKey -> KeyList -> Key. A KeyList which contains<BR>several primitive keys (e.g., ed25519) has 2 levels: KeyList -> Key. A Key with 2 levels of<BR>nested ThresholdKeys has 7 levels: Key -> ThresholdKey -> KeyList -> Key -> ThresholdKey -><BR>KeyList -> Key.<BR>Each Key should not have more than 46 levels, which implies 15 levels of nested ThresholdKeys.<BR>Only ed25519 primitive keys are currently supported.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| key | oneof |  | |
| | smart | [*](#*) |  | |
| |  | [](#) |  | |
| | contractID | [ContractID](#ContractID) |  | |
| | ed25519 | [*](#*) |  | |
| |  | [](#) |  | |
| | ed25519 |  |  | |
| | RSA-3072 | [*](#*) |  | |
| |  | [](#) |  | |
| | RSA_3072 |  |  | |
| | ECDSA | [*](#*) |  | |
| |  | [](#) |  | |
| | ECDSA_384 |  |  | |
| | a | [*](#*) |  | |
| |  | [*](#*) |  | |
| |  | [](#) |  | |
| | thresholdKey | [ThresholdKey](#ThresholdKey) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | keyList | [KeyList](#KeyList) |  | |


<a name="KeyList"></a>

### KeyList
<BR>A list of keys that requires all keys (M-of-M) to sign unless otherwise specified in<BR>documentation. A KeyList may contain repeated keys, but all repeated keys are only required to<BR>sign once.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| list | [*](#*) |  | |
|  | [](#) |  | |
| keys | [Key](#Key) |  | |


<a name="NftTransfer"></a>

### NftTransfer
<BR>A sender account, a receiver account, and the serial number of an NFT of a Token with<BR>NON_FUNGIBLE_UNIQUE type. When minting NFTs the sender will be the default AccountID instance<BR>(0.0.0) and when burning NFTs, the receiver will be the default AccountID instance.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| senderAccountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| receiverAccountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| serialNumber |  |  | |


<a name="NodeAddress"></a>

### NodeAddress
<BR>The data about a node, including its service endpoints and the Hedera account to be paid for<BR>services provided by the node (that is, queries answered and transactions submitted.)<BR>If the <tt>serviceEndpoint</tt> list is not set, or empty, then the endpoint given by the<BR>(deprecated) <tt>ipAddress</tt> and <tt>portno</tt> fields should be used.<BR>All fields are populated in the 0.0.102 address book file while only fields that start with # are<BR>populated in the 0.0.101 address book file.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| ServiceEndpoint | [*](#*) |  | |
|  | [](#) |  | |
| ipAddress |  |  | |
| The | [*](#*) |  | |
| preferred | [*](#*) |  | |
|  | [](#) |  | |
| portno |  |  | |
| Usage | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| RSA_PubKey |  |  | |
| # | [*](#*) |  | |
|  | [](#) |  | |
| nodeId |  |  | |
| # | [*](#*) |  | |
|  | [](#) |  | |
| nodeAccountId | [AccountID](#AccountID) |  | |
| # | [*](#*) |  | |
|  | [](#) |  | |
| nodeCertHash |  |  | |
| # | [*](#*) |  | |
|  | [](#) |  | |
| serviceEndpoint | [ServiceEndpoint](#ServiceEndpoint) |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| description |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| stake |  |  | |


<a name="NodeAddressBook"></a>

### NodeAddressBook
<BR>A list of nodes and their metadata that contains all details of the nodes for the network.  Used<BR>to parse the contents of system files <tt>0.0.101</tt> and <tt>0.0.102</tt>.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Metadata | [*](#*) |  | |
|  | [](#) |  | |
| nodeAddress | [NodeAddress](#NodeAddress) |  | |


<a name="RealmID"></a>

### RealmID
<BR>The ID for a realm. Within a given shard, every realm has a unique ID. Each account, file, and<BR>contract instance belongs to exactly one realm.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| shardNum |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| realmNum |  |  | |


<a name="ScheduleID"></a>

### ScheduleID
<BR>Unique identifier for a Schedule

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| shardNum |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| realmNum |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| scheduleNum |  |  | |


<a name="SemanticVersion"></a>

### SemanticVersion
<BR>Hedera follows semantic versioning (https:semver.org/) for both the HAPI protobufs and the<BR>Services software.  This type allows the <tt>getVersionInfo</tt> query in the<BR><tt>NetworkService</tt> to return the deployed versions of both protobufs and software on the<BR>node answering the query.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Increases | [*](#*) |  | |
|  | [](#) |  | |
| major |  |  | |
| Increases | [*](#*) |  | |
|  | [](#) |  | |
| minor |  |  | |
| Increases | [*](#*) |  | |
|  | [](#) |  | |
| patch |  |  | |
| A | [*](#*) |  | |
| identifiers | [*](#*) | semver.org/#spec-item-9); so given a semver 0.14.0-alpha.1+21AF26D3, | |
| this | [*](#*) |  | |
|  | [](#) |  | |
| pre |  |  | |
| Build | [*](#*) |  | |
| identifiers | [*](#*) |  | |
| (https://semver.org/#spec-item-10); | [*](#*) |  | |
| would | [*](#*) |  | |
|  | [](#) |  | |
| build |  |  | |


<a name="ServiceEndpoint"></a>

### ServiceEndpoint
<BR>Contains the IP address and the port representing a service endpoint of a Node in a network. Used<BR>to reach the Hedera API and submit transactions to the network.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| as | [*](#*) |  | |
|  | [](#) |  | |
| ipAddressV4 |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| port |  |  | |


<a name="ServicesConfigurationList"></a>

### ServicesConfigurationList
<BR>UNDOCUMENTED

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| list | [*](#*) |  | |
|  | [](#) |  | |
| nameValue | [Setting](#Setting) |  | |


<a name="Setting"></a>

### Setting
<BR>UNDOCUMENTED

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| name | [*](#*) |  | |
|  | [](#) |  | |
| name |  |  | |
| value | [*](#*) |  | |
|  | [](#) |  | |
| value |  |  | |
| any | [*](#*) |  | |
|  | [](#) |  | |
| data |  |  | |


<a name="ShardID"></a>

### ShardID


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| the | [*](#*) |  | |
|  | [](#) |  | |
| shardNum |  |  | |


<a name="Signature"></a>

### Signature
<BR>A Signature corresponding to a Key. It is a sequence of bytes holding a public key signature from<BR>one of the three supported systems (ed25519, RSA-3072,  ECDSA with p384). Or, it can be a list of<BR>signatures corresponding to a single threshold key. Or, it can be the ID of a smart contract<BR>instance, which is authorized to act as if it had a key. If an account has an ed25519 key<BR>associated with it, then the corresponding private key must sign any transaction to transfer<BR>cryptocurrency out of it.  If it has a smart contract ID associated with it, then that smart<BR>contract is allowed to transfer cryptocurrency out of it. The smart contract doesn't actually<BR>have a key, and  doesn't actually sign a transaction. But it's as if a virtual transaction were<BR>created, and the smart contract signed it with a private key. A key can also be a "threshold<BR>key", which means a list of M keys, any N of which must sign in order for the threshold signature<BR>to be considered valid. The keys within a threshold signature may themselves be threshold<BR>signatures, to allow complex signature requirements (this nesting is not supported in the<BR>currently, but will be supported in a future version of API). If a Signature message is missing<BR>the "signature" field, then this is considered to be a null signature. That is useful in cases<BR>such as threshold signatures, where some of the signatures can be null.  The definition of Key<BR>uses mutual recursion, so it allows nesting that is arbitrarily deep. But the current API only<BR>accepts Key messages up to 3 levels deep, such as a list of threshold keys, each of which is a<BR>list of primitive keys. Therefore, the matching Signature will have the same limitation. This<BR>restriction may be relaxed in future versions of the API, to allow deeper nesting.<BR>This message is deprecated and succeeded by SignaturePair and SignatureMap messages.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
| signature | oneof |  | |
| | smart | [*](#*) |  | |
| |  | [](#) |  | |
| | contract |  |  | |
| | ed25519 | [*](#*) |  | |
| |  | [](#) |  | |
| | ed25519 |  |  | |
| | RSA-3072 | [*](#*) |  | |
| |  | [](#) |  | |
| | RSA_3072 |  |  | |
| | ECDSA | [*](#*) |  | |
| |  | [](#) |  | |
| | ECDSA_384 |  |  | |
| | A | [*](#*) |  | |
| | signatures, | [*](#*) |  | |
| |  | [](#) |  | |
| | thresholdSignature | [ThresholdSignature](#ThresholdSignature) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | signatureList | [SignatureList](#SignatureList) |  | |


<a name="SignatureList"></a>

### SignatureList
<BR>The signatures corresponding to a KeyList of the same length.  This message is deprecated and<BR>succeeded by SignaturePair and SignatureMap messages.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
| each | [*](#*) |  | |
|  | [](#) |  | |
| sigs | [Signature](#Signature) |  | |


<a name="SignatureMap"></a>

### SignatureMap
<BR>A set of signatures corresponding to every unique public key used to sign a given transaction. If<BR>one public key matches more than one prefixes on the signature map, the transaction containing<BR>the map will fail immediately with the response code KEY_PREFIX_MISMATCH.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Each | [*](#*) |  | |
|  | [](#) |  | |
| sigPair | [SignaturePair](#SignaturePair) |  | |


<a name="SignaturePair"></a>

### SignaturePair
<BR>The client may use any number of bytes from 0 to the whole length of the public key for<BR>pubKeyPrefix.  If 0 bytes is used, then it is assumed that only one public key is used to sign.<BR>Only ed25519 keys and hence signatures are currently supported.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| First | [*](#*) |  | |
|  | [](#) |  | |
| pubKeyPrefix |  |  | |
| signature | oneof |  | |
| | smart | [*](#*) |  | |
| |  | [](#) |  | |
| | contract |  |  | |
| | ed25519 | [*](#*) |  | |
| |  | [](#) |  | |
| | ed25519 |  |  | |
| | RSA-3072 | [*](#*) |  | |
| |  | [](#) |  | |
| | RSA_3072 |  |  | |
| | ECDSA | [*](#*) |  | |
| |  | [](#) |  | |
| | ECDSA_384 |  |  | |


<a name="SubType"></a>

### SubType
<BR>Allows a set of resource prices to be scoped to a certain type of a HAPI operation.<BR>For example, the resource prices for a TokenMint operation are different between minting fungible<BR>and non-fungible tokens. This enum allows us to "mark" a set of prices as applying to one or the<BR>other.<BR>Similarly, the resource prices for a basic TokenCreate without a custom fee schedule yield a<BR>total price of $1. The resource prices for a TokenCreate with a custom fee schedule are different<BR>and yield a total base price of $2.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| DEFAULT |  |
| * |  |
|  |  |
| TOKEN_FUNGIBLE_COMMON |  |
| * |  |
|  |  |
| TOKEN_NON_FUNGIBLE_UNIQUE |  |
| * |  |
| * |  |
|  |  |
| TOKEN_FUNGIBLE_COMMON_WITH_CUSTOM_FEES |  |
| * |  |
| * |  |
|  |  |
| TOKEN_NON_FUNGIBLE_UNIQUE_WITH_CUSTOM_FEES |  |


<a name="ThresholdKey"></a>

### ThresholdKey
<BR>A set of public keys that are used together to form a threshold signature.  If the threshold is N<BR>and there are M keys, then this is an N of M threshold signature. If an account is associated<BR>with ThresholdKeys, then a transaction to move cryptocurrency out of it must be signed by a list<BR>of M signatures, where at most M-N of them are blank, and the other at least N of them are valid<BR>signatures corresponding to at least N of the public keys listed here.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| threshold |  |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| keys | [KeyList](#KeyList) |  | |


<a name="ThresholdSignature"></a>

### ThresholdSignature
<BR>A signature corresponding to a ThresholdKey. For an N-of-M threshold key, this is a list of M<BR>signatures, at least N of which must be non-null.  This message is deprecated and succeeded by<BR>SignaturePair and SignatureMap messages.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
| for | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| sigs | [SignatureList](#SignatureList) |  | |


<a name="TokenAssociation"></a>

### TokenAssociation
 A token - account association 

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token_id | [TokenID](#TokenID) | The token involved in the association | |
| account_id | [AccountID](#AccountID) | The account involved in the association | |


<a name="TokenBalance"></a>

### TokenBalance
<BR>A number of <i>transferable units</i> of a certain token.<BR>The transferable unit of a token is its smallest denomination, as given by the token's<BR><tt>decimals</tt> property---each minted token contains <tt>10<sup>decimals</sup></tt><BR>transferable units. For example, we could think of the cent as the transferable unit of the US<BR>dollar (<tt>decimals=2</tt>); and the tinybar as the transferable unit of hbar<BR>(<tt>decimals=8</tt>).<BR>Transferable units are not directly comparable across different tokens.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| tokenId | [TokenID](#TokenID) |  | |
| Number | [*](#*) |  | |
| balance | [*](#*) |  | |
| NFTs | [*](#*) |  | |
|  | [](#) |  | |
| balance |  |  | |
| Tokens | [*](#*) |  | |
|  | [](#) |  | |
| decimals |  |  | |


<a name="TokenBalances"></a>

### TokenBalances
<BR>A sequence of token balances

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| tokenBalances | [TokenBalance](#TokenBalance) |  | |


<a name="TokenFreezeStatus"></a>

### TokenFreezeStatus
<BR>Possible Freeze statuses returned on TokenGetInfoQuery or CryptoGetInfoResponse in<BR>TokenRelationship

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| FreezeNotApplicable |  |
| * |  |
|  |  |
| Frozen |  |
| * |  |
|  |  |
| Unfrozen |  |


<a name="TokenID"></a>

### TokenID
<BR>Unique identifier for a token

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| shardNum |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| realmNum |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| tokenNum |  |  | |


<a name="TokenKycStatus"></a>

### TokenKycStatus
<BR>Possible KYC statuses returned on TokenGetInfoQuery or CryptoGetInfoResponse in TokenRelationship

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| KycNotApplicable |  |
| * |  |
|  |  |
| Granted |  |
| * |  |
|  |  |
| Revoked |  |


<a name="TokenRelationship"></a>

### TokenRelationship
<BR>Token's information related to the given Account

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenId | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| symbol |  |  | |
| For | [*](#*) |  | |
| denomination. | [*](#*) |  | |
|  | [](#) |  | |
| balance |  |  | |
| The | [*](#*) |  | |
| have | [*](#*) |  | |
|  | [](#) |  | |
| kycStatus | [TokenKycStatus](#TokenKycStatus) |  | |
| The | [*](#*) |  | |
| not | [*](#*) |  | |
|  | [](#) |  | |
| freezeStatus | [TokenFreezeStatus](#TokenFreezeStatus) |  | |
| Tokens | [*](#*) |  | |
|  | [](#) |  | |
| decimals |  |  | |
| Specifies | [*](#*) |  | |
| implicitly | [*](#*) |  | |
|  | [](#) |  | |
| automatic_association |  |  | |


<a name="TokenSupplyType"></a>

### TokenSupplyType
<BR>Possible Token Supply Types (IWA Compatibility).<BR>Indicates how many tokens can have during its lifetime.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| INFINITE |  |
| * |  |
| * |  |
|  |  |
| FINITE |  |


<a name="TokenTransferList"></a>

### TokenTransferList
<BR>A list of token IDs and amounts representing the transferred out (negative) or into (positive)<BR>amounts, represented in the lowest denomination of the token

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| Applicable | [*](#*) |  | |
| has | [*](#*) |  | |
|  | [](#) |  | |
| transfers | [AccountAmount](#AccountAmount) |  | |
| Applicable | [*](#*) |  | |
| which | [*](#*) |  | |
|  | [](#) |  | |
| nftTransfers | [NftTransfer](#NftTransfer) |  | |


<a name="TokenType"></a>

### TokenType
<BR>Possible Token Types (IWA Compatibility).<BR>Apart from fungible and non-fungible, Tokens can have either a common or unique representation.<BR>This distinction might seem subtle, but it is important when considering how tokens can be traced<BR>and if they can have isolated and unique properties.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
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
<BR>Unique identifier for a topic (used by the consensus service)

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| shardNum |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| realmNum |  |  | |
| Unique | [*](#*) |  | |
|  | [](#) |  | |
| topicNum |  |  | |


<a name="TransactionFeeSchedule"></a>

### TransactionFeeSchedule
<BR>The fees for a specific transaction or query based on the fee data.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| hederaFunctionality | [HederaFunctionality](#HederaFunctionality) |  | |
| Resource | [*](#*) |  | |
|  | [](#) |  | |
| feeData | [FeeData](#FeeData) |  | |
| Resource | [*](#*) |  | |
|  | [](#) |  | |
| fees | [FeeData](#FeeData) |  | |


<a name="TransactionID"></a>

### TransactionID
<BR>The ID for a transaction. This is used for retrieving receipts and records for a transaction, for<BR>appending to a file right after creating it, for instantiating a smart contract with bytecode in<BR>a file just created, and internally by the network for detecting when duplicate transactions are<BR>submitted. A user might get a transaction processed faster by submitting it to N nodes, each with<BR>a different node account, but all with the same TransactionID. Then, the transaction will take<BR>effect when the first of all those nodes submits the transaction and it reaches consensus. The<BR>other transactions will not take effect. So this could make the transaction take effect faster,<BR>if any given node might be slow. However, the full transaction fee is charged for each<BR>transaction, so the total fee is N times as much if the transaction is sent to N nodes.<BR>Applicable to Scheduled Transactions:<BR>- The ID of a Scheduled Transaction has transactionValidStart and accountIDs inherited from the<BR>ScheduleCreate transaction that created it. That is to say that they are equal<BR>- The scheduled property is true for Scheduled Transactions<BR>- transactionValidStart, accountID and scheduled properties should be omitted

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionValidStart | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| Whether | [*](#*) |  | |
|  | [](#) |  | |
| scheduled |  |  | |


<a name="TransferList"></a>

### TransferList
<BR>A list of accounts and amounts to transfer out of each account (negative) or into it (positive).

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Multiple | [*](#*) |  | |
| an | [*](#*) |  | |
|  | [](#) |  | |
| accountAmounts | [AccountAmount](#AccountAmount) |  | |


<a name="consensus_create_topic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## consensus_create_topic.proto

<BR>See [ConsensusService.createTopic()](#proto.ConsensusService)

<a name="ConsensusCreateTopicTransactionBody"></a>

### ConsensusCreateTopicTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Short | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| Access | [*](#*) |  | |
| Anyone | [*](#*) |  | |
| If | [*](#*) |  | |
| is | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| Access | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| submitKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| automatically | [*](#*) |  | |
| is | [*](#*) |  | |
| Limited | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| Optional | [*](#*) |  | |
| functionality | [*](#*) |  | |
| The | [*](#*) |  | |
| can | [*](#*) |  | |
| is | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewAccount | [AccountID](#AccountID) |  | |


<a name="consensus_delete_topic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## consensus_delete_topic.proto

<BR>See [ConsensusService.deleteTopic()](#proto.ConsensusService)

<a name="ConsensusDeleteTopicTransactionBody"></a>

### ConsensusDeleteTopicTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Topic | [*](#*) |  | |
|  | [](#) |  | |
| topicID | [TopicID](#TopicID) |  | |


<a name="consensus_get_topic_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## consensus_get_topic_info.proto

<BR>See [ConsensusService.getTopicInfo()](#proto.ConsensusService)

<a name="ConsensusGetTopicInfoQuery"></a>

### ConsensusGetTopicInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| (cost, | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| topicID | [TopicID](#TopicID) |  | |


<a name="ConsensusGetTopicInfoResponse"></a>

### ConsensusGetTopicInfoResponse
<BR>Retrieve the parameters of and state of a consensus topic.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| Topic | [*](#*) |  | |
|  | [](#) |  | |
| topicID | [TopicID](#TopicID) |  | |
| Current | [*](#*) |  | |
|  | [](#) |  | |
| topicInfo | [ConsensusTopicInfo](#ConsensusTopicInfo) |  | |


<a name="consensus_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## consensus_service.proto

<BR>The Consensus Service provides the ability for Hedera Hashgraph to provide aBFT consensus as to<BR>the order and validity of messages submitted to a topic, as well as a consensus timestamp for<BR>those messages.<BR>Automatic renewal can be configured via an autoRenewAccount.<BR>Any time an autoRenewAccount is added to a topic, that createTopic/updateTopic transaction must<BR>be signed by the autoRenewAccount.<BR>The autoRenewPeriod on an account must currently be set a value in createTopic between<BR>MIN_AUTORENEW_PERIOD (6999999 seconds) and MAX_AUTORENEW_PERIOD (8000001 seconds). During<BR>creation this sets the initial expirationTime of the topic (see more below).<BR>If no adminKey is on a topic, there may not be an autoRenewAccount on the topic, deleteTopic is<BR>not allowed, and the only change allowed via an updateTopic is to extend the expirationTime.<BR>If an adminKey is on a topic, every updateTopic and deleteTopic transaction must be signed by the<BR>adminKey, except for updateTopics which only extend the topic's expirationTime (no adminKey<BR>authorization required).<BR>If an updateTopic modifies the adminKey of a topic, the transaction signatures on the updateTopic<BR>must fulfill both the pre-update and post-update adminKey signature requirements.<BR>Mirrornet ConsensusService may be used to subscribe to changes on the topic, including changes to<BR>the topic definition and the consensus ordering and timestamp of submitted messages.<BR>Until autoRenew functionality is supported by HAPI, the topic will not expire, the<BR>autoRenewAccount will not be charged, and the topic will not automatically be deleted.<BR>Once autoRenew functionality is supported by HAPI:<BR>1. Once the expirationTime is encountered, if an autoRenewAccount is configured on the topic, the<BR>account will be charged automatically at the expirationTime, to extend the expirationTime of the<BR>topic up to the topic's autoRenewPeriod (or as much extension as the account's balance will<BR>supply).<BR>2. If the topic expires and is not automatically renewed, the topic will enter the EXPIRED state.<BR>All transactions on the topic will fail with TOPIC_EXPIRED, except an updateTopic() call that<BR>modifies only the expirationTime.  getTopicInfo() will succeed. This state will be available for<BR>a AUTORENEW_GRACE_PERIOD grace period (7 days).<BR>3. After the grace period, if the topic's expirationTime is not extended, the topic will be<BR>automatically deleted and no transactions or queries on the topic will succeed after that point.

<a name="ConsensusService"></a>

### ConsensusService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createTopic  | Transaction | TransactionResponse | <BR>Create a topic to be used for consensus.<BR>If an autoRenewAccount is specified, that account must also sign this transaction.<BR>If an adminKey is specified, the adminKey must sign the transaction.<BR>On success, the resulting TransactionReceipt contains the newly created TopicId.<BR>Request is [ConsensusCreateTopicTransactionBody](#proto.ConsensusCreateTopicTransactionBody) |
| updateTopic  | Transaction | TransactionResponse | <BR>Update a topic.<BR>If there is no adminKey, the only authorized update (available to anyone) is to extend the expirationTime.<BR>Otherwise transaction must be signed by the adminKey.<BR>If an adminKey is updated, the transaction must be signed by the pre-update adminKey and post-update adminKey.<BR>If a new autoRenewAccount is specified (not just being removed), that account must also sign the transaction.<BR>Request is [ConsensusUpdateTopicTransactionBody](#proto.ConsensusUpdateTopicTransactionBody) |
| deleteTopic  | Transaction | TransactionResponse | <BR>Delete a topic. No more transactions or queries on the topic (via HAPI) will succeed.<BR>If an adminKey is set, this transaction must be signed by that key.<BR>If there is no adminKey, this transaction will fail UNAUTHORIZED.<BR>Request is [ConsensusDeleteTopicTransactionBody](#proto.ConsensusDeleteTopicTransactionBody) |
| getTopicInfo  | Query | Response | <BR>Retrieve the latest state of a topic. This method is unrestricted and allowed on any topic by any payer account.<BR>Deleted accounts will not be returned.<BR>Request is [ConsensusGetTopicInfoQuery](#proto.ConsensusGetTopicInfoQuery)<BR>Response is [ConsensusGetTopicInfoResponse](#proto.ConsensusGetTopicInfoResponse) |
| submitMessage  | Transaction | TransactionResponse | <BR>Submit a message for consensus.<BR>Valid and authorized messages on valid topics will be ordered by the consensus service, gossipped to the<BR>mirror net, and published (in order) to all subscribers (from the mirror net) on this topic.<BR>The submitKey (if any) must sign this transaction.<BR>On success, the resulting TransactionReceipt contains the topic's updated topicSequenceNumber and<BR>topicRunningHash.<BR>Request is [ConsensusSubmitMessageTransactionBody](#proto.ConsensusSubmitMessageTransactionBody) |


<a name="consensus_submit_message.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## consensus_submit_message.proto

<BR>UNDOCUMENTED

<a name="ConsensusMessageChunkInfo"></a>

### ConsensusMessageChunkInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| TransactionID | [*](#*) |  | |
|  | [](#) |  | |
| initialTransactionID | [TransactionID](#TransactionID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| total |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| number |  |  | |


<a name="ConsensusSubmitMessageTransactionBody"></a>

### ConsensusSubmitMessageTransactionBody
<BR>UNDOCUMENTED

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Topic | [*](#*) |  | |
|  | [](#) |  | |
| topicID | [TopicID](#TopicID) |  | |
| Message | [*](#*) |  | |
|  | [](#) |  | |
| message |  |  | |
| Optional | [*](#*) |  | |
|  | [](#) |  | |
| chunkInfo | [ConsensusMessageChunkInfo](#ConsensusMessageChunkInfo) |  | |


<a name="consensus_topic_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## consensus_topic_info.proto

<BR>Current state of a topic.

<a name="ConsensusTopicInfo"></a>

### ConsensusTopicInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| When | [*](#*) |  | |
| For | [*](#*) |  | |
| of | [*](#*) |  | |
|  | [](#) |  | |
| See | [*](#*) |  | |
| data | [*](#*) |  | |
|  | [](#) |  | |
| runningHash |  |  | |
| Sequence | [*](#*) |  | |
|  | [](#) |  | |
| sequenceNumber |  |  | |
| Effective | [*](#*) |  | |
| and | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| Access | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| Access | [*](#*) |  | |
|  | [](#) |  | |
| submitKey | [Key](#Key) |  | |
| If | [*](#*) |  | |
| by | [*](#*) |  | |
| auto-renew | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewAccount | [AccountID](#AccountID) |  | |


<a name="consensus_update_topic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## consensus_update_topic.proto

<BR>All fields left null will not be updated.<BR>See [ConsensusService.updateTopic()](#proto.ConsensusService)

<a name="ConsensusUpdateTopicTransactionBody"></a>

### ConsensusUpdateTopicTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
|  | [*](#*) |  | |
|  | [](#) |  | |
| topicID | [TopicID](#TopicID) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |
| Effective | [*](#*) |  | |
| The | [*](#*) |  | |
| this | [*](#*) |  | |
| On | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| Access | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| Access | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| submitKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| configured | [*](#*) |  | |
| Limited | [*](#*) |  | |
| servers-side | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| Optional | [*](#*) |  | |
| Once | [*](#*) |  | |
| autoRenewPeriod | [*](#*) |  | |
| smaller | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewAccount | [AccountID](#AccountID) |  | |


<a name="contract_call.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_call.proto

<BR>Call a function of the given smart contract instance, giving it functionParameters as its inputs.<BR>The call can use at maximum the given amount of gas – the paying account will not be charged for<BR>any unspent gas.<BR>If this function results in data being stored, an amount of gas is calculated that reflects this<BR>storage burden.<BR>The amount of gas used, as well as other attributes of the transaction, e.g. size, number of<BR>signatures to be verified, determine the fee for the transaction – which is charged to the paying<BR>account.

<a name="ContractCallTransactionBody"></a>

### ContractCallTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| the | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| gas |  |  | |
| number | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |
| which | [*](#*) |  | |
|  | [](#) |  | |
| functionParameters |  |  | |


<a name="contract_call_local.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_call_local.proto

<BR>The log information for an event returned by a smart contract function call. One function call<BR>may return several such events.

<a name="ContractCallLocalQuery"></a>

### ContractCallLocalQuery
<BR>Call a function of the given smart contract instance, giving it functionParameters as its inputs.<BR>This is performed locally on the particular node that the client is communicating with.<BR>It cannot change the state of the contract instance (and so, cannot spend anything from the instance's cryptocurrency account).<BR>It will not have a consensus timestamp. It cannot generate a record or a receipt. The response will contain the output<BR>returned by the function call.  This is useful for calling getter functions, which purely read the state and don't change it.<BR>It is faster and cheaper than a normal call, because it is purely local to a single  node.<BR>Unlike a ContractCall transaction, the node will consume the entire amount of provided gas in determining<BR>the fee for this query.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| standard | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| gas |  |  | |
| which | [*](#*) |  | |
|  | [](#) |  | |
| functionParameters |  |  | |
| max | [*](#*) |  | |
|  | [](#) |  | |
| maxResultSize |  |  | |


<a name="ContractCallLocalResponse"></a>

### ContractCallLocalResponse
<BR>Response when the client sends the node ContractCallLocalQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| standard | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| functionResult | [ContractFunctionResult](#ContractFunctionResult) |  | |


<a name="ContractFunctionResult"></a>

### ContractFunctionResult
<BR>The result returned by a call to a smart contract function. This is part of the response to a<BR>ContractCallLocal query, and is in the record for a ContractCall or ContractCreateInstance<BR>transaction. The ContractCreateInstance transaction record has the results of the call to the<BR>constructor.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| the | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| contractCallResult |  |  | |
| message | [*](#*) |  | |
|  | [](#) |  | |
| errorMessage |  |  | |
| bloom | [*](#*) |  | |
|  | [](#) |  | |
| bloom |  |  | |
| units | [*](#*) |  | |
|  | [](#) |  | |
| gasUsed |  |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| logInfo | [ContractLoginfo](#ContractLoginfo) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| createdContractIDs | [ContractID](#ContractID) |  | |


<a name="ContractLoginfo"></a>

### ContractLoginfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| address | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| bloom | [*](#*) |  | |
|  | [](#) |  | |
| bloom |  |  | |
| topics | [*](#*) |  | |
|  | [](#) |  | |
| topic |  |  | |
| event | [*](#*) |  | |
|  | [](#) |  | |
| data |  |  | |


<a name="contract_create.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_create.proto

<BR>Start a new smart contract instance. After the instance is created, the ContractID for it is in<BR>the receipt, and can be retrieved by the Record or with a GetByKey query. The instance will run<BR>the bytecode stored in a previously created file, referenced either by FileID or by the<BR>transaction ID of the transaction that created the file<BR>The constructor will be executed using the given amount of gas, and any unspent gas will be<BR>refunded to the paying account. Constructor inputs come from the given constructorParameters.<BR>- The instance will exist for autoRenewPeriod seconds. When that is reached, it will renew<BR>itself for another autoRenewPeriod seconds by charging its associated cryptocurrency account<BR>(which it creates here). If it has insufficient cryptocurrency to extend that long, it will<BR>extend as long as it can. If its balance is zero, the instance will be deleted.<BR>- A smart contract instance normally enforces rules, so "the code is law". For example, an<BR>ERC-20 contract prevents a transfer from being undone without a signature by the recipient of<BR>the transfer. This is always enforced if the contract instance was created with the adminKeys<BR>being null. But for some uses, it might be desirable to create something like an ERC-20<BR>contract that has a specific group of trusted individuals who can act as a "supreme court"<BR>with the ability to override the normal operation, when a sufficient number of them agree to<BR>do so. If adminKeys is not null, then they can sign a transaction that can change the state of<BR>the smart contract in arbitrary ways, such as to reverse a transaction that violates some<BR>standard of behavior that is not covered by the code itself. The admin keys can also be used<BR>to change the autoRenewPeriod, and change the adminKeys field itself. The API currently does<BR>not implement this ability. But it does allow the adminKeys field to be set and queried, and<BR>will in the future implement such admin abilities for any instance that has a non-null<BR>adminKeys.<BR>- If this constructor stores information, it is charged gas to store it. There is a fee in hbars<BR>to maintain that storage until the expiration time, and that fee is added as part of the<BR>transaction fee.<BR>- An entity (account, file, or smart contract instance) must be created in a particular realm.<BR>If the realmID is left null, then a new realm will be created with the given admin key. If a<BR>new realm has a null adminKey, then anyone can create/modify/delete entities in that realm.<BR>But if an admin key is given, then any transaction to create/modify/delete an entity in that<BR>realm must be signed by that key, though anyone can still call functions on smart contract<BR>instances that exist in that realm. A realm ceases to exist when everything within it has<BR>expired and no longer exists.<BR>- The current API ignores shardID, realmID, and newRealmAdminKey, and creates everything in<BR>shard 0 and realm 0, with a null key. Future versions of the API will support multiple realms<BR>and multiple shards.<BR>- The optional memo field can contain a string whose length is up to 100 bytes. That is the size<BR>after Unicode NFD then UTF-8 conversion. This field can be used to describe the smart contract.<BR>It could also be used for other purposes. One recommended purpose is to hold a hexadecimal<BR>string that is the SHA-384 hash of a PDF file containing a human-readable legal contract. Then,<BR>if the admin keys are the public keys of human arbitrators, they can use that legal document to<BR>guide their decisions during a binding arbitration tribunal, convened to consider any changes<BR>to the smart contract in the future. The memo field can only be changed using the admin keys.<BR>If there are no admin keys, then it cannot be changed after the smart contract is created.

<a name="ContractCreateTransactionBody"></a>

### ContractCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| the | [*](#*) |  | |
| contract | [*](#*) |  | |
| one | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |
| the | [*](#*) |  | |
| transaction | [*](#*) |  | |
| there | [*](#*) |  | |
| instance. | [*](#*) |  | |
| authorize | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| gas | [*](#*) |  | |
|  | [](#) |  | |
| gas |  |  | |
| initial | [*](#*) |  | |
| by | [*](#*) |  | |
|  | [](#) |  | |
| initialBalance |  |  | |
| ID | [*](#*) |  | |
| invalid | [*](#*) |  | |
| staked | [*](#*) |  | |
| account | [*](#*) |  | |
| will | [*](#*) |  | |
|  | [](#) |  | |
| proxyAccountID | [AccountID](#AccountID) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| parameters | [*](#*) |  | |
|  | [](#) |  | |
| constructorParameters |  |  | |
| shard | [*](#*) |  | |
|  | [](#) |  | |
| shardID | [ShardID](#ShardID) |  | |
| realm | [*](#*) |  | |
|  | [](#) |  | |
| realmID | [RealmID](#RealmID) |  | |
| if | [*](#*) |  | |
|  | [](#) |  | |
| newRealmAdminKey | [Key](#Key) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |


<a name="contract_delete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_delete.proto

<BR>At consensus, marks a contract as deleted and transfers its remaining hBars, if any, to a<BR>designated receiver. After a contract is deleted, it can no longer be called.<BR>If the target contract is immutable (that is, was created without an admin key), then this<BR>transaction resolves to MODIFYING_IMMUTABLE_CONTRACT.<BR>--- Signing Requirements ---<BR>1. The admin key of the target contract must sign.<BR>2. If the transfer account or contract has receiverSigRequired, its associated key must also sign

<a name="ContractDeleteTransactionBody"></a>

### ContractDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| obtainers | oneof |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | transferAccountID | [AccountID](#AccountID) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | transferContractID | [ContractID](#ContractID) |  | |


<a name="contract_get_bytecode.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_get_bytecode.proto

<BR>Get the bytecode for a smart contract instance

<a name="ContractGetBytecodeQuery"></a>

### ContractGetBytecodeQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |


<a name="ContractGetBytecodeResponse"></a>

### ContractGetBytecodeResponse
<BR>Response when the client sends the node ContractGetBytecodeQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| bytecode |  |  | |


<a name="contract_get_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_get_info.proto

<BR>Get information about a smart contract instance. This includes the account that it uses, the file<BR>containing its bytecode, and the time when it will expire.

<a name="ContractGetInfoQuery"></a>

### ContractGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |


<a name="ContractGetInfoResponse"></a>

### ContractGetInfoResponse
<BR>Response when the client sends the node ContractGetInfoQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| contractInfo | [ContractGetInfoResponse.ContractInfo](#ContractGetInfoResponse.ContractInfo) |  | |


<a name="ContractGetInfoResponse.ContractInfo"></a>

### ContractGetInfoResponse.ContractInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| ID | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| ID | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| ID | [*](#*) |  | |
| instance, | [*](#*) |  | |
|  | [](#) |  | |
| contractAccountID |  |  | |
| the | [*](#*) |  | |
| transaction | [*](#*) |  | |
| there | [*](#*) |  | |
| instance. | [*](#*) |  | |
| to | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| the | [*](#*) |  | |
| then | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| number | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| storage |  |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| balance |  |  | |
| Whether | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenRelationships | [TokenRelationship](#TokenRelationship) |  | |


<a name="contract_get_records.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_get_records.proto

<BR>Before v0.9.0, requested records of all transactions against the given contract in the last 25 hours.

<a name="ContractGetRecordsQuery"></a>

### ContractGetRecordsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
| Standard | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |


<a name="ContractGetRecordsResponse"></a>

### ContractGetRecordsResponse
<BR>Before v0.9.0, returned records of all transactions against the given contract in the last 25 hours.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| option | [deprecated=true](#deprecated=true) |  | |
| Standard | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| records | [TransactionRecord](#TransactionRecord) |  | |


<a name="contract_update.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_update.proto

<BR>At consensus, updates the fields of a smart contract to the given values.<BR>If no value is given for a field, that field is left unchanged on the contract. For an immutable<BR>smart contract (that is, a contract created without an adminKey), only the expirationTime may be<BR>updated; setting any other field in this case will cause the transaction status to resolve to<BR>MODIFYING_IMMUTABLE_CONTRACT.<BR>--- Signing Requirements ---<BR>1. Whether or not a contract has an admin Key, its expiry can be extended with only the<BR>transaction payer's signature.<BR>2. Updating any other field of a mutable contract requires the admin key's signature.<BR>3. If the update transaction includes a new admin key, this new key must also sign <b>unless</b><BR>it is exactly an empty <tt>KeyList</tt>. This special sentinel key removes the existing admin<BR>key and causes the contract to become immutable. (Other <tt>Key</tt> structures without a<BR>constituent <tt>Ed25519</tt> key will be rejected with <tt>INVALID_ADMIN_KEY</tt>.)

<a name="ContractUpdateTransactionBody"></a>

### ContractUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| The | [*](#*) |  | |
| EXPIRATION_REDUCTION_NOT_ALLOWED | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| (NOT | [*](#*) |  | |
|  | [](#) |  | |
| proxyAccountID | [AccountID](#AccountID) |  | |
| (NOT | [*](#*) |  | |
| (by | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| The | [*](#*) |  | |
| created | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memoField | oneof |  | |
| | [Deprecated] | [*](#*) |  | |
| | (UTF-8 | [*](#*) |  | |
| |  | [](#) |  | |
| | memo |  |  | |
| | If | [*](#*) |  | |
| |  | [](#) |  | |
| | memoWrapper | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |


<a name="crypto_add_live_hash.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_add_live_hash.proto

<BR>A hash---presumably of some kind of credential or certificate---along with a list of keys, each<BR>of which may be either a primitive or a threshold key.

<a name="CryptoAddLiveHashTransactionBody"></a>

### CryptoAddLiveHashTransactionBody
<BR>At consensus, attaches the given livehash to the given account.  The hash can be deleted by the<BR>key controlling the account, or by any of the keys associated to the livehash.  Hence livehashes<BR>provide a revocation service for their implied credentials; for example, when an authority grants<BR>a credential to the account, the account owner will cosign with the authority (or authorities) to<BR>attach a hash of the credential to the account---hence proving the grant. If the credential is<BR>revoked, then any of the authorities may delete it (or the account owner). In this way, the<BR>livehash mechanism acts as a revocation service.  An account cannot have two identical livehashes<BR>associated. To modify the list of keys in a livehash, the livehash should first be deleted, then<BR>recreated with a new list of keys.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| liveHash | [LiveHash](#LiveHash) |  | |


<a name="LiveHash"></a>

### LiveHash


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountId | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| hash |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| keys | [KeyList](#KeyList) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| duration | [Duration](#Duration) |  | |


<a name="crypto_create.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_create.proto

<BR>Create a new account. After the account is created, the AccountID for it is in the receipt. It<BR>can also be retrieved with a GetByKey query. Threshold values can be defined, and records are<BR>generated and stored for 25 hours for any transfer that exceeds the thresholds. This account is<BR>charged for each record generated, so the thresholds are useful for limiting record generation to<BR>happen only for large transactions.<BR>The Key field is the key used to sign transactions for this account. If the account has<BR>receiverSigRequired set to true, then all cryptocurrency transfers must be signed by this<BR>account's key, both for transfers in and out. If it is false, then only transfers out have to be<BR>signed by it. When the account is created, the payer account is charged enough hbars so that the<BR>new account will not expire for the next autoRenewPeriod seconds. When it reaches the expiration<BR>time, the new account will then be automatically charged to renew for another autoRenewPeriod<BR>seconds. If it does not have enough hbars to renew for that long, then the remaining hbars are<BR>used to extend its expiration as long as possible. If it is has a zero balance when it expires,<BR>then it is deleted. This transaction must be signed by the payer account. If receiverSigRequired<BR>is false, then the transaction does not have to be signed by the keys in the keys field. If it is<BR>true, then it must be signed by them, in addition to the keys of the payer account.<BR>An entity (account, file, or smart contract instance) must be created in a particular realm. If<BR>the realmID is left null, then a new realm will be created with the given admin key. If a new<BR>realm has a null adminKey, then anyone can create/modify/delete entities in that realm. But if an<BR>admin key is given, then any transaction to create/modify/delete an entity in that realm must be<BR>signed by that key, though anyone can still call functions on smart contract instances that exist<BR>in that realm. A realm ceases to exist when everything within it has expired and no longer<BR>exists.<BR>The current API ignores shardID, realmID, and newRealmAdminKey, and creates everything in shard 0<BR>and realm 0, with a null key. Future versions of the API will support multiple realms and<BR>multiple shards.

<a name="CryptoCreateTransactionBody"></a>

### CryptoCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| it | [*](#*) |  | |
|  | [](#) |  | |
| key | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| initialBalance |  |  | |
| ID | [*](#*) |  | |
| invalid | [*](#*) |  | |
| staked | [*](#*) |  | |
| account | [*](#*) |  | |
| will | [*](#*) |  | |
|  | [](#) |  | |
| proxyAccountID | [AccountID](#AccountID) |  | |
| [Deprecated]. | [*](#*) |  | |
| any | [*](#*) |  | |
|  | [](#) |  | |
| sendRecordThreshold |  |  | |
| [Deprecated]. | [*](#*) |  | |
| any | [*](#*) |  | |
|  | [](#) |  | |
| receiveRecordThreshold |  |  | |
| If | [*](#*) |  | |
| addition | [*](#*) |  | |
|  | [](#) |  | |
| receiverSigRequired |  |  | |
| The | [*](#*) |  | |
| have | [*](#*) |  | |
| is | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| shardID | [ShardID](#ShardID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| realmID | [RealmID](#RealmID) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| newRealmAdminKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
| and | [*](#*) |  | |
|  | [](#) |  | |
| max_automatic_token_associations |  |  | |


<a name="crypto_delete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_delete.proto

<BR>Mark an account as deleted, moving all its current hbars to another account. It will remain in<BR>the ledger, marked as deleted, until it expires. Transfers into it a deleted account fail. But a<BR>deleted account can still have its expiration extended in the normal way.

<a name="CryptoDeleteTransactionBody"></a>

### CryptoDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transferAccountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| deleteAccountID | [AccountID](#AccountID) |  | |


<a name="crypto_delete_live_hash.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_delete_live_hash.proto

<BR>At consensus, deletes a livehash associated to the given account. The transaction must be signed<BR>by either the key of the owning account, or at least one of the keys associated to the livehash.

<a name="CryptoDeleteLiveHashTransactionBody"></a>

### CryptoDeleteLiveHashTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountOfLiveHash | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| liveHashToDelete |  |  | |


<a name="crypto_get_account_balance.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_get_account_balance.proto

<BR>Get the balance of a cryptocurrency account. This returns only the balance, so it is a smaller<BR>reply than CryptoGetInfo, which returns the balance plus additional information.

<a name="CryptoGetAccountBalanceQuery"></a>

### CryptoGetAccountBalanceQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| balanceSource | oneof |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | accountID | [AccountID](#AccountID) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | contractID | [ContractID](#ContractID) |  | |


<a name="CryptoGetAccountBalanceResponse"></a>

### CryptoGetAccountBalanceResponse
<BR>Response when the client sends the node CryptoGetAccountBalanceQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
| third | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| balance |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenBalances | [TokenBalance](#TokenBalance) |  | |


<a name="crypto_get_account_records.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_get_account_records.proto

<BR>Requests records of all transactions for which the given account was the effective payer in the last 3 minutes of consensus time and <tt>ledger.keepRecordsInState=true</tt> was true during <tt>handleTransaction</tt>.

<a name="CryptoGetAccountRecordsQuery"></a>

### CryptoGetAccountRecordsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |


<a name="CryptoGetAccountRecordsResponse"></a>

### CryptoGetAccountRecordsResponse
<BR>Returns records of all transactions for which the given account was the effective payer in the last 3 minutes of consensus time and <tt>ledger.keepRecordsInState=true</tt> was true during <tt>handleTransaction</tt>.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| records | [TransactionRecord](#TransactionRecord) |  | |


<a name="crypto_get_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_get_info.proto

<BR>Get all the information about an account, including the balance. This does not get the list of<BR>account records.

<a name="CryptoGetInfoQuery"></a>

### CryptoGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |


<a name="CryptoGetInfoResponse"></a>

### CryptoGetInfoResponse
<BR>Response when the client sends the node CryptoGetInfoQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| Info | [*](#*) |  | |
|  | [](#) |  | |
| accountInfo | [CryptoGetInfoResponse.AccountInfo](#CryptoGetInfoResponse.AccountInfo) |  | |


<a name="CryptoGetInfoResponse.AccountInfo"></a>

### CryptoGetInfoResponse.AccountInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| account | [*](#*) |  | |
|  | [](#) |  | |
| contractAccountID |  |  | |
| If | [*](#*) |  | |
| transactions | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| The | [*](#*) |  | |
| or | [*](#*) |  | |
| automatically | [*](#*) |  | |
| If | [*](#*) |  | |
| running | [*](#*) |  | |
|  | [](#) |  | |
| proxyAccountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| proxyReceived |  |  | |
| The | [*](#*) |  | |
| account | [*](#*) |  | |
|  | [](#) |  | |
| key | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| balance |  |  | |
| [Deprecated]. | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| generateSendRecordThreshold |  |  | |
| [Deprecated]. | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| generateReceiveRecordThreshold |  |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| receiverSigRequired |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
| insufficient | [*](#*) |  | |
| then | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| All | [*](#*) |  | |
| keys | [*](#*) |  | |
|  | [](#) |  | |
| liveHashes | [LiveHash](#LiveHash) |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| tokenRelationships | [TokenRelationship](#TokenRelationship) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| ownedNfts |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| max_automatic_token_associations |  |  | |


<a name="crypto_get_live_hash.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_get_live_hash.proto

<BR>Requests a livehash associated to an account.

<a name="CryptoGetLiveHashQuery"></a>

### CryptoGetLiveHashQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| hash |  |  | |


<a name="CryptoGetLiveHashResponse"></a>

### CryptoGetLiveHashResponse
<BR>Returns the full livehash associated to an account, if it is present. Note that the only way to<BR>obtain a state proof exhibiting the absence of a livehash from an account is to retrieve a state<BR>proof of the entire account with its list of livehashes.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| liveHash | [LiveHash](#LiveHash) |  | |


<a name="crypto_get_stakers.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_get_stakers.proto

<BR>Get all the accounts that are proxy staking to this account. For each of them, give the amount<BR>currently staked. This is not yet implemented, but will be in a future version of the API.

<a name="AllProxyStakers"></a>

### AllProxyStakers
<BR>all of the accounts proxy staking to a given account, and the amounts proxy staked

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| Each | [*](#*) |  | |
|  | [](#) |  | |
| proxyStaker | [ProxyStaker](#ProxyStaker) |  | |


<a name="CryptoGetStakersQuery"></a>

### CryptoGetStakersQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |


<a name="CryptoGetStakersResponse"></a>

### CryptoGetStakersResponse
<BR>Response when the client sends the node CryptoGetStakersQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| List | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| stakers | [AllProxyStakers](#AllProxyStakers) |  | |


<a name="ProxyStaker"></a>

### ProxyStaker
<BR>information about a single account that is proxy staking

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |


<a name="crypto_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_service.proto

<BR>Transactions and queries for the Crypto Service

<a name="CryptoService"></a>

### CryptoService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createAccount  | Transaction | TransactionResponse | <BR>Creates a new account by submitting the transaction |
| updateAccount  | Transaction | TransactionResponse | <BR>Updates an account by submitting the transaction |
| cryptoTransfer  | Transaction | TransactionResponse | <BR>Initiates a transfer by submitting the transaction |
| cryptoDelete  | Transaction | TransactionResponse | <BR>Deletes and account by submitting the transaction |
| addLiveHash  | Transaction | TransactionResponse | <BR>(NOT CURRENTLY SUPPORTED) Adds a livehash |
| deleteLiveHash  | Transaction | TransactionResponse | <BR>(NOT CURRENTLY SUPPORTED) Deletes a livehash |
| getLiveHash  | Query | Response | <BR>(NOT CURRENTLY SUPPORTED) Retrieves a livehash for an account |
| getAccountRecords  | Query | Response | <BR>Returns all transactions in the last 180s of consensus time for which the given account was<BR>the effective payer <b>and</b> network property <tt>ledger.keepRecordsInState</tt> was<BR><tt>true</tt>. |
| cryptoGetBalance  | Query | Response | <BR>Retrieves the balance of an account |
| getAccountInfo  | Query | Response | <BR>Retrieves the metadata of an account |
| getTransactionReceipts  | Query | Response | <BR>Retrieves the latest receipt for a transaction that is either awaiting consensus, or reached<BR>consensus in the last 180 seconds |
| getFastTransactionRecord  | Query | Response | <BR>(NOT CURRENTLY SUPPORTED) Returns the records of transactions recently funded by an account |
| getTxRecordByTxID  | Query | Response | <BR>Retrieves the record of a transaction that is either awaiting consensus, or reached consensus<BR>in the last 180 seconds |
| getStakersByAccountID  | Query | Response | <BR>(NOT CURRENTLY SUPPORTED) Retrieves the stakers for a node by account id |


<a name="crypto_transfer.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_transfer.proto

<BR>Transfers cryptocurrency among two or more accounts by making the desired adjustments to their<BR>balances. Each transfer list can specify up to 10 adjustments. Each negative amount is withdrawn<BR>from the corresponding account (a sender), and each positive one is added to the corresponding<BR>account (a receiver). The amounts list must sum to zero. Each amount is a number of tinybars<BR>(there are 100,000,000 tinybars in one hbar).  If any sender account fails to have sufficient<BR>hbars, then the entire transaction fails, and none of those transfers occur, though the<BR>transaction fee is still charged. This transaction must be signed by the keys for all the sending<BR>accounts, and for any receiving accounts that have receiverSigRequired == true. The signatures<BR>are in the same order as the accounts, skipping those accounts that don't need a signature.

<a name="CryptoTransferTransactionBody"></a>

### CryptoTransferTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transfers | [TransferList](#TransferList) |  | |
| The | [*](#*) |  | |
| try | [*](#*) |  | |
| INSUFFICIENT_PAYER_BALANCE_FOR_CUSTOM_FEE | [*](#*) |  | |
|  | [](#) |  | |
| tokenTransfers | [TokenTransferList](#TokenTransferList) |  | |


<a name="crypto_update.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_update.proto

<BR>Change properties for the given account. Any null field is ignored (left unchanged). This<BR>transaction must be signed by the existing key for this account. If the transaction is changing<BR>the key field, then the transaction must be signed by both the old key (from before the change)<BR>and the new key. The old key must sign for security. The new key must sign as a safeguard to<BR>avoid accidentally changing to an invalid key, and then having no way to recover.

<a name="CryptoUpdateTransactionBody"></a>

### CryptoUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountIDToUpdate | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| key | [Key](#Key) |  | |
| ID | [*](#*) |  | |
| invalid | [*](#*) |  | |
| staked | [*](#*) |  | |
| account | [*](#*) |  | |
| will | [*](#*) |  | |
|  | [](#) |  | |
| proxyAccountID | [AccountID](#AccountID) |  | |
| [Deprecated]. | [*](#*) |  | |
| account, | [*](#*) |  | |
|  | [](#) |  | |
| proxyFraction |  |  | |
| sendRecordThresholdField | oneof |  | |
| | [Deprecated]. | [*](#*) |  | |
| | created | [*](#*) |  | |
| |  | [](#) |  | |
| | sendRecordThreshold |  |  | |
| | [Deprecated]. | [*](#*) |  | |
| | created | [*](#*) |  | |
| |  | [](#) |  | |
| | sendRecordThresholdWrapper | [google.protobuf.UInt64Value](#google.protobuf.UInt64Value) |  | |
| receiveRecordThresholdField | oneof |  | |
| | [Deprecated]. | [*](#*) |  | |
| | created | [*](#*) |  | |
| |  | [](#) |  | |
| | receiveRecordThreshold |  |  | |
| | [Deprecated]. | [*](#*) |  | |
| | created | [*](#*) |  | |
| |  | [](#) |  | |
| | receiveRecordThresholdWrapper | [google.protobuf.UInt64Value](#google.protobuf.UInt64Value) |  | |
| The | [*](#*) |  | |
| enough | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| receiverSigRequiredField | oneof |  | |
| | [Deprecated] | [*](#*) |  | |
| | distinguish | [*](#*) |  | |
| |  | [*](#*) |  | |
| |  | [](#) |  | |
| | receiverSigRequired |  |  | |
| | If | [*](#*) |  | |
| | addition | [*](#*) |  | |
| |  | [](#) |  | |
| | receiverSigRequiredWrapper | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |
| The | [*](#*) |  | |
| including | [*](#*) |  | |
|  | [](#) |  | |
| max_automatic_token_associations | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | |


<a name="custom_fees.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## custom_fees.proto

<BR>A fraction of the transferred units of a token to assess as a fee. The amount assessed will never<BR>be less than the given minimum_amount, and never greater than the given maximum_amount.  The<BR>denomination is always units of the token to which this fractional fee is attached.

<a name="AssessedCustomFee"></a>

### AssessedCustomFee
<BR>A custom transfer fee that was assessed during handling of a CryptoTransfer.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token_id | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fee_collector_account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| effective_payer_account_id | [AccountID](#AccountID) |  | |


<a name="CustomFee"></a>

### CustomFee
<BR>A transfer fee to assess during a CryptoTransfer that transfers units of the token to which the<BR>fee is attached. A custom fee may be either fixed or fractional, and must specify a fee collector<BR>account to receive the assessed fees. Only positive fees may be assessed.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| fee | oneof |  | |
| | Fixed | [*](#*) |  | |
| |  | [](#) |  | |
| | fixed_fee | [FixedFee](#FixedFee) |  | |
| | Fractional | [*](#*) |  | |
| |  | [](#) |  | |
| | fractional_fee | [FractionalFee](#FractionalFee) |  | |
| | Royalty | [*](#*) |  | |
| |  | [](#) |  | |
| | royalty_fee | [RoyaltyFee](#RoyaltyFee) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fee_collector_account_id | [AccountID](#AccountID) |  | |


<a name="FixedFee"></a>

### FixedFee
<BR>A fixed number of units (hbar or token) to assess as a fee during a CryptoTransfer that transfers<BR>units of the token to which this fixed fee is attached.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |
| The | [*](#*) |  | |
| of | [*](#*) |  | |
|  | [](#) |  | |
| denominating_token_id | [TokenID](#TokenID) |  | |


<a name="FractionalFee"></a>

### FractionalFee


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fractional_amount | [Fraction](#Fraction) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| minimum_amount |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| maximum_amount |  |  | |
| If | [*](#*) |  | |
| transfer | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| net_of_transfers |  |  | |


<a name="RoyaltyFee"></a>

### RoyaltyFee
<BR>A fee to assess during a CryptoTransfer that changes ownership of an NFT. Defines the fraction of<BR>the fungible value exchanged for an NFT that the ledger should collect as a royalty. ("Fungible<BR>value" includes both ℏ and units of fungible HTS tokens.) When the NFT sender does not receive<BR>any fungible value, the ledger will assess the fallback fee, if present, to the new NFT owner.<BR>Royalty fees can only be added to tokens of type type NON_FUNGIBLE_UNIQUE.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| exchange_value_fraction | [Fraction](#Fraction) |  | |
| If | [*](#*) |  | |
| with | [*](#*) |  | |
|  | [](#) |  | |
| fallback_fee | [FixedFee](#FixedFee) |  | |


<a name="duration.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## duration.proto

<BR>A length of time in seconds.

<a name="Duration"></a>

### Duration


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| seconds |  |  | |


<a name="exchange_rate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## exchange_rate.proto

<BR>An exchange rate between hbar and cents (USD) and the time at which the exchange rate will<BR>expire, and be superseded by a new exchange rate.

<a name="ExchangeRate"></a>

### ExchangeRate


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Denominator | [*](#*) |  | |
|  | [](#) |  | |
| hbarEquiv |  |  | |
| Numerator | [*](#*) |  | |
|  | [](#) |  | |
| centEquiv |  |  | |
| Expiration | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [TimestampSeconds](#TimestampSeconds) |  | |


<a name="ExchangeRateSet"></a>

### ExchangeRateSet
<BR>Two sets of exchange rates

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Current | [*](#*) |  | |
|  | [](#) |  | |
| currentRate | [ExchangeRate](#ExchangeRate) |  | |
| Next | [*](#*) |  | |
|  | [](#) |  | |
| nextRate | [ExchangeRate](#ExchangeRate) |  | |


<a name="file_append.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## file_append.proto

<BR>Append the given contents to the end of the specified file. If a file is too big to create with a<BR>single FileCreateTransaction, then it can be created with the first part of its contents, and<BR>then appended as many times as necessary to create the entire file. This transaction must be<BR>signed by all initial M-of-M KeyList keys. If keys contains additional KeyList or ThresholdKey<BR>then M-of-M secondary KeyList or ThresholdKey signing requirements must be meet.

<a name="FileAppendTransactionBody"></a>

### FileAppendTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contents |  |  | |


<a name="file_create.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## file_create.proto

<BR>Create a new file, containing the given contents.<BR>After the file is created, the FileID for it can be found in the receipt, or record, or retrieved<BR>with a GetByKey query.<BR>The file contains the specified contents (possibly empty). The file will automatically disappear<BR>at the expirationTime, unless its expiration is extended by another transaction before that time.<BR>If the file is deleted, then its contents will become empty and it will be marked as deleted<BR>until it expires, and then it will cease to exist.<BR>The keys field is a list of keys. All keys within the top-level key list must sign (M-M) to<BR>create or modify a file. However, to delete the file, only one key (1-M) is required to sign from<BR>the top-level key list.  Each of those "keys" may itself be threshold key containing other keys<BR>(including other threshold keys). In other words, the behavior is an AND for create/modify, OR<BR>for delete. This is useful for acting as a revocation server. If it is desired to have the<BR>behavior be AND for all 3 operations (or OR for all 3), then the list should have only a single<BR>Key, which is a threshold key, with N=1 for OR, N=M for AND.<BR>If a file is created without ANY keys in the keys field, the file is immutable and ONLY the<BR>expirationTime of the file can be changed with a FileUpdate transaction. The file contents or its<BR>keys cannot be changed.<BR>An entity (account, file, or smart contract instance) must be created in a particular realm. If<BR>the realmID is left null, then a new realm will be created with the given admin key. If a new<BR>realm has a null adminKey, then anyone can create/modify/delete entities in that realm. But if an<BR>admin key is given, then any transaction to create/modify/delete an entity in that realm must be<BR>signed by that key, though anyone can still call functions on smart contract instances that exist<BR>in that realm. A realm ceases to exist when everything within it has expired and no longer<BR>exists.<BR>The current API ignores shardID, realmID, and newRealmAdminKey, and creates everything in shard 0<BR>and realm 0, with a null key. Future versions of the API will support multiple realms and<BR>multiple shards.

<a name="FileCreateTransactionBody"></a>

### FileCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| to | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| All | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| keys | [KeyList](#KeyList) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contents |  |  | |
| Shard | [*](#*) |  | |
|  | [](#) |  | |
| shardID | [ShardID](#ShardID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| realmID | [RealmID](#RealmID) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| newRealmAdminKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |


<a name="file_delete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## file_delete.proto

<BR>Delete the given file. After deletion, it will be marked as deleted and will have no contents.<BR>But information about it will continue to exist until it expires. A list of keys was given when<BR>the file was created. All the top level keys on that list must sign transactions to create or<BR>modify the file, but any single one of the top level keys can be used to delete the file. This<BR>transaction must be signed by 1-of-M KeyList keys. If keys contains additional KeyList or<BR>ThresholdKey then 1-of-M secondary KeyList or ThresholdKey signing requirements must be meet.

<a name="FileDeleteTransactionBody"></a>

### FileDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |


<a name="file_get_contents.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## file_get_contents.proto

<BR>Get the contents of a file. The content field is empty (no bytes) if the file is empty.

<a name="FileGetContentsQuery"></a>

### FileGetContentsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |


<a name="FileGetContentsResponse"></a>

### FileGetContentsResponse
<BR>Response when the client sends the node FileGetContentsQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| fileContents | [FileGetContentsResponse.FileContents](#FileGetContentsResponse.FileContents) |  | |


<a name="FileGetContentsResponse.FileContents"></a>

### FileGetContentsResponse.FileContents


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contents |  |  | |


<a name="file_get_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## file_get_info.proto

<BR>Get all of the information about a file, except for its contents. When a file expires, it no<BR>longer exists, and there will be no info about it, and the fileInfo field will be blank. If a<BR>transaction or smart contract deletes the file, but it has not yet expired, then the fileInfo<BR>field will be non-empty, the deleted field will be true, its size will be 0, and its contents<BR>will be empty.

<a name="FileGetInfoQuery"></a>

### FileGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |


<a name="FileGetInfoResponse"></a>

### FileGetInfoResponse
<BR>Response when the client sends the node FileGetInfoQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileInfo | [FileGetInfoResponse.FileInfo](#FileGetInfoResponse.FileInfo) |  | |


<a name="FileGetInfoResponse.FileInfo"></a>

### FileGetInfoResponse.FileInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |
| Number | [*](#*) |  | |
|  | [](#) |  | |
| size |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| True | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| One | [*](#*) |  | |
|  | [](#) |  | |
| keys | [KeyList](#KeyList) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |


<a name="file_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## file_service.proto

<BR>Transactions and queries for the file service.

<a name="FileService"></a>

### FileService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createFile  | Transaction | TransactionResponse | <BR>Creates a file |
| updateFile  | Transaction | TransactionResponse | <BR>Updates a file |
| deleteFile  | Transaction | TransactionResponse | <BR>Deletes a file |
| appendContent  | Transaction | TransactionResponse | <BR>Appends to a file |
| getFileContent  | Query | Response | <BR>Retrieves the file contents |
| getFileInfo  | Query | Response | <BR>Retrieves the file information |
| systemDelete  | Transaction | TransactionResponse | <BR>Deletes a file if the submitting account has network admin privileges |
| systemUndelete  | Transaction | TransactionResponse | <BR>Undeletes a file if the submitting account has network admin privileges |


<a name="file_update.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## file_update.proto

<BR>Modify the metadata and/or contents of a file. If a field is not set in the transaction body, the<BR>corresponding file attribute will be unchanged. This transaction must be signed by all the keys<BR>in the top level of a key list (M-of-M) of the file being updated. If the keys themselves are<BR>being updated, then the transaction must also be signed by all the new keys. If the keys contain<BR>additional KeyList or ThresholdKey then M-of-M secondary KeyList or ThresholdKey signing<BR>requirements must be meet

<a name="FileUpdateTransactionBody"></a>

### FileUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| keys | [KeyList](#KeyList) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contents |  |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |


<a name="freeze.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## freeze.proto

<BR>At consensus, sets the consensus time at which the platform should stop creating events and<BR>accepting transactions, and enter a maintenance window.

<a name="FreezeTransactionBody"></a>

### FreezeTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| startHour |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| startMin |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| endHour |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| endMin |  |  | |
| If | [*](#*) |  | |
| maintenance | [*](#*) |  | |
|  | [](#) |  | |
| update_file | [FileID](#FileID) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| file_hash |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| start_time | [Timestamp](#Timestamp) |  | |


<a name="freeze_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## freeze_service.proto

<BR>The request and responses for freeze service.

<a name="FreezeService"></a>

### FreezeService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| freeze  | Transaction | TransactionResponse | <BR>Freezes the nodes by submitting the transaction. The grpc server returns the<BR>TransactionResponse |


<a name="get_by_key.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## get_by_key.proto

<BR>Get all accounts, claims, files, and smart contract instances whose associated keys include the<BR>given Key. The given Key must not be a contractID or a ThresholdKey. This is not yet implemented<BR>in the API, but will be in the future.

<a name="EntityID"></a>

### EntityID
<BR>the ID for a single entity (account, livehash, file, or smart contract instance)

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| entity | oneof |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | accountID | [AccountID](#AccountID) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | liveHash | [LiveHash](#LiveHash) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | fileID | [FileID](#FileID) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | contractID | [ContractID](#ContractID) |  | |


<a name="GetByKeyQuery"></a>

### GetByKeyQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| key | [Key](#Key) |  | |


<a name="GetByKeyResponse"></a>

### GetByKeyResponse
<BR>Response when the client sends the node GetByKeyQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| entities | [EntityID](#EntityID) |  | |


<a name="get_by_solidity_id.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## get_by_solidity_id.proto

<BR>Get the IDs in the format used by transactions, given the ID in the format used by Solidity. If<BR>the Solidity ID is for a smart contract instance, then both the ContractID and associated<BR>AccountID will be returned.

<a name="GetBySolidityIDQuery"></a>

### GetBySolidityIDQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| solidityID |  |  | |


<a name="GetBySolidityIDResponse"></a>

### GetBySolidityIDResponse
<BR>Response when the client sends the node GetBySolidityIDQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |
| A | [*](#*) |  | |
| also | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |


<a name="network_get_execution_time.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## network_get_execution_time.proto

<BR>Gets the time in nanoseconds spent in <tt>handleTransaction</tt> for one or more<BR>TransactionIDs (assuming they have reached consensus "recently", since only a limited<BR>number of execution times are kept in-memory, depending on the value of the node-local<BR>property <tt>stats.executionTimesToTrack</tt>).

<a name="NetworkGetExecutionTimeQuery"></a>

### NetworkGetExecutionTimeQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| standard | [*](#*) |  | |
| is | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transaction_ids | [TransactionID](#TransactionID) |  | |


<a name="NetworkGetExecutionTimeResponse"></a>

### NetworkGetExecutionTimeResponse
<BR>Response when the client sends the node NetworkGetExecutionTimeQuery; returns<BR>INVALID_TRANSACTION_ID if any of the given TransactionIDs do not have available<BR>execution times in the answering node.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| execution_times |  |  | |


<a name="network_get_version_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## network_get_version_info.proto

<BR>Get the deployed versions of Hedera Services and the HAPI proto in semantic version format

<a name="NetworkGetVersionInfoQuery"></a>

### NetworkGetVersionInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |


<a name="NetworkGetVersionInfoResponse"></a>

### NetworkGetVersionInfoResponse
<BR>Response when the client sends the node NetworkGetVersionInfoQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| hapiProtoVersion | [SemanticVersion](#SemanticVersion) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| hederaServicesVersion | [SemanticVersion](#SemanticVersion) |  | |


<a name="network_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## network_service.proto

<BR>The requests and responses for different network services.

<a name="NetworkService"></a>

### NetworkService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| getVersionInfo  | Query | Response | <BR>Retrieves the active versions of Hedera Services and HAPI proto |
| getExecutionTime  | Query | Response | <BR>Retrieves the time in nanoseconds spent in <tt>handleTransaction</tt> for one or more<BR>TransactionIDs (assuming they have reached consensus "recently", since only a limited<BR>number of execution times are kept in-memory, depending on the value of the node-local<BR>property <tt>stats.executionTimesToTrack</tt>). |
| uncheckedSubmit  | Transaction | TransactionResponse | <BR>Submits a "wrapped" transaction to the network, skipping its standard prechecks. (Note that<BR>the "wrapper" <tt>UncheckedSubmit</tt> transaction is still subject to normal prechecks,<BR>including an authorization requirement that its payer be either the treasury or system admin<BR>account.) |


<a name="query.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## query.proto

<BR>A single query, which is sent from the client to a node. This includes all possible queries. Each<BR>Query should not have more than 50 levels.

<a name="Query"></a>

### Query


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| query | oneof |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | getByKey | [GetByKeyQuery](#GetByKeyQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | getBySolidityID | [GetBySolidityIDQuery](#GetBySolidityIDQuery) |  | |
| | Call | [*](#*) |  | |
| |  | [](#) |  | |
| | contractCallLocal | [ContractCallLocalQuery](#ContractCallLocalQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | contractGetInfo | [ContractGetInfoQuery](#ContractGetInfoQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | contractGetBytecode | [ContractGetBytecodeQuery](#ContractGetBytecodeQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | ContractGetRecords | [ContractGetRecordsQuery](#ContractGetRecordsQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptogetAccountBalance | [CryptoGetAccountBalanceQuery](#CryptoGetAccountBalanceQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoGetAccountRecords | [CryptoGetAccountRecordsQuery](#CryptoGetAccountRecordsQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoGetInfo | [CryptoGetInfoQuery](#CryptoGetInfoQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoGetLiveHash | [CryptoGetLiveHashQuery](#CryptoGetLiveHashQuery) |  | |
| | Get | [*](#*) |  | |
| | (not | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoGetProxyStakers | [CryptoGetStakersQuery](#CryptoGetStakersQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | fileGetContents | [FileGetContentsQuery](#FileGetContentsQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | fileGetInfo | [FileGetInfoQuery](#FileGetInfoQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | transactionGetReceipt | [TransactionGetReceiptQuery](#TransactionGetReceiptQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | transactionGetRecord | [TransactionGetRecordQuery](#TransactionGetRecordQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | transactionGetFastRecord | [TransactionGetFastRecordQuery](#TransactionGetFastRecordQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusGetTopicInfo | [ConsensusGetTopicInfoQuery](#ConsensusGetTopicInfoQuery) |  | |
| | Get | [*](#*) |  | |
| | responding | [*](#*) |  | |
| |  | [](#) |  | |
| | networkGetVersionInfo | [NetworkGetVersionInfoQuery](#NetworkGetVersionInfoQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGetInfo | [TokenGetInfoQuery](#TokenGetInfoQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleGetInfo | [ScheduleGetInfoQuery](#ScheduleGetInfoQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGetAccountNftInfos | [TokenGetAccountNftInfosQuery](#TokenGetAccountNftInfosQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGetNftInfo | [TokenGetNftInfoQuery](#TokenGetNftInfoQuery) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGetNftInfos | [TokenGetNftInfosQuery](#TokenGetNftInfosQuery) |  | |
| | Gets | [*](#*) |  | |
| |  | [](#) |  | |
| | networkGetExecutionTime | [NetworkGetExecutionTimeQuery](#NetworkGetExecutionTimeQuery) |  | |


<a name="query_header.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## query_header.proto

<BR>The client uses the ResponseType to indicate that it desires the node send just the answer, or<BR>both the answer and a state proof. It can also ask for just the cost and not the answer itself<BR>(allowing it to tailor the payment transaction accordingly). If the payment in the query fails<BR>the precheck, then the response may have some fields blank. The state proof is only available for<BR>some types of information. It is available for a Record, but not a receipt. It is available for<BR>the information in each kind of GetInfo request.

<a name="QueryHeader"></a>

### QueryHeader
<BR>Each query from the client to the node will contain the QueryHeader, which gives the requested<BR>response type, and includes a payment transaction that will compensate the node for responding to<BR>the query. The payment can be blank if the query is free.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| payment | [Transaction](#Transaction) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| responseType | [ResponseType](#ResponseType) |  | |


<a name="ResponseType"></a>

### ResponseType


| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| ANSWER_ONLY |  |
| * |  |
|  |  |
| ANSWER_STATE_PROOF |  |
| * |  |
|  |  |
| COST_ANSWER |  |
| * |  |
|  |  |
| COST_ANSWER_STATE_PROOF |  |


<a name="response.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## response.proto

<BR>A single response, which is returned from the node to the client, after the client sent the node<BR>a query. This includes all responses.

<a name="Response"></a>

### Response


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| response | oneof |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | getByKey | [GetByKeyResponse](#GetByKeyResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | getBySolidityID | [GetBySolidityIDResponse](#GetBySolidityIDResponse) |  | |
| | Response | [*](#*) |  | |
| |  | [](#) |  | |
| | contractCallLocal | [ContractCallLocalResponse](#ContractCallLocalResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | contractGetBytecodeResponse | [ContractGetBytecodeResponse](#ContractGetBytecodeResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | contractGetInfo | [ContractGetInfoResponse](#ContractGetInfoResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | contractGetRecordsResponse | [ContractGetRecordsResponse](#ContractGetRecordsResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptogetAccountBalance | [CryptoGetAccountBalanceResponse](#CryptoGetAccountBalanceResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoGetAccountRecords | [CryptoGetAccountRecordsResponse](#CryptoGetAccountRecordsResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoGetInfo | [CryptoGetInfoResponse](#CryptoGetInfoResponse) |  | |
| | Contains | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoGetLiveHash | [CryptoGetLiveHashResponse](#CryptoGetLiveHashResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoGetProxyStakers | [CryptoGetStakersResponse](#CryptoGetStakersResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | fileGetContents | [FileGetContentsResponse](#FileGetContentsResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | fileGetInfo | [FileGetInfoResponse](#FileGetInfoResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | transactionGetReceipt | [TransactionGetReceiptResponse](#TransactionGetReceiptResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | transactionGetRecord | [TransactionGetRecordResponse](#TransactionGetRecordResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | transactionGetFastRecord | [TransactionGetFastRecordResponse](#TransactionGetFastRecordResponse) |  | |
| | Parameters | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusGetTopicInfo | [ConsensusGetTopicInfoResponse](#ConsensusGetTopicInfoResponse) |  | |
| | Semantic | [*](#*) |  | |
| |  | [](#) |  | |
| | networkGetVersionInfo | [NetworkGetVersionInfoResponse](#NetworkGetVersionInfoResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGetInfo | [TokenGetInfoResponse](#TokenGetInfoResponse) |  | |
| | Get | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleGetInfo | [ScheduleGetInfoResponse](#ScheduleGetInfoResponse) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGetAccountNftInfos | [TokenGetAccountNftInfosResponse](#TokenGetAccountNftInfosResponse) |  | |
| | All | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGetNftInfo | [TokenGetNftInfoResponse](#TokenGetNftInfoResponse) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGetNftInfos | [TokenGetNftInfosResponse](#TokenGetNftInfosResponse) |  | |
| | Execution | [*](#*) |  | |
| |  | [](#) |  | |
| | networkGetExecutionTime | [NetworkGetExecutionTimeResponse](#NetworkGetExecutionTimeResponse) |  | |


<a name="response_code.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## response_code.proto

<BR>UNDOCUMENTED

<a name="ResponseCodeEnum"></a>

### ResponseCodeEnum


| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| OK |  |
| * |  |
|  |  |
| INVALID_TRANSACTION |  |
| * |  |
|  |  |
| PAYER_ACCOUNT_NOT_FOUND |  |
| * |  |
| * |  |
|  |  |
| INVALID_NODE_ACCOUNT |  |
| * |  |
| * |  |
|  |  |
| TRANSACTION_EXPIRED |  |
| * |  |
|  |  |
| INVALID_TRANSACTION_START |  |
| * |  |
|  |  |
| INVALID_TRANSACTION_DURATION |  |
| * |  |
|  |  |
| INVALID_SIGNATURE |  |
| * |  |
|  |  |
| MEMO_TOO_LONG |  |
| * |  |
|  |  |
| INSUFFICIENT_TX_FEE |  |
| * |  |
|  |  |
| INSUFFICIENT_PAYER_BALANCE |  |
| * |  |
| * |  |
|  |  |
| DUPLICATE_TRANSACTION |  |
| * |  |
|  |  |
| BUSY |  |
| * |  |
|  |  |
| NOT_SUPPORTED |  |
| * |  |
|  |  |
| INVALID_FILE_ID |  |
| * |  |
|  |  |
| INVALID_ACCOUNT_ID |  |
| * |  |
|  |  |
| INVALID_CONTRACT_ID |  |
| * |  |
|  |  |
| INVALID_TRANSACTION_ID |  |
| * |  |
|  |  |
| RECEIPT_NOT_FOUND |  |
| * |  |
|  |  |
| RECORD_NOT_FOUND |  |
| * |  |
|  |  |
| INVALID_SOLIDITY_ID |  |
| * |  |
| * |  |
|  |  |
| UNKNOWN |  |
| * |  |
|  |  |
| SUCCESS |  |
| * |  |
|  |  |
| FAIL_INVALID |  |
| * |  |
|  |  |
| FAIL_FEE |  |
| * |  |
|  |  |
| FAIL_BALANCE |  |
| * |  |
|  |  |
| KEY_REQUIRED |  |
| * |  |
|  |  |
| BAD_ENCODING |  |
| * |  |
|  |  |
| INSUFFICIENT_ACCOUNT_BALANCE |  |
| * |  |
|  |  |
| INVALID_SOLIDITY_ADDRESS |  |
| * |  |
|  |  |
| INSUFFICIENT_GAS |  |
| * |  |
|  |  |
| CONTRACT_SIZE_LIMIT_EXCEEDED |  |
| * |  |
|  |  |
| LOCAL_CALL_MODIFICATION_EXCEPTION |  |
| * |  |
|  |  |
| CONTRACT_REVERT_EXECUTED |  |
| * |  |
|  |  |
| CONTRACT_EXECUTION_EXCEPTION |  |
| * |  |
| * |  |
|  |  |
| INVALID_RECEIVING_NODE_ACCOUNT |  |
| * |  |
|  |  |
| MISSING_QUERY_HEADER |  |
| * |  |
|  |  |
| ACCOUNT_UPDATE_FAILED |  |
| * |  |
|  |  |
| INVALID_KEY_ENCODING |  |
| * |  |
|  |  |
| NULL_SOLIDITY_ADDRESS |  |
| * |  |
|  |  |
| CONTRACT_UPDATE_FAILED |  |
| * |  |
|  |  |
| INVALID_QUERY_HEADER |  |
| * |  |
|  |  |
| INVALID_FEE_SUBMITTED |  |
| * |  |
|  |  |
| INVALID_PAYER_SIGNATURE |  |
| * |  |
|  |  |
| KEY_NOT_PROVIDED |  |
| * |  |
|  |  |
| INVALID_EXPIRATION_TIME |  |
| * |  |
|  |  |
| NO_WACL_KEY |  |
| * |  |
|  |  |
| FILE_CONTENT_EMPTY |  |
| * |  |
|  |  |
| INVALID_ACCOUNT_AMOUNTS |  |
| * |  |
|  |  |
| EMPTY_TRANSACTION_BODY |  |
| * |  |
|  |  |
| INVALID_TRANSACTION_BODY |  |
| * |  |
| * |  |
|  |  |
| INVALID_SIGNATURE_TYPE_MISMATCHING_KEY |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_SIGNATURE_COUNT_MISMATCHING_KEY |  |
| * |  |
|  |  |
| EMPTY_LIVE_HASH_BODY |  |
| * |  |
|  |  |
| EMPTY_LIVE_HASH |  |
| * |  |
|  |  |
| EMPTY_LIVE_HASH_KEYS |  |
| * |  |
|  |  |
| INVALID_LIVE_HASH_SIZE |  |
| * |  |
|  |  |
| EMPTY_QUERY_BODY |  |
| * |  |
|  |  |
| EMPTY_LIVE_HASH_QUERY |  |
| * |  |
|  |  |
| LIVE_HASH_NOT_FOUND |  |
| * |  |
|  |  |
| ACCOUNT_ID_DOES_NOT_EXIST |  |
| * |  |
|  |  |
| LIVE_HASH_ALREADY_EXISTS |  |
| * |  |
|  |  |
| INVALID_FILE_WACL |  |
| * |  |
|  |  |
| SERIALIZATION_FAILED |  |
| * |  |
|  |  |
| TRANSACTION_OVERSIZE |  |
| * |  |
|  |  |
| TRANSACTION_TOO_MANY_LAYERS |  |
| * |  |
|  |  |
| CONTRACT_DELETED |  |
| * |  |
|  |  |
| PLATFORM_NOT_ACTIVE |  |
| * |  |
|  |  |
| KEY_PREFIX_MISMATCH |  |
| * |  |
|  |  |
| PLATFORM_TRANSACTION_NOT_CREATED |  |
| * |  |
|  |  |
| INVALID_RENEWAL_PERIOD |  |
| * |  |
|  |  |
| INVALID_PAYER_ACCOUNT_ID |  |
| * |  |
|  |  |
| ACCOUNT_DELETED |  |
| * |  |
|  |  |
| FILE_DELETED |  |
| * |  |
|  |  |
| ACCOUNT_REPEATED_IN_ACCOUNT_AMOUNTS |  |
| * |  |
|  |  |
| SETTING_NEGATIVE_ACCOUNT_BALANCE |  |
| * |  |
| * |  |
|  |  |
| OBTAINER_REQUIRED |  |
| * |  |
| * |  |
|  |  |
| OBTAINER_SAME_CONTRACT_ID |  |
| * |  |
|  |  |
| OBTAINER_DOES_NOT_EXIST |  |
| * |  |
| * |  |
|  |  |
| MODIFYING_IMMUTABLE_CONTRACT |  |
| * |  |
|  |  |
| FILE_SYSTEM_EXCEPTION |  |
| * |  |
|  |  |
| AUTORENEW_DURATION_NOT_IN_RANGE |  |
| * |  |
| * |  |
|  |  |
| ERROR_DECODING_BYTESTRING |  |
| * |  |
|  |  |
| CONTRACT_FILE_EMPTY |  |
| * |  |
|  |  |
| CONTRACT_BYTECODE_EMPTY |  |
| * |  |
|  |  |
| INVALID_INITIAL_BALANCE |  |
| * |  |
|  |  |
| INVALID_RECEIVE_RECORD_THRESHOLD |  |
| * |  |
|  |  |
| INVALID_SEND_RECORD_THRESHOLD |  |
| * |  |
| * |  |
|  |  |
| ACCOUNT_IS_NOT_GENESIS_ACCOUNT |  |
| * |  |
|  |  |
| PAYER_ACCOUNT_UNAUTHORIZED |  |
| * |  |
|  |  |
| INVALID_FREEZE_TRANSACTION_BODY |  |
| * |  |
|  |  |
| FREEZE_TRANSACTION_BODY_NOT_FOUND |  |
| * |  |
|  |  |
| TRANSFER_LIST_SIZE_LIMIT_EXCEEDED |  |
| * |  |
|  |  |
| RESULT_SIZE_LIMIT_EXCEEDED |  |
| * |  |
|  |  |
| NOT_SPECIAL_ACCOUNT |  |
| * |  |
|  |  |
| CONTRACT_NEGATIVE_GAS |  |
| * |  |
|  |  |
| CONTRACT_NEGATIVE_VALUE |  |
| * |  |
|  |  |
| INVALID_FEE_FILE |  |
| * |  |
|  |  |
| INVALID_EXCHANGE_RATE_FILE |  |
| * |  |
|  |  |
| INSUFFICIENT_LOCAL_CALL_GAS |  |
| * |  |
|  |  |
| ENTITY_NOT_ALLOWED_TO_DELETE |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| AUTHORIZATION_FAILED |  |
| * |  |
|  |  |
| FILE_UPLOADED_PROTO_INVALID |  |
| * |  |
|  |  |
| FILE_UPLOADED_PROTO_NOT_SAVED_TO_DISK |  |
| * |  |
|  |  |
| FEE_SCHEDULE_FILE_PART_UPLOADED |  |
| * |  |
|  |  |
| EXCHANGE_RATE_CHANGE_LIMIT_EXCEEDED |  |
| * |  |
|  |  |
| MAX_CONTRACT_STORAGE_EXCEEDED |  |
| * |  |
|  |  |
| TRANSFER_ACCOUNT_SAME_AS_DELETE_ACCOUNT |  |
| TOTAL_LEDGER_BALANCE_INVALID |  |
| * |  |
|  |  |
| EXPIRATION_REDUCTION_NOT_ALLOWED |  |
| * |  |
|  |  |
| MAX_GAS_LIMIT_EXCEEDED |  |
| * |  |
|  |  |
| MAX_FILE_SIZE_EXCEEDED |  |
| * |  |
|  |  |
| RECEIVER_SIG_REQUIRED |  |
| * |  |
|  |  |
| INVALID_TOPIC_ID |  |
| * |  |
|  |  |
| INVALID_ADMIN_KEY |  |
| * |  |
|  |  |
| INVALID_SUBMIT_KEY |  |
| * |  |
|  |  |
| UNAUTHORIZED |  |
| * |  |
|  |  |
| INVALID_TOPIC_MESSAGE |  |
| * |  |
|  |  |
| INVALID_AUTORENEW_ACCOUNT |  |
| * |  |
|  |  |
| AUTORENEW_ACCOUNT_NOT_ALLOWED |  |
| * |  |
| * |  |
| * |  |
|  |  |
| TOPIC_EXPIRED |  |
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
| * |  |
|  |  |
| INVALID_SCHEDULE_ID |  |
| * |  |
|  |  |
| SCHEDULE_IS_IMMUTABLE |  |
| * |  |
|  |  |
| INVALID_SCHEDULE_PAYER_ID |  |
| * |  |
|  |  |
| INVALID_SCHEDULE_ACCOUNT_ID |  |
| * |  |
|  |  |
| NO_NEW_VALID_SIGNATURES |  |
| * |  |
|  |  |
| UNRESOLVABLE_REQUIRED_SIGNERS |  |
| * |  |
|  |  |
| SCHEDULED_TRANSACTION_NOT_IN_WHITELIST |  |
| * |  |
|  |  |
| SOME_SIGNATURES_WERE_INVALID |  |
| * |  |
|  |  |
| TRANSACTION_ID_FIELD_NOT_ALLOWED |  |
| * |  |
|  |  |
| IDENTICAL_SCHEDULE_ALREADY_CREATED |  |
| * |  |
|  |  |
| INVALID_ZERO_BYTE_IN_STRING |  |
| * |  |
|  |  |
| SCHEDULE_ALREADY_DELETED |  |
| * |  |
|  |  |
| SCHEDULE_ALREADY_EXECUTED |  |
| * |  |
|  |  |
| MESSAGE_SIZE_TOO_LARGE |  |
| * |  |
|  |  |
| OPERATION_REPEATED_IN_BUCKET_GROUPS |  |
| * |  |
|  |  |
| BUCKET_CAPACITY_OVERFLOW |  |
| * |  |
|  |  |
| NODE_CAPACITY_NOT_SUFFICIENT_FOR_OPERATION |  |
| * |  |
|  |  |
| BUCKET_HAS_NO_THROTTLE_GROUPS |  |
| * |  |
|  |  |
| THROTTLE_GROUP_HAS_ZERO_OPS_PER_SEC |  |
| * |  |
|  |  |
| SUCCESS_BUT_MISSING_EXPECTED_OPERATION |  |
| * |  |
|  |  |
| UNPARSEABLE_THROTTLE_DEFINITIONS |  |
| * |  |
|  |  |
| INVALID_THROTTLE_DEFINITIONS |  |
| * |  |
|  |  |
| ACCOUNT_EXPIRED_AND_PENDING_REMOVAL |  |
| * |  |
|  |  |
| INVALID_TOKEN_MAX_SUPPLY |  |
| * |  |
|  |  |
| INVALID_TOKEN_NFT_SERIAL_NUMBER |  |
| * |  |
|  |  |
| INVALID_NFT_ID |  |
| * |  |
|  |  |
| METADATA_TOO_LONG |  |
| * |  |
|  |  |
| BATCH_SIZE_LIMIT_EXCEEDED |  |
| * |  |
|  |  |
| INVALID_QUERY_RANGE |  |
| * |  |
|  |  |
| FRACTION_DIVIDES_BY_ZERO |  |
| * |  |
|  |  |
| INSUFFICIENT_PAYER_BALANCE_FOR_CUSTOM_FEE |  |
| * |  |
|  |  |
| CUSTOM_FEES_LIST_TOO_LONG |  |
| * |  |
|  |  |
| INVALID_CUSTOM_FEE_COLLECTOR |  |
| * |  |
|  |  |
| INVALID_TOKEN_ID_IN_CUSTOM_FEES |  |
| * |  |
|  |  |
| TOKEN_NOT_ASSOCIATED_TO_FEE_COLLECTOR |  |
| * |  |
|  |  |
| TOKEN_MAX_SUPPLY_REACHED |  |
| * |  |
|  |  |
| SENDER_DOES_NOT_OWN_NFT_SERIAL_NO |  |
| * |  |
|  |  |
| CUSTOM_FEE_NOT_FULLY_SPECIFIED |  |
| * |  |
|  |  |
| CUSTOM_FEE_MUST_BE_POSITIVE |  |
| * |  |
|  |  |
| TOKEN_HAS_NO_FEE_SCHEDULE_KEY |  |
| * |  |
|  |  |
| CUSTOM_FEE_OUTSIDE_NUMERIC_RANGE |  |
| * |  |
|  |  |
| ROYALTY_FRACTION_CANNOT_EXCEED_ONE |  |
| * |  |
|  |  |
| FRACTIONAL_FEE_MAX_AMOUNT_LESS_THAN_MIN_AMOUNT |  |
| * |  |
|  |  |
| CUSTOM_SCHEDULE_ALREADY_HAS_NO_FEES |  |
| * |  |
|  |  |
| CUSTOM_FEE_DENOMINATION_MUST_BE_FUNGIBLE_COMMON |  |
| * |  |
|  |  |
| CUSTOM_FRACTIONAL_FEE_ONLY_ALLOWED_FOR_FUNGIBLE_COMMON |  |
| * |  |
|  |  |
| INVALID_CUSTOM_FEE_SCHEDULE_KEY |  |
| * |  |
|  |  |
| INVALID_TOKEN_MINT_METADATA |  |
| * |  |
|  |  |
| INVALID_TOKEN_BURN_METADATA |  |
| * |  |
|  |  |
| CURRENT_TREASURY_STILL_OWNS_NFTS |  |
| * |  |
|  |  |
| ACCOUNT_STILL_OWNS_NFTS |  |
| * |  |
|  |  |
| TREASURY_MUST_OWN_BURNED_NFT |  |
| * |  |
|  |  |
| ACCOUNT_DOES_NOT_OWN_WIPED_NFT |  |
| * |  |
|  |  |
| ACCOUNT_AMOUNT_TRANSFERS_ONLY_ALLOWED_FOR_FUNGIBLE_COMMON |  |
| * |  |
|  |  |
| MAX_NFTS_IN_PRICE_REGIME_HAVE_BEEN_MINTED |  |
| * |  |
|  |  |
| PAYER_ACCOUNT_DELETED |  |
| * |  |
|  |  |
| CUSTOM_FEE_CHARGING_EXCEEDED_MAX_RECURSION_DEPTH |  |
| * |  |
|  |  |
| CUSTOM_FEE_CHARGING_EXCEEDED_MAX_ACCOUNT_AMOUNTS |  |
| * |  |
|  |  |
| INSUFFICIENT_SENDER_ACCOUNT_BALANCE_FOR_CUSTOM_FEE |  |
| * |  |
|  |  |
| SERIAL_NUMBER_LIMIT_REACHED |  |
| * |  |
|  |  |
| CUSTOM_ROYALTY_FEE_ONLY_ALLOWED_FOR_NON_FUNGIBLE_UNIQUE |  |
| * |  |
|  |  |
| NO_REMAINING_AUTOMATIC_ASSOCIATIONS |  |
| * |  |
|  |  |
| EXISTING_AUTOMATIC_ASSOCIATIONS_EXCEED_GIVEN_LIMIT |  |
| * |  |
|  |  |
| REQUESTED_NUM_AUTOMATIC_ASSOCIATIONS_EXCEEDS_ASSOCIATION_LIMIT |  |


<a name="response_header.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## response_header.proto

<BR>Every query receives a response containing the QueryResponseHeader. Either or both of the cost<BR>and stateProof fields may be blank, if the responseType didn't ask for the cost or stateProof.

<a name="ResponseHeader"></a>

### ResponseHeader


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Result | [*](#*) |  | |
|  | [](#) |  | |
| nodeTransactionPrecheckCode | [ResponseCodeEnum](#ResponseCodeEnum) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| responseType | [ResponseType](#ResponseType) |  | |
| The | [*](#*) |  | |
| Note: | [*](#*) |  | |
| required | [*](#*) |  | |
| account | [*](#*) |  | |
|  | [](#) |  | |
| cost |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| stateProof |  |  | |


<a name="schedulable_transaction_body.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedulable_transaction_body.proto

<BR>A schedulable transaction. Note that the global/dynamic system property<BR><tt>scheduling.whitelist</tt> controls which transaction types may be scheduled.  In Hedera<BR>Services 0.13.0, it will include only <tt>CryptoTransfer</tt> and <tt>ConsensusSubmitMessage</tt><BR>functions.

<a name="SchedulableTransactionBody"></a>

### SchedulableTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionFee |  |  | |
| A | [*](#*) |  | |
| include | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| data | oneof |  | |
| | Calls | [*](#*) |  | |
| |  | [](#) |  | |
| | contractCall | [ContractCallTransactionBody](#ContractCallTransactionBody) |  | |
| | Creates | [*](#*) |  | |
| |  | [](#) |  | |
| | contractCreateInstance | [ContractCreateTransactionBody](#ContractCreateTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | contractUpdateInstance | [ContractUpdateTransactionBody](#ContractUpdateTransactionBody) |  | |
| | Delete | [*](#*) |  | |
| |  | [](#) |  | |
| | contractDeleteInstance | [ContractDeleteTransactionBody](#ContractDeleteTransactionBody) |  | |
| | Create | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoCreateAccount | [CryptoCreateTransactionBody](#CryptoCreateTransactionBody) |  | |
| | Delete | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoDelete | [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody) |  | |
| | Transfer | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoTransfer | [CryptoTransferTransactionBody](#CryptoTransferTransactionBody) |  | |
| | Modify | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoUpdateAccount | [CryptoUpdateTransactionBody](#CryptoUpdateTransactionBody) |  | |
| | Add | [*](#*) |  | |
| |  | [](#) |  | |
| | fileAppend | [FileAppendTransactionBody](#FileAppendTransactionBody) |  | |
| | Create | [*](#*) |  | |
| |  | [](#) |  | |
| | fileCreate | [FileCreateTransactionBody](#FileCreateTransactionBody) |  | |
| | Delete | [*](#*) |  | |
| |  | [](#) |  | |
| | fileDelete | [FileDeleteTransactionBody](#FileDeleteTransactionBody) |  | |
| | Modify | [*](#*) |  | |
| |  | [](#) |  | |
| | fileUpdate | [FileUpdateTransactionBody](#FileUpdateTransactionBody) |  | |
| | Hedera | [*](#*) |  | |
| |  | [](#) |  | |
| | systemDelete | [SystemDeleteTransactionBody](#SystemDeleteTransactionBody) |  | |
| | To | [*](#*) |  | |
| |  | [](#) |  | |
| | systemUndelete | [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody) |  | |
| | Freeze | [*](#*) |  | |
| |  | [](#) |  | |
| | freeze | [FreezeTransactionBody](#FreezeTransactionBody) |  | |
| | Creates | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusCreateTopic | [ConsensusCreateTopicTransactionBody](#ConsensusCreateTopicTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusUpdateTopic | [ConsensusUpdateTopicTransactionBody](#ConsensusUpdateTopicTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusDeleteTopic | [ConsensusDeleteTopicTransactionBody](#ConsensusDeleteTopicTransactionBody) |  | |
| | Submits | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusSubmitMessage | [ConsensusSubmitMessageTransactionBody](#ConsensusSubmitMessageTransactionBody) |  | |
| | Creates | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenCreation | [TokenCreateTransactionBody](#TokenCreateTransactionBody) |  | |
| | Freezes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenFreeze | [TokenFreezeAccountTransactionBody](#TokenFreezeAccountTransactionBody) |  | |
| | Unfreezes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenUnfreeze | [TokenUnfreezeAccountTransactionBody](#TokenUnfreezeAccountTransactionBody) |  | |
| | Grants | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGrantKyc | [TokenGrantKycTransactionBody](#TokenGrantKycTransactionBody) |  | |
| | Revokes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenRevokeKyc | [TokenRevokeKycTransactionBody](#TokenRevokeKycTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenDeletion | [TokenDeleteTransactionBody](#TokenDeleteTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenUpdate | [TokenUpdateTransactionBody](#TokenUpdateTransactionBody) |  | |
| | Mints | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenMint | [TokenMintTransactionBody](#TokenMintTransactionBody) |  | |
| | Burns | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenBurn | [TokenBurnTransactionBody](#TokenBurnTransactionBody) |  | |
| | Wipes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenWipe | [TokenWipeAccountTransactionBody](#TokenWipeAccountTransactionBody) |  | |
| | Associate | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenAssociate | [TokenAssociateTransactionBody](#TokenAssociateTransactionBody) |  | |
| | Dissociate | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenDissociate | [TokenDissociateTransactionBody](#TokenDissociateTransactionBody) |  | |
| | Marks | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleDelete | [ScheduleDeleteTransactionBody](#ScheduleDeleteTransactionBody) |  | |


<a name="schedule_create.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_create.proto

<BR>Create a new <i>schedule entity</i> (or simply, <i>schedule</i>) in the network's action queue.<BR>Upon <tt>SUCCESS</tt>, the receipt contains the `ScheduleID` of the created schedule. A schedule<BR>entity includes a <tt>scheduledTransactionBody</tt> to be executed when the schedule has<BR>collected enough signing Ed25519 keys to satisfy the scheduled transaction's signing<BR>requirements. Upon `SUCCESS`, the receipt also includes the <tt>scheduledTransactionID</tt> to<BR>use to query for the record of the scheduled transaction's execution (if it occurs).<BR>The expiration time of a schedule is always 30 minutes; it remains in state and can be queried<BR>using <tt>GetScheduleInfo</tt> until expiration, no matter if the scheduled transaction has<BR>executed or marked deleted.<BR>If the <tt>adminKey</tt> field is omitted, the resulting schedule is immutable. If the<BR><tt>adminKey</tt> is set, the <tt>ScheduleDelete</tt> transaction can be used to mark it as<BR>deleted. The creator may also specify an optional <tt>memo</tt> whose UTF-8 encoding is at most<BR>100 bytes and does not include the zero byte is also supported.<BR>When a scheduled transaction whose schedule has collected enough signing keys is executed, the<BR>network only charges its payer the service fee, and not the node and network fees. If the<BR>optional <tt>payerAccountID</tt> is set, the network charges this account. Otherwise it charges<BR>the payer of the originating <tt>ScheduleCreate</tt>.<BR>Two <tt>ScheduleCreate</tt> transactions are <i>identical</i> if they are equal in all their<BR>fields other than <tt>payerAccountID</tt>.  (Here "equal" should be understood in the sense of<BR>gRPC object equality in the network software runtime. In particular, a gRPC object with <a<BR>href="https:developers.google.com/protocol-buffers/docs/proto3#unknowns">unknown fields</a> is<BR>not equal to a gRPC object without unknown fields, even if they agree on all known fields.)<BR>A <tt>ScheduleCreate</tt> transaction that attempts to re-create an identical schedule already in<BR>state will receive a receipt with status <tt>IDENTICAL_SCHEDULE_ALREADY_CREATED</tt>; the receipt<BR>will include the <tt>ScheduleID</tt> of the extant schedule, which may be used in a subsequent<BR><tt>ScheduleSign</tt> transaction. (The receipt will also include the <tt>TransactionID</tt> to<BR>use in querying for the receipt or record of the scheduled transaction.)<BR>Other notable response codes include, <tt>INVALID_ACCOUNT_ID</tt>,<BR><tt>UNSCHEDULABLE_TRANSACTION</tt>, <tt>UNRESOLVABLE_REQUIRED_SIGNERS</tt>,<BR><tt>INVALID_SIGNATURE</tt>. For more information please see the section of this documentation on<BR>the <tt>ResponseCode</tt> enum.

<a name="ScheduleCreateTransactionBody"></a>

### ScheduleCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduledTransactionBody | [SchedulableTransactionBody](#SchedulableTransactionBody) |  | |
| An | [*](#*) |  | |
| zero | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| An | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| An | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| payerAccountID | [AccountID](#AccountID) |  | |


<a name="schedule_delete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_delete.proto

<BR>Marks a schedule in the network's action queue as deleted. Must be signed by the admin key of the<BR>target schedule.  A deleted schedule cannot receive any additional signing keys, nor will it be<BR>executed.<BR>Other notable response codes include, <tt>INVALID_SCHEDULE_ID</tt>,<BR><tt>SCHEDULE_WAS_DELETED</tt>, <tt>SCHEDULE_WAS_EXECUTED</tt>, <tt>SCHEDULE_IS_IMMUTABLE</tt>.<BR>For more information please see the section of this documentation on the <tt>ResponseCode</tt><BR>enum.

<a name="ScheduleDeleteTransactionBody"></a>

### ScheduleDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduleID | [ScheduleID](#ScheduleID) |  | |


<a name="schedule_get_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_get_info.proto

<BR>Gets information about a schedule in the network's action queue.<BR>Responds with <tt>INVALID_SCHEDULE_ID</tt> if the requested schedule doesn't exist.

<a name="ScheduleGetInfoQuery"></a>

### ScheduleGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| standard | [*](#*) |  | |
| is | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduleID | [ScheduleID](#ScheduleID) |  | |


<a name="ScheduleGetInfoResponse"></a>

### ScheduleGetInfoResponse
<BR>Response wrapper for the <tt>ScheduleInfo</tt>

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| both, | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduleInfo | [ScheduleInfo](#ScheduleInfo) |  | |


<a name="ScheduleInfo"></a>

### ScheduleInfo
<BR>Information summarizing schedule state

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduleID | [ScheduleID](#ScheduleID) |  | |
| data | oneof |  | |
| | If | [*](#*) |  | |
| |  | [](#) |  | |
| | deletion_time | [Timestamp](#Timestamp) |  | |
| | If | [*](#*) |  | |
| |  | [](#) |  | |
| | execution_time | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduledTransactionBody | [SchedulableTransactionBody](#SchedulableTransactionBody) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| signers | [KeyList](#KeyList) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| creatorAccountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| payerAccountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| scheduledTransactionID | [TransactionID](#TransactionID) |  | |


<a name="schedule_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_service.proto

<BR>Transactions and queries for the Schedule Service<BR>The Schedule Service allows transactions to be submitted without all the required signatures and<BR>allows anyone to provide the required signatures independently after a transaction has already<BR>been created.<BR>Execution:<BR>Scheduled Transactions are executed once all required signatures are collected and witnessed.<BR>Every time new signature is provided, a check is performed on the "readiness" of the execution.<BR>The Scheduled Transaction will be executed immediately after the transaction that triggered it<BR>and will be externalised in a separate Transaction Record.<BR>Transaction Record:<BR>The timestamp of the Scheduled Transaction will be equal to consensusTimestamp + 1 nano, where<BR>consensusTimestamp is the timestamp of the transaction that triggered the execution.<BR>The Transaction ID of the Scheduled Transaction will have the scheduled property set to true and<BR>inherit the transactionValidStart and accountID from the ScheduleCreate transaction.<BR>The scheduleRef property of the transaction record will be populated with the ScheduleID of the<BR>Scheduled Transaction.<BR>Post execution:<BR>Once a given Scheduled Transaction executes, it will be removed from the ledger and any upcoming<BR>operation referring the ScheduleID will resolve to INVALID_SCHEDULE_ID.<BR>Expiry:<BR>Scheduled Transactions have a global expiry time txExpiryTimeSecs (Currently set to 30 minutes).<BR>If txExpiryTimeSecs pass and the Scheduled Transaction haven't yet executed, it will be removed<BR>from the ledger as if ScheduleDelete operation is executed.

<a name="ScheduleService"></a>

### ScheduleService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createSchedule  | Transaction | TransactionResponse | <BR>Creates a new Schedule by submitting the transaction |
| signSchedule  | Transaction | TransactionResponse | <BR>Signs a new Schedule by submitting the transaction |
| deleteSchedule  | Transaction | TransactionResponse | <BR>Deletes a new Schedule by submitting the transaction |
| getScheduleInfo  | Query | Response | <BR>Retrieves the metadata of a schedule entity |


<a name="schedule_sign.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_sign.proto

<BR>Adds zero or more signing keys to a schedule. If the resulting set of signing keys satisfy the<BR>scheduled transaction's signing requirements, it will be executed immediately after the<BR>triggering <tt>ScheduleSign</tt>.<BR>Upon <tt>SUCCESS</tt>, the receipt includes the <tt>scheduledTransactionID</tt> to use to query<BR>for the record of the scheduled transaction's execution (if it occurs).<BR>Other notable response codes include <tt>INVALID_SCHEDULE_ID</tt>, <tt>SCHEDULE_WAS_DELETD</tt>,<BR><tt>INVALID_ACCOUNT_ID</tt>, <tt>UNRESOLVABLE_REQUIRED_SIGNERS</tt>,<BR><tt>SOME_SIGNATURES_WERE_INVALID</tt>, and <tt>NO_NEW_VALID_SIGNATURES</tt>. For more information<BR>please see the section of this documentation on the <tt>ResponseCode</tt> enum.

<a name="ScheduleSignTransactionBody"></a>

### ScheduleSignTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduleID | [ScheduleID](#ScheduleID) |  | |


<a name="smart_contract_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## smart_contract_service.proto

<BR>Transactions and queries for the file service.

<a name="SmartContractService"></a>

### SmartContractService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createContract  | Transaction | TransactionResponse | <BR>Creates a contract |
| updateContract  | Transaction | TransactionResponse | <BR>Updates a contract with the content |
| contractCallMethod  | Transaction | TransactionResponse | <BR>Calls a contract |
| getContractInfo  | Query | Response | <BR>Retrieves the contract information |
| contractCallLocalMethod  | Query | Response | <BR>Calls a smart contract to be run on a single node |
| ContractGetBytecode  | Query | Response | <BR>Retrieves the byte code of a contract |
| getBySolidityID  | Query | Response | <BR>Retrieves a contract by its Solidity address |
| getTxRecordByContractID  | Query | Response) {<BR>Always returns an empty record list, as contract accounts are never effective payers for<BR>transactions |
| option deprecated  =  true; |


<a name="system_delete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## system_delete.proto

<BR>Delete a file or smart contract - can only be done with a Hedera administrative multisignature.<BR>When it is deleted, it immediately disappears from the system as seen by the user, but is still<BR>stored internally until the expiration time, at which time it is truly and permanently deleted.<BR>Until that time, it can be undeleted by the Hedera administrative multisignature. When a smart<BR>contract is deleted, the cryptocurrency account within it continues to exist, and is not affected<BR>by the expiration time here.

<a name="SystemDeleteTransactionBody"></a>

### SystemDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| id | oneof |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | fileID | [FileID](#FileID) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | contractID | [ContractID](#ContractID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expirationTime | [TimestampSeconds](#TimestampSeconds) |  | |


<a name="system_undelete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## system_undelete.proto

<BR>Undelete a file or smart contract that was deleted by SystemDelete; requires a Hedera<BR>administrative multisignature.

<a name="SystemUndeleteTransactionBody"></a>

### SystemUndeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| id | oneof |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | fileID | [FileID](#FileID) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | contractID | [ContractID](#ContractID) |  | |


<a name="throttle_definitions.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## throttle_definitions.proto

<BR>A set of operations which should be collectively throttled at a given milli-ops-per-second limit.

<a name="ThrottleBucket"></a>

### ThrottleBucket
<BR>A list of throttle groups that should all compete for the same internal bucket.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| name |  |  | |
| The | [*](#*) |  | |
| of | [*](#*) |  | |
| not | [*](#*) |  | |
|  | [](#) |  | |
| burstPeriodMs |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| throttleGroups | [ThrottleGroup](#ThrottleGroup) |  | |


<a name="ThrottleDefinitions"></a>

### ThrottleDefinitions
<BR>A list of throttle buckets which, simultaneously enforced, define the system's throttling policy.<BR><ol><BR><li> When an operation appears in more than one throttling bucket, all its buckets must have room<BR>or it will be throttled.</li><BR><li>An operation assigned to no buckets is always throttled.</li><BR></ol>

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| throttleBuckets | [ThrottleBucket](#ThrottleBucket) |  | |


<a name="ThrottleGroup"></a>

### ThrottleGroup


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| operations | [HederaFunctionality](#HederaFunctionality) |  | |
| The | [*](#*) |  | |
| choose | [*](#*) |  | |
| second | [*](#*) |  | |
| milliOpsPerSec | [*](#*) |  | |
|  | [](#) |  | |
| milliOpsPerSec |  |  | |


<a name="timestamp.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## timestamp.proto

<BR>An exact date and time. This is the same data structure as the protobuf Timestamp.proto (see the<BR>comments in https:github.com/google/protobuf/blob/master/src/google/protobuf/timestamp.proto)

<a name="Timestamp"></a>

### Timestamp


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Number | [*](#*) |  | |
|  | [](#) |  | |
| seconds |  |  | |
| Number | [*](#*) |  | |
|  | [](#) |  | |
| nanos |  |  | |


<a name="TimestampSeconds"></a>

### TimestampSeconds
<BR>An exact date and time,  with a resolution of one second (no nanoseconds).

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Number | [*](#*) |  | |
|  | [](#) |  | |
| seconds |  |  | |


<a name="token_associate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_associate.proto

<BR>Associates the provided account with the provided tokens. Must be signed by the provided<BR>Account's key.<BR>If the provided account is not found, the transaction will resolve to INVALID_ACCOUNT_ID.<BR>If the provided account has been deleted, the transaction will resolve to ACCOUNT_DELETED.<BR>If any of the provided tokens is not found, the transaction will resolve to INVALID_TOKEN_REF.<BR>If any of the provided tokens has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If an association between the provided account and any of the tokens already exists, the<BR>transaction will resolve to TOKEN_ALREADY_ASSOCIATED_TO_ACCOUNT.<BR>If the provided account's associations count exceed the constraint of maximum token associations<BR>per account, the transaction will resolve to TOKENS_PER_ACCOUNT_LIMIT_EXCEEDED.<BR>On success, associations between the provided account and tokens are made and the account is<BR>ready to interact with the tokens.

<a name="TokenAssociateTransactionBody"></a>

### TokenAssociateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| Type, | [*](#*) |  | |
| token | [*](#*) |  | |
|  | [](#) |  | |
| tokens | [TokenID](#TokenID) |  | |


<a name="token_burn.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_burn.proto

<BR>Burns tokens from the Token's treasury Account. If no Supply Key is defined, the transaction will<BR>resolve to TOKEN_HAS_NO_SUPPLY_KEY.<BR>The operation decreases the Total Supply of the Token. Total supply cannot go below zero.<BR>The amount provided must be in the lowest denomination possible. Example:<BR>Token A has 2 decimals. In order to burn 100 tokens, one must provide amount of 10000. In order<BR>to burn 100.55 tokens, one must provide amount of 10055.<BR>For non fungible tokens the transaction body accepts serialNumbers list of integers as a parameter.<BR>If neither the amount nor the serialNumbers get filled, a INVALID_TOKEN_BURN_AMOUNT response code<BR>will be returned.<BR>If both amount and serialNumbers get filled, a INVALID_TRANSACTION_BODY response code will be<BR>returned.<BR>If the serialNumbers' list count is greater than the batch size limit global dynamic property, a<BR>BATCH_SIZE_LIMIT_EXCEEDED response code will be returned.<BR>If the serialNumbers list contains a non-positive integer as a serial number, a INVALID_NFT_ID<BR>response code will be returned.

<a name="TokenBurnTransactionBody"></a>

### TokenBurnTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| Applicable | [*](#*) |  | |
| Amount | [*](#*) |  | |
| account | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |
| Applicable | [*](#*) |  | |
|  | [](#) |  | |
| serialNumbers |  |  | |


<a name="token_create.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_create.proto

<BR>Create a new token. After the token is created, the Token ID for it is in the receipt.<BR>The specified Treasury Account is receiving the initial supply of tokens as-well as the tokens<BR>from the Token Mint operation once executed. The balance of the treasury account is decreased<BR>when the Token Burn operation is executed.<BR>The <tt>initialSupply</tt> is the initial supply of the smallest parts of a token (like a<BR>tinybar, not an hbar). These are the smallest units of the token which may be transferred.<BR>The supply can change over time. If the total supply at some moment is <i>S</i> parts of tokens,<BR>and the token is using <i>D</i> decimals, then <i>S</i> must be less than or equal to<BR>2<sup>63</sup>-1, which is 9,223,372,036,854,775,807. The number of whole tokens (not parts) will<BR>be <i>S / 10<sup>D</sup></i>.<BR>If decimals is 8 or 11, then the number of whole tokens can be at most a few billions or<BR>millions, respectively. For example, it could match Bitcoin (21 million whole tokens with 8<BR>decimals) or hbars (50 billion whole tokens with 8 decimals). It could even match Bitcoin with<BR>milli-satoshis (21 million whole tokens with 11 decimals).<BR>Note that a created token is <i>immutable</i> if the <tt>adminKey</tt> is omitted. No property of<BR>an immutable token can ever change, with the sole exception of its expiry. Anyone can pay to<BR>extend the expiry time of an immutable token.<BR>A token can be either <i>FUNGIBLE_COMMON</i> or <i>NON_FUNGIBLE_UNIQUE</i>, based on its<BR><i>TokenType</i>. If it has been omitted, <i>FUNGIBLE_COMMON</i> type is used.<BR>A token can have either <i>INFINITE</i> or <i>FINITE</i> supply type, based on its<BR><i>TokenType</i>. If it has been omitted, <i>INFINITE</i> type is used.<BR>If a <i>FUNGIBLE</i> TokenType is used, <i>initialSupply</i> should explicitly be set to a<BR>non-negative. If not, the transaction will resolve to INVALID_TOKEN_INITIAL_SUPPLY.<BR>If a <i>NON_FUNGIBLE_UNIQUE</i> TokenType is used, <i>initialSupply</i> should explicitly be set<BR>to 0. If not, the transaction will resolve to INVALID_TOKEN_INITIAL_SUPPLY.<BR>If an <i>INFINITE</i> TokenSupplyType is used, <i>maxSupply</i> should explicitly be set to 0. If<BR>it is not 0, the transaction will resolve to INVALID_TOKEN_MAX_SUPPLY.<BR>If a <i>FINITE</i> TokenSupplyType is used, <i>maxSupply</i> should be explicitly set to a<BR>non-negative value. If it is not, the transaction will resolve to INVALID_TOKEN_MAX_SUPPLY.

<a name="TokenCreateTransactionBody"></a>

### TokenCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| length | [*](#*) |  | |
|  | [](#) |  | |
| name |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| symbol |  |  | |
| For | [*](#*) |  | |
| token | [*](#*) |  | |
| must | [*](#*) |  | |
|  | [](#) |  | |
| decimals |  |  | |
| Specifies | [*](#*) |  | |
| initial | [*](#*) |  | |
| lowest | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| initialSupply |  |  | |
| The | [*](#*) |  | |
| will | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| treasury | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| perceived | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| KYC | [*](#*) |  | |
|  | [](#) |  | |
| kycKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| freezing | [*](#*) |  | |
|  | [](#) |  | |
| freezeKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| wipeKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| supplyKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| true, | [*](#*) |  | |
|  | [](#) |  | |
| freezeDefault |  |  | |
| The | [*](#*) |  | |
| specified, | [*](#*) |  | |
|  | [](#) |  | |
| expiry | [Timestamp](#Timestamp) |  | |
| An | [*](#*) |  | |
| autoRenewPeriod | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewAccount | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| IWA | [*](#*) |  | |
|  | [](#) |  | |
| tokenType | [TokenType](#TokenType) |  | |
| IWA | [*](#*) |  | |
|  | [](#) |  | |
| supplyType | [TokenSupplyType](#TokenSupplyType) |  | |
| IWA | [*](#*) |  | |
| maximum | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| maxSupply |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| fee_schedule_key | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| custom_fees | [CustomFee](#CustomFee) |  | |


<a name="token_delete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_delete.proto

<BR>Marks a token as deleted, though it will remain in the ledger.<BR>The operation must be signed by the specified Admin Key of the Token. If<BR>admin key is not set, Transaction will result in TOKEN_IS_IMMUTABlE.<BR>Once deleted update, mint, burn, wipe, freeze, unfreeze, grant kyc, revoke<BR>kyc and token transfer transactions will resolve to TOKEN_WAS_DELETED.

<a name="TokenDeleteTransactionBody"></a>

### TokenDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| result | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |


<a name="token_dissociate.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_dissociate.proto

<BR>Dissociates the provided account with the provided tokens. Must be signed by the provided<BR>Account's key.<BR>If the provided account is not found, the transaction will resolve to INVALID_ACCOUNT_ID.<BR>If the provided account has been deleted, the transaction will resolve to ACCOUNT_DELETED.<BR>If any of the provided tokens is not found, the transaction will resolve to INVALID_TOKEN_REF.<BR>If any of the provided tokens has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If an association between the provided account and any of the tokens does not exist, the<BR>transaction will resolve to TOKEN_NOT_ASSOCIATED_TO_ACCOUNT.<BR>If a token has not been deleted and has not expired, and the user has a nonzero balance, the<BR>transaction will resolve to TRANSACTION_REQUIRES_ZERO_TOKEN_BALANCES.<BR>If a <b>fungible token</b> has expired, the user can disassociate even if their token balance is<BR>not zero.<BR>If a <b>non fungible token</b> has expired, the user can <b>not</b> disassociate if their token<BR>balance is not zero. The transaction will resolve to TRANSACTION_REQUIRED_ZERO_TOKEN_BALANCES.<BR>On success, associations between the provided account and tokens are removed.

<a name="TokenDissociateTransactionBody"></a>

### TokenDissociateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokens | [TokenID](#TokenID) |  | |


<a name="token_fee_schedule_update.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_fee_schedule_update.proto

<BR>At consensus, updates a token type's fee schedule to the given list of custom fees.<BR>If the target token type has no fee_schedule_key, resolves to TOKEN_HAS_NO_FEE_SCHEDULE_KEY.<BR>Otherwise this transaction must be signed to the fee_schedule_key, or the transaction will<BR>resolve to INVALID_SIGNATURE.<BR>If the custom_fees list is empty, clears the fee schedule or resolves to<BR>CUSTOM_SCHEDULE_ALREADY_HAS_NO_FEES if the fee schedule was already empty.

<a name="TokenFeeScheduleUpdateTransactionBody"></a>

### TokenFeeScheduleUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token_id | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| custom_fees | [CustomFee](#CustomFee) |  | |


<a name="token_freeze_account.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_freeze_account.proto

<BR>Freezes transfers of the specified token for the account. Must be signed by the Token's freezeKey.<BR>If the provided account is not found, the transaction will resolve to INVALID_ACCOUNT_ID.<BR>If the provided account has been deleted, the transaction will resolve to ACCOUNT_DELETED.<BR>If the provided token is not found, the transaction will resolve to INVALID_TOKEN_ID.<BR>If the provided token has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If an Association between the provided token and account is not found, the transaction will<BR>resolve to TOKEN_NOT_ASSOCIATED_TO_ACCOUNT.<BR>If no Freeze Key is defined, the transaction will resolve to TOKEN_HAS_NO_FREEZE_KEY.<BR>Once executed the Account is marked as Frozen and will not be able to receive or send tokens<BR>unless unfrozen. The operation is idempotent.

<a name="TokenFreezeAccountTransactionBody"></a>

### TokenFreezeAccountTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account | [AccountID](#AccountID) |  | |


<a name="token_get_account_nft_infos.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_get_account_nft_infos.proto

<BR>Applicable only to tokens of type NON_FUNGIBLE_UNIQUE. Gets info on NFTs N through M owned by the<BR>specified accountId.<BR>Example: If Account A owns 5 NFTs (might be of different Token Entity), having start=0 and end=5<BR>will return all of the NFTs<BR>INVALID_QUERY_RANGE response code will be returned if:<BR>1) Start > End<BR>2) Start and End indices are non-positive<BR>3) Start and End indices are out of boundaries for the retrieved nft list<BR>4) The range between Start and End is bigger than the global dynamic property for maximum query<BR>range<BR>NOT_SUPPORTED response code will be returned if the queried token is of type FUNGIBLE_COMMON<BR>INVALID_ACCOUNT_ID response code will be returned if the queried account does not exist<BR>ACCOUNT_DELETED response code will be returned if the queried account has been deleted

<a name="TokenGetAccountNftInfosQuery"></a>

### TokenGetAccountNftInfosQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| Specifies | [*](#*) |  | |
| range | [*](#*) |  | |
|  | [](#) |  | |
| start |  |  | |
| Specifies | [*](#*) |  | |
| range | [*](#*) |  | |
|  | [](#) |  | |
| end |  |  | |


<a name="TokenGetAccountNftInfosResponse"></a>

### TokenGetAccountNftInfosResponse
<BR>UNDOCUMENTED

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| nfts | [TokenNftInfo](#TokenNftInfo) |  | |


<a name="token_get_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_get_info.proto

<BR>Gets information about Token instance

<a name="TokenGetInfoQuery"></a>

### TokenGetInfoQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |


<a name="TokenGetInfoResponse"></a>

### TokenGetInfoResponse
<BR>Response when the client sends the node TokenGetInfoQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenInfo | [TokenInfo](#TokenInfo) |  | |


<a name="TokenInfo"></a>

### TokenInfo
<BR>The metadata about a Token instance

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| ID | [*](#*) |  | |
|  | [](#) |  | |
| tokenId | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| name |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| symbol |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| decimals |  |  | |
| For | [*](#*) |  | |
| circulation. | [*](#*) |  | |
| token | [*](#*) |  | |
|  | [](#) |  | |
| totalSupply |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| treasury | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| perceived | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| KYC | [*](#*) |  | |
|  | [](#) |  | |
| kycKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| not | [*](#*) |  | |
|  | [](#) |  | |
| freezeKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| wipeKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| supplyKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| this | [*](#*) |  | |
| if | [*](#*) |  | |
| Freeze | [*](#*) |  | |
|  | [](#) |  | |
| defaultFreezeStatus | [TokenFreezeStatus](#TokenFreezeStatus) |  | |
| The | [*](#*) |  | |
| token. | [*](#*) |  | |
|  | [](#) |  | |
| defaultKycStatus | [TokenKycStatus](#TokenKycStatus) |  | |
| Specifies | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| An | [*](#*) |  | |
| autoRenewPeriod | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewAccount | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expiry | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenType | [TokenType](#TokenType) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| supplyType | [TokenSupplyType](#TokenSupplyType) |  | |
| For | [*](#*) |  | |
| circulation. | [*](#*) |  | |
| numbers) | [*](#*) |  | |
|  | [](#) |  | |
| maxSupply |  |  | |
| The | [*](#*) |  | |
| is | [*](#*) |  | |
|  | [](#) |  | |
| fee_schedule_key | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| custom_fees | [CustomFee](#CustomFee) |  | |


<a name="token_get_nft_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_get_nft_info.proto

<BR>Represents an NFT on the Ledger

<a name="NftID"></a>

### NftID


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenID | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| serialNumber |  |  | |


<a name="TokenGetNftInfoQuery"></a>

### TokenGetNftInfoQuery
<BR>Applicable only to tokens of type NON_FUNGIBLE_UNIQUE. Gets info on a NFT for a given TokenID (of<BR>type NON_FUNGIBLE_UNIQUE) and serial number

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nftID | [NftID](#NftID) |  | |


<a name="TokenGetNftInfoResponse"></a>

### TokenGetNftInfoResponse
<BR>UNDOCUMENTED

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nft | [TokenNftInfo](#TokenNftInfo) |  | |


<a name="TokenNftInfo"></a>

### TokenNftInfo
<BR>UNDOCUMENTED

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nftID | [NftID](#NftID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| creationTime | [Timestamp](#Timestamp) |  | |
| Represents | [*](#*) |  | |
|  | [](#) |  | |
| metadata |  |  | |


<a name="token_get_nft_infos.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_get_nft_infos.proto

<BR>Applicable only to tokens of type NON_FUNGIBLE_UNIQUE. Gets info on NFTs N through M on the list<BR>of NFTs associated with a given NON_FUNGIBLE_UNIQUE Token.<BR>Example: If there are 10 NFTs issued, having start=0 and end=5 will query for the first 5 NFTs.<BR>Querying +all 10 NFTs will require start=0 and end=10<BR>INVALID_QUERY_RANGE response code will be returned if:<BR>1) Start > End<BR>2) Start and End indices are non-positive<BR>3) Start and End indices are out of boundaries for the retrieved nft list<BR>4) The range between Start and End is bigger than the global dynamic property for maximum query<BR>range<BR>NOT_SUPPORTED response code will be returned if the queried token is of type FUNGIBLE_COMMON<BR>INVALID_TOKEN_ID response code will be returned if the queried token does not exist

<a name="TokenGetNftInfosQuery"></a>

### TokenGetNftInfosQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenID | [TokenID](#TokenID) |  | |
| Specifies | [*](#*) |  | |
| range | [*](#*) |  | |
|  | [](#) |  | |
| start |  |  | |
| Specifies | [*](#*) |  | |
| range | [*](#*) |  | |
|  | [](#) |  | |
| end |  |  | |


<a name="TokenGetNftInfosResponse"></a>

### TokenGetNftInfosResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenID | [TokenID](#TokenID) |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| nfts | [TokenNftInfo](#TokenNftInfo) |  | |


<a name="token_grant_kyc.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_grant_kyc.proto

<BR>Grants KYC to the account for the given token. Must be signed by the Token's kycKey.<BR>If the provided account is not found, the transaction will resolve to INVALID_ACCOUNT_ID.<BR>If the provided account has been deleted, the transaction will resolve to ACCOUNT_DELETED.<BR>If the provided token is not found, the transaction will resolve to INVALID_TOKEN_ID.<BR>If the provided token has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If an Association between the provided token and account is not found, the transaction will<BR>resolve to TOKEN_NOT_ASSOCIATED_TO_ACCOUNT.<BR>If no KYC Key is defined, the transaction will resolve to TOKEN_HAS_NO_KYC_KEY.<BR>Once executed the Account is marked as KYC Granted.

<a name="TokenGrantKycTransactionBody"></a>

### TokenGrantKycTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| results | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account | [AccountID](#AccountID) |  | |


<a name="token_mint.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_mint.proto

<BR>Mints tokens to the Token's treasury Account. If no Supply Key is defined, the transaction will<BR>resolve to TOKEN_HAS_NO_SUPPLY_KEY.<BR>The operation increases the Total Supply of the Token. The maximum total supply a token can have<BR>is 2^63-1.<BR>The amount provided must be in the lowest denomination possible. Example:<BR>Token A has 2 decimals. In order to mint 100 tokens, one must provide amount of 10000. In order<BR>to mint 100.55 tokens, one must provide amount of 10055.<BR>If both amount and metadata list get filled, a INVALID_TRANSACTION_BODY response code will be<BR>returned.<BR>If the metadata list contains metadata which is too large, a METADATA_TOO_LONG response code will<BR>be returned.<BR>If neither the amount nor the metadata list get filled, a INVALID_TOKEN_MINT_AMOUNT response code<BR>will be returned.<BR>If the metadata list count is greater than the batch size limit global dynamic property, a<BR>BATCH_SIZE_LIMIT_EXCEEDED response code will be returned.

<a name="TokenMintTransactionBody"></a>

### TokenMintTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| Applicable | [*](#*) |  | |
| Amount | [*](#*) |  | |
| token. | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |
| Applicable | [*](#*) |  | |
| Maximum | [*](#*) |  | |
|  | [](#) |  | |
| metadata |  |  | |


<a name="token_revoke_kyc.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_revoke_kyc.proto

<BR>Revokes KYC to the account for the given token. Must be signed by the Token's kycKey.<BR>If the provided account is not found, the transaction will resolve to INVALID_ACCOUNT_ID.<BR>If the provided account has been deleted, the transaction will resolve to ACCOUNT_DELETED.<BR>If the provided token is not found, the transaction will resolve to INVALID_TOKEN_ID.<BR>If the provided token has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If an Association between the provided token and account is not found, the transaction will<BR>resolve to TOKEN_NOT_ASSOCIATED_TO_ACCOUNT.<BR>If no KYC Key is defined, the transaction will resolve to TOKEN_HAS_NO_KYC_KEY.<BR>Once executed the Account is marked as KYC Revoked

<a name="TokenRevokeKycTransactionBody"></a>

### TokenRevokeKycTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account | [AccountID](#AccountID) |  | |


<a name="token_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_service.proto

<BR>Transactions and queries for the Token Service

<a name="TokenService"></a>

### TokenService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createToken  | Transaction | TransactionResponse | <BR>Creates a new Token by submitting the transaction |
| updateToken  | Transaction | TransactionResponse | <BR>Updates the account by submitting the transaction |
| mintToken  | Transaction | TransactionResponse | <BR>Mints an amount of the token to the defined treasury account |
| burnToken  | Transaction | TransactionResponse | <BR>Burns an amount of the token from the defined treasury account |
| deleteToken  | Transaction | TransactionResponse | <BR>Deletes a Token |
| wipeTokenAccount  | Transaction | TransactionResponse | <BR>Wipes the provided amount of tokens from the specified Account ID |
| freezeTokenAccount  | Transaction | TransactionResponse | <BR>Freezes the transfer of tokens to or from the specified Account ID |
| unfreezeTokenAccount  | Transaction | TransactionResponse | <BR>Unfreezes the transfer of tokens to or from the specified Account ID |
| grantKycToTokenAccount  | Transaction | TransactionResponse | <BR>Flags the provided Account ID as having gone through KYC |
| revokeKycFromTokenAccount  | Transaction | TransactionResponse | <BR>Removes the KYC flag of the provided Account ID |
| associateTokens  | Transaction | TransactionResponse | <BR>Associates tokens to an account |
| dissociateTokens  | Transaction | TransactionResponse | <BR>Dissociates tokens from an account |
| updateTokenFeeSchedule  | Transaction | TransactionResponse | <BR>Updates the custom fee schedule on a token |
| getTokenInfo  | Query | Response | <BR>Retrieves the metadata of a token |
| getAccountNftInfos  | Query | Response) {<BR>(DEPRECATED) Gets info on NFTs N through M on the list of NFTs associated with a given account |
| option deprecated  =  true; |


<a name="token_unfreeze_account.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_unfreeze_account.proto

<BR>Unfreezes transfers of the specified token for the account. Must be signed by the Token's<BR>freezeKey.<BR>If the provided account is not found, the transaction will resolve to INVALID_ACCOUNT_ID.<BR>If the provided account has been deleted, the transaction will resolve to ACCOUNT_DELETED.<BR>If the provided token is not found, the transaction will resolve to INVALID_TOKEN_ID.<BR>If the provided token has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If an Association between the provided token and account is not found, the transaction will<BR>resolve to TOKEN_NOT_ASSOCIATED_TO_ACCOUNT.<BR>If no Freeze Key is defined, the transaction will resolve to TOKEN_HAS_NO_FREEZE_KEY.<BR>Once executed the Account is marked as Unfrozen and will be able to receive or send tokens. The<BR>operation is idempotent.

<a name="TokenUnfreezeAccountTransactionBody"></a>

### TokenUnfreezeAccountTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| results | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account | [AccountID](#AccountID) |  | |


<a name="token_update.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_update.proto

<BR>At consensus, updates an already created token to the given values.<BR>If no value is given for a field, that field is left unchanged. For an immutable tokens (that is,<BR>a token without an admin key), only the expiry may be updated. Setting any other field in that<BR>case will cause the transaction status to resolve to TOKEN_IS_IMMUTABLE.<BR>--- Signing Requirements ---<BR>1. Whether or not a token has an admin key, its expiry can be extended with only the transaction<BR>payer's signature.<BR>2. Updating any other field of a mutable token requires the admin key's signature.<BR>3. If a new admin key is set, this new key must sign <b>unless</b> it is exactly an empty<BR><tt>KeyList</tt>. This special sentinel key removes the existing admin key and causes the<BR>token to become immutable. (Other <tt>Key</tt> structures without a constituent<BR><tt>Ed25519</tt> key will be rejected with <tt>INVALID_ADMIN_KEY</tt>.)<BR>4. If a new treasury is set, the new treasury account's key must sign the transaction.<BR>--- Nft Requirements ---<BR>1. If a non fungible token has a positive treasury balance, the operation will abort with<BR>CURRENT_TREASURY_STILL_OWNS_NFTS.

<a name="TokenUpdateTransactionBody"></a>

### TokenUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| symbol |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| name |  |  | |
| The | [*](#*) |  | |
| deleted, | [*](#*) |  | |
| balance | [*](#*) |  | |
|  | [](#) |  | |
| treasury | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| adminKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| resolve | [*](#*) |  | |
|  | [](#) |  | |
| kycKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| freezeKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| will | [*](#*) |  | |
|  | [](#) |  | |
| wipeKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| supplyKey | [Key](#Key) |  | |
| The | [*](#*) |  | |
| autoRenewPeriod | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewAccount | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| The | [*](#*) |  | |
| provided | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| expiry | [Timestamp](#Timestamp) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| memo | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |
| If | [*](#*) |  | |
| currently | [*](#*) |  | |
|  | [](#) |  | |
| fee_schedule_key | [Key](#Key) |  | |


<a name="token_wipe_account.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_wipe_account.proto

<BR>Wipes the provided amount of tokens from the specified Account. Must be signed by the Token's<BR>Wipe key.<BR>If the provided account is not found, the transaction will resolve to INVALID_ACCOUNT_ID.<BR>If the provided account has been deleted, the transaction will resolve to ACCOUNT_DELETED.<BR>If the provided token is not found, the transaction will resolve to INVALID_TOKEN_ID.<BR>If the provided token has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If an Association between the provided token and account is not found, the transaction will<BR>resolve to TOKEN_NOT_ASSOCIATED_TO_ACCOUNT.<BR>If Wipe Key is not present in the Token, transaction results in TOKEN_HAS_NO_WIPE_KEY.<BR>If the provided account is the Token's Treasury Account, transaction results in<BR>CANNOT_WIPE_TOKEN_TREASURY_ACCOUNT<BR>On success, tokens are removed from the account and the total supply of the token is decreased by<BR>the wiped amount.<BR>If both amount and serialNumbers get filled, a INVALID_TRANSACTION_BODY response code will be<BR>returned.<BR>If neither the amount nor the serialNumbers get filled, a INVALID_WIPING_AMOUNT response code<BR>will be returned.<BR>If the serialNumbers list contains a non-positive integer as a serial number, a INVALID_NFT_ID<BR>response code will be returned.<BR>If the serialNumbers' list count is greater than the batch size limit global dynamic property, a<BR>BATCH_SIZE_LIMIT_EXCEEDED response code will be returned.<BR>The amount provided is in the lowest denomination possible. Example:<BR>Token A has 2 decimals. In order to wipe 100 tokens from account, one must provide amount of<BR>10000. In order to wipe 100.55 tokens, one must provide amount of 10055.

<a name="TokenWipeAccountTransactionBody"></a>

### TokenWipeAccountTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account | [AccountID](#AccountID) |  | |
| Applicable | [*](#*) |  | |
| account. | [*](#*) |  | |
| bigger | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |
| Applicable | [*](#*) |  | |
|  | [](#) |  | |
| serialNumbers |  |  | |


<a name="transaction.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction.proto

<BR>A single signed transaction, including all its signatures. The SignatureList will have a<BR>Signature for each Key in the transaction, either explicit or implicit, in the order that they<BR>appear in the transaction. For example, a CryptoTransfer will first have a Signature<BR>corresponding to the Key for the paying account, followed by a Signature corresponding to the Key<BR>for each account that is sending or receiving cryptocurrency in the transfer. Each Transaction<BR>should not have more than 50 levels.<BR>The SignatureList field is deprecated and succeeded by SignatureMap.

<a name="Transaction"></a>

### Transaction


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| the | [*](#*) |  | |
|  | [](#) |  | |
| body | [TransactionBody](#TransactionBody) |  | |
| The | [*](#*) |  | |
| SignatureMap | [*](#*) |  | |
|  | [](#) |  | |
| sigs | [SignatureList](#SignatureList) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| sigMap | [SignatureMap](#SignatureMap) |  | |
| TransactionBody | [*](#*) |  | |
|  | [](#) |  | |
| bodyBytes |  |  | |
| SignedTransaction | [*](#*) |  | |
|  | [](#) |  | |
| signedTransactionBytes |  |  | |


<a name="transaction_body.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_body.proto

<BR>A single transaction. All transaction types are possible here.

<a name="TransactionBody"></a>

### TransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| transactionID | [TransactionID](#TransactionID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nodeAccountID | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionFee |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| transactionValidDuration | [Duration](#Duration) |  | |
| Should | [*](#*) |  | |
| record | [*](#*) |  | |
|  | [](#) |  | |
| generateRecord |  |  | |
| Any | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| data | oneof |  | |
| | Calls | [*](#*) |  | |
| |  | [](#) |  | |
| | contractCall | [ContractCallTransactionBody](#ContractCallTransactionBody) |  | |
| | Creates | [*](#*) |  | |
| |  | [](#) |  | |
| | contractCreateInstance | [ContractCreateTransactionBody](#ContractCreateTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | contractUpdateInstance | [ContractUpdateTransactionBody](#ContractUpdateTransactionBody) |  | |
| | Delete | [*](#*) |  | |
| |  | [](#) |  | |
| | contractDeleteInstance | [ContractDeleteTransactionBody](#ContractDeleteTransactionBody) |  | |
| | Attach | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoAddLiveHash | [CryptoAddLiveHashTransactionBody](#CryptoAddLiveHashTransactionBody) |  | |
| | Create | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoCreateAccount | [CryptoCreateTransactionBody](#CryptoCreateTransactionBody) |  | |
| | Delete | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoDelete | [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody) |  | |
| | Remove | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoDeleteLiveHash | [CryptoDeleteLiveHashTransactionBody](#CryptoDeleteLiveHashTransactionBody) |  | |
| | Transfer | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoTransfer | [CryptoTransferTransactionBody](#CryptoTransferTransactionBody) |  | |
| | Modify | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoUpdateAccount | [CryptoUpdateTransactionBody](#CryptoUpdateTransactionBody) |  | |
| | Add | [*](#*) |  | |
| |  | [](#) |  | |
| | fileAppend | [FileAppendTransactionBody](#FileAppendTransactionBody) |  | |
| | Create | [*](#*) |  | |
| |  | [](#) |  | |
| | fileCreate | [FileCreateTransactionBody](#FileCreateTransactionBody) |  | |
| | Delete | [*](#*) |  | |
| |  | [](#) |  | |
| | fileDelete | [FileDeleteTransactionBody](#FileDeleteTransactionBody) |  | |
| | Modify | [*](#*) |  | |
| |  | [](#) |  | |
| | fileUpdate | [FileUpdateTransactionBody](#FileUpdateTransactionBody) |  | |
| | Hedera | [*](#*) |  | |
| |  | [](#) |  | |
| | systemDelete | [SystemDeleteTransactionBody](#SystemDeleteTransactionBody) |  | |
| | To | [*](#*) |  | |
| |  | [](#) |  | |
| | systemUndelete | [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody) |  | |
| | Freeze | [*](#*) |  | |
| |  | [](#) |  | |
| | freeze | [FreezeTransactionBody](#FreezeTransactionBody) |  | |
| | Creates | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusCreateTopic | [ConsensusCreateTopicTransactionBody](#ConsensusCreateTopicTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusUpdateTopic | [ConsensusUpdateTopicTransactionBody](#ConsensusUpdateTopicTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusDeleteTopic | [ConsensusDeleteTopicTransactionBody](#ConsensusDeleteTopicTransactionBody) |  | |
| | Submits | [*](#*) |  | |
| |  | [](#) |  | |
| | consensusSubmitMessage | [ConsensusSubmitMessageTransactionBody](#ConsensusSubmitMessageTransactionBody) |  | |
| |  | [*](#*) |  | |
| |  | [](#) |  | |
| | uncheckedSubmit | [UncheckedSubmitBody](#UncheckedSubmitBody) |  | |
| | Creates | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenCreation | [TokenCreateTransactionBody](#TokenCreateTransactionBody) |  | |
| | Freezes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenFreeze | [TokenFreezeAccountTransactionBody](#TokenFreezeAccountTransactionBody) |  | |
| | Unfreezes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenUnfreeze | [TokenUnfreezeAccountTransactionBody](#TokenUnfreezeAccountTransactionBody) |  | |
| | Grants | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenGrantKyc | [TokenGrantKycTransactionBody](#TokenGrantKycTransactionBody) |  | |
| | Revokes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenRevokeKyc | [TokenRevokeKycTransactionBody](#TokenRevokeKycTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenDeletion | [TokenDeleteTransactionBody](#TokenDeleteTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenUpdate | [TokenUpdateTransactionBody](#TokenUpdateTransactionBody) |  | |
| | Mints | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenMint | [TokenMintTransactionBody](#TokenMintTransactionBody) |  | |
| | Burns | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenBurn | [TokenBurnTransactionBody](#TokenBurnTransactionBody) |  | |
| | Wipes | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenWipe | [TokenWipeAccountTransactionBody](#TokenWipeAccountTransactionBody) |  | |
| | Associate | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenAssociate | [TokenAssociateTransactionBody](#TokenAssociateTransactionBody) |  | |
| | Dissociate | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenDissociate | [TokenDissociateTransactionBody](#TokenDissociateTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | token_fee_schedule_update | [TokenFeeScheduleUpdateTransactionBody](#TokenFeeScheduleUpdateTransactionBody) |  | |
| | Creates | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleCreate | [ScheduleCreateTransactionBody](#ScheduleCreateTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleDelete | [ScheduleDeleteTransactionBody](#ScheduleDeleteTransactionBody) |  | |
| | Adds | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleSign | [ScheduleSignTransactionBody](#ScheduleSignTransactionBody) |  | |


<a name="transaction_contents.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_contents.proto

-<BR>‌<BR>Hedera Network Services Protobuf<BR>​<BR>Copyright (C) 2018 - 2021 Hedera Hashgraph, LLC<BR>​<BR>Licensed under the Apache License, Version 2.0 (the "License");<BR>you may not use this file except in compliance with the License.<BR>You may obtain a copy of the License at<BR>http:www.apache.org/licenses/LICENSE-2.0<BR>Unless required by applicable law or agreed to in writing, software<BR>distributed under the License is distributed on an "AS IS" BASIS,<BR>WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<BR>See the License for the specific language governing permissions and<BR>limitations under the License.<BR>‍

<a name="SignedTransaction"></a>

### SignedTransaction


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| TransactionBody | [*](#*) |  | |
|  | [](#) |  | |
| bodyBytes |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| sigMap | [SignatureMap](#SignatureMap) |  | |


<a name="transaction_get_fast_record.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_get_fast_record.proto

<BR>Get the tx record of a transaction, given its transaction ID. Once a transaction reaches<BR>consensus, then information about whether it succeeded or failed will be available until the end<BR>of the receipt period.  Before and after the receipt period, and for a transaction that was never<BR>submitted, the receipt is unknown.  This query is free (the payment field is left empty).

<a name="TransactionGetFastRecordQuery"></a>

### TransactionGetFastRecordQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionID | [TransactionID](#TransactionID) |  | |


<a name="TransactionGetFastRecordResponse"></a>

### TransactionGetFastRecordResponse
<BR>Response when the client sends the node TransactionGetFastRecordQuery. If it created a new entity<BR>(account, file, or smart contract instance) then one of the three ID fields will be filled in<BR>with the ID of the new entity. Sometimes a single transaction will create more than one new<BR>entity, such as when a new contract instance is created, and this also creates the new account<BR>that it owned by that instance.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionRecord | [TransactionRecord](#TransactionRecord) |  | |


<a name="transaction_get_receipt.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_get_receipt.proto

<BR>Get the receipt of a transaction, given its transaction ID. Once a transaction reaches consensus,<BR>then information about whether it succeeded or failed will be available until the end of the<BR>receipt period.  Before and after the receipt period, and for a transaction that was never<BR>submitted, the receipt is unknown.  This query is free (the payment field is left empty). No<BR>State proof is available for this response

<a name="TransactionGetReceiptQuery"></a>

### TransactionGetReceiptQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionID | [TransactionID](#TransactionID) |  | |
| Whether | [*](#*) |  | |
| receipt | [*](#*) |  | |
| neither | [*](#*) |  | |
| such | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| includeDuplicates |  |  | |


<a name="TransactionGetReceiptResponse"></a>

### TransactionGetReceiptResponse
<BR>Response when the client sends the node TransactionGetReceiptQuery. If it created a new entity<BR>(account, file, or smart contract instance) then one of the three ID fields will be filled in<BR>with the ID of the new entity. Sometimes a single transaction will create more than one new<BR>entity, such as when a new contract instance is created, and this also creates the new account<BR>that it owned by that instance. No State proof is available for this response

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| Either | [*](#*) |  | |
| status | [*](#*) |  | |
| <b>or</b>, | [*](#*) |  | |
| reach | [*](#*) |  | |
|  | [](#) |  | |
| receipt | [TransactionReceipt](#TransactionReceipt) |  | |
| The | [*](#*) |  | |
| receipt | [*](#*) |  | |
|  | [](#) |  | |
| duplicateTransactionReceipts | [TransactionReceipt](#TransactionReceipt) |  | |


<a name="transaction_get_record.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_get_record.proto

<BR>Get the record for a transaction. If the transaction requested a record, then the record lasts<BR>for one hour, and a state proof is available for it. If the transaction created an account, file,<BR>or smart contract instance, then the record will contain the ID for what it created. If the<BR>transaction called a smart contract function, then the record contains the result of that call.<BR>If the transaction was a cryptocurrency transfer, then the record includes the TransferList which<BR>gives the details of that transfer. If the transaction didn't return anything that should be in<BR>the record, then the results field will be set to nothing.

<a name="TransactionGetRecordQuery"></a>

### TransactionGetRecordQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionID | [TransactionID](#TransactionID) |  | |
| Whether | [*](#*) |  | |
| of | [*](#*) |  | |
| <tt>INVALID_NODE_ACCOUNT</tt> | [*](#*) |  | |
| record | [*](#*) |  | |
| given | [*](#*) |  | |
|  | [](#) |  | |
| includeDuplicates |  |  | |


<a name="TransactionGetRecordResponse"></a>

### TransactionGetRecordResponse
<BR>Response when the client sends the node TransactionGetRecordQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| Either | [*](#*) |  | |
| status | [*](#*) |  | |
| <b>or</b>, | [*](#*) |  | |
| consensus | [*](#*) |  | |
|  | [](#) |  | |
| transactionRecord | [TransactionRecord](#TransactionRecord) |  | |
| The | [*](#*) |  | |
| record | [*](#*) |  | |
|  | [](#) |  | |
| duplicateTransactionRecords | [TransactionRecord](#TransactionRecord) |  | |


<a name="transaction_list.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_list.proto

<BR>A simple protobuf wrapper to store a list of transactions. This is used by<BR>`Transaction.[from|to]Bytes()` in the SDKs. The reason the SDK needs a list of transactions is<BR>because it holds onto a transaction per node. So if a transaction is to be submitted to nodes 3<BR>and 4 the SDK Transaction type would contain a list of 2 protobuf transactions, one for node 3<BR>and one for node 4.

<a name="TransactionList"></a>

### TransactionList


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transaction_list | [Transaction](#Transaction) |  | |


<a name="transaction_receipt.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_receipt.proto

<BR>The summary of a transaction's result so far. If the transaction has not reached consensus, this<BR>result will be necessarily incomplete.

<a name="TransactionReceipt"></a>

### TransactionReceipt


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| status | [ResponseCodeEnum](#ResponseCodeEnum) |  | |
| In | [*](#*) |  | |
|  | [](#) |  | |
| accountID | [AccountID](#AccountID) |  | |
| In | [*](#*) |  | |
|  | [](#) |  | |
| fileID | [FileID](#FileID) |  | |
| In | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| exchangeRate | [ExchangeRateSet](#ExchangeRateSet) |  | |
| In | [*](#*) |  | |
|  | [](#) |  | |
| topicID | [TopicID](#TopicID) |  | |
| In | [*](#*) |  | |
| received | [*](#*) |  | |
|  | [](#) |  | |
| topicSequenceNumber |  |  | |
| In | [*](#*) |  | |
| the | [*](#*) |  | |
| data | [*](#*) |  | |
| uint64 | [*](#*) |  | |
|  | [](#) |  | |
| IF | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [*](#*) |  | |
| 1. | [*](#*) |  | |
| 2. | [*](#*) |  | |
| 3. | [*](#*) |  | |
| 4. | [*](#*) |  | |
| 5. | [*](#*) |  | |
| consensus | [*](#*) |  | |
| 6. | [*](#*) |  | |
| consensus | [*](#*) |  | |
| 7. | [*](#*) |  | |
| 8. | [*](#*) |  | |
|  | [](#) |  | |
| IF | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| 1. | [*](#*) |  | |
| 2. | [*](#*) |  | |
| 3. | [*](#*) |  | |
| 4. | [*](#*) |  | |
| 5. | [*](#*) |  | |
| 6. | [*](#*) |  | |
| consensus | [*](#*) |  | |
| 7. | [*](#*) |  | |
| consensus | [*](#*) |  | |
| 8. | [*](#*) |  | |
| 9. | [*](#*) |  | |
| consensusSubmitMessage | [*](#*) |  | |
|  | [](#) |  | |
| Otherwise, | [*](#*) |  | |
| are, | [*](#*) |  | |
|  | [*](#*) |  | |
| 1. | [*](#*) |  | |
| 2. | [*](#*) |  | |
| 3. | [*](#*) |  | |
| 4. | [*](#*) |  | |
| 5. | [*](#*) |  | |
| 6. | [*](#*) |  | |
| 7. | [*](#*) |  | |
| 8. | [*](#*) |  | |
| 9. | [*](#*) |  | |
| consensus | [*](#*) |  | |
| 10. | [*](#*) |  | |
| consensus | [*](#*) |  | |
| 11. | [*](#*) |  | |
| 12. | [*](#*) |  | |
| consensusSubmitMessage | [*](#*) |  | |
|  | [](#) |  | |
| topicRunningHash |  |  | |
| In | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| topicRunningHashVersion |  |  | |
| In | [*](#*) |  | |
|  | [](#) |  | |
| tokenID | [TokenID](#TokenID) |  | |
| In | [*](#*) |  | |
| supply | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| newTotalSupply |  |  | |
| In | [*](#*) |  | |
|  | [](#) |  | |
| scheduleID | [ScheduleID](#ScheduleID) |  | |
| In | [*](#*) |  | |
| TransactionID | [*](#*) |  | |
| scheduled | [*](#*) |  | |
|  | [](#) |  | |
| scheduledTransactionID | [TransactionID](#TransactionID) |  | |
| In | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| serialNumbers |  |  | |


<a name="transaction_record.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_record.proto

<BR>Response when the client sends the node TransactionGetRecordResponse

<a name="TransactionRecord"></a>

### TransactionRecord


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| account/file/instance | [*](#*) |  | |
|  | [](#) |  | |
| receipt | [TransactionReceipt](#TransactionReceipt) |  | |
| The | [*](#*) |  | |
| having | [*](#*) |  | |
|  | [](#) |  | |
| transactionHash |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| consensusTimestamp | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionID | [TransactionID](#TransactionID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| transactionFee |  |  | |
| body | oneof |  | |
| | Record | [*](#*) |  | |
| | fail) | [*](#*) |  | |
| |  | [](#) |  | |
| | contractCallResult | [ContractFunctionResult](#ContractFunctionResult) |  | |
| | Record | [*](#*) |  | |
| | didn't | [*](#*) |  | |
| |  | [](#) |  | |
| | contractCreateResult | [ContractFunctionResult](#ContractFunctionResult) |  | |
| All | [*](#*) |  | |
| the | [*](#*) |  | |
| that | [*](#*) |  | |
|  | [](#) |  | |
| transferList | [TransferList](#TransferList) |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| tokenTransferLists | [TokenTransferList](#TokenTransferList) |  | |
| Reference | [*](#*) |  | |
|  | [](#) |  | |
| scheduleRef | [ScheduleID](#ScheduleID) |  | |
| All | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| assessed_custom_fees | [AssessedCustomFee](#AssessedCustomFee) |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| automatic_token_associations | [TokenAssociation](#TokenAssociation) |  | |


<a name="transaction_response.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_response.proto

<BR>When the client sends the node a transaction of any kind, the node replies with this, which<BR>simply says that the transaction passed the precheck (so the node will submit it to the network)<BR>or it failed (so it won't). If the fee offered was insufficient, this will also contain the<BR>amount of the required fee. To learn the consensus result, the client should later obtain a<BR>receipt (free), or can buy a more detailed record (not free).

<a name="TransactionResponse"></a>

### TransactionResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nodeTransactionPrecheckCode | [ResponseCodeEnum](#ResponseCodeEnum) |  | |
| If | [*](#*) |  | |
| required | [*](#*) |  | |
|  | [](#) |  | |
| cost |  |  | |


<a name="unchecked_submit.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## unchecked_submit.proto

<BR>Submit an arbitrary (serialized) Transaction to the network without prechecks. Requires superuser<BR>privileges.

<a name="UncheckedSubmitBody"></a>

### UncheckedSubmitBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transactionBytes |  |  | |

