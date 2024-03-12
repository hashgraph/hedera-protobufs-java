# HAPI Documentation
<a name="top"></a>

## Table of Contents


- [account.proto](#account.proto)
  - [Account](#Account)
  - [AccountApprovalForAllAllowance](#AccountApprovalForAllAllowance)
  - [AccountCryptoAllowance](#AccountCryptoAllowance)
  - [AccountFungibleTokenAllowance](#AccountFungibleTokenAllowance)

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
  - [NftID](#NftID)
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
  - [StakingInfo](#StakingInfo)
  - [SubType](#SubType) (Enum)
  - [ThresholdKey](#ThresholdKey)
  - [ThresholdSignature](#ThresholdSignature)
  - [TokenAssociation](#TokenAssociation)
  - [TokenBalance](#TokenBalance)
  - [TokenBalances](#TokenBalances)
  - [TokenFreezeStatus](#TokenFreezeStatus) (Enum)
  - [TokenID](#TokenID)
  - [TokenKycStatus](#TokenKycStatus) (Enum)
  - [TokenPauseStatus](#TokenPauseStatus) (Enum)
  - [TokenRelationship](#TokenRelationship)
  - [TokenSupplyType](#TokenSupplyType) (Enum)
  - [TokenTransferList](#TokenTransferList)
  - [TokenType](#TokenType) (Enum)
  - [TopicID](#TopicID)
  - [TransactionFeeSchedule](#TransactionFeeSchedule)
  - [TransactionID](#TransactionID)
  - [TransferList](#TransferList)

- [block_info.proto](#block_info.proto)
  - [BlockInfo](#BlockInfo)

- [bytecode.proto](#bytecode.proto)
  - [Bytecode](#Bytecode)

- [common.proto](#common.proto)
  - [EntityIDPair](#EntityIDPair)
  - [EntityNumber](#EntityNumber)

- [congestion_level_starts.proto](#congestion_level_starts.proto)
  - [CongestionLevelStarts](#CongestionLevelStarts)

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

- [contract_action.proto](#contract_action.proto)
  - [CallOperationType](#CallOperationType) (Enum)
  - [ContractAction](#ContractAction)
  - [ContractActionType](#ContractActionType) (Enum)
  - [ContractActions](#ContractActions)

- [contract_bytecode.proto](#contract_bytecode.proto)
  - [ContractBytecode](#ContractBytecode)

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

- [contract_state_change.proto](#contract_state_change.proto)
  - [ContractStateChange](#ContractStateChange)
  - [ContractStateChanges](#ContractStateChanges)
  - [StorageChange](#StorageChange)

- [contract_types.proto](#contract_types.proto)
  - [ContractNonceInfo](#ContractNonceInfo)

- [contract_update.proto](#contract_update.proto)
  - [ContractUpdateTransactionBody](#ContractUpdateTransactionBody)

- [crypto_add_live_hash.proto](#crypto_add_live_hash.proto)
  - [CryptoAddLiveHashTransactionBody](#CryptoAddLiveHashTransactionBody)
  - [LiveHash](#LiveHash)

- [crypto_approve_allowance.proto](#crypto_approve_allowance.proto)
  - [CryptoAllowance](#CryptoAllowance)
  - [CryptoApproveAllowanceTransactionBody](#CryptoApproveAllowanceTransactionBody)
  - [NftAllowance](#NftAllowance)
  - [TokenAllowance](#TokenAllowance)

- [crypto_create.proto](#crypto_create.proto)
  - [CryptoCreateTransactionBody](#CryptoCreateTransactionBody)

- [crypto_delete.proto](#crypto_delete.proto)
  - [CryptoDeleteTransactionBody](#CryptoDeleteTransactionBody)

- [crypto_delete_allowance.proto](#crypto_delete_allowance.proto)
  - [CryptoDeleteAllowanceTransactionBody](#CryptoDeleteAllowanceTransactionBody)
  - [NftRemoveAllowance](#NftRemoveAllowance)

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

- [ethereum_transaction.proto](#ethereum_transaction.proto)
  - [EthereumTransactionBody](#EthereumTransactionBody)

- [exchange_rate.proto](#exchange_rate.proto)
  - [ExchangeRate](#ExchangeRate)
  - [ExchangeRateSet](#ExchangeRateSet)

- [file.proto](#file.proto)
  - [File](#File)

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

- [freeze_type.proto](#freeze_type.proto)
  - [FreezeType](#FreezeType) (Enum)

- [get_account_details.proto](#get_account_details.proto)
  - [GetAccountDetailsQuery](#GetAccountDetailsQuery)
  - [GetAccountDetailsResponse](#GetAccountDetailsResponse)
  - [GetAccountDetailsResponse.AccountDetails](#GetAccountDetailsResponse.AccountDetails)
  - [GrantedCryptoAllowance](#GrantedCryptoAllowance)
  - [GrantedNftAllowance](#GrantedNftAllowance)
  - [GrantedTokenAllowance](#GrantedTokenAllowance)

- [get_by_key.proto](#get_by_key.proto)
  - [EntityID](#EntityID)
  - [GetByKeyQuery](#GetByKeyQuery)
  - [GetByKeyResponse](#GetByKeyResponse)

- [get_by_solidity_id.proto](#get_by_solidity_id.proto)
  - [GetBySolidityIDQuery](#GetBySolidityIDQuery)
  - [GetBySolidityIDResponse](#GetBySolidityIDResponse)

- [hash_object.proto](#hash_object.proto)
  - [HashAlgorithm](#HashAlgorithm) (Enum)
  - [HashObject](#HashObject)

- [mirror_network_service.proto](#mirror_network_service.proto)
  - [AddressBookQuery](#AddressBookQuery)
  - [NetworkService](#NetworkService) (Service)

- [network_get_execution_time.proto](#network_get_execution_time.proto)
  - [NetworkGetExecutionTimeQuery](#NetworkGetExecutionTimeQuery)
  - [NetworkGetExecutionTimeResponse](#NetworkGetExecutionTimeResponse)

- [network_get_version_info.proto](#network_get_version_info.proto)
  - [NetworkGetVersionInfoQuery](#NetworkGetVersionInfoQuery)
  - [NetworkGetVersionInfoResponse](#NetworkGetVersionInfoResponse)

- [network_service.proto](#network_service.proto)
  - [NetworkService](#NetworkService) (Service)

- [network_staking_rewards.proto](#network_staking_rewards.proto)
  - [NetworkStakingRewards](#NetworkStakingRewards)

- [nft.proto](#nft.proto)
  - [Nft](#Nft)

- [node_stake_update.proto](#node_stake_update.proto)
  - [NodeStake](#NodeStake)
  - [NodeStakeUpdateTransactionBody](#NodeStakeUpdateTransactionBody)

- [primitives.proto](#primitives.proto)
  - [ProtoBoolean](#ProtoBoolean)
  - [ProtoBytes](#ProtoBytes)
  - [ProtoInteger](#ProtoInteger)
  - [ProtoLong](#ProtoLong)
  - [ProtoString](#ProtoString)

- [query.proto](#query.proto)
  - [Query](#Query)

- [query_header.proto](#query_header.proto)
  - [QueryHeader](#QueryHeader)
  - [ResponseType](#ResponseType) (Enum)

- [record_stream_file.proto](#record_stream_file.proto)
  - [RecordStreamFile](#RecordStreamFile)
  - [RecordStreamItem](#RecordStreamItem)
  - [SidecarMetadata](#SidecarMetadata)
  - [SidecarType](#SidecarType) (Enum)

- [recordcache.proto](#recordcache.proto)
  - [TransactionRecordEntry](#TransactionRecordEntry)

- [response.proto](#response.proto)
  - [Response](#Response)

- [response_code.proto](#response_code.proto)
  - [ResponseCodeEnum](#ResponseCodeEnum) (Enum)

- [response_header.proto](#response_header.proto)
  - [ResponseHeader](#ResponseHeader)

- [running_hashes.proto](#running_hashes.proto)
  - [RunningHashes](#RunningHashes)

- [schedulable_transaction_body.proto](#schedulable_transaction_body.proto)
  - [SchedulableTransactionBody](#SchedulableTransactionBody)

- [schedule.proto](#schedule.proto)
  - [Schedule](#Schedule)
  - [ScheduleList](#ScheduleList)

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

- [sidecar_file.proto](#sidecar_file.proto)
  - [SidecarFile](#SidecarFile)
  - [TransactionSidecarRecord](#TransactionSidecarRecord)

- [signature_file.proto](#signature_file.proto)
  - [SignatureFile](#SignatureFile)
  - [SignatureObject](#SignatureObject)
  - [SignatureType](#SignatureType) (Enum)

- [smart_contract_service.proto](#smart_contract_service.proto)
  - [SmartContractService](#SmartContractService) (Service)

- [staking_node_info.proto](#staking_node_info.proto)
  - [StakingNodeInfo](#StakingNodeInfo)

- [storage_slot.proto](#storage_slot.proto)
  - [SlotKey](#SlotKey)
  - [SlotValue](#SlotValue)

- [system_delete.proto](#system_delete.proto)
  - [SystemDeleteTransactionBody](#SystemDeleteTransactionBody)

- [system_undelete.proto](#system_undelete.proto)
  - [SystemUndeleteTransactionBody](#SystemUndeleteTransactionBody)

- [throttle_definitions.proto](#throttle_definitions.proto)
  - [ThrottleBucket](#ThrottleBucket)
  - [ThrottleDefinitions](#ThrottleDefinitions)
  - [ThrottleGroup](#ThrottleGroup)

- [throttle_usage_snapshots.proto](#throttle_usage_snapshots.proto)
  - [ThrottleUsageSnapshot](#ThrottleUsageSnapshot)
  - [ThrottleUsageSnapshots](#ThrottleUsageSnapshots)

- [timestamp.proto](#timestamp.proto)
  - [Timestamp](#Timestamp)
  - [TimestampSeconds](#TimestampSeconds)

- [token.proto](#token.proto)
  - [Token](#Token)

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

- [token_pause.proto](#token_pause.proto)
  - [TokenPauseTransactionBody](#TokenPauseTransactionBody)

- [token_relation.proto](#token_relation.proto)
  - [TokenRelation](#TokenRelation)

- [token_revoke_kyc.proto](#token_revoke_kyc.proto)
  - [TokenRevokeKycTransactionBody](#TokenRevokeKycTransactionBody)

- [token_service.proto](#token_service.proto)
  - [TokenService](#TokenService) (Service)

- [token_unfreeze_account.proto](#token_unfreeze_account.proto)
  - [TokenUnfreezeAccountTransactionBody](#TokenUnfreezeAccountTransactionBody)

- [token_unpause.proto](#token_unpause.proto)
  - [TokenUnpauseTransactionBody](#TokenUnpauseTransactionBody)

- [token_update.proto](#token_update.proto)
  - [TokenUpdateTransactionBody](#TokenUpdateTransactionBody)

- [token_update_nft.proto](#token_update_nft.proto)
  - [TokenUpdateNftTransactionBody](#TokenUpdateNftTransactionBody)

- [token_update_nfts.proto](#token_update_nfts.proto)
  - [TokenUpdateNftsTransactionBody](#TokenUpdateNftsTransactionBody)

- [token_wipe_account.proto](#token_wipe_account.proto)
  - [TokenWipeAccountTransactionBody](#TokenWipeAccountTransactionBody)

- [topic.proto](#topic.proto)
  - [Topic](#Topic)

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

- [util_prng.proto](#util_prng.proto)
  - [UtilPrngTransactionBody](#UtilPrngTransactionBody)

- [util_service.proto](#util_service.proto)
  - [UtilService](#UtilService) (Service)

<a name="account.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## account.proto

<BR>Representation of a Hedera Token Service account entity in the network Merkle tree.<BR>As with all network entities, account has a unique entity number represented as shard.realm.X.<BR>X can be an alias public key or an EVM address or a number.

<a name="Account"></a>

### Account


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| alias |  |  | |
| (Optional) | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| key | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expiration_second |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tinybar_balance |  |  | |
| An | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| staked_to_me |  |  | |
| If | [*](#*) |  | |
| be | [*](#*) |  | |
|  | [](#) |  | |
| stake_period_start |  |  | |
| ID | [*](#*) |  | |
|  | [](#) |  | |
| staked_id | oneof |  | |
| | ID | [*](#*) |  | |
| | this | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_account_id | [AccountID](#AccountID) |  | |
| | ID | [*](#*) |  | |
| | removes | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_node_id |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| decline_reward |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| receiver_sig_required |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| head_token_id | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| head_nft_id | [NftID](#NftID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| head_nft_serial_number |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| number_owned_nfts |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| max_auto_associations |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| used_auto_associations |  |  | |
| The | [*](#*) |  | |
| fee | [*](#*) |  | |
|  | [](#) |  | |
| number_associations |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| smart_contract |  |  | |
| The | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| number_positive_balances |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| ethereum_nonce |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| stake_at_start_of_last_rewarded_period |  |  | |
| (Optional) | [*](#*) |  | |
| has | [*](#*) |  | |
| expiration | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| account | [*](#*) |  | |
| If | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_seconds |  |  | |
| If | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| contract_kv_pairs_number |  |  | |
| (Optional) | [*](#*) |  | |
| It | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| crypto_allowances | [AccountCryptoAllowance](#AccountCryptoAllowance) |  | |
| (Optional) | [*](#*) |  | |
| It | [*](#*) |  | |
| NFT | [*](#*) |  | |
| Allowances | [*](#*) |  | |
|  | [](#) |  | |
| approve_for_all_nft_allowances | [AccountApprovalForAllAllowance](#AccountApprovalForAllAllowance) |  | |
| (Optional) | [*](#*) |  | |
| It | [*](#*) |  | |
| It | [*](#*) |  | |
|  | [](#) |  | |
| token_allowances | [AccountFungibleTokenAllowance](#AccountFungibleTokenAllowance) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| number_treasury_titles |  |  | |
| A | [*](#*) |  | |
| Only | [*](#*) |  | |
| and | [*](#*) |  | |
| an | [*](#*) |  | |
| auto-renew | [*](#*) |  | |
| and | [*](#*) |  | |
|  | [](#) |  | |
| expired_and_pending_removal |  |  | |
| The | [*](#*) |  | |
| It | [*](#*) |  | |
|  | [](#) |  | |
| first_contract_storage_key |  |  | |


<a name="AccountApprovalForAllAllowance"></a>

### AccountApprovalForAllAllowance
<BR>Allowance granted by this account to a spender for a specific non-fungible token<BR>using ApproveForAll. This allows spender to spend all serial numbers for the given<BR>non-fungible token id.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token_id | [TokenID](#TokenID) |  | |
| spender_id | [AccountID](#AccountID) |  | |


<a name="AccountCryptoAllowance"></a>

### AccountCryptoAllowance
<BR>Allowance granted by this account to another account for an amount of hbars.<BR>This allows spender to spend the amount of hbars approved for the account.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| spender_id | [AccountID](#AccountID) |  | |
| amount |  |  | |


<a name="AccountFungibleTokenAllowance"></a>

### AccountFungibleTokenAllowance
<BR>Allowance granted by this account to another account for a specific fungible token.<BR>This also contains the amount of the token that is approved for the account.<BR>This allows spender to spend the amount of tokens approved for the account.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token_id | [TokenID](#TokenID) |  | |
| spender_id | [AccountID](#AccountID) |  | |
| amount |  |  | |


<a name="account_balance_file.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## account_balance_file.proto

 <<<pbj.java_package = "com.hedera.hapi.streams">>> This comment is special code for setting PBJ Compiler java package

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
| If | [*](#*) |  | |
| accountID | [*](#*) |  | |
|  | [](#) |  | |
| is_approval |  |  | |


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
| The | [*](#*) |  | |
| For | [*](#*) |  | |
| be | [*](#*) |  | |
|  | [](#) |  | |
| account | oneof |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | accountNum |  |  | |
| | The | [*](#*) |  | |
| | a | [*](#*) |  | |
| | (ThresholdKey, | [*](#*) |  | |
| |  | [](#) |  | |
| | May | [*](#*) |  | |
| | address | [*](#*) |  | |
| |  | [](#) |  | |
| | At | [*](#*) |  | |
| | was | [*](#*) |  | |
| | It | [*](#*) |  | |
| |  | [](#) |  | |
| | If | [*](#*) |  | |
| | in | [*](#*) |  | |
| |  | [](#) |  | |
| | If | [*](#*) |  | |
| | that | [*](#*) |  | |
| |  | [](#) |  | |
| | alias |  |  | |


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
| contract | oneof |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | contractNum |  |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | Every | [*](#*) |  | |
| | This | [*](#*) |  | |
| |  | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| |  | [*](#*) |  | |
| |  | [](#) |  | |
| | Contracts | [*](#*) |  | |
| | derived | [*](#*) | eips.ethereum.org/EIPS/eip-1014">EIP-1014</a> | |
| | specification, | [*](#*) |  | |
| |  | [](#) |  | |
| | (Please | [*](#*) |  | |
| | EVM | [*](#*) |  | |
| |  | [](#) |  | |
| | evm_address |  |  | |


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
<BR>The total fee charged for a transaction. It is composed of three components - a node fee that<BR>compensates the specific node that submitted the transaction, a network fee that compensates the<BR>network for assigning the transaction a consensus timestamp, and a service fee that compensates<BR>the network for the ongoing maintenance of the consequences of the transaction.

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
| * |  |
|  |  |
| TokenPause |  |
| * |  |
|  |  |
| TokenUnpause |  |
| * |  |
|  |  |
| CryptoApproveAllowance |  |
| * |  |
|  |  |
| CryptoDeleteAllowance |  |
| * |  |
| * |  |
|  |  |
| GetAccountDetails |  |
| * |  |
|  |  |
| EthereumTransaction |  |
| * |  |
|  |  |
| NodeStakeUpdate |  |
| * |  |
|  |  |
| UtilPrng |  |
| * |  |
|  |  |
| TransactionGetFastRecord |  |
| * |  |
|  |  |
| TokenUpdateNfts |  |


<a name="Key"></a>

### Key
<BR>A Key can be a public key from either the Ed25519 or ECDSA(secp256k1) signature schemes, where<BR>in the ECDSA(secp256k1) case we require the 33-byte compressed form of the public key. We call<BR>these public keys <b>primitive keys</b>.<BR>If an account has primitive key associated to it, then the corresponding private key must sign<BR>any transaction to transfer cryptocurrency out of it.<BR>A Key can also be the ID of a smart contract instance, which is then authorized to perform any<BR>precompiled contract action that requires this key to sign.<BR>Note that when a Key is a smart contract ID, it <i>doesn't</i> mean the contract with that ID<BR>will actually create a cryptographic signature. It only means that when the contract calls a<BR>precompiled contract, the resulting "child transaction" will be authorized to perform any action<BR>controlled by the Key.<BR>A Key can be a "threshold key", which means a list of M keys, any N of which must sign in order<BR>for the threshold signature to be considered valid. The keys within a threshold signature may<BR>themselves be threshold signatures, to allow complex signature requirements.<BR>A Key can be a "key list" where all keys in the list must sign unless specified otherwise in the<BR>documentation for a specific transaction type (e.g.  FileDeleteTransactionBody).  Their use is<BR>dependent on context. For example, a Hedera file is created with a list of keys, where all of<BR>them must sign a transaction to create or modify the file, but only one of them is needed to sign<BR>a transaction to delete the file. So it's a single list that sometimes acts as a 1-of-M threshold<BR>key, and sometimes acts as an M-of-M threshold key.  A key list is always an M-of-M, unless<BR>specified otherwise in documentation. A key list can have nested key lists or threshold keys.<BR>Nested key lists are always M-of-M. A key list can have repeated primitive public keys, but all<BR>repeated keys are only required to sign once.<BR>A Key can contain a ThresholdKey or KeyList, which in turn contain a Key, so this mutual<BR>recursion would allow nesting arbitrarily deep. A ThresholdKey which contains a list of primitive<BR>keys has 3 levels: ThresholdKey -> KeyList -> Key. A KeyList which contains several primitive<BR>keys has 2 levels: KeyList -> Key. A Key with 2 levels of nested ThresholdKeys has 7 levels:<BR>Key -> ThresholdKey -> KeyList -> Key -> ThresholdKey -> KeyList -> Key.<BR>Each Key should not have more than 46 levels, which implies 15 levels of nested ThresholdKeys.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| key | oneof |  | |
| | smart | [*](#*) |  | |
| |  | [](#) |  | |
| | contractID | [ContractID](#ContractID) |  | |
| | Ed25519 | [*](#*) |  | |
| |  | [](#) |  | |
| | ed25519 |  |  | |
| | (NOT | [*](#*) |  | |
| |  | [](#) |  | |
| | RSA_3072 |  |  | |
| | (NOT | [*](#*) |  | |
| |  | [](#) |  | |
| | ECDSA_384 |  |  | |
| | a | [*](#*) |  | |
| |  | [*](#*) |  | |
| |  | [](#) |  | |
| | thresholdKey | [ThresholdKey](#ThresholdKey) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | keyList | [KeyList](#KeyList) |  | |
| | Compressed | [*](#*) |  | |
| |  | [](#) |  | |
| | ECDSA_secp256k1 |  |  | |
| | A | [*](#*) |  | |
| | as | [*](#*) |  | |
| | will | [*](#*) |  | |
| | <tt>delegatecall</tt>. | [*](#*) |  | |
| | contractID | [*](#*) |  | |
| | the | [*](#*) |  | |
| |  | [](#) |  | |
| | delegatable_contract_id | [ContractID](#ContractID) |  | |


<a name="KeyList"></a>

### KeyList
<BR>A list of keys that requires all keys (M-of-M) to sign unless otherwise specified in<BR>documentation. A KeyList may contain repeated keys, but all repeated keys are only required to<BR>sign once.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| list | [*](#*) |  | |
|  | [](#) |  | |
| keys | [Key](#Key) |  | |


<a name="NftID"></a>

### NftID
<BR>Identifier for a unique token (or "NFT"), used by both contract and token services.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| for | [*](#*) |  | |
|  | [](#) |  | |
| token_ID | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| serial_number |  |  | |


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
| If | [*](#*) |  | |
| senderAccountID | [*](#*) |  | |
|  | [](#) |  | |
| is_approval |  |  | |


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
| files). | [*](#*) |  | |
| translated | [*](#*) |  | |
|  | [](#) |  | |
| RSA_PubKey |  |  | |
| # | [*](#*) |  | |
|  | [](#) |  | |
| nodeId |  |  | |
| # | [*](#*) |  | |
|  | [](#) |  | |
| nodeAccountId | [AccountID](#AccountID) |  | |
| # | [*](#*) |  | |
| hexadecimal | [*](#*) |  | |
| the | [*](#*) |  | |
| used | [*](#*) |  | |
|  | [](#) |  | |
| nodeCertHash |  |  | |
| # | [*](#*) |  | |
|  | [](#) |  | |
| serviceEndpoint | [ServiceEndpoint](#ServiceEndpoint) |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| description |  |  | |
| [Deprecated] | [*](#*) |  | |
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
<BR>This message is <b>DEPRECATED</b> and <b>UNUSABLE</b> with network nodes. It is retained<BR>here only for historical reasons.<BR>Please use the SignaturePair and SignatureMap messages.

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
<BR>This message is <b>DEPRECATED</b> and <b>UNUSABLE</b> with network nodes. It is retained<BR>here only for historical reasons.<BR>Please use the SignaturePair and SignatureMap messages.

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
<BR>The client may use any number of bytes from zero to the whole length of the public key for<BR>pubKeyPrefix. If zero bytes are used, then it must be that only one primitive key is required<BR>to sign the linked transaction; it will surely resolve to <tt>INVALID_SIGNATURE</tt> otherwise.<BR><b>IMPORTANT:</b> In the special case that a signature is being provided for a key used to<BR>authorize a precompiled contract, the <tt>pubKeyPrefix</tt> must contain the <b>entire public<BR>key</b>! That is, if the key is a Ed25519 key, the <tt>pubKeyPrefix</tt> should be 32 bytes<BR>long. If the key is a ECDSA(secp256k1) key, the <tt>pubKeyPrefix</tt> should be 33 bytes long,<BR>since we require the compressed form of the public key.<BR>Only Ed25519 and ECDSA(secp256k1) keys and hence signatures are currently supported.

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
| | ECDSA(secp256k1) | [*](#*) |  | |
| |  | [](#) |  | |
| | ECDSA_secp256k1 |  |  | |


<a name="StakingInfo"></a>

### StakingInfo
<BR>Staking metadata for an account or a contract returned in CryptoGetInfo or ContractGetInfo queries

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| If | [*](#*) |  | |
|  | [](#) |  | |
| decline_reward |  |  | |
| The | [*](#*) |  | |
| staking | [*](#*) |  | |
| is | [*](#*) |  | |
|  | [](#) |  | |
| stake_period_start | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| pending_reward |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| staked_to_me |  |  | |
| ID | [*](#*) |  | |
|  | [](#) |  | |
| staked_id | oneof |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_account_id | [AccountID](#AccountID) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_node_id |  |  | |


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
| * |  |
|  |  |
| SCHEDULE_CREATE_CONTRACT_CALL |  |


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
<BR>This message is <b>DEPRECATED</b> and <b>UNUSABLE</b> with network nodes. It is retained<BR>here only for historical reasons.<BR>Please use the SignaturePair and SignatureMap messages.

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


<a name="TokenPauseStatus"></a>

### TokenPauseStatus
<BR>Possible Pause statuses returned on TokenGetInfoQuery

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| PauseNotApplicable |  |
| * |  |
|  |  |
| Paused |  |
| * |  |
|  |  |
| Unpaused |  |


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
| If | [*](#*) |  | |
| will | [*](#*) |  | |
|  | [](#) |  | |
| expected_decimals | [google.protobuf.UInt32Value](#google.protobuf.UInt32Value) |  | |


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
| The | [*](#*) |  | |
| of | [*](#*) |  | |
| transactionValidStart | [*](#*) |  | |
| nonce | [*](#*) |  | |
|  | [](#) |  | |
| An | [*](#*) |  | |
| calls | [*](#*) |  | |
| transactions | [*](#*) |  | |
|  | [](#) |  | |
| nonce |  |  | |


<a name="TransferList"></a>

### TransferList
<BR>A list of accounts and amounts to transfer out of each account (negative) or into it (positive).

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Multiple | [*](#*) |  | |
| an | [*](#*) |  | |
|  | [](#) |  | |
| accountAmounts | [AccountAmount](#AccountAmount) |  | |


<a name="block_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## block_info.proto

<BR>Information about ongoing, most recently completed, and last 256 blocks.

<a name="BlockInfo"></a>

### BlockInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| last_block_number |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| first_cons_time_of_last_block | [Timestamp](#Timestamp) |  | |
| SHA384 | [*](#*) |  | |
| First | [*](#*) |  | |
| Last | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| block_hashes |  |  | |
| The | [*](#*) |  | |
| consensus | [*](#*) |  | |
| handled | [*](#*) |  | |
|  | [](#) |  | |
| cons_time_of_last_handled_txn | [Timestamp](#Timestamp) |  | |
| A | [*](#*) |  | |
| immediately | [*](#*) |  | |
| should | [*](#*) |  | |
|  | [](#) |  | |
| migration_records_streamed |  |  | |
| The | [*](#*) |  | |
| when | [*](#*) |  | |
|  | [](#) |  | |
| first_cons_time_of_current_block | [Timestamp](#Timestamp) |  | |


<a name="bytecode.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## bytecode.proto

<BR>The bytecode for a contract id.

<a name="Bytecode"></a>

### Bytecode


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| code |  |  | |


<a name="common.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## common.proto

<BR>A single 64-bit number identifying a Hedera native entity.

<a name="EntityIDPair"></a>

### EntityIDPair
<BR>Pair of AccountID and TokenID to represent TokenRelation

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| account_id | [AccountID](#AccountID) |  | |
| token_id | [TokenID](#TokenID) |  | |


<a name="EntityNumber"></a>

### EntityNumber


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| number |  |  | |


<a name="congestion_level_starts.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## congestion_level_starts.proto

 <<<pbj.java_package = "com.hedera.hapi.node.state.congestion">>> This comment is special code for setting PBJ Compiler java package

<a name="CongestionLevelStarts"></a>

### CongestionLevelStarts


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Timestamps | [*](#*) |  | |
|  | [](#) |  | |
| generic_level_starts | [Timestamp](#Timestamp) |  | |
| Timestamps | [*](#*) |  | |
|  | [](#) |  | |
| gas_level_starts | [Timestamp](#Timestamp) |  | |


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
| The | [*](#*) | github.com/hashgraph/hedera-improvement-proposal/blob/master/HIP/hip-198.md">HIP-198</a> for the network-specific IDs. | |
|  | [](#) |  | |
| ledger_id |  |  | |


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


<a name="contract_action.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_action.proto

 <<<pbj.java_package = "com.hedera.hapi.streams">>> This comment is special code for setting PBJ Compiler java package

<a name="CallOperationType"></a>

### CallOperationType
<BR>The specific operation type of a call. The OP prefix has been added to avoid name collisions for<BR>the CALL and CREATE operation types since both ContractActionType and CallOperationType enums are<BR>used in ContractAction

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| OP_UNKNOWN |  |
| * |  |
|  |  |
| OP_CALL |  |
| * |  |
|  |  |
| OP_CALLCODE |  |
| * |  |
|  |  |
| OP_DELEGATECALL |  |
| * |  |
|  |  |
| OP_STATICCALL |  |
| * |  |
|  |  |
| OP_CREATE |  |
| * |  |
|  |  |
| OP_CREATE2 |  |


<a name="ContractAction"></a>

### ContractAction
<BR>A finer grained action with a function result. Sometimes called "internal transactions." The function call itself<BR>will be the first action in a list, followed by sub-action in the order they were executed.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| call_type | [ContractActionType](#ContractActionType) |  | |
| Only | [*](#*) |  | |
| and | [*](#*) |  | |
|  | [](#) |  | |
| caller | oneof |  | |
| | If | [*](#*) |  | |
| |  | [](#) |  | |
| | calling_account | [AccountID](#AccountID) |  | |
| | If | [*](#*) |  | |
| |  | [](#) |  | |
| | calling_contract | [ContractID](#ContractID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| gas |  |  | |
| Bytes | [*](#*) |  | |
|  | [](#) |  | |
| input |  |  | |
| Who | [*](#*) |  | |
|  | [](#) |  | |
| recipient | oneof |  | |
| | The | [*](#*) |  | |
| | effects | [*](#*) |  | |
| |  | [](#) |  | |
| | recipient_account | [AccountID](#AccountID) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | recipient_contract | [ContractID](#ContractID) |  | |
| | The | [*](#*) |  | |
| | Only | [*](#*) |  | |
| | correspond | [*](#*) |  | |
| | this | [*](#*) |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | targeted_address |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| value |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| gas_used |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| result_data | oneof |  | |
| | If | [*](#*) |  | |
| |  | [](#) |  | |
| | output |  |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | revert_reason |  |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | error |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| call_depth |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| call_operation_type | [CallOperationType](#CallOperationType) |  | |


<a name="ContractActionType"></a>

### ContractActionType
<BR>The type of action described by the action proto.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| NO_ACTION |  |
| * |  |
| * |  |
|  |  |
| CALL |  |
| * |  |
|  |  |
| CREATE |  |
| * |  |
|  |  |
| PRECOMPILE |  |
| * |  |
|  |  |
| SYSTEM |  |


<a name="ContractActions"></a>

### ContractActions


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| contract_actions | [ContractAction](#ContractAction) |  | |


<a name="contract_bytecode.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_bytecode.proto

 <<<pbj.java_package = "com.hedera.hapi.streams">>> This comment is special code for setting PBJ Compiler java package

<a name="ContractBytecode"></a>

### ContractBytecode


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contract_id | [ContractID](#ContractID) |  | |
| Contract | [*](#*) |  | |
|  | [](#) |  | |
| initcode |  |  | |
| Contract | [*](#*) |  | |
|  | [](#) |  | |
| runtime_bytecode |  |  | |


<a name="contract_call.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_call.proto

<BR>Call a function of the given smart contract instance, giving it functionParameters as its inputs.<BR>The call can use at maximum the given amount of gas - the paying account will not be charged for<BR>any unspent gas.<BR>If this function results in data being stored, an amount of gas is calculated that reflects this<BR>storage burden.<BR>The amount of gas used, as well as other attributes of the transaction, e.g. size, number of<BR>signatures to be verified, determine the fee for the transaction - which is charged to the paying<BR>account.

<a name="ContractCallTransactionBody"></a>

### ContractCallTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
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
| The | [*](#*) |  | |
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
| The | [*](#*) |  | |
| Typically | [*](#*) |  | |
| over | [*](#*) |  | |
|  | [](#) |  | |
| sender_id | [AccountID](#AccountID) |  | |


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
| [DEPRECATED] | [*](#*) |  | |
|  | [](#) |  | |
| The | [*](#*) |  | |
| records, | [*](#*) |  | |
| EVM | [*](#*) |  | |
| there | [*](#*) |  | |
| and | [*](#*) |  | |
|  | [](#) |  | |
| createdContractIDs | [ContractID](#ContractID) |  | |
|  | [reserved](#reserved) |  | |
| The | [*](#*) |  | |
| where | [*](#*) |  | |
| point--the | [*](#*) |  | |
| child | [*](#*) |  | |
|  | [](#) |  | |
| Every | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| Contracts | [*](#*) |  | |
| derived | [*](#*) | eips.ethereum.org/EIPS/eip-1014">EIP-1014</a> | |
| specification, | [*](#*) |  | |
|  | [](#) |  | |
| (Please | [*](#*) |  | |
| EVM | [*](#*) |  | |
|  | [](#) |  | |
| evm_address | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| This | [*](#*) |  | |
| ContractCreateTransactionBody | [*](#*) |  | |
|  | [](#) |  | |
| gas |  |  | |
| Number | [*](#*) |  | |
|  | [](#) |  | |
| This | [*](#*) |  | |
| ContractCreateTransactionBody | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| This | [*](#*) |  | |
| ContractCreateTransactionBody | [*](#*) |  | |
|  | [](#) |  | |
| functionParameters |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| This | [*](#*) |  | |
| ContractCreateTransactionBody | [*](#*) |  | |
|  | [](#) |  | |
| sender_id | [AccountID](#AccountID) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| contract_nonces | [ContractNonceInfo](#ContractNonceInfo) |  | |
| If | [*](#*) |  | |
| For | [*](#*) |  | |
|  | [](#) |  | |
| signer_nonce | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | |


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

<BR>Start a new smart contract instance. After the instance is created, the ContractID for it is in<BR>the receipt, and can be retrieved by the Record or with a GetByKey query. The instance will run<BR>the bytecode, either stored in a previously created file or in the transaction body itself for<BR>small contracts.<BR>The constructor will be executed using the given amount of gas, and any unspent gas will be<BR>refunded to the paying account. Constructor inputs come from the given constructorParameters.<BR>- The instance will exist for autoRenewPeriod seconds. When that is reached, it will renew<BR>itself for another autoRenewPeriod seconds by charging its associated cryptocurrency account<BR>(which it creates here). If it has insufficient cryptocurrency to extend that long, it will<BR>extend as long as it can. If its balance is zero, the instance will be deleted.<BR>- A smart contract instance normally enforces rules, so "the code is law". For example, an<BR>ERC-20 contract prevents a transfer from being undone without a signature by the recipient of<BR>the transfer. This is always enforced if the contract instance was created with the adminKeys<BR>being null. But for some uses, it might be desirable to create something like an ERC-20<BR>contract that has a specific group of trusted individuals who can act as a "supreme court"<BR>with the ability to override the normal operation, when a sufficient number of them agree to<BR>do so. If adminKeys is not null, then they can sign a transaction that can change the state of<BR>the smart contract in arbitrary ways, such as to reverse a transaction that violates some<BR>standard of behavior that is not covered by the code itself. The admin keys can also be used<BR>to change the autoRenewPeriod, and change the adminKeys field itself. The API currently does<BR>not implement this ability. But it does allow the adminKeys field to be set and queried, and<BR>will in the future implement such admin abilities for any instance that has a non-null<BR>adminKeys.<BR>- If this constructor stores information, it is charged gas to store it. There is a fee in hbars<BR>to maintain that storage until the expiration time, and that fee is added as part of the<BR>transaction fee.<BR>- An entity (account, file, or smart contract instance) must be created in a particular realm.<BR>If the realmID is left null, then a new realm will be created with the given admin key. If a<BR>new realm has a null adminKey, then anyone can create/modify/delete entities in that realm.<BR>But if an admin key is given, then any transaction to create/modify/delete an entity in that<BR>realm must be signed by that key, though anyone can still call functions on smart contract<BR>instances that exist in that realm. A realm ceases to exist when everything within it has<BR>expired and no longer exists.<BR>- The current API ignores shardID, realmID, and newRealmAdminKey, and creates everything in<BR>shard 0 and realm 0, with a null key. Future versions of the API will support multiple realms<BR>and multiple shards.<BR>- The optional memo field can contain a string whose length is up to 100 bytes. That is the size<BR>after Unicode NFD then UTF-8 conversion. This field can be used to describe the smart contract.<BR>It could also be used for other purposes. One recommended purpose is to hold a hexadecimal<BR>string that is the SHA-384 hash of a PDF file containing a human-readable legal contract. Then,<BR>if the admin keys are the public keys of human arbitrators, they can use that legal document to<BR>guide their decisions during a binding arbitration tribunal, convened to consider any changes<BR>to the smart contract in the future. The memo field can only be changed using the admin keys.<BR>If there are no admin keys, then it cannot be changed after the smart contract is created.<BR><b>Signing requirements:</b> If an admin key is set, it must sign the transaction. If an<BR>auto-renew account is set, its key must sign the transaction.

<a name="ContractCreateTransactionBody"></a>

### ContractCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| There | [*](#*) |  | |
| large | [*](#*) |  | |
| either | [*](#*) |  | |
|  | [](#) |  | |
|  | [](#) |  | |
| initcodeSource | oneof |  | |
| | The | [*](#*) |  | |
| | contract | [*](#*) |  | |
| |  | [](#) |  | |
| | fileID | [FileID](#FileID) |  | |
| | The | [*](#*) |  | |
| | is | [*](#*) |  | |
| |  | [](#) |  | |
| | initcode |  |  | |
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
| [Deprecated] | [*](#*) |  | |
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
| The | [*](#*) |  | |
| with | [*](#*) |  | |
|  | [](#) |  | |
| max_automatic_token_associations |  |  | |
| An | [*](#*) |  | |
| account | [*](#*) |  | |
| cover | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_account_id | [AccountID](#AccountID) |  | |
| ID | [*](#*) |  | |
|  | [](#) |  | |
| staked_id | oneof |  | |
| | ID | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_account_id | [AccountID](#AccountID) |  | |
| | ID | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_node_id |  |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| decline_reward |  |  | |


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
| If | [*](#*) |  | |
| alert | [*](#*) |  | |
| <b>IMPORTANT:</b> | [*](#*) |  | |
| removal | [*](#*) |  | |
| submitted | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| permanent_removal |  |  | |


<a name="contract_get_bytecode.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_get_bytecode.proto

<BR>Get the runtime bytecode for a smart contract instance

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

<BR>Get information about a smart contract instance. This includes the account that it uses, the file<BR>containing its initcode (if a file was used to initialize the contract), and the time when it will expire.

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
| [DEPRECATED] | [*](#*) |  | |
| deprecated | [*](#*) | hips.hedera.com/hip/hip-367">HIP-367</a>, which allowed | |
| an | [*](#*) |  | |
| efficient | [*](#*) |  | |
|  | [](#) |  | |
| tokenRelationships | [TokenRelationship](#TokenRelationship) |  | |
| The | [*](#*) | github.com/hashgraph/hedera-improvement-proposal/blob/master/HIP/hip-198.md">HIP-198</a> for the network-specific IDs. | |
|  | [](#) |  | |
| ledger_id |  |  | |
| ID | [*](#*) |  | |
| balance, | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| max_automatic_token_associations |  |  | |
| Staking | [*](#*) |  | |
|  | [](#) |  | |
| staking_info | [StakingInfo](#StakingInfo) |  | |


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


<a name="contract_state_change.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_state_change.proto

 <<<pbj.java_package = "com.hedera.hapi.streams">>> This comment is special code for setting PBJ Compiler java package

<a name="ContractStateChange"></a>

### ContractStateChange
<BR>The storage changes to a smart contract's storage as a side effect of the function call.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contract_id | [ContractID](#ContractID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| storage_changes | [StorageChange](#StorageChange) |  | |


<a name="ContractStateChanges"></a>

### ContractStateChanges


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| contract_state_changes | [ContractStateChange](#ContractStateChange) |  | |


<a name="StorageChange"></a>

### StorageChange
<BR>A storage slot change description.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| slot |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| Because | [*](#*) |  | |
|  | [](#) |  | |
| value_read |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| value_written | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |


<a name="contract_types.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_types.proto

<BR>Info about a contract account's nonce value.<BR>A nonce of a contract is only incremented when that contract creates another contract.

<a name="ContractNonceInfo"></a>

### ContractNonceInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Id | [*](#*) |  | |
|  | [](#) |  | |
| contract_id | [ContractID](#ContractID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nonce |  |  | |


<a name="contract_update.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## contract_update.proto

<BR>At consensus, updates the fields of a smart contract to the given values.<BR>If no value is given for a field, that field is left unchanged on the contract. For an immutable<BR>smart contract (that is, a contract created without an adminKey), only the expirationTime may be<BR>updated; setting any other field in this case will cause the transaction status to resolve to<BR>MODIFYING_IMMUTABLE_CONTRACT.<BR>--- Signing Requirements ---<BR>1. Whether or not a contract has an admin key, its expiry can be extended with only the<BR>transaction payer's signature.<BR>2. Updating any other field of a mutable contract requires the admin key's signature.<BR>3. If the update transaction includes a new admin key, this new key must also sign <b>unless</b><BR>it is exactly an empty <tt>KeyList</tt>. This special sentinel key removes the existing admin<BR>key and causes the contract to become immutable. (Other <tt>Key</tt> structures without a<BR>constituent <tt>Ed25519</tt> key will be rejected with <tt>INVALID_ADMIN_KEY</tt>.)<BR>4. If the update transaction sets the AccountID auto_renew_account_id wrapper field to anything<BR>other than the sentinel <tt>0.0.0</tt> value, then the key of the referenced account must sign.

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
| [Deprecated] | [*](#*) |  | |
|  | [](#) |  | |
| proxyAccountID | [AccountID](#AccountID) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| autoRenewPeriod | [Duration](#Duration) |  | |
| This | [*](#*) |  | |
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
| If | [*](#*) |  | |
| automatically | [*](#*) |  | |
|  | [](#) |  | |
| max_automatic_token_associations | [google.protobuf.Int32Value](#google.protobuf.Int32Value) |  | |
| If | [*](#*) |  | |
| account. | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_account_id | [AccountID](#AccountID) |  | |
| ID | [*](#*) |  | |
|  | [](#) |  | |
| staked_id | oneof |  | |
| | ID | [*](#*) |  | |
| | this | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_account_id | [AccountID](#AccountID) |  | |
| | ID | [*](#*) |  | |
| | removes | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_node_id |  |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| decline_reward | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | |


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


<a name="crypto_approve_allowance.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_approve_allowance.proto

<BR>Creates one or more hbar/token approved allowances <b>relative to the owner account specified in the allowances of<BR>this transaction</b>. Each allowance grants a spender the right to transfer a pre-determined amount of the owner's<BR>hbar/token to any other account of the spender's choice. If the owner is not specified in any allowance, the payer<BR>of transaction is considered to be the owner for that particular allowance.<BR>Setting the amount to zero in CryptoAllowance or TokenAllowance will remove the respective allowance for the spender.<BR>(So if account <tt>0.0.X</tt> pays for this transaction and owner is not specified in the allowance,<BR>then at consensus each spender account will have new allowances to spend hbar or tokens from <tt>0.0.X</tt>).

<a name="CryptoAllowance"></a>

### CryptoAllowance
<BR>An approved allowance of hbar transfers for a spender.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| owner | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| spender | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |


<a name="CryptoApproveAllowanceTransactionBody"></a>

### CryptoApproveAllowanceTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| List | [*](#*) |  | |
|  | [](#) |  | |
| cryptoAllowances | [CryptoAllowance](#CryptoAllowance) |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| nftAllowances | [NftAllowance](#NftAllowance) |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| tokenAllowances | [TokenAllowance](#TokenAllowance) |  | |


<a name="NftAllowance"></a>

### NftAllowance
<BR>An approved allowance of non-fungible token transfers for a spender.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenId | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| owner | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| spender | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| serial_numbers |  |  | |
| If | [*](#*) |  | |
| owned | [*](#*) |  | |
|  | [](#) |  | |
| approved_for_all | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | |
| The | [*](#*) |  | |
| approval | [*](#*) |  | |
|  | [](#) |  | |
| delegating_spender | [AccountID](#AccountID) |  | |


<a name="TokenAllowance"></a>

### TokenAllowance
<BR>An approved allowance of fungible token transfers for a spender.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| tokenId | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| owner | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| spender | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |


<a name="crypto_create.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_create.proto

<BR>Create a new account. After the account is created, the AccountID for it is in the receipt. It<BR>can also be retrieved with a GetByKey query. Threshold values can be defined, and records are<BR>generated and stored for 25 hours for any transfer that exceeds the thresholds. This account is<BR>charged for each record generated, so the thresholds are useful for limiting record generation to<BR>happen only for large transactions.<BR>The Key field is the key used to sign transactions for this account. If the account has<BR>receiverSigRequired set to true, then all cryptocurrency transfers must be signed by this<BR>account's key, both for transfers in and out. If it is false, then only transfers out have to be<BR>signed by it. When the account is created, the payer account is charged enough hbars so that the<BR>new account will not expire for the next autoRenewPeriod seconds. When it reaches the expiration<BR>time, the new account will then be automatically charged to renew for another autoRenewPeriod<BR>seconds. If it does not have enough hbars to renew for that long, then the remaining hbars are<BR>used to extend its expiration as long as possible. If it is has a zero balance when it expires,<BR>then it is deleted. This transaction must be signed by the payer account. If receiverSigRequired<BR>is false, then the transaction does not have to be signed by the keys in the keys field. If it is<BR>true, then it must be signed by them, in addition to the keys of the payer account. If the<BR>auto_renew_account field is set, the key of the referenced account must sign.<BR>An entity (account, file, or smart contract instance) must be created in a particular realm. If<BR>the realmID is left null, then a new realm will be created with the given admin key. If a new<BR>realm has a null adminKey, then anyone can create/modify/delete entities in that realm. But if an<BR>admin key is given, then any transaction to create/modify/delete an entity in that realm must be<BR>signed by that key, though anyone can still call functions on smart contract instances that exist<BR>in that realm. A realm ceases to exist when everything within it has expired and no longer<BR>exists.<BR>The current API ignores shardID, realmID, and newRealmAdminKey, and creates everything in shard 0<BR>and realm 0, with a null key. Future versions of the API will support multiple realms and<BR>multiple shards.

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
| [Deprecated] | [*](#*) |  | |
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
| ID | [*](#*) |  | |
|  | [](#) |  | |
| staked_id | oneof |  | |
| | ID | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_account_id | [AccountID](#AccountID) |  | |
| | ID | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_node_id |  |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| decline_reward |  |  | |
| The | [*](#*) |  | |
| serialization | [*](#*) |  | |
| supported | [*](#*) |  | |
| delegatable_contract_id | [*](#*) |  | |
|  | [](#) |  | |
| May | [*](#*) |  | |
|  | [](#) |  | |
| A | [*](#*) |  | |
| relative | [*](#*) |  | |
|  | [](#) |  | |
| If | [*](#*) |  | |
| simply | [*](#*) |  | |
|  | [](#) |  | |
| alias |  |  | |


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


<a name="crypto_delete_allowance.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_delete_allowance.proto

<BR>Deletes one or more non-fungible approved allowances from an owner's account. This operation<BR>will remove the allowances granted to one or more specific non-fungible token serial numbers. Each owner account<BR>listed as wiping an allowance must sign the transaction. Hbar and fungible token allowances<BR>can be removed by setting the amount to zero in CryptoApproveAllowance.

<a name="CryptoDeleteAllowanceTransactionBody"></a>

### CryptoDeleteAllowanceTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| List | [*](#*) |  | |
|  | [](#) |  | |
| nftAllowances | [NftRemoveAllowance](#NftRemoveAllowance) |  | |


<a name="NftRemoveAllowance"></a>

### NftRemoveAllowance
<BR>Nft allowances to be removed on an owner account

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token_id | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| owner | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| serial_numbers |  |  | |


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
| [DEPRECATED] | [*](#*) |  | |
| deprecated | [*](#*) | hips.hedera.com/hip/hip-367">HIP-367</a>, which allowed | |
| an | [*](#*) |  | |
| efficient | [*](#*) |  | |
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
| [Deprecated] | [*](#*) |  | |
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
| [DEPRECATED] | [*](#*) |  | |
| deprecated | [*](#*) | hips.hedera.com/hip/hip-367">HIP-367</a>, which allowed | |
| an | [*](#*) |  | |
| efficient | [*](#*) |  | |
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
| The | [*](#*) |  | |
|  | [](#) |  | |
| alias |  |  | |
| The | [*](#*) | github.com/hashgraph/hedera-improvement-proposal/blob/master/HIP/hip-198.md">HIP-198</a> for the network-specific IDs. | |
|  | [](#) |  | |
| ledger_id |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| ethereum_nonce |  |  | |
| Staking | [*](#*) |  | |
|  | [](#) |  | |
| staking_info | [StakingInfo](#StakingInfo) |  | |


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
| approveAllowances  | Transaction | TransactionResponse | <BR>Adds one or more approved allowances for spenders to transfer the paying account's hbar or tokens. |
| deleteAllowances  | Transaction | TransactionResponse | <BR>Deletes one or more of the specific approved NFT serial numbers on an owner account. |
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

<BR>Change properties for the given account. Any null field is ignored (left unchanged). This<BR>transaction must be signed by the existing key for this account. If the transaction is changing<BR>the key field, then the transaction must be signed by both the old key (from before the change)<BR>and the new key. The old key must sign for security. The new key must sign as a safeguard to<BR>avoid accidentally changing to an invalid key, and then having no way to recover.<BR>If the update transaction sets the <tt>auto_renew_account</tt> field to anything other<BR>than the sentinel <tt>0.0.0</tt>, the key of the referenced account must sign.

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
| [Deprecated] | [*](#*) |  | |
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
| ID | [*](#*) |  | |
|  | [](#) |  | |
| staked_id | oneof |  | |
| | ID | [*](#*) |  | |
| | this | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_account_id | [AccountID](#AccountID) |  | |
| | ID | [*](#*) |  | |
| | removes | [*](#*) |  | |
| |  | [](#) |  | |
| | staked_node_id |  |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| decline_reward | [google.protobuf.BoolValue](#google.protobuf.BoolValue) |  | |


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
| If | [*](#*) |  | |
| (The | [*](#*) |  | |
| be | [*](#*) | hips.hedera.com/hip/hip-573">HIP-573</a> | |
| for | [*](#*) |  | |
|  | [](#) |  | |
| all_collectors_are_exempt |  |  | |


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
<BR>A fee to assess during a CryptoTransfer that changes ownership of an NFT. Defines the fraction of<BR>the fungible value exchanged for an NFT that the ledger should collect as a royalty. ("Fungible<BR>value" includes both ℏ and units of fungible HTS tokens.) When the NFT sender does not receive<BR>any fungible value, the ledger will assess the fallback fee, if present, to the new NFT owner.<BR>Royalty fees can only be added to tokens of type type NON_FUNGIBLE_UNIQUE.<BR>IMPORTANT: Users must understand that native royalty fees are _strictly_ a convenience feature,<BR>and that the network cannot enforce inescapable royalties on the exchange of a non-fractional NFT.<BR>For example, if the counterparties agree to split their value transfer and NFT exchange into separate<BR>transactions, the network cannot possibly intervene. (And note the counterparties could use a smart<BR>contract to make this split transaction atomic if they do not trust each other.)<BR>Counterparties that _do_ wish to respect creator royalties should follow the pattern the network<BR>recognizes: The NFT sender and receiver should both sign a single `CryptoTransfer` that credits<BR>the sender with all the fungible value the receiver is exchanging for the NFT.<BR>Similarly, a marketplace using an approved spender account for an escrow transaction should credit<BR>the account selling the NFT in the same `CryptoTransfer` that deducts fungible value from the buying<BR>account.<BR>There is an [open HIP discussion](https:github.com/hashgraph/hedera-improvement-proposal/discussions/578)<BR>that proposes to broaden the class of transactions for which the network automatically collects<BR>royalties. If this interests or concerns you, please add your voice to that discussion.

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


<a name="ethereum_transaction.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ethereum_transaction.proto

 <<<pbj.java_package = "com.hedera.hapi.node.contract">>> This comment is special code for setting PBJ Compiler java package

<a name="EthereumTransactionBody"></a>

### EthereumTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| unless | [*](#*) |  | |
|  | [](#) |  | |
| ethereum_data |  |  | |
| For | [*](#*) |  | |
| of | [*](#*) |  | |
| the | [*](#*) |  | |
| the | [*](#*) |  | |
| "rehydrated" | [*](#*) |  | |
|  | [](#) |  | |
| call_data | [FileID](#FileID) |  | |
| The | [*](#*) |  | |
| is | [*](#*) |  | |
|  | [](#) |  | |
| Ordinarily | [*](#*) |  | |
| key | [*](#*) |  | |
| fees | [*](#*) |  | |
| authorized | [*](#*) |  | |
| charged, | [*](#*) |  | |
| transaction | [*](#*) |  | |
| only | [*](#*) |  | |
| price | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| max_gas_allowance |  |  | |


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


<a name="file.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## file.proto

<BR>Representation of a Hedera Token Service file in the network Merkle tree.<BR>As with all network entities, a file has a unique entity number, which is given along<BR>with the network's shard and realm in the form of a shard.realm.number id.

<a name="File"></a>

### File


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| file_id | [FileID](#FileID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expiration_second |  |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| keys | [KeyList](#KeyList) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contents |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| Whether | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| pre_system_delete_expiration_second |  |  | |


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

<BR>Create a new file, containing the given contents.<BR>After the file is created, the FileID for it can be found in the receipt, or record, or retrieved<BR>with a GetByKey query.<BR>The file contains the specified contents (possibly empty). The file will automatically disappear<BR>at the expirationTime, unless its expiration is extended by another transaction before that time.<BR>If the file is deleted, then its contents will become empty and it will be marked as deleted<BR>until it expires, and then it will cease to exist.<BR>The keys field is a list of keys. All keys within the top-level key list must sign (M-M) to<BR>create or modify a file. However, to delete the file, only one key (1-M) is required to sign from<BR>the top-level key list.  Each of those "keys" may itself be threshold key containing other keys<BR>(including other threshold keys). In other words, the behavior is an AND for create/modify, OR<BR>for delete. This is useful for acting as a revocation server. If it is desired to have the<BR>behavior be AND for all 3 operations (or OR for all 3), then the list should have only a single<BR>Key, which is a threshold key, with N=1 for OR, N=M for AND. If the auto_renew_account field<BR>is set, the key of the referenced account must sign.<BR>If a file is created without ANY keys in the keys field, the file is immutable and ONLY the<BR>expirationTime of the file can be changed with a FileUpdate transaction. The file contents or its<BR>keys cannot be changed.<BR>An entity (account, file, or smart contract instance) must be created in a particular realm. If<BR>the realmID is left null, then a new realm will be created with the given admin key. If a new<BR>realm has a null adminKey, then anyone can create/modify/delete entities in that realm. But if an<BR>admin key is given, then any transaction to create/modify/delete an entity in that realm must be<BR>signed by that key, though anyone can still call functions on smart contract instances that exist<BR>in that realm. A realm ceases to exist when everything within it has expired and no longer<BR>exists.<BR>The current API ignores shardID, realmID, and newRealmAdminKey, and creates everything in shard 0<BR>and realm 0, with a null key. Future versions of the API will support multiple realms and<BR>multiple shards.

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
| The | [*](#*) | github.com/hashgraph/hedera-improvement-proposal/blob/master/HIP/hip-198.md">HIP-198</a> for the network-specific IDs. | |
|  | [](#) |  | |
| ledger_id |  |  | |


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

<BR>Modify the metadata and/or contents of a file. If a field is not set in the transaction body, the<BR>corresponding file attribute will be unchanged. This transaction must be signed by all the keys<BR>in the top level of a key list (M-of-M) of the file being updated. If the keys themselves are<BR>being updated, then the transaction must also be signed by all the new keys. If the keys contain<BR>additional KeyList or ThresholdKey then M-of-M secondary KeyList or ThresholdKey signing<BR>requirements must be meet If the update transaction sets the <tt>auto_renew_account_id</tt> field<BR>to anything other than the sentinel <tt>0.0.0</tt>, the key of the referenced account must sign.

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
| !! | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| startHour |  |  | |
| !! | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| startMin |  |  | |
| !! | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| endHour |  |  | |
| !! | [*](#*) |  | |
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
| The | [*](#*) |  | |
|  | [](#) |  | |
| freeze_type | [FreezeType](#FreezeType) |  | |


<a name="freeze_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## freeze_service.proto

<BR>The request and responses for freeze service.

<a name="FreezeService"></a>

### FreezeService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| freeze  | Transaction | TransactionResponse | <BR>Freezes the nodes by submitting the transaction. The grpc server returns the<BR>TransactionResponse |


<a name="freeze_type.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## freeze_type.proto

<BR>The type of network freeze or upgrade operation to be performed. This type dictates which<BR>fields are required.

<a name="FreezeType"></a>

### FreezeType


| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
|  |  |
| UNKNOWN_FREEZE_TYPE |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| FREEZE_ONLY |  |
| * |  |
| * |  |
| * |  |
|  |  |
| PREPARE_UPGRADE |  |
| * |  |
| * |  |
|  |  |
| FREEZE_UPGRADE |  |
| * |  |
|  |  |
| FREEZE_ABORT |  |
| * |  |
| * |  |
|  |  |
| TELEMETRY_UPGRADE |  |


<a name="get_account_details.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## get_account_details.proto

<BR>Gets all the information about an account, including balance and allowances. This does not get the list of<BR>account records.

<a name="GetAccountDetailsQuery"></a>

### GetAccountDetailsQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Account | [*](#*) |  | |
| response | [*](#*) |  | |
|  | [](#) |  | |
| header | [QueryHeader](#QueryHeader) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account_id | [AccountID](#AccountID) |  | |


<a name="GetAccountDetailsResponse"></a>

### GetAccountDetailsResponse
<BR>Response when the client sends the node GetAccountDetailsQuery

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Standard | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| header | [ResponseHeader](#ResponseHeader) |  | |
| Details | [*](#*) |  | |
|  | [](#) |  | |
| account_details | [GetAccountDetailsResponse.AccountDetails](#GetAccountDetailsResponse.AccountDetails) |  | |


<a name="GetAccountDetailsResponse.AccountDetails"></a>

### GetAccountDetailsResponse.AccountDetails


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| account | [*](#*) |  | |
|  | [](#) |  | |
| contract_account_id |  |  | |
| If | [*](#*) |  | |
| transactions | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| [Deprecated] | [*](#*) |  | |
| or | [*](#*) |  | |
| automatically | [*](#*) |  | |
| If | [*](#*) |  | |
| running | [*](#*) |  | |
|  | [](#) |  | |
| proxy_account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| proxy_received |  |  | |
| The | [*](#*) |  | |
| account | [*](#*) |  | |
|  | [](#) |  | |
| key | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| balance |  |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| receiver_sig_required |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expiration_time | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
| insufficient | [*](#*) |  | |
| then | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_period | [Duration](#Duration) |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| token_relationships | [TokenRelationship](#TokenRelationship) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| owned_nfts |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| max_automatic_token_associations |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| alias |  |  | |
| The | [*](#*) | github.com/hashgraph/hedera-improvement-proposal/blob/master/HIP/hip-198.md">HIP-198</a> for the network-specific IDs. | |
|  | [](#) |  | |
| ledger_id |  |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| granted_crypto_allowances | [GrantedCryptoAllowance](#GrantedCryptoAllowance) |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| granted_nft_allowances | [GrantedNftAllowance](#GrantedNftAllowance) |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| granted_token_allowances | [GrantedTokenAllowance](#GrantedTokenAllowance) |  | |


<a name="GrantedCryptoAllowance"></a>

### GrantedCryptoAllowance
<BR>A granted allowance of hbar transfers for a spender relative to the owner account.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| spender | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |


<a name="GrantedNftAllowance"></a>

### GrantedNftAllowance
<BR>A granted allowance for all the NFTs of a token for a spender relative to the owner account.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token_id | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| spender | [AccountID](#AccountID) |  | |


<a name="GrantedTokenAllowance"></a>

### GrantedTokenAllowance
<BR>A granted allowance of fungible token transfers for a spender relative to the owner account.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token_id | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| spender | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |


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


<a name="hash_object.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## hash_object.proto

<BR>List of hash algorithms

<a name="HashAlgorithm"></a>

### HashAlgorithm


| Enum Name | Description |
| --------- | ----------- |
| HASH_ALGORITHM_UNKNOWN |  |
| SHA_384 |  |


<a name="HashObject"></a>

### HashObject
<BR>Encapsulates an object hash so that additional hash algorithms<BR>can be added in the future without requiring a breaking change.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Specifies | [*](#*) |  | |
|  | [](#) |  | |
| algorithm | [HashAlgorithm](#HashAlgorithm) |  | |
| Hash | [*](#*) |  | |
|  | [](#) |  | |
| length |  |  | |
| Specifies | [*](#*) |  | |
|  | [](#) |  | |
| hash |  |  | |


<a name="mirror_network_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## mirror_network_service.proto

<BR>Request object to query an address book for its list of nodes

<a name="AddressBookQuery"></a>

### AddressBookQuery


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| file_id | [.proto.FileID](#.proto.FileID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| limit |  |  | |


<a name="NetworkService"></a>

### NetworkService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| getNodes  | AddressBookQuery | stream .proto.NodeAddress | <BR>Query for an address book and return its nodes. The nodes are returned in ascending order by node ID. The<BR>response is not guaranteed to be a byte-for-byte equivalent to the NodeAddress in the Hedera file on<BR>the network since it is reconstructed from a normalized database table. |


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
| getAccountDetails  | Query | Response | <BR>Get all the information about an account, including balance and allowances. This does not get the list of<BR>account records. |


<a name="network_staking_rewards.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## network_staking_rewards.proto

<BR>Representation of a Hedera Token Service staking reward entity in the network Merkle tree.<BR>This consists of all the information needed to calculate the staking rewards for all nodes in the network. It is<BR>calculated at the beginning of each staking period for all nodes and is needed to have same values<BR>for reconnect.<BR>As with all network entities, staking info is per node and has a unique entity number represented as shard.realm.X.

<a name="NetworkStakingRewards"></a>

### NetworkStakingRewards


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Whether | [*](#*) |  | |
| reaches | [*](#*) |  | |
|  | [](#) |  | |
| staking_rewards_activated |  |  | |
| Total | [*](#*) |  | |
| beginning | [*](#*) |  | |
|  | [](#) |  | |
| total_staked_reward_start |  |  | |
| Total | [*](#*) |  | |
| staking | [*](#*) |  | |
|  | [](#) |  | |
| total_staked_start |  |  | |
| The | [*](#*) |  | |
| of | [*](#*) |  | |
|  | [](#) |  | |
| pending_rewards |  |  | |


<a name="nft.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## nft.proto

<BR>Representation of a Hedera Token Service NFT in the network Merkle tree.

<a name="Nft"></a>

### Nft


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nft_id | [NftID](#NftID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| owner_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| spender_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| mint_time | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| metadata |  |  | |
| If | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [](#) |  | |
| owner_previous_nft_id | [NftID](#NftID) |  | |
| If | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| owner_next_nft_id | [NftID](#NftID) |  | |


<a name="node_stake_update.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## node_stake_update.proto

<BR>Updates the staking info at the end of staking period to indicate new staking period has started.

<a name="NodeStake"></a>

### NodeStake
<BR>Staking info for each node at the end of a staking period.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| reward | [*](#*) |  | |
| period | [*](#*) |  | |
|  | [](#) |  | |
| max_stake |  |  | |
| The | [*](#*) |  | |
| If | [*](#*) |  | |
| that | [*](#*) |  | |
|  | [](#) |  | |
| min_stake |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |
| The | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| reward_rate |  |  | |
| Consensus | [*](#*) |  | |
|  | [](#) |  | |
| stake |  |  | |
| Total | [*](#*) |  | |
| beginning | [*](#*) |  | |
|  | [](#) |  | |
| stake_not_rewarded |  |  | |
| Total | [*](#*) |  | |
| beginning | [*](#*) |  | |
|  | [](#) |  | |
| stake_rewarded |  |  | |


<a name="NodeStakeUpdateTransactionBody"></a>

### NodeStakeUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Time | [*](#*) |  | |
|  | [](#) |  | |
| end_of_staking_period | [Timestamp](#Timestamp) |  | |
| Staking | [*](#*) |  | |
|  | [](#) |  | |
| node_stake | [NodeStake](#NodeStake) |  | |
| The | [*](#*) |  | |
| staking | [*](#*) |  | |
|  | [](#) |  | |
| max_staking_reward_rate_per_hbar |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| node_reward_fee_fraction | [Fraction](#Fraction) |  | |
| The | [*](#*) |  | |
| is | [*](#*) |  | |
| year | [*](#*) |  | |
|  | [](#) |  | |
| staking_periods_stored |  |  | |
| The | [*](#*) |  | |
| treated | [*](#*) |  | |
|  | [](#) |  | |
| staking_period |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| staking_reward_fee_fraction | [Fraction](#Fraction) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| staking_start_threshold |  |  | |
| (DEPRECATED) | [*](#*) |  | |
| ending | [*](#*) |  | |
|  | [](#) |  | |
| staking_reward_rate |  |  | |
| The | [*](#*) |  | |
| have | [*](#*) |  | |
|  | [](#) |  | |
| reserved_staking_rewards |  |  | |
| The | [*](#*) |  | |
| used | [*](#*) |  | |
|  | [](#) |  | |
| unreserved_staking_reward_balance |  |  | |
| The | [*](#*) |  | |
| rate | [*](#*) |  | |
|  | [](#) |  | |
| reward_balance_threshold |  |  | |
| The | [*](#*) |  | |
| per-hbar | [*](#*) |  | |
|  | [](#) |  | |
| max_stake_rewarded |  |  | |
| The | [*](#*) |  | |
| applying | [*](#*) |  | |
| field | [*](#*) |  | |
| mirror | [*](#*) |  | |
| stake_rewarded | [*](#*) |  | |
|  | [](#) |  | |
| max_total_reward |  |  | |


<a name="primitives.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## primitives.proto

<BR>A single 64-bit number with no particular meaning.

<a name="ProtoBoolean"></a>

### ProtoBoolean
<BR>A single boolean with no particular meaning.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| value |  |  | |


<a name="ProtoBytes"></a>

### ProtoBytes
<BR>A single byte array with no particular meaning.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| value |  |  | |


<a name="ProtoInteger"></a>

### ProtoInteger
<BR>A single 32-bit number with no particular meaning.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| value |  |  | |


<a name="ProtoLong"></a>

### ProtoLong


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| value |  |  | |


<a name="ProtoString"></a>

### ProtoString
<BR>A single string with no particular meaning.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| value |  |  | |


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
| | Gets | [*](#*) |  | |
| |  | [](#) |  | |
| | accountDetails | [GetAccountDetailsQuery](#GetAccountDetailsQuery) |  | |


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


<a name="record_stream_file.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## record_stream_file.proto

<BR>RecordStreamFile is used to serialize all RecordStreamItems that are part of the<BR>same period into record stream files.<BR>This structure represents a block in Hedera (HIP-415).

<a name="RecordStreamFile"></a>

### RecordStreamFile


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Version | [*](#*) |  | |
|  | [](#) |  | |
| hapi_proto_version | [SemanticVersion](#SemanticVersion) |  | |
| Running | [*](#*) |  | |
|  | [](#) |  | |
| start_object_running_hash | [HashObject](#HashObject) |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| record_stream_items | [RecordStreamItem](#RecordStreamItem) |  | |
| Running | [*](#*) |  | |
|  | [](#) |  | |
| end_object_running_hash | [HashObject](#HashObject) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| block_number |  |  | |
| List | [*](#*) |  | |
| Allows | [*](#*) |  | |
|  | [](#) |  | |
| sidecars | [SidecarMetadata](#SidecarMetadata) |  | |


<a name="RecordStreamItem"></a>

### RecordStreamItem
<BR>A RecordStreamItem consists of a Transaction and a TransactionRecord,<BR>which are already defined protobuf messages.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transaction | [Transaction](#Transaction) |  | |
| record | [TransactionRecord](#TransactionRecord) |  | |


<a name="SidecarMetadata"></a>

### SidecarMetadata
<BR>Information about a single sidecar file.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| hash | [HashObject](#HashObject) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| id |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| types | [SidecarType](#SidecarType) |  | |


<a name="SidecarType"></a>

### SidecarType
<BR>The type of sidecar records contained in the sidecar record file

| Enum Name | Description |
| --------- | ----------- |
| SIDECAR_TYPE_UNKNOWN |  |
| CONTRACT_STATE_CHANGE |  |
| CONTRACT_ACTION |  |
| CONTRACT_BYTECODE |  |


<a name="recordcache.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## recordcache.proto

<BR>As transactions are handled and records and receipts are created, they are stored in state for a configured time<BR>limit (perhaps, for example, 3 minutes). During this time window, any client can query the node and get the record<BR>or receipt for the transaction. The TransactionRecordEntry is the object stored in state with this information.

<a name="TransactionRecordEntry"></a>

### TransactionRecordEntry


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| address | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |
| The | [*](#*) |  | |
| of | [*](#*) |  | |
| ID | [*](#*) |  | |
|  | [](#) |  | |
| payer_account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| transaction_record | [TransactionRecord](#TransactionRecord) |  | |


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
| | Gets | [*](#*) |  | |
| |  | [](#) |  | |
| | accountDetails | [GetAccountDetailsResponse](#GetAccountDetailsResponse) |  | |


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
| * |  |
|  |  |
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
| * |  |
|  |  |
| REQUESTED_NUM_AUTOMATIC_ASSOCIATIONS_EXCEEDS_ASSOCIATION_LIMIT |  |
| * |  |
|  |  |
| TOKEN_IS_PAUSED |  |
| * |  |
|  |  |
| TOKEN_HAS_NO_PAUSE_KEY |  |
| * |  |
|  |  |
| INVALID_PAUSE_KEY |  |
| * |  |
|  |  |
| FREEZE_UPDATE_FILE_DOES_NOT_EXIST |  |
| * |  |
|  |  |
| FREEZE_UPDATE_FILE_HASH_DOES_NOT_MATCH |  |
| * |  |
|  |  |
| NO_UPGRADE_HAS_BEEN_PREPARED |  |
| * |  |
|  |  |
| NO_FREEZE_IS_SCHEDULED |  |
| * |  |
| * |  |
|  |  |
| UPDATE_FILE_HASH_CHANGED_SINCE_PREPARE_UPGRADE |  |
| * |  |
|  |  |
| FREEZE_START_TIME_MUST_BE_FUTURE |  |
| * |  |
| * |  |
|  |  |
| PREPARED_UPDATE_FILE_IS_IMMUTABLE |  |
| * |  |
| * |  |
|  |  |
| FREEZE_ALREADY_SCHEDULED |  |
| * |  |
| * |  |
|  |  |
| FREEZE_UPGRADE_IN_PROGRESS |  |
| * |  |
| * |  |
|  |  |
| UPDATE_FILE_ID_DOES_NOT_MATCH_PREPARED |  |
| * |  |
| * |  |
|  |  |
| UPDATE_FILE_HASH_DOES_NOT_MATCH_PREPARED |  |
| * |  |
| * |  |
|  |  |
| CONSENSUS_GAS_EXHAUSTED |  |
| * |  |
|  |  |
| REVERTED_SUCCESS |  |
| * |  |
|  |  |
| MAX_STORAGE_IN_PRICE_REGIME_HAS_BEEN_USED |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_ALIAS_KEY |  |
| * |  |
| * |  |
|  |  |
| UNEXPECTED_TOKEN_DECIMALS |  |
| * |  |
|  |  |
| INVALID_PROXY_ACCOUNT_ID |  |
| * |  |
|  |  |
| INVALID_TRANSFER_ACCOUNT_ID |  |
| * |  |
|  |  |
| INVALID_FEE_COLLECTOR_ACCOUNT_ID |  |
| * |  |
|  |  |
| ALIAS_IS_IMMUTABLE |  |
| * |  |
| * |  |
|  |  |
| SPENDER_ACCOUNT_SAME_AS_OWNER |  |
| * |  |
| * |  |
|  |  |
| AMOUNT_EXCEEDS_TOKEN_MAX_SUPPLY |  |
| * |  |
|  |  |
| NEGATIVE_ALLOWANCE_AMOUNT |  |
| * |  |
|  |  |
| CANNOT_APPROVE_FOR_ALL_FUNGIBLE_COMMON |  |
| * |  |
|  |  |
| SPENDER_DOES_NOT_HAVE_ALLOWANCE |  |
| * |  |
|  |  |
| AMOUNT_EXCEEDS_ALLOWANCE |  |
| * |  |
| * |  |
|  |  |
| MAX_ALLOWANCES_EXCEEDED |  |
| * |  |
|  |  |
| EMPTY_ALLOWANCES |  |
| * |  |
| * |  |
|  |  |
| SPENDER_ACCOUNT_REPEATED_IN_ALLOWANCES |  |
| * |  |
|  |  |
| REPEATED_SERIAL_NUMS_IN_NFT_ALLOWANCES |  |
| * |  |
|  |  |
| FUNGIBLE_TOKEN_IN_NFT_ALLOWANCES |  |
| * |  |
|  |  |
| NFT_IN_FUNGIBLE_TOKEN_ALLOWANCES |  |
| * |  |
|  |  |
| INVALID_ALLOWANCE_OWNER_ID |  |
| * |  |
|  |  |
| INVALID_ALLOWANCE_SPENDER_ID |  |
| * |  |
|  |  |
| REPEATED_ALLOWANCES_TO_DELETE |  |
| * |  |
|  |  |
| INVALID_DELEGATING_SPENDER |  |
| * |  |
|  |  |
| DELEGATING_SPENDER_CANNOT_GRANT_APPROVE_FOR_ALL |  |
| * |  |
| * |  |
|  |  |
| DELEGATING_SPENDER_DOES_NOT_HAVE_APPROVE_FOR_ALL |  |
| * |  |
|  |  |
| SCHEDULE_EXPIRATION_TIME_TOO_FAR_IN_FUTURE |  |
| * |  |
|  |  |
| SCHEDULE_EXPIRATION_TIME_MUST_BE_HIGHER_THAN_CONSENSUS_TIME |  |
| * |  |
|  |  |
| SCHEDULE_FUTURE_THROTTLE_EXCEEDED |  |
| * |  |
|  |  |
| SCHEDULE_FUTURE_GAS_LIMIT_EXCEEDED |  |
| * |  |
|  |  |
| INVALID_ETHEREUM_TRANSACTION |  |
| * |  |
|  |  |
| WRONG_CHAIN_ID |  |
| * |  |
|  |  |
| WRONG_NONCE |  |
| * |  |
|  |  |
| ACCESS_LIST_UNSUPPORTED |  |
| * |  |
|  |  |
| SCHEDULE_PENDING_EXPIRATION |  |
| * |  |
|  |  |
| CONTRACT_IS_TOKEN_TREASURY |  |
| * |  |
|  |  |
| CONTRACT_HAS_NON_ZERO_TOKEN_BALANCES |  |
| * |  |
| * |  |
|  |  |
| CONTRACT_EXPIRED_AND_PENDING_REMOVAL |  |
| * |  |
| * |  |
|  |  |
| CONTRACT_HAS_NO_AUTO_RENEW_ACCOUNT |  |
| * |  |
|  |  |
| PERMANENT_REMOVAL_REQUIRES_SYSTEM_INITIATION |  |
| * |  |
|  |  |
| PROXY_ACCOUNT_ID_FIELD_IS_DEPRECATED |  |
| * |  |
|  |  |
| SELF_STAKING_IS_NOT_ALLOWED |  |
| * |  |
|  |  |
| INVALID_STAKING_ID |  |
| * |  |
|  |  |
| STAKING_NOT_ENABLED |  |
| * |  |
|  |  |
| INVALID_PRNG_RANGE |  |
| * |  |
|  |  |
| MAX_ENTITIES_IN_PRICE_REGIME_HAVE_BEEN_CREATED |  |
| * |  |
|  |  |
| INVALID_FULL_PREFIX_SIGNATURE_FOR_PRECOMPILE |  |
| * |  |
| * |  |
|  |  |
| INSUFFICIENT_BALANCES_FOR_STORAGE_RENT |  |
| * |  |
| * |  |
|  |  |
| MAX_CHILD_RECORDS_EXCEEDED |  |
| * |  |
| * |  |
|  |  |
| INSUFFICIENT_BALANCES_FOR_RENEWAL_FEES |  |
| * |  |
| * |  |
|  |  |
| TRANSACTION_HAS_UNKNOWN_FIELDS |  |
| * |  |
|  |  |
| ACCOUNT_IS_IMMUTABLE |  |
| * |  |
|  |  |
| ALIAS_ALREADY_ASSIGNED |  |
| * |  |
|  |  |
| INVALID_METADATA_KEY |  |
| * |  |
|  |  |
| TOKEN_HAS_NO_METADATA_KEY |  |
| * |  |
|  |  |
| MISSING_TOKEN_METADATA |  |
| * |  |
|  |  |
| MISSING_SERIAL_NUMBERS |  |


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


<a name="running_hashes.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## running_hashes.proto

<BR>The running hash of a transaction records and the previous 3 running hashes. All hashes are 48 bytes SHA384 hashes. If the<BR>running hashes do not exist yet then they will be default values witch is empty bytes object or zero length byte array.

<a name="RunningHashes"></a>

### RunningHashes


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| running_hash |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| n_minus_1_running_hash |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| n_minus_2_running_hash |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| n_minus_3_running_hash |  |  | |


<a name="schedulable_transaction_body.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedulable_transaction_body.proto

<BR>A schedulable transaction. Note that the global/dynamic system property<BR><tt>scheduling.whitelist</tt> controls which transaction types may be scheduled. As of Hedera<BR>Services 0.24.0 this list includes <tt>ConsensusSubmitMessage</tt>, <tt>CryptoTransfer</tt>, <tt>TokenMint</tt>, and <tt>TokenBurn</tt><BR>functions.

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
| The | [*](#*) |  | |
|  | [](#) |  | |
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
| | Adds | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoApproveAllowance | [CryptoApproveAllowanceTransactionBody](#CryptoApproveAllowanceTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoDeleteAllowance | [CryptoDeleteAllowanceTransactionBody](#CryptoDeleteAllowanceTransactionBody) |  | |
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
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | token_fee_schedule_update | [TokenFeeScheduleUpdateTransactionBody](#TokenFeeScheduleUpdateTransactionBody) |  | |
| | Pauses | [*](#*) |  | |
| |  | [](#) |  | |
| | token_pause | [TokenPauseTransactionBody](#TokenPauseTransactionBody) |  | |
| | Unpauses | [*](#*) |  | |
| |  | [](#) |  | |
| | token_unpause | [TokenUnpauseTransactionBody](#TokenUnpauseTransactionBody) |  | |
| | Marks | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleDelete | [ScheduleDeleteTransactionBody](#ScheduleDeleteTransactionBody) |  | |
| | Generates | [*](#*) |  | |
| |  | [](#) |  | |
| | util_prng | [UtilPrngTransactionBody](#UtilPrngTransactionBody) |  | |
| | Update | [*](#*) |  | |
| |  | [](#) |  | |
| | token_update_nfts | [TokenUpdateNftsTransactionBody](#TokenUpdateNftsTransactionBody) |  | |


<a name="schedule.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule.proto

<BR>Representation of a Hedera Schedule entry in the network Merkle tree.<BR>As with all network entities, a schedule has a unique entity number, which is usually given along<BR>with the network's shard and realm in the form of a shard.realm.number id.

<a name="Schedule"></a>

### Schedule


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| This | [*](#*) |  | |
|  | [](#) |  | |
| schedule_id | [ScheduleID](#ScheduleID) |  | |
| The | [*](#*) |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| The | [*](#*) |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| executed |  |  | |
| The | [*](#*) |  | |
| A | [*](#*) |  | |
| this | [*](#*) |  | |
| reaches | [*](#*) |  | |
| required | [*](#*) |  | |
| the | [*](#*) |  | |
| Note | [*](#*) |  | |
| was | [*](#*) |  | |
|  | [](#) |  | |
| wait_for_expiry |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
| ScheduleCreate | [*](#*) |  | |
|  | [](#) |  | |
| scheduler_account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| payer_account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| admin_key | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| schedule_valid_start | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| provided_expiration_second |  |  | |
| The | [*](#*) |  | |
| expiration | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| time | [*](#*) |  | |
|  | [](#) |  | |
| calculated_expiration_second |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| resolution_time | [Timestamp](#Timestamp) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduled_transaction | [SchedulableTransactionBody](#SchedulableTransactionBody) |  | |
| The | [*](#*) |  | |
| schedule | [*](#*) |  | |
| which | [*](#*) |  | |
|  | [](#) |  | |
| original_create_transaction | [TransactionBody](#TransactionBody) |  | |
| All | [*](#*) |  | |
| The | [*](#*) |  | |
| sufficient | [*](#*) |  | |
|  | [](#) |  | |
| signatories | [Key](#Key) |  | |


<a name="ScheduleList"></a>

### ScheduleList
<BR>A message for storing a list of schedules in state.<BR>This is used to store lists of schedules that expire at a particular time or that have the same<BR>simplified hash code.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| a | [*](#*) |  | |
|  | [](#) |  | |
| schedules | [Schedule](#Schedule) |  | |


<a name="schedule_create.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_create.proto

<BR>Create a new <i>schedule entity</i> (or simply, <i>schedule</i>) in the network's action queue.<BR>Upon <tt>SUCCESS</tt>, the receipt contains the `ScheduleID` of the created schedule. A schedule<BR>entity includes a <tt>scheduledTransactionBody</tt> to be executed.<BR>When the schedule has collected enough signing Ed25519 keys to satisfy the schedule's signing<BR>requirements, the schedule can be executed.<BR>If Long Term Scheduled Transactions are enabled and <tt>wait_for_expiry</tt> is set to <tt>true</tt>, then the schedule<BR>will execute at it's <tt>expiration_time</tt>.<BR>Otherwise it will execute immediately after the transaction that provided enough Ed25519 keys, a <tt>ScheduleCreate</tt><BR>or <tt>ScheduleSign</tt>.<BR>Upon `SUCCESS`, the receipt also includes the <tt>scheduledTransactionID</tt> to<BR>use to query for the record of the scheduled transaction's execution (if it occurs).<BR>The expiration time of a schedule is controlled by it's <tt>expiration_time</tt>. It remains in state and can be queried<BR>using <tt>GetScheduleInfo</tt> until expiration, no matter if the scheduled transaction has<BR>executed or marked deleted. If Long Term Scheduled Transactions are disabled, the <tt>expiration_time</tt> is always<BR>30 minutes in the future.<BR>If the <tt>adminKey</tt> field is omitted, the resulting schedule is immutable. If the<BR><tt>adminKey</tt> is set, the <tt>ScheduleDelete</tt> transaction can be used to mark it as<BR>deleted. The creator may also specify an optional <tt>memo</tt> whose UTF-8 encoding is at most<BR>100 bytes and does not include the zero byte is also supported.<BR>When a <tt>scheduledTransactionBody</tt> is executed, the<BR>network only charges its payer the service fee, and not the node and network fees. If the<BR>optional <tt>payerAccountID</tt> is set, the network charges this account. Otherwise it charges<BR>the payer of the originating <tt>ScheduleCreate</tt>.<BR>Two <tt>ScheduleCreate</tt> transactions are <i>identical</i> if they are equal in all their<BR>fields other than <tt>payerAccountID</tt>.  (For the <tt>scheduledTransactionBody</tt> field,<BR>"equal" should be understood in the sense of<BR>gRPC object equality in the network software runtime. In particular, a gRPC object with <a<BR>href="https:developers.google.com/protocol-buffers/docs/proto3#unknowns">unknown fields</a> is<BR>not equal to a gRPC object without unknown fields, even if they agree on all known fields.)<BR>A <tt>ScheduleCreate</tt> transaction that attempts to re-create an identical schedule already in<BR>state will receive a receipt with status <tt>IDENTICAL_SCHEDULE_ALREADY_CREATED</tt>; the receipt<BR>will include the <tt>ScheduleID</tt> of the extant schedule, which may be used in a subsequent<BR><tt>ScheduleSign</tt> transaction. (The receipt will also include the <tt>TransactionID</tt> to<BR>use in querying for the receipt or record of the scheduled transaction.)<BR>Other notable response codes include, <tt>INVALID_ACCOUNT_ID</tt>,<BR><tt>UNSCHEDULABLE_TRANSACTION</tt>, <tt>UNRESOLVABLE_REQUIRED_SIGNERS</tt>,<BR><tt>INVALID_SIGNATURE</tt>. For more information please see the section of this documentation on<BR>the <tt>ResponseCode</tt> enum.

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
| An | [*](#*) |  | |
| Defaults | [*](#*) |  | |
|  | [](#) |  | |
| Note: | [*](#*) |  | |
| expire | [*](#*) |  | |
|  | [](#) |  | |
| expiration_time | [Timestamp](#Timestamp) |  | |
| When | [*](#*) |  | |
| of | [*](#*) |  | |
| When | [*](#*) |  | |
| to | [*](#*) |  | |
|  | [](#) |  | |
| Defaults | [*](#*) |  | |
|  | [](#) |  | |
| Setting | [*](#*) |  | |
| For | [*](#*) |  | |
| such | [*](#*) |  | |
| ScheduleSign | [*](#*) |  | |
|  | [](#) |  | |
| Note: | [*](#*) |  | |
| Scheduled | [*](#*) |  | |
| execute | [*](#*) |  | |
| expire | [*](#*) |  | |
|  | [](#) |  | |
| wait_for_expiry |  |  | |


<a name="schedule_delete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_delete.proto

<BR>Marks a schedule in the network's action queue as deleted. Must be signed by the admin key of the<BR>target schedule.  A deleted schedule cannot receive any additional signing keys, nor will it be<BR>executed.<BR>Other notable response codes include, <tt>INVALID_SCHEDULE_ID</tt>, <tt>SCHEDULE_PENDING_EXPIRATION</tt>,<BR><tt>SCHEDULE_ALREADY_DELETED</tt>, <tt>SCHEDULE_ALREADY_EXECUTED</tt>, <tt>SCHEDULE_IS_IMMUTABLE</tt>.<BR>For more information please see the section of this documentation on the <tt>ResponseCode</tt><BR>enum.

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
| Note: | [*](#*) |  | |
| will | [*](#*) |  | |
| expire | [*](#*) |  | |
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
| The | [*](#*) | github.com/hashgraph/hedera-improvement-proposal/blob/master/HIP/hip-198.md">HIP-198</a> for the network-specific IDs. | |
|  | [](#) |  | |
| ledger_id |  |  | |
| When | [*](#*) |  | |
| of | [*](#*) |  | |
| When | [*](#*) |  | |
| to | [*](#*) |  | |
|  | [](#) |  | |
| Note: | [*](#*) |  | |
|  | [](#) |  | |
| wait_for_expiry |  |  | |


<a name="schedule_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_service.proto

<BR>Transactions and queries for the Schedule Service<BR>The Schedule Service allows transactions to be submitted without all the required signatures and<BR>allows anyone to provide the required signatures independently after a transaction has already<BR>been created. The transactions can be executed immediately when all required signatures are received<BR>or at a future date if Long Term Scheduled Transactions are enabled.<BR>Execution:<BR>Scheduled Transactions are executed in two different modes.<BR>1. If Long Term Scheduled Transactions are enabled and <tt>wait_for_expiry</tt> was set to <tt>true</tt> on the<BR><tt>ScheduleCreate</tt>, then the transaction will be executed at the <tt>expiration_time</tt> specified on the<BR><tt>ScheduleCreate</tt>.<BR>2. Otherwise Scheduled Transactions are executed once all required signatures are collected and witnessed.<BR>Every time new signature is provided, a check is performed on the "readiness" of the execution.<BR>The Scheduled Transaction will be executed immediately after the transaction that triggered it.<BR>NOTICE:<BR>A Scheduled Transaction being ready to execute, or even not ready to execute, at the time a <tt>ScheduleCreate</tt> or<BR><tt>ScheduleSign</tt> comes in does not guarantee it will stay that way. Any number of things can happen over time that<BR>impact the transaction.<BR>For example, account keys can change, accounts can be deleted, and account balances can change.<BR>A particularly noteworthy case is if Long Term Scheduled Transactions are enabled and signature requirements for a Scheduled<BR>Transaction change such that existing signatures become sufficient to allow the transaction to go through. In this case the transaction<BR>will execute at expiration_time unless a ScheduleSign comes in to push it through.<BR>Transaction Record:<BR>If a Scheduled Transaction is executed immediately following the transaction that provided all required signatures,<BR>the timestamp of the Scheduled Transaction will be equal to consensusTimestamp + 1 nano, where<BR>consensusTimestamp is the timestamp of the transaction that triggered the execution.<BR>The Transaction ID of the Scheduled Transaction will have the scheduled property set to true and<BR>inherit the <tt>transactionValidStart</tt> and <tt>accountID</tt> from the <tt>ScheduleCreate</tt> transaction.<BR>The <tt>scheduleRef</tt> property of the transaction record will be populated with the <tt>ScheduleID</tt> of the<BR>Scheduled Transaction.<BR>Post execution:<BR>After execution, a Scheduled Transaction will remain in state and can be queried using <tt>GetScheduleInfo</tt> until expiration.<BR>Expiry:<BR>The expiration time of a schedule is controlled by it's <tt>expiration_time</tt>. If Long Term Scheduled Transactions are disabled,<BR>the <tt>expiration_time</tt> is always 30 minutes in the future.<BR>Once a given Scheduled Transaction expires, it will be removed from the ledger and any upcoming<BR>operation referring the ScheduleID will resolve to INVALID_SCHEDULE_ID.

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

<BR>Adds zero or more signing keys to a schedule.<BR>If Long Term Scheduled Transactions are enabled and <tt>wait_for_expiry</tt> was set to <tt>true</tt> on the<BR><tt>ScheduleCreate</tt> then the transaction will always wait till it's `expiration_time` to execute.<BR>Otherwise, if the resulting set of signing keys satisfy the<BR>scheduled transaction's signing requirements, it will be executed immediately after the<BR>triggering <tt>ScheduleSign</tt>.<BR>Upon <tt>SUCCESS</tt>, the receipt includes the <tt>scheduledTransactionID</tt> to use to query<BR>for the record of the scheduled transaction's execution (if it occurs).<BR>Other notable response codes include <tt>INVALID_SCHEDULE_ID</tt>, <tt>SCHEDULE_ALREADY_DELETED</tt>,<BR><tt>SCHEDULE_PENDING_EXPIRATION</tt>, <tt>SCHEDULE_ALREADY_EXPIRED</tt>,<BR><tt>INVALID_ACCOUNT_ID</tt>, <tt>UNRESOLVABLE_REQUIRED_SIGNERS</tt>,<BR><tt>SOME_SIGNATURES_WERE_INVALID</tt>, and <tt>NO_NEW_VALID_SIGNATURES</tt>. For more information<BR>please see the section of this documentation on the <tt>ResponseCode</tt> enum.

<a name="ScheduleSignTransactionBody"></a>

### ScheduleSignTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| scheduleID | [ScheduleID](#ScheduleID) |  | |


<a name="sidecar_file.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## sidecar_file.proto

<BR>A SidecarFile contains a list of TransactionSidecarRecords that are all created<BR>in the same period and related to the same RecordStreamFile.

<a name="SidecarFile"></a>

### SidecarFile


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| List | [*](#*) |  | |
|  | [](#) |  | |
| sidecar_records | [TransactionSidecarRecord](#TransactionSidecarRecord) |  | |


<a name="TransactionSidecarRecord"></a>

### TransactionSidecarRecord
<BR>TransactionSidecarRecord is used to create sidecar records complementing<BR>TransactionRecord and storing additional information about a transaction's execution.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Consensus | [*](#*) |  | |
| transaction | [*](#*) |  | |
| way | [*](#*) |  | |
|  | [](#) |  | |
| consensus_timestamp | [Timestamp](#Timestamp) |  | |
| Whether | [*](#*) |  | |
|  | [](#) |  | |
| migration |  |  | |
| List | [*](#*) |  | |
| In | [*](#*) |  | |
|  | [](#) |  | |
| sidecar_records | oneof |  | |
| | state_changes | [ContractStateChanges](#ContractStateChanges) |  | |
| | actions | [ContractActions](#ContractActions) |  | |
| | bytecode | [ContractBytecode](#ContractBytecode) |  | |


<a name="signature_file.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## signature_file.proto

<BR>The record signature file which is created for each record stream file<BR>that signs the hash of the entire corresponding stream file.

<a name="SignatureFile"></a>

### SignatureFile


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Signature | [*](#*) |  | |
|  | [](#) |  | |
| file_signature | [SignatureObject](#SignatureObject) |  | |
| Metadata | [*](#*) |  | |
|  | [](#) |  | |
| metadata_signature | [SignatureObject](#SignatureObject) |  | |


<a name="SignatureObject"></a>

### SignatureObject
<BR>A Signature defined by its type, length, checksum and signature bytes and the hash that is signed

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| type | [SignatureType](#SignatureType) |  | |
| Signature | [*](#*) |  | |
|  | [](#) |  | |
| length |  |  | |
| Signature | [*](#*) |  | |
|  | [](#) |  | |
| checksum |  |  | |
| Signature | [*](#*) |  | |
|  | [](#) |  | |
| signature |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| hash_object | [HashObject](#HashObject) |  | |


<a name="SignatureType"></a>

### SignatureType
<BR>The signature type

| Enum Name | Description |
| --------- | ----------- |
| SIGNATURE_TYPE_UNKNOWN |  |
| SHA_384_WITH_RSA |  |


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
| ContractGetBytecode  | Query | Response | <BR>Retrieves the runtime code of a contract |
| getBySolidityID  | Query | Response | <BR>Retrieves a contract by its Solidity address |
| getTxRecordByContractID  | Query | Response) {<BR>Always returns an empty record list, as contract accounts are never effective payers for<BR>transactions |
| option deprecated  =  true; |


<a name="staking_node_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## staking_node_info.proto

<BR>Representation of a Hedera Token Service staking info entity in the network Merkle tree.<BR>As with all network entities, staking info is per node and has a unique entity number represented as shard.realm.X.

<a name="StakingNodeInfo"></a>

### StakingNodeInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| this | [*](#*) |  | |
|  | [](#) |  | |
| node_number |  |  | |
| The | [*](#*) |  | |
| participate | [*](#*) |  | |
|  | [](#) |  | |
| min_stake |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| max_stake |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| stake_to_reward |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| stake_to_not_reward |  |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
| stake_to_reward | [*](#*) |  | |
|  | [](#) |  | |
| stake_reward_start |  |  | |
| Tracks | [*](#*) |  | |
| metadata | [*](#*) |  | |
|  | [](#) |  | |
| unclaimed_stake_reward_start |  |  | |
| The | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| stake |  |  | |
| An | [*](#*) |  | |
| is | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| reward_sum_history |  |  | |
| The | [*](#*) |  | |
| at | [*](#*) |  | |
| Sum | [*](#*) |  | |
| If | [*](#*) |  | |
| (node | [*](#*) |  | |
|  | [](#) |  | |
| weight |  |  | |
| The | [*](#*) |  | |
| of | [*](#*) |  | |
| When | [*](#*) |  | |
| to | [*](#*) |  | |
|  | [](#) |  | |
| pending_rewards |  |  | |
| True | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |


<a name="storage_slot.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## storage_slot.proto

<BR>The key of a storage slot. A slot is scoped to a specific contract number.<BR>For each contract, its EVM storage is a mapping of 256-bit keys (or "words") to 256-bit values.

<a name="SlotKey"></a>

### SlotKey


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| contractID | [ContractID](#ContractID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| key |  |  | |


<a name="SlotValue"></a>

### SlotValue
<BR>The value of a contract storage slot. For the EVM, this is a single word.<BR>Because we iterate through all the storage slots for an expired contract<BR>when purging it from state, our slot values also include the words<BR>of the previous and next keys in this contract's storage "list".

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| value |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| previous_key |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| next_key |  |  | |


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


<a name="throttle_usage_snapshots.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## throttle_usage_snapshots.proto

 <<<pbj.java_package = "com.hedera.hapi.node.state.throttles">>> This comment is special code for setting PBJ Compiler java package

<a name="ThrottleUsageSnapshot"></a>

### ThrottleUsageSnapshot


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Used | [*](#*) |  | |
|  | [](#) |  | |
| used |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| last_decision_time | [Timestamp](#Timestamp) |  | |


<a name="ThrottleUsageSnapshots"></a>

### ThrottleUsageSnapshots


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Snapshots | [*](#*) |  | |
|  | [](#) |  | |
| tps_throttles | [ThrottleUsageSnapshot](#ThrottleUsageSnapshot) |  | |
| Snapshots | [*](#*) |  | |
|  | [](#) |  | |
| gas_throttle | [ThrottleUsageSnapshot](#ThrottleUsageSnapshot) |  | |


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


<a name="token.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token.proto

<BR>Representation of a Hedera Token Service token entity in the network Merkle tree.<BR>As with all network entities, a token has a unique entity number, which is usually given along<BR>with the network's shard and realm in the form of a shard.realm.number id.

<a name="Token"></a>

### Token


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token_id | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| name |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| symbol |  |  | |
| The | [*](#*) |  | |
| tokens | [*](#*) |  | |
| Bitcoin | [*](#*) |  | |
| It | [*](#*) |  | |
|  | [](#) |  | |
| decimals |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| total_supply |  |  | |
| The | [*](#*) |  | |
| tokens | [*](#*) |  | |
| of | [*](#*) |  | |
|  | [](#) |  | |
| treasury_account_id | [AccountID](#AccountID) |  | |
| (Optional) | [*](#*) |  | |
| A | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| admin_key | [Key](#Key) |  | |
| (Optional) | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| kyc_key | [Key](#Key) |  | |
| (Optional) | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| freeze_key | [Key](#Key) |  | |
| (Optional) | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| wipe_key | [Key](#Key) |  | |
| (Optional) | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| supply_key | [Key](#Key) |  | |
| (Optional) | [*](#*) |  | |
| changes | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| fee_schedule_key | [Key](#Key) |  | |
| (Optional) | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| pause_key | [Key](#Key) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| last_used_serial_number |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| The | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| token_type | [TokenType](#TokenType) |  | |
| The | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| supply_type | [TokenSupplyType](#TokenSupplyType) |  | |
| The | [*](#*) |  | |
| token's | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
| token | [*](#*) |  | |
| If | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_seconds |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expiration_second |  |  | |
| An | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| max_supply |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| paused |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accounts_frozen_by_default |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| accounts_kyc_granted_by_default |  |  | |
| (Optional) | [*](#*) |  | |
|  | [](#) |  | |
| custom_fees | [CustomFee](#CustomFee) |  | |
| Metadata | [*](#*) |  | |
|  | [](#) |  | |
| metadata |  |  | |
| The | [*](#*) |  | |
| (token | [*](#*) |  | |
|  | [](#) |  | |
| metadata_key | [Key](#Key) |  | |


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

<BR>Burns tokens from the Token's treasury Account. If no Supply Key is defined, the transaction will<BR>resolve to TOKEN_HAS_NO_SUPPLY_KEY.<BR>The operation decreases the Total Supply of the Token. Total supply cannot go below zero.<BR>The amount provided must be in the lowest denomination possible. Example:<BR>Token A has 2 decimals. In order to burn 100 tokens, one must provide amount of 10000. In order<BR>to burn 100.55 tokens, one must provide amount of 10055.<BR>For non fungible tokens the transaction body accepts serialNumbers list of integers as a parameter.<BR>If the serialNumbers don't get filled for non-fungible token type, a INVALID_TOKEN_BURN_AMOUNT response<BR>code will be returned.<BR>If a zero amount is provided for a fungible token type, it will be treated as a regular transaction.<BR>If both amount and serialNumbers get filled, a INVALID_TRANSACTION_BODY response code will be<BR>returned.<BR>If the serialNumbers' list count is greater than the batch size limit global dynamic property, a<BR>BATCH_SIZE_LIMIT_EXCEEDED response code will be returned.<BR>If the serialNumbers list contains a non-positive integer as a serial number, a INVALID_NFT_ID<BR>response code will be returned.

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
| Its | [*](#*) |  | |
|  | [](#) |  | |
| name |  |  | |
| The | [*](#*) |  | |
| Its | [*](#*) |  | |
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
| The | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| pause_key | [Key](#Key) |  | |
| Metadata | [*](#*) |  | |
|  | [](#) |  | |
| metadata |  |  | |
| The | [*](#*) |  | |
| (token | [*](#*) |  | |
|  | [](#) |  | |
| metadata_key | [Key](#Key) |  | |


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
| The | [*](#*) |  | |
|  | [](#) |  | |
| pause_key | [Key](#Key) |  | |
| Specifies | [*](#*) |  | |
|  | [](#) |  | |
| pause_status | [TokenPauseStatus](#TokenPauseStatus) |  | |
| The | [*](#*) | github.com/hashgraph/hedera-improvement-proposal/blob/master/HIP/hip-198.md">HIP-198</a> for the network-specific IDs. | |
|  | [](#) |  | |
| ledger_id |  |  | |
| Represents | [*](#*) |  | |
|  | [](#) |  | |
| metadata |  |  | |
| The | [*](#*) |  | |
| (token | [*](#*) |  | |
|  | [](#) |  | |
| metadata_key | [Key](#Key) |  | |


<a name="token_get_nft_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_get_nft_info.proto

<BR>Applicable only to tokens of type NON_FUNGIBLE_UNIQUE. Gets info on a NFT for a given TokenID (of<BR>type NON_FUNGIBLE_UNIQUE) and serial number

<a name="TokenGetNftInfoQuery"></a>

### TokenGetNftInfoQuery


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
| The | [*](#*) | github.com/hashgraph/hedera-improvement-proposal/blob/master/HIP/hip-198.md">HIP-198</a> for the network-specific IDs. | |
|  | [](#) |  | |
| ledger_id |  |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| spender_id | [AccountID](#AccountID) |  | |


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

<BR>Mints tokens to the Token's treasury Account. If no Supply Key is defined, the transaction will<BR>resolve to TOKEN_HAS_NO_SUPPLY_KEY.<BR>The operation increases the Total Supply of the Token. The maximum total supply a token can have<BR>is 2^63-1.<BR>The amount provided must be in the lowest denomination possible. Example:<BR>Token A has 2 decimals. In order to mint 100 tokens, one must provide amount of 10000. In order<BR>to mint 100.55 tokens, one must provide amount of 10055.<BR>If both amount and metadata list get filled, a INVALID_TRANSACTION_BODY response code will be<BR>returned.<BR>If the metadata list contains metadata which is too large, a METADATA_TOO_LONG response code will<BR>be returned.<BR>If the metadata list is not filled for a non-fungible token type, a INVALID_TOKEN_MINT_AMOUNT response<BR>code will be returned.<BR>If a zero amount is provided for a fungible token type, it will be treated as a regular transaction.<BR>If the metadata list count is greater than the batch size limit global dynamic property, a<BR>BATCH_SIZE_LIMIT_EXCEEDED response code will be returned.

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


<a name="token_pause.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_pause.proto

<BR>Pauses the Token from being involved in any kind of Transaction until it is unpaused.<BR>Must be signed with the Token's pause key.<BR>If the provided token is not found, the transaction will resolve to INVALID_TOKEN_ID.<BR>If the provided token has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If no Pause Key is defined, the transaction will resolve to TOKEN_HAS_NO_PAUSE_KEY.<BR>Once executed the Token is marked as paused and will be not able to be a part of any transaction.<BR>The operation is idempotent - becomes a no-op if the Token is already Paused.

<a name="TokenPauseTransactionBody"></a>

### TokenPauseTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |


<a name="token_relation.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_relation.proto

<BR>Representation of a Hedera Token Service token relationship entity in the network Merkle tree.<BR>As with all network entities, a token relationship has a unique entity number pair, which is represented<BR>with the account and the token involved in the relationship.

<a name="TokenRelation"></a>

### TokenRelation


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token_id | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| account_id | [AccountID](#AccountID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| balance |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| frozen |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| kyc_granted |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| automatic_association |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| previous_token | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| next_token | [TokenID](#TokenID) |  | |


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


<a name="token_unpause.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_unpause.proto

<BR>Unpauses the Token. Must be signed with the Token's pause key.<BR>If the provided token is not found, the transaction will resolve to INVALID_TOKEN_ID.<BR>If the provided token has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If no Pause Key is defined, the transaction will resolve to TOKEN_HAS_NO_PAUSE_KEY.<BR>Once executed the Token is marked as Unpaused and can be used in Transactions.<BR>The operation is idempotent - becomes a no-op if the Token is already unpaused.

<a name="TokenUnpauseTransactionBody"></a>

### TokenUnpauseTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |


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
| Its | [*](#*) |  | |
|  | [](#) |  | |
| symbol |  |  | |
| The | [*](#*) |  | |
| Its | [*](#*) |  | |
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
| The | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| pause_key | [Key](#Key) |  | |
| Metadata | [*](#*) |  | |
|  | [](#) |  | |
| metadata | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |
| The | [*](#*) |  | |
| (token | [*](#*) |  | |
| If | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| metadata_key | [Key](#Key) |  | |


<a name="token_update_nft.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_update_nft.proto

<BR>At consensus, updates an already created Non Fungible Token to the given values.<BR>If no value is given for a field, that field is left unchanged. For an immutable tokens (that is,<BR>a token without an admin key), only the expiry may be updated. Setting any other field in that<BR>case will cause the transaction status to resolve to TOKEN_IS_IMMUTABLE.

<a name="TokenUpdateNftTransactionBody"></a>

### TokenUpdateNftTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nft_id | [NftID](#NftID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| metadata | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |


<a name="token_update_nfts.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_update_nfts.proto

<BR>At consensus, updates an already created Non Fungible Token to the given values.<BR>If no value is given for a field, that field is left unchanged.<BR>Only certain fields such as metadata can be updated.<BR>Updating the metadata of an NFT does not affect its ownership or transferability.<BR>This operation is intended for updating attributes of individual NFTs in a collection.<BR>--- Signing Requirements ---<BR>1. To update metadata of an NFT, the metadata_key of the token should sign the transaction.

<a name="TokenUpdateNftsTransactionBody"></a>

### TokenUpdateNftsTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| token | [TokenID](#TokenID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| serial_numbers |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| metadata | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |


<a name="token_wipe_account.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_wipe_account.proto

<BR>Wipes the provided amount of tokens from the specified Account. Must be signed by the Token's<BR>Wipe key.<BR>If the provided account is not found, the transaction will resolve to INVALID_ACCOUNT_ID.<BR>If the provided account has been deleted, the transaction will resolve to ACCOUNT_DELETED.<BR>If the provided token is not found, the transaction will resolve to INVALID_TOKEN_ID.<BR>If the provided token has been deleted, the transaction will resolve to TOKEN_WAS_DELETED.<BR>If an Association between the provided token and account is not found, the transaction will<BR>resolve to TOKEN_NOT_ASSOCIATED_TO_ACCOUNT.<BR>If Wipe Key is not present in the Token, transaction results in TOKEN_HAS_NO_WIPE_KEY.<BR>If the provided account is the Token's Treasury Account, transaction results in<BR>CANNOT_WIPE_TOKEN_TREASURY_ACCOUNT<BR>On success, tokens are removed from the account and the total supply of the token is decreased by<BR>the wiped amount.<BR>If both amount and serialNumbers get filled, a INVALID_TRANSACTION_BODY response code will be<BR>returned.<BR>If the serialNumbers don't get filled for a non-fungible token type, a INVALID_WIPING_AMOUNT response<BR>code will be returned.<BR>If a zero amount is provided for a fungible token type, it will be treated as a regular transaction.<BR>If the serialNumbers list contains a non-positive integer as a serial number, a INVALID_NFT_ID<BR>response code will be returned.<BR>If the serialNumbers' list count is greater than the batch size limit global dynamic property, a<BR>BATCH_SIZE_LIMIT_EXCEEDED response code will be returned.<BR>The amount provided is in the lowest denomination possible. Example:<BR>Token A has 2 decimals. In order to wipe 100 tokens from account, one must provide amount of<BR>10000. In order to wipe 100.55 tokens, one must provide amount of 10055.

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


<a name="topic.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## topic.proto

<BR>Representation of a Hedera Consensus Service topic in the network Merkle tree.<BR>As with all network entities, a topic has a unique entity number, which is usually given along<BR>with the network's shard and realm in the form of a shard.realm.number id.<BR>A topic consists of just two pieces of data:<BR>1. The total number of messages sent to the topic; and,<BR>2. The running hash of all those messages.<BR>It also has several metadata elements:<BR>1. A consensus expiration time in seconds since the epoch.<BR>2. (Optional) The number of an auto-renew account, in the same shard and realm as the topic, that<BR>has signed a transaction allowing the network to use its balance to automatically extend the topic's<BR>expiration time when it passes.<BR>3. The number of seconds the network should automatically extend the topic's expiration by, if the<BR>topic has a valid auto-renew account, and is not deleted upon expiration.<BR>4. A boolean marking if the topic has been deleted.<BR>5. A memo string whose UTF-8 encoding is at most 100 bytes.<BR>6. (Optional) An admin key whose signature must be active for the topic's metadata to be updated.<BR>7. (Optional) A submit key whose signature must be active for the topic to receive a message.

<a name="Topic"></a>

### Topic


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| topic_id | [TopicID](#TopicID) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| sequence_number |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| expiration_second |  |  | |
| The | [*](#*) |  | |
| upon | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_period |  |  | |
| The | [*](#*) |  | |
| topic's | [*](#*) |  | |
|  | [](#) |  | |
| auto_renew_account_id | [AccountID](#AccountID) |  | |
| Whether | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| When | [*](#*) |  | |
| For | [*](#*) |  | |
| of | [*](#*) |  | |
|  | [](#) |  | |
| See | [*](#*) |  | |
| data | [*](#*) |  | |
|  | [](#) |  | |
| running_hash |  |  | |
| An | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |
| If | [*](#*) |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| admin_key | [Key](#Key) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| submit_key | [Key](#Key) |  | |


<a name="transaction.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction.proto

<BR>A single signed transaction, including all its signatures. The SignatureList will have a<BR>Signature for each Key in the transaction, either explicit or implicit, in the order that they<BR>appear in the transaction. For example, a CryptoTransfer will first have a Signature<BR>corresponding to the Key for the paying account, followed by a Signature corresponding to the Key<BR>for each account that is sending or receiving cryptocurrency in the transfer. Each Transaction<BR>should not have more than 50 levels.<BR>The SignatureList field is deprecated and succeeded by SignatureMap.

<a name="Transaction"></a>

### Transaction


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
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
| The | [*](#*) |  | |
|  | [](#) |  | |
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
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | ethereumTransaction | [EthereumTransactionBody](#EthereumTransactionBody) |  | |
| | Attach | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoAddLiveHash | [CryptoAddLiveHashTransactionBody](#CryptoAddLiveHashTransactionBody) |  | |
| | Adds | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoApproveAllowance | [CryptoApproveAllowanceTransactionBody](#CryptoApproveAllowanceTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoDeleteAllowance | [CryptoDeleteAllowanceTransactionBody](#CryptoDeleteAllowanceTransactionBody) |  | |
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
| | Pauses | [*](#*) |  | |
| |  | [](#) |  | |
| | token_pause | [TokenPauseTransactionBody](#TokenPauseTransactionBody) |  | |
| | Unpauses | [*](#*) |  | |
| |  | [](#) |  | |
| | token_unpause | [TokenUnpauseTransactionBody](#TokenUnpauseTransactionBody) |  | |
| | Creates | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleCreate | [ScheduleCreateTransactionBody](#ScheduleCreateTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleDelete | [ScheduleDeleteTransactionBody](#ScheduleDeleteTransactionBody) |  | |
| | Adds | [*](#*) |  | |
| |  | [](#) |  | |
| | scheduleSign | [ScheduleSignTransactionBody](#ScheduleSignTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | node_stake_update | [NodeStakeUpdateTransactionBody](#NodeStakeUpdateTransactionBody) |  | |
| | Generates | [*](#*) |  | |
| |  | [](#) |  | |
| | util_prng | [UtilPrngTransactionBody](#UtilPrngTransactionBody) |  | |
| | Update | [*](#*) |  | |
| |  | [](#) |  | |
| | token_update_nfts | [TokenUpdateNftsTransactionBody](#TokenUpdateNftsTransactionBody) |  | |


<a name="transaction_contents.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_contents.proto

 <<<pbj.java_package = "com.hedera.hapi.node.transaction">>> This comment is special code for setting PBJ Compiler java package

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
| Whether | [*](#*) |  | |
| top-level | [*](#*) |  | |
|  | [](#) |  | |
| include_child_receipts |  |  | |


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
|  | [](#) |  | |
| duplicateTransactionReceipts | [TransactionReceipt](#TransactionReceipt) |  | |
| The | [*](#*) |  | |
| given | [*](#*) |  | |
|  | [](#) |  | |
| child_transaction_receipts | [TransactionReceipt](#TransactionReceipt) |  | |


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
| Whether | [*](#*) |  | |
| top-level | [*](#*) |  | |
|  | [](#) |  | |
| include_child_records |  |  | |


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
| The | [*](#*) |  | |
| top-level | [*](#*) |  | |
|  | [](#) |  | |
| child_transaction_records | [TransactionRecord](#TransactionRecord) |  | |


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
| In | [*](#*) |  | |
| transaction | [*](#*) |  | |
|  | [](#) |  | |
| parent_consensus_timestamp | [Timestamp](#Timestamp) |  | |
| In | [*](#*) |  | |
| (previously | [*](#*) |  | |
|  | [](#) |  | |
| alias |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| ethereum_hash |  |  | |
| List | [*](#*) |  | |
|  | [](#) |  | |
| paid_staking_rewards | [AccountAmount](#AccountAmount) |  | |
| entropy | oneof |  | |
| | In | [*](#*) |  | |
| |  | [](#) |  | |
| | prng_bytes |  |  | |
| | In | [*](#*) |  | |
| |  | [](#) |  | |
| | prng_number |  |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| evm_address |  |  | |


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


<a name="util_prng.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## util_prng.proto

<BR>Generates a pseudorandom number

<a name="UtilPrngTransactionBody"></a>

### UtilPrngTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| range |  |  | |


<a name="util_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## util_service.proto

<BR>The requests and responses for different utility services.

<a name="UtilService"></a>

### UtilService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| prng  | Transaction | TransactionResponse | <BR>Generates a pseudorandom number. |

