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

- [account_pending_airdrop.proto](#account_pending_airdrop.proto)
  - [AccountPendingAirdrop](#AccountPendingAirdrop)

- [address_book_service.proto](#address_book_service.proto)
  - [AddressBookService](#AddressBookService) (Service)

- [basic_types.proto](#basic_types.proto)
  - [AccountAmount](#AccountAmount)
  - [AccountID](#AccountID)
  - [BlockHashAlgorithm](#BlockHashAlgorithm) (Enum)
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
  - [PendingAirdropId](#PendingAirdropId)
  - [PendingAirdropValue](#PendingAirdropValue)
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
  - [TokenKeyValidation](#TokenKeyValidation) (Enum)
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

- [block.proto](#block.proto)
  - [Block](#Block)

- [block_header.proto](#block_header.proto)
  - [BlockHeader](#BlockHeader)

- [block_info.proto](#block_info.proto)
  - [BlockInfo](#BlockInfo)

- [block_item.proto](#block_item.proto)
  - [BlockItem](#BlockItem)
  - [FilteredItemHash](#FilteredItemHash)

- [block_proof.proto](#block_proof.proto)
  - [BlockProof](#BlockProof)
  - [MerkleSiblingHash](#MerkleSiblingHash)

- [block_service.proto](#block_service.proto)
  - [BlockAccessService](#BlockAccessService) (Service)
  - [BlockItemSet](#BlockItemSet)
  - [BlockNodeService](#BlockNodeService) (Service)
  - [BlockStreamService](#BlockStreamService) (Service)
  - [PublishStreamEndCode](#PublishStreamEndCode) (Enum)
  - [PublishStreamRequest](#PublishStreamRequest)
  - [PublishStreamResponse](#PublishStreamResponse)
  - [PublishStreamResponse.Acknowledgement](#PublishStreamResponse.Acknowledgement)
  - [PublishStreamResponse.BlockAcknowledgement](#PublishStreamResponse.BlockAcknowledgement)
  - [PublishStreamResponse.EndOfStream](#PublishStreamResponse.EndOfStream)
  - [PublishStreamResponse.ItemAcknowledgement](#PublishStreamResponse.ItemAcknowledgement)
  - [PublishStreamResponseCode](#PublishStreamResponseCode) (Enum)
  - [ServerStatusRequest {}.BlockNodeVersions](#ServerStatusRequest {}.BlockNodeVersions)
  - [ServerStatusRequest {}.ServerStatusResponse](#ServerStatusRequest {}.ServerStatusResponse)
  - [SingleBlockRequest](#SingleBlockRequest)
  - [SingleBlockResponse](#SingleBlockResponse)
  - [SingleBlockResponseCode](#SingleBlockResponseCode) (Enum)
  - [StateService](#StateService) (Service)
  - [StateSnapshotRequest](#StateSnapshotRequest)
  - [StateSnapshotResponse](#StateSnapshotResponse)
  - [StateSnapshotResponseCode](#StateSnapshotResponseCode) (Enum)
  - [SubscribeStreamRequest](#SubscribeStreamRequest)
  - [SubscribeStreamResponse](#SubscribeStreamResponse)
  - [SubscribeStreamResponseCode](#SubscribeStreamResponseCode) (Enum)

- [block_stream_info.proto](#block_stream_info.proto)
  - [BlockStreamInfo](#BlockStreamInfo)

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
  - [RunningHashVersion](#RunningHashVersion) (Enum)

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

- [crypto_service.proto](#crypto_service.proto)
  - [ApproveAllowanceOutput {}.CryptoTransferOutput](#ApproveAllowanceOutput {}.CryptoTransferOutput)

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

- [event_consensus_data.proto](#event_consensus_data.proto)
  - [EventConsensusData](#EventConsensusData)

- [event_core.proto](#event_core.proto)
  - [EventCore](#EventCore)

- [event_descriptor.proto](#event_descriptor.proto)
  - [EventDescriptor](#EventDescriptor)

- [event_metadata.proto](#event_metadata.proto)
  - [EventHeader](#EventHeader)

- [event_transaction.proto](#event_transaction.proto)
  - [EventTransaction](#EventTransaction)

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

- [gossip_event.proto](#gossip_event.proto)
  - [GossipEvent](#GossipEvent)

- [hash_object.proto](#hash_object.proto)
  - [HashAlgorithm](#HashAlgorithm) (Enum)
  - [HashObject](#HashObject)

- [ledger_id.proto](#ledger_id.proto)
  - [LedgerId](#LedgerId)
  - [NodeSignature](#NodeSignature)
  - [RosterSignatures](#RosterSignatures)

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

- [network_service.proto](#network_service.proto)

- [network_staking_rewards.proto](#network_staking_rewards.proto)
  - [NetworkStakingRewards](#NetworkStakingRewards)

- [nft.proto](#nft.proto)
  - [Nft](#Nft)

- [node.proto](#node.proto)
  - [Node](#Node)

- [node_create.proto](#node_create.proto)
  - [NodeCreateTransactionBody](#NodeCreateTransactionBody)

- [node_delete.proto](#node_delete.proto)
  - [NodeDeleteTransactionBody](#NodeDeleteTransactionBody)

- [node_stake_update.proto](#node_stake_update.proto)
  - [NodeStake](#NodeStake)
  - [NodeStakeUpdateTransactionBody](#NodeStakeUpdateTransactionBody)

- [node_update.proto](#node_update.proto)
  - [NodeUpdateTransactionBody](#NodeUpdateTransactionBody)

- [platform_state.proto](#platform_state.proto)
  - [Address](#Address)
  - [AddressBook](#AddressBook)
  - [ConsensusSnapshot](#ConsensusSnapshot)
  - [MinimumJudgeInfo](#MinimumJudgeInfo)
  - [NodeId](#NodeId)
  - [PlatformState](#PlatformState)

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

- [record_file_item.proto](#record_file_item.proto)
  - [RecordFileItem](#RecordFileItem)

- [record_stream_file.proto](#record_stream_file.proto)
  - [RecordStreamFile](#RecordStreamFile)
  - [RecordStreamItem](#RecordStreamItem)
  - [SidecarMetadata](#SidecarMetadata)
  - [SidecarType](#SidecarType) (Enum)

- [recordcache.proto](#recordcache.proto)
  - [TransactionReceiptEntries](#TransactionReceiptEntries)
  - [TransactionReceiptEntry](#TransactionReceiptEntry)
  - [TransactionRecordEntry](#TransactionRecordEntry)

- [response.proto](#response.proto)
  - [Response](#Response)

- [response_code.proto](#response_code.proto)
  - [ResponseCodeEnum](#ResponseCodeEnum) (Enum)

- [response_header.proto](#response_header.proto)
  - [ResponseHeader](#ResponseHeader)

- [roster.proto](#roster.proto)
  - [Roster](#Roster)
  - [RosterEntry](#RosterEntry)

- [roster_state.proto](#roster_state.proto)
  - [RosterState](#RosterState)
  - [RoundRosterPair](#RoundRosterPair)

- [round_header.proto](#round_header.proto)
  - [RoundHeader](#RoundHeader)

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

- [schedule_service.proto](#schedule_service.proto)
  - [CreateScheduleOutput](#CreateScheduleOutput)
  - [DeleteScheduleOutput {}.SignScheduleOutput](#DeleteScheduleOutput {}.SignScheduleOutput)

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
  - [CallContractOutput](#CallContractOutput)
  - [CreateContractOutput](#CreateContractOutput)
  - [UpdateContractOutput {}.EthereumOutput](#UpdateContractOutput {}.EthereumOutput)

- [smart_contract_service.proto](#smart_contract_service.proto)
  - [SmartContractService](#SmartContractService) (Service)

- [staking_node_info.proto](#staking_node_info.proto)
  - [StakingNodeInfo](#StakingNodeInfo)

- [state_changes.proto](#state_changes.proto)
  - [MapChangeKey](#MapChangeKey)
  - [MapChangeValue](#MapChangeValue)
  - [MapDeleteChange](#MapDeleteChange)
  - [MapUpdateChange](#MapUpdateChange)
  - [NewStateChange](#NewStateChange)
  - [NewStateType](#NewStateType) (Enum)
  - [QueuePopChange](#QueuePopChange)
  - [QueuePushChange](#QueuePushChange)
  - [RemovedStateChange](#RemovedStateChange)
  - [SingletonUpdateChange](#SingletonUpdateChange)
  - [StateChange](#StateChange)
  - [StateChanges](#StateChanges)
  - [StateIdentifier](#StateIdentifier) (Enum)

- [state_signature_transaction.proto](#state_signature_transaction.proto)
  - [StateSignatureTransaction](#StateSignatureTransaction)

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

- [token_airdrop.proto](#token_airdrop.proto)
  - [TokenAirdropTransactionBody](#TokenAirdropTransactionBody)

- [token_associate.proto](#token_associate.proto)
  - [TokenAssociateTransactionBody](#TokenAssociateTransactionBody)

- [token_burn.proto](#token_burn.proto)
  - [TokenBurnTransactionBody](#TokenBurnTransactionBody)

- [token_cancel_airdrop.proto](#token_cancel_airdrop.proto)
  - [TokenCancelAirdropTransactionBody](#TokenCancelAirdropTransactionBody)

- [token_claim_airdrop.proto](#token_claim_airdrop.proto)
  - [TokenClaimAirdropTransactionBody](#TokenClaimAirdropTransactionBody)

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

- [token_reject.proto](#token_reject.proto)
  - [TokenReference](#TokenReference)
  - [TokenRejectTransactionBody](#TokenRejectTransactionBody)

- [token_relation.proto](#token_relation.proto)
  - [TokenRelation](#TokenRelation)

- [token_revoke_kyc.proto](#token_revoke_kyc.proto)
  - [TokenRevokeKycTransactionBody](#TokenRevokeKycTransactionBody)

- [token_service.proto](#token_service.proto)
  - [CreateTokenOutput {}.TokenAirdropOutput](#CreateTokenOutput {}.TokenAirdropOutput)

- [token_service.proto](#token_service.proto)
  - [TokenService](#TokenService) (Service)

- [token_unfreeze_account.proto](#token_unfreeze_account.proto)
  - [TokenUnfreezeAccountTransactionBody](#TokenUnfreezeAccountTransactionBody)

- [token_unpause.proto](#token_unpause.proto)
  - [TokenUnpauseTransactionBody](#TokenUnpauseTransactionBody)

- [token_update.proto](#token_update.proto)
  - [TokenUpdateTransactionBody](#TokenUpdateTransactionBody)

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

- [transaction_output.proto](#transaction_output.proto)
  - [TransactionOutput](#TransactionOutput)

- [transaction_receipt.proto](#transaction_receipt.proto)
  - [TransactionReceipt](#TransactionReceipt)

- [transaction_record.proto](#transaction_record.proto)
  - [PendingAirdropRecord](#PendingAirdropRecord)
  - [TransactionRecord](#TransactionRecord)

- [transaction_response.proto](#transaction_response.proto)
  - [TransactionResponse](#TransactionResponse)

- [transaction_result.proto](#transaction_result.proto)
  - [TransactionResult](#TransactionResult)

- [tss_message.proto](#tss_message.proto)
  - [TssMessageTransactionBody](#TssMessageTransactionBody)

- [tss_message_map_key.proto](#tss_message_map_key.proto)
  - [TssMessageMapKey](#TssMessageMapKey)

- [tss_vote.proto](#tss_vote.proto)
  - [TssVoteTransactionBody](#TssVoteTransactionBody)

- [tss_vote_map_key.proto](#tss_vote_map_key.proto)
  - [TssVoteMapKey](#TssVoteMapKey)

- [unchecked_submit.proto](#unchecked_submit.proto)
  - [UncheckedSubmitBody](#UncheckedSubmitBody)

- [util_prng.proto](#util_prng.proto)
  - [UtilPrngTransactionBody](#UtilPrngTransactionBody)

- [util_service.proto](#util_service.proto)
  - [UtilService](#UtilService) (Service)

- [util_service.proto](#util_service.proto)
  - [UtilPrngOutput](#UtilPrngOutput)

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
| A | [*](#*) |  | |
| from | [*](#*) |  | |
| The | [*](#*) |  | |
| `PendingAirdropID` | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| pending | [*](#*) |  | |
|  | [](#) |  | |
| head_pending_airdrop_id | [PendingAirdropId](#PendingAirdropId) |  | |
| The | [*](#*) |  | |
| for | [*](#*) |  | |
|  | [](#) |  | |
| number_pending_airdrops |  |  | |


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


<a name="account_pending_airdrop.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## account_pending_airdrop.proto

<BR>A node within a doubly linked list of pending airdrop references.<br/><BR>This internal state message forms the entries in a doubly-linked list<BR>of references to pending airdrop entries that are "owed" by a particular<BR>account as "sender".<BR>Each entry in this list MUST refer to an existing pending airdrop.<br/><BR>The pending airdrop MUST NOT be claimed.<br/><BR>The pending airdrop MUST NOT be canceled.<br/><BR>The pending airdrop `sender` account's `head_pending_airdrop_id` field<BR>MUST match the `pending_airdrop_id` field in this message.<BR>### Record Stream Effects<BR>This value is not currently published in the record stream.

<a name="AccountPendingAirdrop"></a>

### AccountPendingAirdrop


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| pending_airdrop_value | [PendingAirdropValue](#PendingAirdropValue) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| within | [*](#*) |  | |
| account | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [](#) |  | |
| previous_airdrop | [PendingAirdropId](#PendingAirdropId) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| within | [*](#*) |  | |
| account | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [](#) |  | |
| next_airdrop | [PendingAirdropId](#PendingAirdropId) |  | |


<a name="address_book_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## address_book_service.proto

<BR>The Address Book service provides the ability for Hedera network node<BR>administrators to add, update, and remove consensus nodes. This addition,<BR>update, or removal of a consensus node requires governing council approval,<BR>but each node operator may update their own operational attributes without<BR>additional approval, reducing overhead for routine operations.<BR>Most operations are `privileged operations` and require governing council<BR>approval.<BR>### For a node creation transaction.<BR>- The node operator SHALL create a `createNode` transaction.<BR>- The node operator SHALL sign this transaction with the active `key` for<BR>the account to be assigned as the "node account".<BR>- The node operator MUST deliver the signed transaction to the Hedera<BR>council representative.<BR>- The Hedera council representative SHALL arrange for council members to<BR>review and sign the transaction.<BR>- Once sufficient council members have signed the transaction, the<BR>Hedera council representative SHALL submit the transaction to the<BR>network.<BR>- Upon receipt of a valid and signed node creation transaction the network<BR>software SHALL<BR>- Validate the threshold signature for the Hedera governing council<BR>- Validate the signature of the active `key` for the account to be<BR>assigned as the "node account".<BR>- Create the new node in state, this new node SHALL NOT be active in the<BR>network at this time.<BR>- When executing the next `freeze` transaction with `freeze_type` set to<BR>`PREPARE_UPGRADE`, update network configuration and bring the<BR>new node to an active status within the network. The node to be added<BR>SHALL be active in the network following this upgrade.<BR>### For a node deletion transaction.<BR>- The node operator or Hedera council representative SHALL create a<BR>`deleteNode` transaction.<BR>- If the node operator creates the transaction<BR>- The node operator MUST sign this transaction with the active `key`<BR>for the account assigned as the "node account".<BR>- The node operator SHALL deliver the signed transaction to the Hedera<BR>council representative.<BR>- The Hedera council representative SHALL arrange for council members to<BR>review and sign the transaction.<BR>- Once sufficient council members have signed the transaction, the<BR>Hedera council representative SHALL submit the transaction to the<BR>network.<BR>- Upon receipt of a valid and signed node deletion transaction the network<BR>software SHALL<BR>- Validate the threshold signature for the Hedera governing council<BR>- Remove the existing node from network state. The node SHALL still<BR>be active in the network at this time.<BR>- When executing the next `freeze` transaction with `freeze_type` set to<BR>`PREPARE_UPGRADE`, update network configuration and remove the<BR>node to be deleted from the network. The node to be deleted SHALL NOT<BR>be active in the network following this upgrade.<BR>### For a node update transaction.<BR>- The node operator SHALL create an `updateNode` transaction.<BR>- The node operator MUST sign this transaction with the active `key`<BR>assigned as the `admin_key`.<BR>- The node operator SHALL submit the transaction to the<BR>network.  Hedera council approval SHALL NOT be sought for this<BR>transaction<BR>- Upon receipt of a valid and signed node update transaction the network<BR>software SHALL<BR>- If the transaction modifies the value of the "node account",<BR>- Validate the signature of the active `key` for the account<BR>assigned as the _current_ "node account".<BR>- Validate the signature of the active `key` for the account to be<BR>assigned as the _new_ "node account".<BR>- Modify the node information held in network state with the changes<BR>requested in the update transaction. The node changes SHALL NOT be<BR>applied to network configuration, and SHALL NOT affect network<BR>operation at this time.<BR>- When executing the next `freeze` transaction with `freeze_type` set to<BR>`PREPARE_UPGRADE`, update network configuration according to the<BR>modified information in network state. The requested changes SHALL<BR>affect network operation following this upgrade.

<a name="AddressBookService"></a>

### AddressBookService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| createNode  | proto.Transaction | proto.TransactionResponse | <BR>A transaction to create a new consensus node in the network.<BR>address book.<BR><p><BR>This transaction, once complete, SHALL add a new consensus node to the<BR>network state.<br/><BR>The new consensus node SHALL remain in state, but SHALL NOT participate<BR>in network consensus until the network updates the network configuration.<BR><p><BR>Hedera governing council authorization is REQUIRED for this transaction. |
| deleteNode  | proto.Transaction | proto.TransactionResponse | <BR>A transaction to remove a consensus node from the network address<BR>book.<BR><p><BR>This transaction, once complete, SHALL remove the identified consensus<BR>node from the network state.<BR><p><BR>Hedera governing council authorization is REQUIRED for this transaction. |
| updateNode  | proto.Transaction | proto.TransactionResponse | <BR>A transaction to update an existing consensus node from the network<BR>address book.<BR><p><BR>This transaction, once complete, SHALL modify the identified consensus<BR>node state as requested.<BR><p><BR>This transaction is authorized by the node operator |


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


<a name="BlockHashAlgorithm"></a>

### BlockHashAlgorithm
<BR>A specific hash algorithm.<BR>We did not reuse Record Stream `HashAlgorithm` here because in all cases,<BR>currently, this will be `SHA2_384` and if that is the default value then<BR>we can save space by not serializing it, whereas `HASH_ALGORITHM_UNKNOWN`<BR>is the default for Record Stream `HashAlgorithm`.<BR>Note that enum values here MUST NOT match the name of any other enum value<BR>in the same `package`, as protobuf follows `C++` scope rules and all enum<BR>_names_ are treated as global constants within the `package`.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| SHA2_384 |  |


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
| * |  |
|  |  |
| NodeCreate |  |
| * |  |
|  |  |
| NodeUpdate |  |
| * |  |
|  |  |
| NodeDelete |  |
| * |  |
|  |  |
| TokenReject |  |
| * |  |
|  |  |
| TokenAirdrop |  |
| * |  |
|  |  |
| TokenCancelAirdrop |  |
| * |  |
|  |  |
| TokenClaimAirdrop |  |
| * |  |
|  |  |
| TssMessage |  |
| * |  |
|  |  |
| TssVote |  |


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
<BR>The data about a node, including its service endpoints and the Hedera account to be paid for<BR>services provided by the node (that is, queries answered and transactions submitted.)<BR>If the `serviceEndpoint` list is not set, or empty, then the endpoint given by the<BR>(deprecated) `ipAddress` and `portno` fields should be used.<BR>All fields are populated in the 0.0.102 address book file while only fields that start with # are<BR>populated in the 0.0.101 address book file.

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


<a name="PendingAirdropId"></a>

### PendingAirdropId
<BR>A unique, composite, identifier for a pending airdrop.<BR>Each pending airdrop SHALL be uniquely identified by a PendingAirdropId.<BR>A PendingAirdropId SHALL be recorded when created and MUST be provided in any transaction<BR>that would modify that pending airdrop (such as a `claimAirdrop` or `cancelAirdrop`).

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| sender_id | [AccountID](#AccountID) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| receiver_id | [AccountID](#AccountID) |  | |
| token_reference | oneof |  | |
| | A | [*](#*) |  | |
| | This | [*](#*) |  | |
| | This | [*](#*) |  | |
| | non-fungible/unique | [*](#*) |  | |
| |  | [](#) |  | |
| | fungible_token_type | [TokenID](#TokenID) |  | |
| | The | [*](#*) |  | |
| | This | [*](#*) |  | |
| | This | [*](#*) |  | |
| | fungible/common | [*](#*) |  | |
| |  | [](#) |  | |
| | non_fungible_token | [NftID](#NftID) |  | |


<a name="PendingAirdropValue"></a>

### PendingAirdropValue
<BR>A single pending airdrop value.<BR>This message SHALL record the airdrop amount for a fungible/common token.<br/><BR>This message SHOULD be null for a non-fungible/unique token.<br/><BR>If a non-null `PendingAirdropValue` is set for a non-fungible/unique token, the amount<BR>field MUST be `0`.<BR>It is RECOMMENDED that implementations store pending airdrop information as a key-value map<BR>from `PendingAirdropId` to `PendingAirdropValue`, with a `null` value used for non-fungible<BR>pending airdrops.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| An | [*](#*) |  | |
| This | [*](#*) |  | |
| (i.e. | [*](#*) |  | |
| This | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
| set, | [*](#*) |  | |
|  | [](#) |  | |
| amount |  |  | |


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
<BR>Contains the IP address and the port representing a service endpoint of<BR>a Node in a network. Used to reach the Hedera API and submit transactions<BR>to the network.<BR>When the `domain_name` field is set, the `ipAddressV4` field<BR>MUST NOT be set.<br/><BR>When the `ipAddressV4` field is set, the `domain_name` field<BR>MUST NOT be set.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| (e.g. | [*](#*) |  | |
|  | [](#) |  | |
| ipAddressV4 |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| port |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| domain_name | [*](#*) |  | |
| When | [*](#*) |  | |
| When | [*](#*) |  | |
|  | [](#) |  | |
| domain_name |  |  | |


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


<a name="TokenKeyValidation"></a>

### TokenKeyValidation
<BR>Types of validation strategies for token keys.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| FULL_VALIDATION |  |
| * |  |
|  |  |
| NO_VALIDATION |  |


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


<a name="block.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## block.proto

<BR>A single complete Hedera block chain block.<BR>This is a single block structure and SHALL NOT represent the primary<BR>mechanism to transmit a block stream.<br/><BR>The primary mechanism for transmitting block stream data SHALL be to<BR>stream individual block items to the block node(s).<br/><BR>The only delimiter between blocks when streamed SHALL be the `BlockHeader`<BR>item and `BlockProof` item.<BR>This block SHALL be verifiable as correct using only data in the block,<BR>including the `BlockProof`, and public keys for the consensus nodes.

<a name="Block"></a>

### Block


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| Items | [*](#*) |  | |
|  | [*](#*) |  | |
| Items | [*](#*) |  | |
| If | [*](#*) |  | |
| `FilteredBlockItem` | [*](#*) |  | |
|  | [](#) |  | |
| items | [BlockItem](#BlockItem) |  | |


<a name="block_header.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## block_header.proto

<BR>A Block Header.<BR>Each block in the block stream SHALL begin with a block header.<br/><BR>The block header SHALL provide the base minimum information needed to<BR>correctly interpret and process that block, or stop processing<BR>if appropriate.<br/><BR>The block header MUST describe, at minimum, the following items.<BR>- The version of the block stream data<BR>- The block number<BR>- The hash of the previous block<BR>- The hash algorithm used to generate the block hash<BR>All fields of this message are REQUIRED, with the exception that<BR>`hash_algorithm` MAY be _transmitted_ as a default value to improve<BR>data efficiency.

<a name="BlockHeader"></a>

### BlockHeader


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| hapi_proto_version | [proto.SemanticVersion](#proto.SemanticVersion) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| within | [*](#*) |  | |
|  | [](#) |  | |
| software_version | [proto.SemanticVersion](#proto.SemanticVersion) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| Client | [*](#*) |  | |
| reverse | [*](#*) |  | |
| encountered | [*](#*) |  | |
|  | [](#) |  | |
| number |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| block | [*](#*) |  | |
| This | [*](#*) |  | |
| for | [*](#*) |  | |
| Client | [*](#*) |  | |
| `previous_block_proof_hash` | [*](#*) |  | |
| previous | [*](#*) |  | |
| loss, | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| creating | [*](#*) |  | |
| that | [*](#*) |  | |
| The | [*](#*) |  | |
| structured | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| internal | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| two | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| single | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| merkle | [*](#*) |  | |
| the | [*](#*) |  | |
| Input | [*](#*) |  | |
| and | [*](#*) |  | |
| Leaf | [*](#*) |  | |
| same | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| two | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| merkle | [*](#*) |  | |
| the | [*](#*) |  | |
| Output | [*](#*) |  | |
| output, | [*](#*) |  | |
| Leaf | [*](#*) |  | |
| same | [*](#*) |  | |
| in | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| network | [*](#*) |  | |
| 48-byte | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| of | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| previous_block_hash |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| algorithm | [*](#*) |  | |
|  | [](#) |  | |
| first_transaction_consensus_time | [proto.Timestamp](#proto.Timestamp) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| hash_algorithm | [proto.BlockHashAlgorithm](#proto.BlockHashAlgorithm) |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
| key(s) | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| address_book_version | [proto.SemanticVersion](#proto.SemanticVersion) |  | |


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


<a name="block_item.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## block_item.proto

<BR>A single item within a block stream.<BR>Each item in the block stream SHALL be self-contained and independent,<BR>with the following constraints applicable to the _unfiltered_ stream.<BR>- A block SHALL start with a `header`.<BR>- A block SHALL end with a `state_proof`.<BR>- A `block_header` SHALL be followed by an `event_header`.<BR>- An `event_header` SHALL be followed by one or more<BR>`event_transaction` items.<BR>- An `event_transaction` SHALL be followed by a `transaction_result`.<BR>- A `transaction_result` MAY be followed by a `transaction_output`.<BR>- A `transaction_result` (or a `transaction_output`, if present) MAY be<BR>followed by one or more `state_changes`.<BR>This forms the following required sequence for each block, which is then<BR>repeated within the block stream, indefinitely.  Note that there is no<BR>container structure in the stream, the indentation below is only to<BR>highlight repeated subsequences.<br/><BR>The order of items within each block below is REQUIRED and SHALL NOT change.<BR>```text<BR>header<BR>repeated {<BR>start_event<BR>repeated {<BR>event_transaction<BR>transaction_result<BR>(optional) transaction_output<BR>(optional) repeated state_changes<BR>}<BR>}<BR>state_proof<BR>```<BR>A filtered stream may exclude some items above, depending on filter<BR>criteria. A filtered item is replaced with a merkle path and hash value<BR>to maintain block stream verifiability.<BR>A BlockItem SHALL be individually and directly processed to create the<BR>item hash.<br/><BR>Items to be hashed MUST NOT be contained within another item.<br/><BR>Items which might be filtered out of the stream MUST NOT be<BR>contained in other items.

<a name="BlockItem"></a>

### BlockItem


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| item | oneof |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | block_header | [com.hedera.hapi.block.stream.output.BlockHeader](#com.hedera.hapi.block.stream.output.BlockHeader) |  | |
| | An | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | gossip | [*](#*) |  | |
| |  | [](#) |  | |
| | event_header | [com.hedera.hapi.block.stream.input.EventHeader](#com.hedera.hapi.block.stream.input.EventHeader) |  | |
| | An | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | consensus | [*](#*) |  | |
| |  | [](#) |  | |
| | round_header | [com.hedera.hapi.block.stream.input.RoundHeader](#com.hedera.hapi.block.stream.input.RoundHeader) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | single | [*](#*) |  | |
| | Each | [*](#*) |  | |
| | an | [*](#*) |  | |
| | This | [*](#*) |  | |
| | `SignedTransaction` | [*](#*) |  | |
| |  | [](#) |  | |
| | event_transaction | [com.hedera.hapi.platform.event.EventTransaction](#com.hedera.hapi.platform.event.EventTransaction) |  | |
| | The | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | `event_transaction` | [*](#*) |  | |
| | This | [*](#*) |  | |
| | replaced | [*](#*) |  | |
| |  | [](#) |  | |
| | transaction_result | [com.hedera.hapi.block.stream.output.TransactionResult](#com.hedera.hapi.block.stream.output.TransactionResult) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | an | [*](#*) |  | |
| | If | [*](#*) |  | |
| | in | [*](#*) |  | |
| | `transaction_result` | [*](#*) |  | |
| |  | [](#) |  | |
| | transaction_output | [com.hedera.hapi.block.stream.output.TransactionOutput](#com.hedera.hapi.block.stream.output.TransactionOutput) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | All | [*](#*) |  | |
| | stream | [*](#*) |  | |
| | The | [*](#*) |  | |
| | `reason` | [*](#*) |  | |
| |  | [](#) |  | |
| | state_changes | [com.hedera.hapi.block.stream.output.StateChanges](#com.hedera.hapi.block.stream.output.StateChanges) |  | |
| | Verification | [*](#*) |  | |
| | This | [*](#*) |  | |
| | part | [*](#*) |  | |
| |  | [*](#*) |  | |
| | Items | [*](#*) |  | |
| | block | [*](#*) |  | |
| | Items | [*](#*) |  | |
| | (filtered) | [*](#*) |  | |
| | Presence | [*](#*) |  | |
| | of | [*](#*) |  | |
| | consensus | [*](#*) |  | |
| |  | [](#) |  | |
| | filtered_item_hash | [FilteredItemHash](#FilteredItemHash) |  | |
| | A | [*](#*) |  | |
| | The | [*](#*) |  | |
| | a | [*](#*) |  | |
| | root, | [*](#*) |  | |
| | a | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | MUST | [*](#*) |  | |
| |  | [](#) |  | |
| | block_proof | [BlockProof](#BlockProof) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | and | [*](#*) |  | |
| | If | [*](#*) |  | |
| | REQUIRED | [*](#*) |  | |
| |  | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| |  | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| | the | [*](#*) |  | |
| | the | [*](#*) |  | |
| | of | [*](#*) |  | |
| |  | [*](#*) |  | |
| |  | [](#) |  | |
| | record_file | [RecordFileItem](#RecordFileItem) |  | |


<a name="FilteredItemHash"></a>

### FilteredItemHash
<BR>Verification data for an item filtered from the stream.<BR>Items of this type SHALL NOT be present in the full (unfiltered) block<BR>stream.<br/><BR>Items of this type SHALL replace any item removed from a partial (filtered)<BR>block stream.<br/><BR>Presence of `filtered_item` entries SHALL NOT prevent verification<BR>of a block, but MAY preclude verification or reconstruction<BR>of consensus state.<br/>

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| the | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| item_hash |  |  | |
| A | [*](#*) |  | |
| from | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| merkle | [*](#*) |  | |
| item | [*](#*) |  | |
|  | [](#) |  | |
| filtered_path |  |  | |


<a name="block_proof.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## block_proof.proto

<BR>A cryptographic proof for the "Block Merkle Tree".<BR>This message SHALL offer a proof for the "Block Merkle Tree".<BR>The information in the "Block Merkle Tree" SHALL be used to validate the<BR>full content of the most recent block, and, with chained validation,<BR>all prior blocks.<BR>### Block Merkle Tree<BR>The Block Hash of any block is a merkle root hash comprised of a 4 leaf<BR>binary merkle tree. The 4 leaves represent<BR>1. Previous block proof hash<BR>1. Merkle root of transaction inputs tree<BR>1. Merkle root of transaction outputs tree<BR>1. Merkle rook of state tree<BR>#### Computing the hash<BR>The process for computing a block hash is somewhat complex, and involves<BR>creating a "virtual" merkle tree to obtain the root merkle hash of<BR>that virtual tree.<br/><BR>The merkle tree SHALL have a 4 part structure with 2 internal nodes,<BR>structured in a strictly binary tree.<BR>- The merkle tree root SHALL be the parent of both<BR>internal nodes.<BR>1. The first "internal" node SHALL be the parent of the<BR>two "left-most" nodes.<BR>1. The first leaf MUST be the previous block hash, and is a<BR>single 48-byte value.<BR>1. The second leaf MUST be the root of a, strictly binary, merkle tree<BR>composed of all "input" block items in the block.<br/><BR>Input items SHALL be transactions, system transactions,<BR>and events.<br/><BR>Leaf nodes in this subtree SHALL be ordered in the same order<BR>that the block items are encountered in the stream.<BR>1. The second "internal" node SHALL be the parent of the two<BR>"right-most" nodes.<BR>1. The third leaf MUST be the root of a, strictly binary, merkle tree<BR>composed of all "output" block items in the block.<br/><BR>Output items SHALL be transaction result, transaction<BR>output, and state changes.<br/><BR>Leaf nodes in this subtree SHALL be ordered in the same order that<BR>the block items are encountered in the stream.<BR>1. The fourth leaf MUST be the merkle tree root hash for network state<BR>at the start of the block, and is a single 48-byte value.<BR>- The block hash SHALL be the hash calculated for the root of this merkle<BR>tree.<BR>- The hash algorithm used SHALL be the algorithm specified in the<BR>corresponding block header.<BR>The "inputs" and "outputs" subtrees SHALL be "complete" binary merkle trees,<BR>with nodes that would otherwise be missing replaced by a "null" hash<BR>leaf.

<a name="BlockProof"></a>

### BlockProof


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| We | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| under | [*](#*) |  | |
|  | [](#) |  | |
| block |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| previous | [*](#*) |  | |
| The | [*](#*) |  | |
| block | [*](#*) |  | |
|  | [](#) |  | |
| previous_block_root_hash |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| that | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| of | [*](#*) |  | |
| State | [*](#*) |  | |
| independently | [*](#*) |  | |
| State | [*](#*) |  | |
| for | [*](#*) |  | |
| _following_ | [*](#*) |  | |
| Compliant | [*](#*) |  | |
| only | [*](#*) |  | |
| network | [*](#*) |  | |
| the | [*](#*) |  | |
| Stateless | [*](#*) |  | |
| construct | [*](#*) |  | |
|  | [](#) |  | |
| start_of_block_state_root_hash |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| signatures | [*](#*) |  | |
| current | [*](#*) |  | |
| cryptographic | [*](#*) |  | |
| single | [*](#*) |  | |
| but | [*](#*) |  | |
| threshold | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| which | [*](#*) |  | |
| This | [*](#*) |  | |
| that | [*](#*) |  | |
| The | [*](#*) |  | |
| tracked, | [*](#*) |  | |
| threshold | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| block_signature |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| correctly | [*](#*) |  | |
| hash | [*](#*) |  | |
|  | [*](#*) |  | |
| A | [*](#*) |  | |
| a | [*](#*) |  | |
| node | [*](#*) |  | |
| block | [*](#*) |  | |
| blocks | [*](#*) |  | |
| proof | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| this | [*](#*) |  | |
| root | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| first | [*](#*) |  | |
| of | [*](#*) |  | |
| paying | [*](#*) |  | |
| merkle | [*](#*) |  | |
| "secondary" | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| sibling_hashes | [MerkleSiblingHash](#MerkleSiblingHash) |  | |


<a name="MerkleSiblingHash"></a>

### MerkleSiblingHash
<BR>A hash of a "sibling" to an entry in a Merkle tree.<BR>When constructing a binary merkle tree, each internal node is a hash<BR>constructed from the hash of two "descendant" nodes. Those two nodes<BR>are "siblings" and the order (first, second) in which the two hash values<BR>are combined affects the parent hash.<br/><BR>This may be used to reconstruct a portion of a merkle tree starting from<BR>a node of interest up to the root of the tree.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| sibling | [*](#*) |  | |
| If | [*](#*) |  | |
| of | [*](#*) |  | |
|  | [](#) |  | |
| is_first |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| contains | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| sibling_hash |  |  | |


<a name="block_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## block_service.proto

<BR>Publish a stream of block items.<BR>Each request in the stream MUST contain at least one `BlockItem`.<br/><BR>Each request MAY contain more than one `BlockItem`.<br/><BR>A single request MUST NOT contain `BlockItem`s from more than one block.<br/><BR>Each request MAY contain a variable number of `BlockItem`s.<br/><BR>Each Block MUST begin with a single `BlockHeader` block item.<br/><BR>If a `BlockHeader` is present in a request, it MUST be the first `BlockItem`<BR>in the `block_items` list.<br/><BR>The block node SHALL append each `BlockItem` to an internal structure<BR>to reconstruct full blocks.<br/><BR>The block node MUST verify the block proof for each block before sending a<BR>response message acknowledging that block.<br/><BR>Each Block MUST end with a single `BlockProof` block item.<br/><BR>If a `BlockProof` is present in a request, it MUST be the last `BlockItem`<BR>in the `block_items` list.<br/><BR>The block node MUST verify each Block using the `BlockProof` to<BR>ensure all data was received and processed correctly.

<a name="BlockAccessService"></a>

### BlockAccessService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| singleBlock | SingleBlockRequest | SingleBlockResponse | <BR>Read a single block from the block node.<BR><p><BR>The request SHALL describe the block number of the block to retrieve. |


<a name="BlockItemSet"></a>

### BlockItemSet
<BR>A wrapper around a repeated BlockItem.<br/><BR>This message is required so that we can include ordered lists of block<BR>items as `oneof` alternatives in streams.<BR>Each `BlockItemSet` MUST contain at least one `BlockItem`,<BR>and MAY contain up to one full block.<br/><BR>A single `BlockItemSet` SHALL NOT contain block items from<BR>more than one block.<br/><BR>If a `BlockHeader` is present in a `BlockItemSet`, that item<BR>MUST be the first item in the list.<br/><BR>If a `BlockProof` is present in a `BlockItemSet`, that item<BR>MUST be the last item in the list.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| An | [*](#*) |  | |
| This | [*](#*) |  | |
| for | [*](#*) |  | |
|  | [](#) |  | |
| block_items | [com.hedera.hapi.block.stream.BlockItem](#com.hedera.hapi.block.stream.BlockItem) |  | |


<a name="BlockNodeService"></a>

### BlockNodeService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| serverStatus | ServerStatusRequest | ServerStatusResponse | <BR>Read the status of this block node server.<BR><p><BR>A client SHOULD request server status prior to requesting block stream<BR>data or a state snapshot. |


<a name="BlockStreamService"></a>

### BlockStreamService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| publishBlockStream  | stream PublishStreamRequest | stream PublishStreamResponse | <BR>Publish a stream of blocks.<BR><p><BR>Each item in the stream MUST contain one `BlockItem`.<br/><BR>Each Block MUST begin with a single `BlockHeader` block item.<br/><BR>The block node SHALL append each `BlockItem` to an internal structure<BR>to construct full blocks.<br/><BR>Each Block MUST end with a single `BlockStateProof` block item.<br/><BR>It is RECOMMENDED that the implementations verify the Block using the<BR>`BlockStateProof` to validate all data was received correctly.<br/><BR>This API SHOULD, generally, be restricted based on mTLS authentication<BR>to a limited set of source (i.e. consensus node) systems. |
| subscribeBlockStream | SubscribeStreamRequest | stream SubscribeStreamResponse | <BR>Subscribe to a stream of blocks.<BR><p><BR>Each item in the stream SHALL contain one `BlockItem` or a<BR>response code.<br/><BR>The request message MUST specify start and end block numbers<BR>to return/<br/><BR>The block node SHALL stream the full contents of the blocks<BR>requested.<br/><BR>The block items SHALL be streamed in order originally produced within<BR>a block.<br/><BR>The blocks shall be streamed in ascending order by `block_number`.<br/><BR>The block node SHALL end the stream when the last requested block,<BR>if set, has been sent.<br/><BR>A request with an end block of `0` SHALL be interpreted to indicate the<BR>stream has no end. The block node SHALL continue to stream new blocks<BR>as soon as each becomes available.<br/><BR>The block node SHALL end the stream with response code containing a<BR>status of SUCCESS when the stream is complete.<br/><BR>The block node SHALL end the stream with a response code containing a<BR>status of `READ_STREAM_INVALID_START_BLOCK_NUMBER` if the start block<BR>number is greater than the end block number.<br/><BR>The block node SHALL end the stream with a response code containing a<BR>status of `READ_STREAM_PAYMENT_INSUFFICIENT` if insufficient payment<BR>remains to complete the requested stream.<br/><BR>The block node SHALL make every reasonable effort to fulfill as much<BR>of the request as possible in the event payment is not sufficient to<BR>complete the request. |


<a name="PublishStreamEndCode"></a>

### PublishStreamEndCode
<BR>An enumeration indicating why a publisher ended a stream.<BR>This enumeration describes the reason a block stream<BR>(sent via `publishBlockStream`) was ended by the publisher.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
| * |  |
|  |  |
| STREAM_END_UNKNOWN |  |
| * |  |
| * |  |
|  |  |
| * |  |
| * |  |
| * |  |
|  |  |
| STREAM_END_RESET |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| STREAM_END_TIMEOUT |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| STREAM_END_ERROR |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| STREAM_END_TOO_FAR_BEHIND |  |


<a name="PublishStreamRequest"></a>

### PublishStreamRequest


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| request | oneof |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | The | [*](#*) |  | |
| | followed | [*](#*) |  | |
| |  | [](#) |  | |
| | block_items | [BlockItemSet](#BlockItemSet) |  | |


<a name="PublishStreamResponse"></a>

### PublishStreamResponse
<BR>A response to writing a block stream.<BR>This message is sent in response to each Block in a block stream sent<BR>to a block node. The block stream is sent as a stream of messages, and each<BR>message MAY be acknowledged with a message of this type.<br/><BR>Each `BlockItem` MAY be acknowledged with an `Acknowledgement`<BR>response. Item acknowledgement is an OPTIONAL feature.<br/><BR>Each completed block SHALL be acknowledged with an `Acknowledgement`<BR>response. Block acknowledgement is a REQUIRED feature.<br/><BR>A final response SHALL be sent with an `EndOfStream` status result after<BR>the last block stream item is received, or when the receiving system<BR>must end the stream for any reason.<br/><BR>If a failure is detected (which may include a block or block item that<BR>fails validation) an `EndOfStream` response SHALL be sent with a<BR>relevant error status.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| response | oneof |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | acknowledgement | [Acknowledgement](#Acknowledgement) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | status | [EndOfStream](#EndOfStream) |  | |
| A | [*](#*) |  | |
| or | [*](#*) |  | |
|  | [](#) |  | |
| Acknowledgement | [*](#*) |  | |
| Most | [*](#*) |  | |
| debugging | [*](#*) |  | |
|  | [](#) |  | |
| If | [*](#*) |  | |
| send | [*](#*) |  | |
| and | [*](#*) |  | |
|  | [](#) |  | |
| Acknowledgement | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| This | [*](#*) |  | |
| received | [*](#*) |  | |
| The | [*](#*) |  | |
| each | [*](#*) |  | |
| The | [*](#*) |  | |
| `ItemAcknowledgement` | [*](#*) |  | |
| at | [*](#*) |  | |
|  | [](#) |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| This | [*](#*) |  | |
| stream | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| this | [*](#*) |  | |
| the | [*](#*) |  | |
| A | [*](#*) |  | |
| last | [*](#*) |  | |
| here | [*](#*) |  | |
|  | [](#) |  | |


<a name="PublishStreamResponse.Acknowledgement"></a>

### PublishStreamResponse.Acknowledgement


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| acknowledgements | oneof |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | All | [*](#*) |  | |
| |  | [](#) |  | |
| | block_ack | [BlockAcknowledgement](#BlockAcknowledgement) |  | |
| | A | [*](#*) |  | |
| | This | [*](#*) |  | |
| | only | [*](#*) |  | |
| |  | [](#) |  | |
| | item_ack | [ItemAcknowledgement](#ItemAcknowledgement) |  | |


<a name="PublishStreamResponse.BlockAcknowledgement"></a>

### PublishStreamResponse.BlockAcknowledgement


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| block_number |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| root | [*](#*) |  | |
| system | [*](#*) |  | |
|  | [](#) |  | |
| block_root_hash |  |  | |
| A | [*](#*) |  | |
| existing | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| true | [*](#*) |  | |
| returned | [*](#*) |  | |
| system, | [*](#*) |  | |
| after | [*](#*) |  | |
|  | [](#) |  | |
| block_already_exists |  |  | |


<a name="PublishStreamResponse.EndOfStream"></a>

### PublishStreamResponse.EndOfStream


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| status | [PublishStreamResponseCode](#PublishStreamResponseCode) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| Nodes | [*](#*) |  | |
| the | [*](#*) |  | |
| If | [*](#*) |  | |
| stream | [*](#*) |  | |
| (e.g. | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| block_number |  |  | |


<a name="PublishStreamResponse.ItemAcknowledgement"></a>

### PublishStreamResponse.ItemAcknowledgement


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| A | [*](#*) |  | |
| calculated | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| items_hash |  |  | |


<a name="PublishStreamResponseCode"></a>

### PublishStreamResponseCode
<BR>An enumeration indicating the status of this request.<BR>This enumeration SHALL describe the reason a block stream<BR>(sent via `publishBlockStream`) ended.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
| * |  |
|  |  |
| STREAM_ITEMS_UNKNOWN |  |
| * |  |
| * |  |
|  |  |
| STREAM_ITEMS_SUCCESS |  |
| * |  |
| * |  |
|  |  |
| STREAM_ITEMS_TIMEOUT |  |
| * |  |
| * |  |
|  |  |
| STREAM_ITEMS_OUT_OF_ORDER |  |
| * |  |
| * |  |
|  |  |
| STREAM_ITEMS_BAD_STATE_PROOF |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| STREAM_ITEMS_BEHIND |  |


<a name="ServerStatusRequest {}.BlockNodeVersions"></a>

### ServerStatusRequest {}.BlockNodeVersions


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
| this | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| Block | [*](#*) |  | |
|  | [](#) |  | |
| address_book_version | [proto.SemanticVersion](#proto.SemanticVersion) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| Implementations | [*](#*) |  | |
| released | [*](#*) |  | |
| This | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| stream_proto_version | [proto.SemanticVersion](#proto.SemanticVersion) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| software_version | [proto.SemanticVersion](#proto.SemanticVersion) |  | |


<a name="ServerStatusRequest {}.ServerStatusResponse"></a>

### ServerStatusRequest {}.ServerStatusResponse


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| Any | [*](#*) |  | |
| with | [*](#*) |  | |
|  | [](#) |  | |
| first_available_block |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| Any | [*](#*) |  | |
| value | [*](#*) |  | |
|  | [](#) |  | |
| last_available_block |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [](#) |  | |
| only_latest_state |  |  | |
| Version | [*](#*) |  | |
| Versions | [*](#*) |  | |
| buffer | [*](#*) |  | |
|  | [](#) |  | |
| version_information | [BlockNodeVersions](#BlockNodeVersions) |  | |


<a name="SingleBlockRequest"></a>

### SingleBlockRequest
<BR>A request to read a single block.<BR>A client system SHALL send this message to request a single block,<BR>including the block state proof.<br/><BR>A client MAY request that the block be sent without verification.<BR>A compliant Block Node MAY respond to requests that allow unverified<BR>responses by returning the full requested block before verifying<BR>the included block proof.<br/><BR>A compliant Block Node MAY support _only_ requests that allow unverified<BR>blocks, but MUST clearly document that limitation, and MUST respond to<BR>a request that does not allow unverified blocks with the<BR>`ALLOW_UNVERIFIED_REQUIRED` response code.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| unset | [*](#*) |  | |
|  | [](#) |  | |
| block_number |  |  | |
| A | [*](#*) |  | |
| verifying | [*](#*) |  | |
| This | [*](#*) |  | |
| verification | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| block | [*](#*) |  | |
| If | [*](#*) |  | |
| fully | [*](#*) |  | |
| the | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| allow_unverified |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| If | [*](#*) |  | |
| SHALL | [*](#*) |  | |
|  | [](#) |  | |
| retrieve_latest |  |  | |


<a name="SingleBlockResponse"></a>

### SingleBlockResponse
<BR>A response to a `singleBlock` request.<BR>This message SHALL be sent in response to a request, and SHALL contain at<BR>least a valid `status`.<br/><BR>If `status` is `READ_BLOCK_SUCCESS`, the response SHALL contain the<BR>requested block in the `block` field.<BR>> Note<BR>>> A block can become quite large. A client MUST be prepared to receive the<BR>>> full content of the block, perhaps many megabytes of data.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| a | [*](#*) |  | |
|  | [](#) |  | |
| status | [SingleBlockResponseCode](#SingleBlockResponseCode) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| for | [*](#*) |  | |
| The | [*](#*) |  | |
| as | [*](#*) |  | |
| The | [*](#*) |  | |
| a | [*](#*) |  | |
|  | [](#) |  | |
| block | [com.hedera.hapi.block.stream.Block](#com.hedera.hapi.block.stream.Block) |  | |


<a name="SingleBlockResponseCode"></a>

### SingleBlockResponseCode
<BR>An enumeration indicating the status of this request.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_BLOCK_UNKNOWN |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_BLOCK_INSUFFICIENT_BALANCE |  |
| * |  |
| * |  |
|  |  |
| READ_BLOCK_SUCCESS |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_BLOCK_NOT_FOUND |  |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_BLOCK_NOT_AVAILABLE |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| ALLOW_UNVERIFIED_REQUIRED |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| VERIFIED_BLOCK_UNAVAILABLE |  |


<a name="StateService"></a>

### StateService


| RPC | Request | Response | Comments |
| --- | ------- | -------- | -------- |
| stateSnapshot | StateSnapshotRequest | StateSnapshotResponse | <BR>Read a state snapshot from the block node.<BR><p><BR>The request SHALL describe the last block number present in the<BR>snapshot.<br/><BR>Block node implementations MAY decline a request for a snapshot older<BR>than the latest available, but MUST clearly document this behavior. |


<a name="StateSnapshotRequest"></a>

### StateSnapshotRequest
<BR>A request to read a state snapshot.<BR>A state snapshot is a full copy of the network state at the completion of a<BR>particular block.<BR>This request MUST contain a block number that has already reached this block<BR>node and completed verification, or request the "latest" snapshot.<br/><BR>This request MAY specify the "latest" snapshot, and the block node SHALL<BR>respond with a reference to a snapshot containing the most recent contents<BR>of the network state known to that block node.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| and | [*](#*) |  | |
| A | [*](#*) |  | |
| value | [*](#*) |  | |
|  | [](#) |  | |
| last_block_number |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| set | [*](#*) |  | |
| A | [*](#*) |  | |
| set | [*](#*) |  | |
|  | [](#) |  | |
| retrieve_latest |  |  | |


<a name="StateSnapshotResponse"></a>

### StateSnapshotResponse
<BR>A response to a request for a state snapshot.<BR>This message SHALL deliver a _reference_ to the requested snapshot<BR>data if successful.<br/><BR>This message SHALL deliver a code indicating the reason for failure<BR>if unsuccessful.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| reason | [*](#*) |  | |
|  | [](#) |  | |
| status | [StateSnapshotResponseCode](#StateSnapshotResponseCode) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| state | [*](#*) |  | |
|  | [](#) |  | |
| last_block_number |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| <blockquote>REVIEW | [*](#*) |  | |
| This | [*](#*) |  | |
| be | [*](#*) |  | |
| another | [*](#*) |  | |
| node | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| snapshot_reference |  |  | |


<a name="StateSnapshotResponseCode"></a>

### StateSnapshotResponseCode
<BR>An enumeration indicating the status of a StateSnapshotResponse request.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
| * |  |
|  |  |
| STATE_SNAPSHOT_UNKNOWN |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| STATE_SNAPSHOT_INSUFFICIENT_BALANCE |  |
| * |  |
| * |  |
| * |  |
|  |  |
| STATE_SNAPSHOT_SUCCESS |  |


<a name="SubscribeStreamRequest"></a>

### SubscribeStreamRequest
<BR>A request to stream block items from block node to a client.<BR>The block node SHALL respond to this request with a stream of<BR>`SubscribeStreamResponse` messages.<br/><BR>The block node SHALL stream the full contents of the blocks requested.<br/><BR>The block items SHALL be streamed in order originally produced within<BR>a block.<br/><BR>The blocks SHALL be streamed in ascending order by `block_number`.<br/><BR>The block node SHALL end the stream when the last requested block has<BR>been sent.<br/><BR>The block node SHALL end the stream with a response code status of SUCCESS<BR>when the stream is complete.<br/><BR>The client SHOULD call the `serverStatus` rpc prior to constructing this<BR>request to determine the available start and end blocks.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| block | [*](#*) |  | |
|  | [](#) |  | |
| start_block_number |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| indefinitely, | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>This | [*](#*) |  | |
| <li>This | [*](#*) |  | |
| <li>This | [*](#*) |  | |
| from | [*](#*) |  | |
| <li>A | [*](#*) |  | |
| requested | [*](#*) |  | |
| <li>A | [*](#*) |  | |
| that | [*](#*) |  | |
| <li>A | [*](#*) |  | |
| <li>Block | [*](#*) |  | |
| "future" | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| end_block_number |  |  | |
| A | [*](#*) |  | |
| verifying | [*](#*) |  | |
| This | [*](#*) |  | |
| verification | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| blocks | [*](#*) |  | |
| If | [*](#*) |  | |
| fully | [*](#*) |  | |
| If | [*](#*) |  | |
| blocks | [*](#*) |  | |
| a | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| allow_unverified |  |  | |


<a name="SubscribeStreamResponse"></a>

### SubscribeStreamResponse
<BR>One item in a stream of `subscribeBlockStream` responses.<BR>The block node SHALL respond to a `subscribeBlockStream` request with a<BR>stream of `SubscribeStreamResponse` messages.<br/><BR>The block node SHALL stream the full contents of the blocks requested.<br/><BR>The block items SHALL be streamed in order originally produced within<BR>a block.<br/><BR>The blocks SHALL be streamed in ascending order by `block_number`.<br/><BR>The block node SHALL end the stream when the last requested block has<BR>been sent.<br/><BR>The block node SHALL end the stream with a response code status of SUCCESS<BR>when the stream is complete.<br/><BR>The block node SHALL end the stream with a response code status of<BR>`READ_STREAM_INVALID_START_BLOCK_NUMBER` if the start block number is<BR>greater than the end block number.<br/><BR>The block node SHALL end the stream with a response code status of<BR>`READ_STREAM_INSUFFICIENT_BALANCE` if insufficient balance remains to<BR>complete the requested stream.<BR>The block node SHALL make every reasonable effort to fulfill as much of the<BR>request as available balance supports, in the event balance is not<BR>sufficient to complete the request.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| response | oneof |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | status | [SubscribeStreamResponseCode](#SubscribeStreamResponseCode) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | The | [*](#*) |  | |
| | followed | [*](#*) |  | |
| |  | [](#) |  | |
| | block_items | [BlockItemSet](#BlockItemSet) |  | |


<a name="SubscribeStreamResponseCode"></a>

### SubscribeStreamResponseCode
<BR>An enumeration indicating the status of this request.<BR>This response code SHALL be the last message in the stream of responses.<BR>This code SHALL represent the final status of the full request.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_STREAM_UNKNOWN |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_STREAM_INSUFFICIENT_BALANCE |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_STREAM_SUCCESS |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_STREAM_INVALID_START_BLOCK_NUMBER |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| READ_STREAM_INVALID_END_BLOCK_NUMBER |  |


<a name="block_stream_info.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## block_stream_info.proto

<BR>A message stored in state to maintain block stream parameters.<br/><BR>Nodes use this information for three purposes.<BR>1. To maintain hash chain continuity at restart and reconnect boundaries.<BR>1. To store historical hashes for implementation of the EVM `BLOCKHASH`<BR>and `PREVRANDAO` opcodes.<BR>1. To track the amount of consensus time that has passed between blocks.<BR>This value MUST be updated for every block.<br/><BR>This value MUST be transmitted in the "state changes" section of<BR>_each_ block, but MUST be updated at the beginning of the _next_ block.<br/><BR>This value SHALL contain the block hash up to, and including, the<BR>immediately prior completed block.<br/><BR>The state change to update this singleton MUST be the last<BR>block item in this block.

<a name="BlockStreamInfo"></a>

### BlockStreamInfo


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| block_number |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| and | [*](#*) |  | |
| important | [*](#*) |  | |
| This | [*](#*) |  | |
| block | [*](#*) |  | |
|  | [](#) |  | |
| block_time | [proto.Timestamp](#proto.Timestamp) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| is | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| trailing_output_hashes |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| hash | [*](#*) |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| ### | [*](#*) |  | |
| Each | [*](#*) |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| trailing_block_hashes |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| input_tree_root_hash |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| start_of_block_state_hash |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| num_preceding_output_items |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| `BlockItem`s | [*](#*) |  | |
|  | [](#) |  | |
| rightmost_preceding_output_tree_hashes |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| block_end_time | [proto.Timestamp](#proto.Timestamp) |  | |
| Whether | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| after | [*](#*) |  | |
|  | [](#) |  | |
| post_upgrade_work_done |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| creation_software_version | [proto.SemanticVersion](#proto.SemanticVersion) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| at | [*](#*) |  | |
|  | [](#) |  | |
| last_interval_process_time | [proto.Timestamp](#proto.Timestamp) |  | |


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

<BR>Block Stream data for a `createTopic` transaction.<BR>This message SHALL NOT duplicate information already contained in the<BR>original transaction.

<a name="RunningHashVersion"></a>

### RunningHashVersion


| Enum Name | Description |
| --------- | ----------- |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| WITH_MESSAGE_DIGEST_AND_PAYER |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| WITH_MESSAGE_DIGEST |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| WITH_FULL_MESSAGE |  |


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
| If | [*](#*) |  | |
| MUST | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| By | [*](#*) |  | |
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
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| MUST | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
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
| If | [*](#*) |  | |
| MUST | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| By | [*](#*) |  | |
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


<a name="crypto_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## crypto_service.proto

<BR>Block Stream data for a `approveAllowances` transaction.<BR>This message SHALL NOT duplicate information already contained in<BR>the original transaction.

<a name="ApproveAllowanceOutput {}.CryptoTransferOutput"></a>

### ApproveAllowanceOutput {}.CryptoTransferOutput


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Custom | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
|  | [](#) |  | |
| assessed_custom_fees | [proto.AssessedCustomFee](#proto.AssessedCustomFee) |  | |


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
| If | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| MUST | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
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


<a name="event_consensus_data.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## event_consensus_data.proto

<BR>Event Consensus Data.<br/><BR>This message records the critical values produced by consensus for an event.

<a name="EventConsensusData"></a>

### EventConsensusData


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| the | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| consensus_timestamp | [proto.Timestamp](#proto.Timestamp) |  | |
| A | [*](#*) |  | |
| A | [*](#*) |  | |
| since | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| consensus_order |  |  | |


<a name="event_core.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## event_core.proto

<BR>Contains information about an event and its parents.

<a name="EventCore"></a>

### EventCore


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| creator_node_id |  |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| birth_round |  |  | |
| The | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| time_created | [proto.Timestamp](#proto.Timestamp) |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| parents | [EventDescriptor](#EventDescriptor) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| format | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| version | [proto.SemanticVersion](#proto.SemanticVersion) | This field is temporary until birth_round migration is complete. Field number 17 chosen to avoid polluting cheaper 1 byte field numbers 1-16 | |


<a name="event_descriptor.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## event_descriptor.proto

<BR>Unique identifier for an event.

<a name="EventDescriptor"></a>

### EventDescriptor


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| 1. | [*](#*) |  | |
| 2. | [*](#*) |  | |
|  | [](#) |  | |
| hash |  |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| creator_node_id |  |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| birth_round |  |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| generation |  | This field is temporary until birth_round migration is complete. Field number 17 chosen to avoid polluting cheaper 1 byte field numbers 1-16 | |


<a name="event_metadata.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## event_metadata.proto

<BR>A header for a single event.<br/><BR>This message delivers information about an event and its parents.

<a name="EventHeader"></a>

### EventHeader


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| An | [*](#*) |  | |
| This | [*](#*) |  | |
| "parents". | [*](#*) |  | |
|  | [](#) |  | |
| event_core | [com.hedera.hapi.platform.event.EventCore](#com.hedera.hapi.platform.event.EventCore) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| signature |  |  | |


<a name="event_transaction.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## event_transaction.proto

<BR>An Event Transaction gossiped between nodes as part of events.<BR>Each node MUST extract this transaction and process according to the type<BR>of transaction encoded.<br/><BR>Both the platform and the application built on that platform MAY define event<BR>transactions.<br/><BR>The encoded data MUST be a serialized protobuf message.

<a name="EventTransaction"></a>

### EventTransaction


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transaction | oneof |  | |
| | An | [*](#*) |  | |
| |  | [*](#*) |  | |
| | The | [*](#*) |  | |
| | subsystem | [*](#*) |  | |
| | The | [*](#*) |  | |
| |  | [](#) |  | |
| | application_transaction |  |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| |  | [](#) |  | |
| | state_signature_transaction | [StateSignatureTransaction](#StateSignatureTransaction) |  | |


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

<BR>Block Stream data for a `fileAppend` transaction.<BR>This message SHALL NOT duplicate information already contained<BR>in the original transaction.

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


<a name="gossip_event.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## gossip_event.proto

<BR>An event that is sent and received via gossip

<a name="GossipEvent"></a>

### GossipEvent


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| event_core | [EventCore](#EventCore) |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| 1. | [*](#*) |  | |
| 2. | [*](#*) |  | |
|  | [](#) |  | |
| signature |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| event_transaction | [EventTransaction](#EventTransaction) |  | |


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


<a name="ledger_id.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ledger_id.proto

<BR>A ledger identifier.<br/><BR>This message identifies a ledger and is used to verify ledger<BR>signatures in a Threshold Signature Scheme (TSS).<BR>A ledger identifier SHALL be a public key defined according to the TSS<BR>process.<br/><BR>A ledger identifier SHOULD NOT change, but MAY do so in rare<BR>circumstances.<br/><BR>Clients SHOULD always check for the correct ledger identifier, according to<BR>the network roster, before attempting to verify any state proof or other<BR>ledger signature.<BR>### Block Stream Effects<BR>Every block in the Block Stream `BlockProof` SHALL be signed via TSS and<BR>MUST be verified with the ledger identifier current at the _start_ of that<BR>block.<BR>If the ledger identifier changes, the new value MUST be used to validate<BR>Block Proof items after the change.<BR>A change to the ledger identifier SHALL be reported in a State Change for<BR>the block containing that change, which SHALL be verified with the _prior_<BR>ledger identifier.

<a name="LedgerId"></a>

### LedgerId


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| ledger_id |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| round |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| to | [*](#*) |  | |
|  | [](#) |  | |
| ledger_signature |  |  | |
| The | [*](#*) |  | |
| ledger | [*](#*) |  | |
| These | [*](#*) |  | |
| ledger | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| id | [*](#*) |  | |
|  | [](#) |  | |
| roster_signatures | [RosterSignatures](#RosterSignatures) |  | |


<a name="NodeSignature"></a>

### NodeSignature
<BR>A pair of a _RSA_ signature and the node id of the node that created the<BR>signature.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| node_signature |  |  | |


<a name="RosterSignatures"></a>

### RosterSignatures
<BR>A collection of signatures from nodes in a roster.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| roster_hash |  |  | |
| A | [*](#*) |  | |
| NodeSignature | [*](#*) |  | |
|  | [](#) |  | |
| node_signatures | [NodeSignature](#NodeSignature) |  | |


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


<a name="network_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## network_service.proto

 <<<pbj.java_package = "com.hedera.hapi.block.stream.output">>> This comment is special code for setting PBJ Compiler java package

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


<a name="node.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## node.proto

<BR>A single address book node in the network state.<BR>Each node in the network address book SHALL represent a single actual<BR>consensus node that is eligible to participate in network consensus.<BR>Address book nodes SHALL NOT be _globally_ uniquely identified. A given node<BR>is only valid within a single realm and shard combination, so the identifier<BR>for a network node SHALL only be unique within a single realm and shard<BR>combination.

<a name="Node"></a>

### Node


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| Node | [*](#*) |  | |
| but | [*](#*) |  | |
| therefore | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| are | [*](#*) |  | |
|  | [](#) |  | |
| account_id | [proto.AccountID](#proto.AccountID) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| description |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
| consensus | [*](#*) |  | |
| If | [*](#*) |  | |
| all | [*](#*) |  | |
| If | [*](#*) |  | |
| then | [*](#*) |  | |
| SHALL | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
| all | [*](#*) |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| gossip_endpoint | [proto.ServiceEndpoint](#proto.ServiceEndpoint) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
| may | [*](#*) |  | |
| These | [*](#*) |  | |
| Endpoints | [*](#*) |  | |
| NOT | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| service_endpoint | [proto.ServiceEndpoint](#proto.ServiceEndpoint) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| gossip_ca_certificate |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| during | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
| be | [*](#*) |  | |
| the | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| grpc_certificate_hash |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| Each | [*](#*) |  | |
| The | [*](#*) |  | |
| of | [*](#*) |  | |
| Consensus | [*](#*) |  | |
| of | [*](#*) |  | |
|  | [](#) |  | |
| weight |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| update | [*](#*) |  | |
| If | [*](#*) |  | |
| be | [*](#*) |  | |
| If | [*](#*) |  | |
| node | [*](#*) |  | |
|  | [](#) |  | |
| deleted |  |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| admin_key | [proto.Key](#proto.Key) |  | |


<a name="node_create.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## node_create.proto

<BR>A transaction body to add a new consensus node to the network address book.<BR>This transaction body SHALL be considered a "privileged transaction".<BR>This message supports a transaction to create a new node in the network<BR>address book. The transaction, once complete, enables a new consensus node<BR>to join the network, and requires governing council authorization.<BR>- A `NodeCreateTransactionBody` MUST be signed by the governing council.<BR>- A `NodeCreateTransactionBody` MUST be signed by the `Key` assigned to the<BR>`admin_key` field.<BR>- The newly created node information SHALL be added to the network address<BR>book information in the network state.<BR>- The new entry SHALL be created in "state" but SHALL NOT participate in<BR>network consensus and SHALL NOT be present in network "configuration"<BR>until the next "upgrade" transaction (as noted below).<BR>- All new address book entries SHALL be added to the active network<BR>configuration during the next `freeze` transaction with the field<BR>`freeze_type` set to `PREPARE_UPGRADE`.<BR>### Record Stream Effects<BR>Upon completion the newly assigned `node_id` SHALL be in the transaction<BR>receipt.

<a name="NodeCreateTransactionBody"></a>

### NodeCreateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| If | [*](#*) |  | |
| Multiple | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| account_id | [proto.AccountID](#proto.AccountID) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| description |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
| consensus | [*](#*) |  | |
| These | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
| all | [*](#*) |  | |
| All | [*](#*) |  | |
|  | [*](#*) |  | |
| Each | [*](#*) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| all | [*](#*) |  | |
| If | [*](#*) |  | |
| then | [*](#*) |  | |
| MUST | [*](#*) |  | |
|  | [](#) |  | |
| gossip_endpoint | [proto.ServiceEndpoint](#proto.ServiceEndpoint) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
| clients | [*](#*) |  | |
| These | [*](#*) |  | |
| Endpoints | [*](#*) |  | |
| NOT | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| service_endpoint | [proto.ServiceEndpoint](#proto.ServiceEndpoint) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| gossip_ca_certificate |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| during | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
| encoded | [*](#*) |  | |
| the | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| grpc_certificate_hash |  |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| admin_key | [proto.Key](#proto.Key) |  | |


<a name="node_delete.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## node_delete.proto

<BR>A transaction body to delete a node from the network address book.<BR>This transaction body SHALL be considered a "privileged transaction".<BR>- A `NodeDeleteTransactionBody` MUST be signed by the governing council.<BR>- Upon success, the address book entry SHALL enter a "pending delete"<BR>state.<BR>- All address book entries pending deletion SHALL be removed from the<BR>active network configuration during the next `freeze` transaction with<BR>the field `freeze_type` set to `PREPARE_UPGRADE`.<br/><BR>- A deleted address book node SHALL be removed entirely from network state.<BR>- A deleted address book node identifier SHALL NOT be reused.<BR>### Record Stream Effects<BR>Upon completion the "deleted" `node_id` SHALL be in the transaction<BR>receipt.

<a name="NodeDeleteTransactionBody"></a>

### NodeDeleteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |


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


<a name="node_update.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## node_update.proto

<BR>Transaction body to modify address book node attributes.<BR>- This transaction SHALL enable the node operator, as identified by the<BR>`admin_key`, to modify operational attributes of the node.<BR>- This transaction MUST be signed by the active `admin_key` for the node.<BR>- If this transaction sets a new value for the `admin_key`, then both the<BR>current `admin_key`, and the new `admin_key` MUST sign this transaction.<BR>- This transaction SHALL NOT change any field that is not set (is null) in<BR>this transaction body.<BR>- This SHALL create a pending update to the node, but the change SHALL NOT<BR>be immediately applied to the active configuration.<BR>- All pending node updates SHALL be applied to the active network<BR>configuration during the next `freeze` transaction with the field<BR>`freeze_type` set to `PREPARE_UPGRADE`.<BR>### Record Stream Effects<BR>Upon completion the `node_id` for the updated entry SHALL be in the<BR>transaction receipt.

<a name="NodeUpdateTransactionBody"></a>

### NodeUpdateTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| account_id | [proto.AccountID](#proto.AccountID) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| description | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
| consensus | [*](#*) |  | |
| These | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
| all | [*](#*) |  | |
| All | [*](#*) |  | |
|  | [*](#*) |  | |
| Each | [*](#*) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| Hedera | [*](#*) |  | |
| permit | [*](#*) |  | |
| Mainnet | [*](#*) |  | |
| address | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| Solo, | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| gossip_endpoint | [proto.ServiceEndpoint](#proto.ServiceEndpoint) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
| may | [*](#*) |  | |
| These | [*](#*) |  | |
| These | [*](#*) |  | |
| These | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| Each | [*](#*) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| service_endpoint | [proto.ServiceEndpoint](#proto.ServiceEndpoint) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| gossip_ca_certificate | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| during | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
| encoded | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| grpc_certificate_hash | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
| update | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| admin_key | [proto.Key](#proto.Key) |  | |


<a name="platform_state.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## platform_state.proto

<BR>The current state of platform consensus.<br/><BR>This message stores the current consensus data for the platform<BR>in network state.<BR>The platform state SHALL represent the latest round's consensus.<br/><BR>This data SHALL be used to ensure consistency and provide critical data for<BR>restart and reconnect.

<a name="Address"></a>

### Address
<BR>A single network address.<BR>This is one address in the network address book, including all required<BR>information to include that consensus node in the consensus gossip.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| id | [NodeId](#NodeId) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| nickname |  |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| self_name |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| consensus | [*](#*) |  | |
|  | [](#) |  | |
| weight |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| interface | [*](#*) |  | |
| DNS | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| hostname_internal |  |  | |
| Network | [*](#*) |  | |
| This | [*](#*) |  | |
| network | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| port_internal |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| interface | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| hostname_external |  |  | |
| Network | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| port_external |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| signing_certificate |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| agreement_certificate |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| memo |  |  | |


<a name="AddressBook"></a>

### AddressBook
<BR>A network address book.<br/><BR>The address book records the address of every known consensus node that<BR>participates in the network, including `0 weight` nodes.<br/>

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| round |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| All | [*](#*) |  | |
|  | [](#) |  | |
| next_node_id | [NodeId](#NodeId) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| addresses | [Address](#Address) |  | |


<a name="ConsensusSnapshot"></a>

### ConsensusSnapshot
<BR>A consensus snapshot.<br/><BR>This is a snapshot of the consensus state for a particular round.<BR>This message SHALL record consensus data necessary for restart<BR>and reconnect.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| round |  |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| judge_hashes |  |  | |
| A | [*](#*) |  | |
| These | [*](#*) |  | |
|  | [](#) |  | |
| minimum_judge_info_list | [MinimumJudgeInfo](#MinimumJudgeInfo) |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| next_consensus_number |  |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| Depending | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>if | [*](#*) |  | |
| <li>if | [*](#*) |  | |
| <li>if | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| "wall | [*](#*) |  | |
| Consensus | [*](#*) |  | |
|  | [](#) |  | |
| consensus_timestamp | [proto.Timestamp](#proto.Timestamp) |  | |


<a name="MinimumJudgeInfo"></a>

### MinimumJudgeInfo
<BR>Records the minimum ancient indicator for all judges in a particular round.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| round |  |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
| round | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| generation-based | [*](#*) |  | |
|  | [](#) |  | |
| minimum_judge_ancient_threshold |  |  | |


<a name="NodeId"></a>

### NodeId
<BR>A consensus node identifier.<br/><BR>This value uniquely identifies a single consensus node within the network.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| id |  |  | |


<a name="PlatformState"></a>

### PlatformState


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| creation_software_version | [proto.SemanticVersion](#proto.SemanticVersion) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| rounds_non_ancient |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| consensus_snapshot | [ConsensusSnapshot](#ConsensusSnapshot) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
| match | [*](#*) |  | |
|  | [](#) |  | |
| freeze_time | [proto.Timestamp](#proto.Timestamp) |  | |
| A | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| last_frozen_time | [proto.Timestamp](#proto.Timestamp) |  | |
| legacy_running_event_hash |  |  Fields below are to be deprecated in the foreseeable future.<BR>A running event hash.<br/><BR>This is computed by the consensus event stream.<BR><p><BR>This will be _removed_ and the field number reserved once the consensus<BR>event stream is retired. | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| lowest_judge_generation_before_birth_round_mode |  |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
| Will | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| last_round_before_birth_round_mode |  |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| If | [*](#*) |  | |
| version | [*](#*) |  | |
|  | [](#) |  | |
| first_version_in_birth_round_mode | [proto.SemanticVersion](#proto.SemanticVersion) |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| address_book | [AddressBook](#AddressBook) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| most | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| previous_address_book | [AddressBook](#AddressBook) |  | |


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


<a name="record_file_item.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## record_file_item.proto

<BR>A Block Item for record files.<BR>A `RecordFileItem` contains data produced before the innovation of the<BR>Block Stream, when data was stored in files and validated by individual<BR>signature files rather than a block proof.<br/><BR>This item enables a single format, the Block Stream, to carry both<BR>historical and current data; eliminating the need to search two sources for<BR>block and block chain data.<br/><BR>Any block containing this item requires special handling.<BR>- The block SHALL NOT have a `BlockHeader`.<BR>- The block SHALL NOT have a `BlockProof`.<BR>- The block SHALL contain _exactly one_ `RecordFileItem`.<BR>- The block SHALL NOT contain any item other than a `RecordFileItem`.<BR>- The content of the `RecordFileItem` MUST be validated using the<BR>signature data and content provided herein according to the<BR>process used for Record Files prior to the creation of Block Stream.<BR>- This block item only replaces the requirement to read several<BR>individual files from cloud storage services.

<a name="RecordFileItem"></a>

### RecordFileItem


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| Client | [*](#*) |  | |
| reverse | [*](#*) |  | |
| encountered | [*](#*) |  | |
|  | [](#) |  | |
| number |  |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| creation_time | [proto.Timestamp](#proto.Timestamp) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| record_file_contents |  |  | |
| The | [*](#*) |  | |
| Each | [*](#*) |  | |
|  | [](#) |  | |
| sidecar_file_contents |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| hash_algorithm | [proto.BlockHashAlgorithm](#proto.BlockHashAlgorithm) |  | |
| A | [*](#*) |  | |
| These | [*](#*) |  | |
|  | [](#) |  | |
| record_file_hash_signatures |  |  | |


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

<BR>As transactions are handled and records and receipts are created, they are<BR>stored in state for a configured time period (for example, 3 minutes).<BR>During this time, any client can query the node and get the record or receipt<BR>for the transaction. The `TransactionRecordEntry` is the object stored in<BR>state with this information.

<a name="TransactionReceiptEntries"></a>

### TransactionReceiptEntries
<BR>A cache of transaction receipts.<br/><BR>As transactions are handled and receipts are created, they are stored in<BR>state for a configured time limit (perhaps, for example, 3 minutes).<BR>During this time window, any client can query the node and get the receipt<BR>for the transaction. The `TransactionReceiptEntries` is the object stored in<BR>state with this information.<BR>This message SHALL contain a list of `TransactionReceiptEntry` objects.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| entries | [TransactionReceiptEntry](#TransactionReceiptEntry) |  | |


<a name="TransactionReceiptEntry"></a>

### TransactionReceiptEntry
<BR>An entry in the record cache with the receipt for a transaction.<BR>This is the entry stored in state that enables returning the receipt<BR>information when queried by clients.<BR>When a transaction is handled a receipt SHALL be created.<br/><BR>This receipt MUST be stored in state for a configured time limit<BR>(e.g. 3 minutes).<br/><BR>While a receipt is stored, a client MAY query the node and retrieve<BR>the receipt.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| Valid | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| transaction_id | [TransactionID](#TransactionID) |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| status | [ResponseCodeEnum](#ResponseCodeEnum) |  | |


<a name="TransactionRecordEntry"></a>

### TransactionRecordEntry


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| submitted | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| record, | [*](#*) |  | |
| transaction | [*](#*) |  | |
| not | [*](#*) |  | |
|  | [](#) |  | |
| payer_account_id | [AccountID](#AccountID) |  | |
| A | [*](#*) |  | |
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
| * |  |
|  |  |
| TOKEN_HAS_NO_ADMIN_KEY |  |
| * |  |
| * |  |
|  |  |
| NODE_DELETED |  |
| * |  |
| * |  |
|  |  |
| INVALID_NODE_ID |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_GOSSIP_ENDPOINT |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_NODE_ACCOUNT_ID |  |
| * |  |
| * |  |
|  |  |
| INVALID_NODE_DESCRIPTION |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_SERVICE_ENDPOINT |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_GOSSIP_CA_CERTIFICATE |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_GRPC_CERTIFICATE |  |
| * |  |
| * |  |
|  |  |
| INVALID_MAX_AUTO_ASSOCIATIONS |  |
| * |  |
|  |  |
| MAX_NODES_CREATED |  |
| * |  |
|  |  |
| IP_FQDN_CANNOT_BE_SET_FOR_SAME_ENDPOINT |  |
| * |  |
|  |  |
| GOSSIP_ENDPOINT_CANNOT_HAVE_FQDN |  |
| * |  |
|  |  |
| FQDN_SIZE_TOO_LARGE |  |
| * |  |
|  |  |
| INVALID_ENDPOINT |  |
| * |  |
|  |  |
| GOSSIP_ENDPOINTS_EXCEEDED_LIMIT |  |
| * |  |
| * |  |
|  |  |
| TOKEN_REFERENCE_REPEATED |  |
| * |  |
|  |  |
| INVALID_OWNER_ID |  |
| * |  |
|  |  |
| TOKEN_REFERENCE_LIST_SIZE_LIMIT_EXCEEDED |  |
| * |  |
|  |  |
| SERVICE_ENDPOINTS_EXCEEDED_LIMIT |  |
| * |  |
|  |  |
| INVALID_IPV4_ADDRESS |  |
| * |  |
|  |  |
| EMPTY_TOKEN_REFERENCE_LIST |  |
| * |  |
|  |  |
| UPDATE_NODE_ACCOUNT_NOT_ALLOWED |  |
| * |  |
|  |  |
| TOKEN_HAS_NO_METADATA_OR_SUPPLY_KEY |  |
| * |  |
|  |  |
| EMPTY_PENDING_AIRDROP_ID_LIST |  |
| * |  |
|  |  |
| PENDING_AIRDROP_ID_REPEATED |  |
| * |  |
|  |  |
| PENDING_AIRDROP_ID_LIST_TOO_LONG |  |
| * |  |
|  |  |
| PENDING_NFT_AIRDROP_ALREADY_EXISTS |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| ACCOUNT_HAS_PENDING_AIRDROPS |  |
| * |  |
| * |  |
|  |  |
| THROTTLED_AT_CONSENSUS |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_PENDING_AIRDROP_ID |  |
| * |  |
| * |  |
|  |  |
| TOKEN_AIRDROP_WITH_FALLBACK_ROYALTY |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
| * |  |
|  |  |
| INVALID_TOKEN_IN_PENDING_AIRDROP |  |


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


<a name="roster.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## roster.proto

<BR>A single roster in the network state.<BR><p><BR>The roster SHALL be a list of `RosterEntry` objects.

<a name="Roster"></a>

### Roster


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| List | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| roster_entries | [RosterEntry](#RosterEntry) |  | |


<a name="RosterEntry"></a>

### RosterEntry
<BR>A single roster entry in the network state.<BR>Each roster entry SHALL encapsulate the elements required<BR>to manage node participation in the Threshold Signature Scheme (TSS).<br/><BR>All fields except tss_encryption_key are REQUIRED.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| Node | [*](#*) |  | |
| and | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| Each | [*](#*) |  | |
| The | [*](#*) |  | |
| and | [*](#*) |  | |
|  | [](#) |  | |
| weight |  |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| gossip_ca_certificate |  |  | |
| An | [*](#*) |  | |
| This | [*](#*) |  | |
| type | [*](#*) |  | |
| if | [*](#*) |  | |
| we | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| See | [*](#*) | eips.ethereum.org/EIPS/eip-196#encoding'>EIP-196</a> and | |
| <a | [*](#*) | eips.ethereum.org/EIPS/eip-197#encoding'>EIP-197</a><br/> | |
| This | [*](#*) |  | |
| but | [*](#*) |  | |
|  | [](#) |  | |
| tss_encryption_key |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
| consensus | [*](#*) |  | |
| If | [*](#*) |  | |
| all | [*](#*) |  | |
| If | [*](#*) |  | |
| then | [*](#*) |  | |
| SHALL | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| gossip_endpoint | [proto.ServiceEndpoint](#proto.ServiceEndpoint) |  | |


<a name="roster_state.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## roster_state.proto

<BR>The current state of platform rosters.<br/><BR>This message stores a roster data for the platform in network state.<BR>The roster state SHALL encapsulate the incoming candidate roster's hash,<BR>and a list of pairs of round number and active roster hash.<br/><BR>This data SHALL be used to track round numbers and the rosters used in determining the consensus.<br/>

<a name="RosterState"></a>

### RosterState


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| for | [*](#*) |  | |
| A | [*](#*) |  | |
| at | [*](#*) |  | |
|  | [](#) |  | |
| candidate_roster_hash |  |  | |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| round_roster_pairs | [RoundRosterPair](#RoundRosterPair) |  | |


<a name="RoundRosterPair"></a>

### RoundRosterPair
<BR>A pair of round number and active roster hash.<BR><p><BR>This message SHALL encapsulate the round number and the hash of the<BR>active roster used for that round.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| round_number |  |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| active_roster_hash |  |  | |


<a name="round_header.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## round_header.proto

<BR>A header for a single round.<br/><BR>This message delivers information about a consensus round.

<a name="RoundHeader"></a>

### RoundHeader


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| round_number |  |  | |


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
| | Transaction | [*](#*) |  | |
| |  | [](#) |  | |
| | nodeCreate | [com.hedera.hapi.node.addressbook.NodeCreateTransactionBody](#com.hedera.hapi.node.addressbook.NodeCreateTransactionBody) |  | |
| | Transaction | [*](#*) |  | |
| |  | [](#) |  | |
| | nodeUpdate | [com.hedera.hapi.node.addressbook.NodeUpdateTransactionBody](#com.hedera.hapi.node.addressbook.NodeUpdateTransactionBody) |  | |
| | Transaction | [*](#*) |  | |
| |  | [](#) |  | |
| | nodeDelete | [com.hedera.hapi.node.addressbook.NodeDeleteTransactionBody](#com.hedera.hapi.node.addressbook.NodeDeleteTransactionBody) |  | |
| | A | [*](#*) |  | |
| | This | [*](#*) |  | |
| | balances | [*](#*) |  | |
| | for | [*](#*) |  | |
| |  | [*](#*) |  | |
| | Each | [*](#*) |  | |
| |  | [*](#*) |  | |
| | <li>A | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| | token | [*](#*) |  | |
| |  | [*](#*) |  | |
| | When | [*](#*) |  | |
| | rejected | [*](#*) |  | |
| | Custom | [*](#*) |  | |
| | SHALL | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenReject | [TokenRejectTransactionBody](#TokenRejectTransactionBody) |  | |
| | Transaction | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenCancelAirdrop | [TokenCancelAirdropTransactionBody](#TokenCancelAirdropTransactionBody) |  | |
| | Transaction | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenClaimAirdrop | [TokenClaimAirdropTransactionBody](#TokenClaimAirdropTransactionBody) |  | |
| | Transaction | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenAirdrop | [TokenAirdropTransactionBody](#TokenAirdropTransactionBody) |  | |


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


<a name="schedule_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## schedule_service.proto

<BR>Block Stream data for a `createSchedule` transaction.<BR>This message SHALL NOT duplicate information already contained in<BR>the original transaction.

<a name="CreateScheduleOutput"></a>

### CreateScheduleOutput


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| set | [*](#*) |  | |
| transaction | [*](#*) |  | |
| value | [*](#*) |  | |
| is | [*](#*) |  | |
| other | [*](#*) |  | |
|  | [](#) |  | |
| schedule_id | [proto.ScheduleID](#proto.ScheduleID) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| child | [*](#*) |  | |
| signatures | [*](#*) |  | |
| This | [*](#*) |  | |
| executed | [*](#*) |  | |
| This | [*](#*) |  | |
| was | [*](#*) |  | |
| for | [*](#*) |  | |
|  | [](#) |  | |
| scheduled_transaction_id | [proto.TransactionID](#proto.TransactionID) |  | |


<a name="DeleteScheduleOutput {}.SignScheduleOutput"></a>

### DeleteScheduleOutput {}.SignScheduleOutput


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| child | [*](#*) |  | |
| signatures | [*](#*) |  | |
| This | [*](#*) |  | |
| executed | [*](#*) |  | |
| This | [*](#*) |  | |
| was | [*](#*) |  | |
| requirements | [*](#*) |  | |
|  | [](#) |  | |
| scheduled_transaction_id | [proto.TransactionID](#proto.TransactionID) |  | |


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

<BR>Block Stream data for a `contractCallMethod` transaction.<BR>This message SHALL NOT duplicate information already contained in<BR>the original transaction.

<a name="CallContractOutput"></a>

### CallContractOutput


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| contract | [*](#*) |  | |
| transaction | [*](#*) |  | |
| This | [*](#*) |  | |
| produce | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| sidecars | [proto.TransactionSidecarRecord](#proto.TransactionSidecarRecord) |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| call | [*](#*) |  | |
|  | [](#) |  | |
| contract_call_result | [proto.ContractFunctionResult](#proto.ContractFunctionResult) |  | |


<a name="CreateContractOutput"></a>

### CreateContractOutput
<BR>Block Stream data for a `createContract` transaction.<BR>This message SHALL NOT duplicate information already contained in<BR>the original transaction.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| contract | [*](#*) |  | |
| transaction | [*](#*) |  | |
| This | [*](#*) |  | |
| produce | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| sidecars | [proto.TransactionSidecarRecord](#proto.TransactionSidecarRecord) |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| create | [*](#*) |  | |
|  | [](#) |  | |
| contract_create_result | [proto.ContractFunctionResult](#proto.ContractFunctionResult) |  | |


<a name="UpdateContractOutput {}.EthereumOutput"></a>

### UpdateContractOutput {}.EthereumOutput


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| contract | [*](#*) |  | |
| transaction | [*](#*) |  | |
| This | [*](#*) |  | |
| produce | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| sidecars | [proto.TransactionSidecarRecord](#proto.TransactionSidecarRecord) |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| ethereum_hash |  |  | |


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


<a name="state_changes.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## state_changes.proto

<BR>A set of state changes.<BR>Each set of changes in the network deterministically mutates the<BR>current state to a new state, and all nodes MUST apply the same<BR>changes in the same order.<br/><BR>Each change set described in the block stream SHALL describe an<BR>ordered set of mutations which mutate the previous valid state to<BR>produce a new valid state.<br/><BR>The order of state change sets SHALL be determined by the<BR>`consensus_timestamp`, which is a strictly ascending value<BR>determined by network consensus.<BR>### Consensus Timestamp<BR>This value enables a consumer of the block stream to order state<BR>changes by a consistent ascending value that is determined by network<BR>consensus. A primary use case would be to enter state changes in a<BR>time-series database.<br/><BR>This value depends on the cause of the state change.<BR>1. For transactions, this is the transaction consensus timestamp.<BR>1. For events without transactions, this is the consensus timestamp of<BR>the event (round?).<BR>1. For changes that are not the result of a transaction, but still follow<BR>a transaction within an event, this is the consensus timestamp of the<BR>preceding transaction.

<a name="MapChangeKey"></a>

### MapChangeKey
<BR>A key identifying a specific entry in a key-value "virtual map".

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| key_choice | oneof |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | account_id_key | [proto.AccountID](#proto.AccountID) |  | |
| | A | [*](#*) |  | |
| | This | [*](#*) |  | |
| | token | [*](#*) |  | |
| |  | [](#) |  | |
| | token_relationship_key | [proto.TokenAssociation](#proto.TokenAssociation) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | full | [*](#*) |  | |
| |  | [](#) |  | |
| | entity_number_key | [google.protobuf.UInt64Value](#google.protobuf.UInt64Value) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | file_id_key | [proto.FileID](#proto.FileID) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | nft_id_key | [proto.NftID](#proto.NftID) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | proto_bytes_key | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | proto_long_key | [google.protobuf.Int64Value](#google.protobuf.Int64Value) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | proto_string_key | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | schedule_id_key | [proto.ScheduleID](#proto.ScheduleID) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | slot_key_key | [proto.SlotKey](#proto.SlotKey) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | token_id_key | [proto.TokenID](#proto.TokenID) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | topic_id_key | [proto.TopicID](#proto.TopicID) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | contract_id_key | [proto.ContractID](#proto.ContractID) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | pending_airdrop_id_key | [proto.PendingAirdropId](#proto.PendingAirdropId) |  | |


<a name="MapChangeValue"></a>

### MapChangeValue
<BR>A value updated in, or added to, a virtual map.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| value_choice | oneof |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | account_value | [proto.Account](#proto.Account) |  | |
| | An | [*](#*) |  | |
| | In | [*](#*) |  | |
| | to | [*](#*) |  | |
| |  | [](#) |  | |
| | account_id_value | [proto.AccountID](#proto.AccountID) |  | |
| | Compiled | [*](#*) |  | |
| |  | [](#) |  | |
| | bytecode_value | [proto.Bytecode](#proto.Bytecode) |  | |
| | An | [*](#*) |  | |
| |  | [*](#*) |  | |
| | <blockquote>REVIEW | [*](#*) |  | |
| | A | [*](#*) |  | |
| | Do | [*](#*) |  | |
| | Perhaps | [*](#*) |  | |
| | just | [*](#*) |  | |
| | allow | [*](#*) |  | |
| | and | [*](#*) |  | |
| |  | [*](#*) |  | |
| |  | [](#) |  | |
| | file_value | [proto.File](#proto.File) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | nft_value | [proto.Nft](#proto.Nft) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | proto_string_value | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | schedule_value | [proto.Schedule](#proto.Schedule) |  | |
| | A | [*](#*) |  | |
| | An | [*](#*) |  | |
| | scheduled | [*](#*) |  | |
| |  | [](#) |  | |
| | schedule_list_value | [proto.ScheduleList](#proto.ScheduleList) |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | slot_value_value | [proto.SlotValue](#proto.SlotValue) |  | |
| | An | [*](#*) |  | |
| | the | [*](#*) |  | |
| |  | [](#) |  | |
| | staking_node_info_value | [proto.StakingNodeInfo](#proto.StakingNodeInfo) |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | token_value | [proto.Token](#proto.Token) |  | |
| | A | [*](#*) |  | |
| | These | [*](#*) |  | |
| | in | [*](#*) |  | |
| |  | [](#) |  | |
| | token_relation_value | [proto.TokenRelation](#proto.TokenRelation) |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | topic_value | [proto.Topic](#proto.Topic) |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | node_value | [com.hedera.hapi.node.state.addressbook.Node](#com.hedera.hapi.node.state.addressbook.Node) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | account_pending_airdrop_value | [proto.AccountPendingAirdrop](#proto.AccountPendingAirdrop) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | roster_value | [com.hedera.hapi.node.state.roster.Roster](#com.hedera.hapi.node.state.roster.Roster) |  | |


<a name="MapDeleteChange"></a>

### MapDeleteChange
<BR>A removal of a single item from a `VirtualMap`.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| key | [MapChangeKey](#MapChangeKey) |  | |


<a name="MapUpdateChange"></a>

### MapUpdateChange
<BR>An update to a single item in a `VirtualMap`.<br/><BR>Each update consists of a "key" and a "value".<BR>Keys are often identifiers or scalar values.<BR>Values are generally full messages or byte arrays.<BR>The key presented here is not mutable, we do not update map keys.<br/><BR>The value associated to the key provided is updated, or the value is<BR>added and associated with that key.<br/><BR>A change of key would be expressed as removal of the prior key and<BR>an addition for the new key.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| key | [MapChangeKey](#MapChangeKey) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| _after_ | [*](#*) |  | |
| This | [*](#*) |  | |
| from | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| value | [MapChangeValue](#MapChangeValue) |  | |


<a name="NewStateChange"></a>

### NewStateChange
<BR>An addition of a new named state.<BR>Adding a new named state SHALL only require the name and type.<br/><BR>The content of the new state SHALL be filled in via subsequent<BR>state change items specific to the type of state<BR>(e.g. SingletonUpdateChange or MapUpdateChange).

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [](#) |  | |
| state_type | [NewStateType](#NewStateType) |  | |


<a name="NewStateType"></a>

### NewStateType
<BR>An enumeration of the types of named states.<br/><BR>The default, Singleton, is the type of state most frequently<BR>added and removed.

| Enum Name | Description |
| --------- | ----------- |
| SINGLETON |  |
| VIRTUAL_MAP |  |
| QUEUE |  |


<a name="QueuePopChange"></a>

### QueuePopChange
<BR>Removal of an item from a `Queue` state.<br/><BR>The item removed SHALL be the current "front" (or "head") of the queue.<br/><BR>Removing from a queue "head" does not, currently, require additional<BR>information beyond the state name common to all state changes.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |


<a name="QueuePushChange"></a>

### QueuePushChange
<BR>Addition of an item to a `Queue` state.<br/><BR>The new item SHALL be added after the current "last" element in the<BR>queue.<br/><BR>The new item MUST be the same type of value as all other items in the queue.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| value | oneof |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | proto_bytes_element | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | proto_string_element | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |
| | All | [*](#*) |  | |
| |  | [](#) |  | |
| | transaction_receipt_entries_element | [proto.TransactionReceiptEntries](#proto.TransactionReceiptEntries) |  | |


<a name="RemovedStateChange"></a>

### RemovedStateChange
<BR>A removal of a named state.<BR>Removing a named state does not, currently, require additional<BR>information beyond the state name common to all state changes.<br/><BR>A named state, other than a singleton, SHOULD be empty before it is removed.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |


<a name="SingletonUpdateChange"></a>

### SingletonUpdateChange
<BR>An update to a `Singleton` state.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| new_value | oneof |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | The | [*](#*) |  | |
| | SHALL | [*](#*) |  | |
| | <blockquote>REVIEW | [*](#*) |  | |
| | The | [*](#*) |  | |
| | necessary | [*](#*) |  | |
| |  | [](#) |  | |
| | block_info_value | [proto.BlockInfo](#proto.BlockInfo) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | general | [*](#*) |  | |
| |  | [](#) |  | |
| | congestion_level_starts_value | [proto.CongestionLevelStarts](#proto.CongestionLevelStarts) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | The | [*](#*) |  | |
| | identifier | [*](#*) |  | |
| | to | [*](#*) |  | |
| |  | [](#) |  | |
| | entity_number_value | [google.protobuf.UInt64Value](#google.protobuf.UInt64Value) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | rate, | [*](#*) |  | |
| | during | [*](#*) |  | |
| |  | [](#) |  | |
| | exchange_rate_set_value | [proto.ExchangeRateSet](#proto.ExchangeRateSet) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | Network | [*](#*) |  | |
| |  | [](#) |  | |
| | network_staking_rewards_value | [proto.NetworkStakingRewards](#proto.NetworkStakingRewards) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| |  | [*](#*) |  | |
| | The | [*](#*) |  | |
| | array | [*](#*) |  | |
| |  | [](#) |  | |
| | bytes_value | [google.protobuf.BytesValue](#google.protobuf.BytesValue) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | <dl><dt>Note</dt><dd>There | [*](#*) |  | |
| | singleton | [*](#*) |  | |
| |  | [](#) |  | |
| | string_value | [google.protobuf.StringValue](#google.protobuf.StringValue) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | Running | [*](#*) |  | |
| |  | [*](#*) |  | |
| | <blockquote>REVIEW | [*](#*) |  | |
| | Running | [*](#*) |  | |
| | the | [*](#*) |  | |
| | as | [*](#*) |  | |
| | for | [*](#*) |  | |
| | this, | [*](#*) |  | |
| | to | [*](#*) |  | |
| |  | [*](#*) |  | |
| |  | [](#) |  | |
| | running_hashes_value | [proto.RunningHashes](#proto.RunningHashes) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | Throttle | [*](#*) |  | |
| | to | [*](#*) |  | |
| | for | [*](#*) |  | |
| |  | [](#) |  | |
| | throttle_usage_snapshots_value | [proto.ThrottleUsageSnapshots](#proto.ThrottleUsageSnapshots) |  | |
| | A | [*](#*) |  | |
| | An | [*](#*) |  | |
| | "network | [*](#*) |  | |
| | the | [*](#*) |  | |
| |  | [](#) |  | |
| | timestamp_value | [proto.Timestamp](#proto.Timestamp) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | information | [*](#*) |  | |
| |  | [](#) |  | |
| | block_stream_info_value | [com.hedera.hapi.node.state.blockstream.BlockStreamInfo](#com.hedera.hapi.node.state.blockstream.BlockStreamInfo) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | platform_state_value | [com.hedera.hapi.platform.state.PlatformState](#com.hedera.hapi.platform.state.PlatformState) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | roster_state_value | [com.hedera.hapi.node.state.roster.RosterState](#com.hedera.hapi.node.state.roster.RosterState) |  | |


<a name="StateChange"></a>

### StateChange
<BR>A change to any item in the merkle tree.<BR>A State change SHALL represent one mutation of the network state merkle<BR>tree. The state changes published in the block stream MAY be combined<BR>into an ordered set of state mutations that transform the tree from any<BR>initial state to a destination state.<br/><BR>When the full set of state change items from the block stream for a round<BR>is applied to the network state at the start of that round the result<BR>SHALL match the network state at the end of the round.<BR>TODO: Need documentation for how the merkle tree is constructed.<BR>Need to reference that document, stored in platform docs?, here.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
| better | [*](#*) |  | |
| block | [*](#*) |  | |
| to | [*](#*) |  | |
| protobuf | [*](#*) |  | |
| parsed | [*](#*) |  | |
| enum | [*](#*) |  | |
| requires | [*](#*) |  | |
| field | [*](#*) |  | |
| as | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| often | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| state_id |  |  | |
| change_operation | oneof |  | |
| | Addition | [*](#*) |  | |
| | This | [*](#*) |  | |
| |  | [](#) |  | |
| | state_add | [NewStateChange](#NewStateChange) |  | |
| | Removal | [*](#*) |  | |
| | The | [*](#*) |  | |
| | and | [*](#*) |  | |
| |  | [](#) |  | |
| | state_remove | [RemovedStateChange](#RemovedStateChange) |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | singleton_update | [SingletonUpdateChange](#SingletonUpdateChange) |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | map_update | [MapUpdateChange](#MapUpdateChange) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | map_delete | [MapDeleteChange](#MapDeleteChange) |  | |
| | Addition | [*](#*) |  | |
| |  | [](#) |  | |
| | queue_push | [QueuePushChange](#QueuePushChange) |  | |
| | Removal | [*](#*) |  | |
| |  | [](#) |  | |
| | queue_pop | [QueuePopChange](#QueuePopChange) |  | |


<a name="StateChanges"></a>

### StateChanges


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| consensus_timestamp | [proto.Timestamp](#proto.Timestamp) |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
| a | [*](#*) |  | |
|  | [](#) |  | |
| state_changes | [StateChange](#StateChange) |  | |


<a name="StateIdentifier"></a>

### StateIdentifier
<BR>An informational enumeration of all known states.<BR>This enumeration is included here So that people know the mapping from<BR>integer to state "name".<BR>State changes are expressed in terms of changes to named states at the<BR>high level conceptual model of the state type like map key/values or<BR>queue appends. To say which state the change is on we will include an<BR>`integer` number for the state name. This is done for performance and<BR>efficiency as there will be 10s of thousands of state changes in a block.<BR>We use an integer, and provide this enumeration, for the following reasons.<BR>- If we have a extra 8-10 bytes per state change at 40-50K state changes<BR>per second then that is an extra 2.5-4 megabits of bandwidth. Compression<BR>should help a lot but that is not guaranteed.<BR>- When the state name is used as part of complex key in the big state<BR>merkle map. The smaller the key is, in bytes, the more efficient the<BR>database is, because more keys can fit in a single disk page.<BR>- When parsing keys, parsing a UTF-8 string to a Java String is a many<BR>times more expensive than parsing a VARINT to an integer.<BR>Note: This enumeration is never transmitted directly in the block stream.<BR>This enumeration is provided for clients to _interpret_ the value<BR>of the `StateChange`.`state_id` field.

| Enum Name | Description |
| --------- | ----------- |
| * |  |
|  |  |
| STATE_ID_TOPICS |  |
| * |  |
|  |  |
| STATE_ID_ENTITY_ID |  |
| * |  |
|  |  |
| STATE_ID_ACCOUNTS |  |
| * |  |
|  |  |
| STATE_ID_ALIASES |  |
| * |  |
|  |  |
| STATE_ID_CONTRACT_STORAGE |  |
| * |  |
|  |  |
| STATE_ID_CONTRACT_BYTECODE |  |
| * |  |
|  |  |
| STATE_ID_FILES |  |
| * |  |
|  |  |
| STATE_ID_TOKENS |  |
| * |  |
|  |  |
| STATE_ID_NFTS |  |
| * |  |
|  |  |
| STATE_ID_TOKEN_RELATIONS |  |
| * |  |
|  |  |
| STATE_ID_STAKING_INFO |  |
| * |  |
|  |  |
| STATE_ID_NETWORK_REWARDS |  |
| * |  |
|  |  |
| STATE_ID_THROTTLE_USAGE |  |
| * |  |
|  |  |
| STATE_ID_CONGESTION_STARTS |  |
| * |  |
|  |  |
| STATE_ID_SCHEDULES_BY_ID |  |
| * |  |
|  |  |
| STATE_ID_SCHEDULES_BY_EXPIRY |  |
| * |  |
|  |  |
| STATE_ID_SCHEDULES_BY_EQUALITY |  |
| * |  |
|  |  |
| STATE_ID_MIDNIGHT_RATES |  |
| * |  |
|  |  |
| STATE_ID_RUNNING_HASHES |  |
| * |  |
|  |  |
| STATE_ID_BLOCK_INFO |  |
| * |  |
|  |  |
| STATE_ID_NODES |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_FILE |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_FILE_HASH |  |
| * |  |
|  |  |
| STATE_ID_FREEZE_TIME |  |
| * |  |
|  |  |
| STATE_ID_BLOCK_STREAM_INFO |  |
| * |  |
|  |  |
| STATE_ID_PENDING_AIRDROPS |  |
| * |  |
|  |  |
| STATE_ID_PLATFORM_STATE |  |
| * |  |
|  |  |
| STATE_ID_ROSTER_STATE |  |
| * |  |
|  |  |
| STATE_ID_ROSTERS |  |
| * |  |
|  |  |
| STATE_ID_TRANSACTION_RECEIPTS_QUEUE |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_150 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_151 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_152 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_153 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_154 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_155 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_156 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_157 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_158 |  |
| * |  |
|  |  |
| STATE_ID_UPGRADE_DATA_159 |  |


<a name="state_signature_transaction.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## state_signature_transaction.proto

<BR>An signature of a state snapshot gossiped to other nodes.<BR>Each node SHALL hash the root of the merkle tree of a state snapshot every<BR>round. Once this hash is calculated, it SHOULD be signed with the nodes<BR>private signing key. This signature, together with the hash SHOULD be added<BR>to an event as a StateSignatureTransaction.

<a name="StateSignatureTransaction"></a>

### StateSignatureTransaction


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| The | [*](#*) |  | |
| being | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| round |  |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| signature |  |  | |
| The | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| hash |  |  | |


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


<a name="token_airdrop.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_airdrop.proto

<BR>Airdrop one or more tokens to one or more accounts.<BR>### Effects<BR>This distributes tokens from the balance of one or more sending account(s) to the balance<BR>of one or more recipient accounts. Accounts MAY receive the tokens in one of four ways.<BR>- An account already associated to the token to be distributed SHALL receive the<BR>airdropped tokens immediately to the recipient account balance.<br/><BR>The fee for this transfer SHALL include the transfer, the airdrop fee, and any custom fees.<BR>- An account with available automatic association slots SHALL be automatically<BR>associated to the token, and SHALL immediately receive the airdropped tokens to the<BR>recipient account balance.<br/><BR>The fee for this transfer SHALL include the transfer, the association, the cost to renew<BR>that association once, the airdrop fee, and any custom fees.<BR>- An account with "receiver signature required" set SHALL have a "Pending Airdrop" created<BR>and must claim that airdrop with a `claimAirdrop` transaction.<br/><BR>The fee for this transfer SHALL include the transfer, the association, the cost to renew<BR>that association once, the airdrop fee, and any custom fees. If the pending airdrop is not<BR>claimed immediately, the `sender` SHALL pay the cost to renew the token association, and<BR>the cost to maintain the pending airdrop, until the pending airdrop is claimed or cancelled.<BR>- An account with no available automatic association slots SHALL have a "Pending Airdrop"<BR>created and must claim that airdrop with a `claimAirdrop` transaction.<br/><BR>The fee for this transfer SHALL include the transfer, the association, the cost to renew<BR>that association once, the airdrop fee, and any custom fees. If the pending airdrop is not<BR>claimed immediately, the `sender` SHALL pay the cost to renew the token association, and<BR>the cost to maintain the pending airdrop, until the pending airdrop is claimed or cancelled.<BR>If an airdrop would create a pending airdrop for a fungible/common token, and a pending airdrop<BR>for the same sender, receiver, and token already exists, the existing pending airdrop<BR>SHALL be updated to add the new amount to the existing airdrop, rather than creating a new<BR>pending airdrop.<BR>Any airdrop that completes immediately SHALL be irreversible. Any airdrop that results in a<BR>"Pending Airdrop" MAY be canceled via a `cancelAirdrop` transaction.<BR>All transfer fees (including custom fees and royalties), as well as the rent cost for the<BR>first auto-renewal period for any automatic-association slot occupied by the airdropped<BR>tokens, SHALL be charged to the account paying for this transaction.<BR>### Record Stream Effects<BR>- Each successful transfer SHALL be recorded in `token_transfer_list` for the transaction record.<BR>- Each successful transfer that consumes an automatic association slot SHALL populate the<BR>`automatic_association` field for the record.<BR>- Each pending transfer _created_ SHALL be added to the `pending_airdrops` field for the record.<BR>- Each pending transfer _updated_ SHALL be added to the `pending_airdrops` field for the record.

<a name="TokenAirdropTransactionBody"></a>

### TokenAirdropTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [](#) |  | |
| All | [*](#*) |  | |
| for | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| Note | [*](#*) |  | |
| a | [*](#*) |  | |
| TokenTransferList | [*](#*) |  | |
|  | [](#) |  | |
| token_transfers | [TokenTransferList](#TokenTransferList) |  | |


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


<a name="token_cancel_airdrop.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_cancel_airdrop.proto

<BR>Token cancel airdrop<br/><BR>Remove one or more pending airdrops from state on behalf of the sender(s)<BR>for each airdrop.<BR>Each pending airdrop canceled SHALL be removed from state and SHALL NOT be available to claim.<br/><BR>Each cancellation SHALL be represented in the transaction body and SHALL NOT be restated<BR>in the record file.<br/><BR>All cancellations MUST succeed for this transaction to succeed.

<a name="TokenCancelAirdropTransactionBody"></a>

### TokenCancelAirdropTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| wishes | [*](#*) |  | |
| will | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| each | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| pending_airdrops | [PendingAirdropId](#PendingAirdropId) |  | |


<a name="token_claim_airdrop.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_claim_airdrop.proto

<BR>Token claim airdrop<br/><BR>Complete one or more pending transfers on behalf of the<BR>recipient(s) for an airdrop.<BR>The sender MUST have sufficient balance to fulfill the airdrop at the<BR>time of claim. If the sender does not have sufficient balance, the<BR>claim SHALL fail.<br/><BR>Each pending airdrop successfully claimed SHALL be removed from state and<BR>SHALL NOT be available to claim again.<br/><BR>Each claim SHALL be represented in the transaction body and<BR>SHALL NOT be restated in the record file.<br/><BR>All claims MUST succeed for this transaction to succeed.<BR>### Record Stream Effects<BR>The completed transfers SHALL be present in the transfer list.

<a name="TokenClaimAirdropTransactionBody"></a>

### TokenClaimAirdropTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| the | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| pending_airdrops | [PendingAirdropId](#PendingAirdropId) |  | |


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


<a name="token_reject.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## token_reject.proto

<BR>Reject undesired token(s).<br/><BR>Transfer one or more token balances held by the requesting account to the treasury for each<BR>token type.<br/><BR>Each transfer SHALL be one of the following<BR>- A single non-fungible/unique token.<BR>- The full balance held for a fungible/common token type.<BR>A single tokenReject transaction SHALL support a maximum of 10 transfers.<BR>### Transaction Record Effects<BR>- Each successful transfer from `payer` to `treasury` SHALL be recorded in `token_transfer_list` for the transaction record.

<a name="TokenReference"></a>

### TokenReference
<BR>A union token identifier.<BR>Identify a fungible/common token type, or a single non-fungible/unique token serial.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| token_identifier | oneof |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | fungible_token | [TokenID](#TokenID) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | nft | [NftID](#NftID) |  | |


<a name="TokenRejectTransactionBody"></a>

### TokenRejectTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| An | [*](#*) |  | |
| If | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [](#) |  | |
| owner | [AccountID](#AccountID) |  | |
| A | [*](#*) |  | |
| On | [*](#*) |  | |
| the | [*](#*) |  | |
| After | [*](#*) |  | |
| if | [*](#*) |  | |
|  | [](#) |  | |
| rejections | [TokenReference](#TokenReference) |  | |


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

<BR>Block Stream data for a `createToken` transaction.<BR>This message SHALL NOT duplicate information already contained in<BR>the original transaction.

<a name="CreateTokenOutput {}.TokenAirdropOutput"></a>

### CreateTokenOutput {}.TokenAirdropOutput


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| Custom | [*](#*) |  | |
|  | [*](#*) |  | |
| These | [*](#*) |  | |
|  | [](#) |  | |
| assessed_custom_fees | [proto.AssessedCustomFee](#proto.AssessedCustomFee) |  | |


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
| Determines | [*](#*) |  | |
|  | [](#) |  | |
| key_verification_mode | [TokenKeyValidation](#TokenKeyValidation) |  | |


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
| | Delete | [*](#*) |  | |
| |  | [](#) |  | |
| | contractDeleteInstance | [ContractDeleteTransactionBody](#ContractDeleteTransactionBody) |  | |
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
| | token_fee_schedule_update | [TokenFeeScheduleUpdateTransactionBody](#TokenFeeScheduleUpdateTransactionBody) |  | |
| | Pauses | [*](#*) |  | |
| |  | [](#) |  | |
| | token_pause | [TokenPauseTransactionBody](#TokenPauseTransactionBody) |  | |
| | Unpauses | [*](#*) |  | |
| |  | [](#) |  | |
| | token_unpause | [TokenUnpauseTransactionBody](#TokenUnpauseTransactionBody) |  | |
| | Adds | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoApproveAllowance | [CryptoApproveAllowanceTransactionBody](#CryptoApproveAllowanceTransactionBody) |  | |
| | Deletes | [*](#*) |  | |
| |  | [](#) |  | |
| | cryptoDeleteAllowance | [CryptoDeleteAllowanceTransactionBody](#CryptoDeleteAllowanceTransactionBody) |  | |
| | An | [*](#*) |  | |
| |  | [](#) |  | |
| | ethereumTransaction | [EthereumTransactionBody](#EthereumTransactionBody) |  | |
| | Updates | [*](#*) |  | |
| |  | [](#) |  | |
| | node_stake_update | [NodeStakeUpdateTransactionBody](#NodeStakeUpdateTransactionBody) |  | |
| | Generates | [*](#*) |  | |
| |  | [](#) |  | |
| | util_prng | [UtilPrngTransactionBody](#UtilPrngTransactionBody) |  | |
| | Update | [*](#*) |  | |
| |  | [](#) |  | |
| | token_update_nfts | [TokenUpdateNftsTransactionBody](#TokenUpdateNftsTransactionBody) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | that | [*](#*) |  | |
| |  | [](#) |  | |
| | nodeCreate | [com.hedera.hapi.node.addressbook.NodeCreateTransactionBody](#com.hedera.hapi.node.addressbook.NodeCreateTransactionBody) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | the | [*](#*) |  | |
| |  | [](#) |  | |
| | nodeUpdate | [com.hedera.hapi.node.addressbook.NodeUpdateTransactionBody](#com.hedera.hapi.node.addressbook.NodeUpdateTransactionBody) |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | the | [*](#*) |  | |
| |  | [](#) |  | |
| | nodeDelete | [com.hedera.hapi.node.addressbook.NodeDeleteTransactionBody](#com.hedera.hapi.node.addressbook.NodeDeleteTransactionBody) |  | |
| | A | [*](#*) |  | |
| | This | [*](#*) |  | |
| | balances | [*](#*) |  | |
| | for | [*](#*) |  | |
| |  | [*](#*) |  | |
| | Each | [*](#*) |  | |
| |  | [*](#*) |  | |
| | <li>A | [*](#*) |  | |
| | <li>The | [*](#*) |  | |
| | token | [*](#*) |  | |
| |  | [*](#*) |  | |
| | When | [*](#*) |  | |
| | rejected | [*](#*) |  | |
| | Custom | [*](#*) |  | |
| | SHALL | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenReject | [TokenRejectTransactionBody](#TokenRejectTransactionBody) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenAirdrop | [TokenAirdropTransactionBody](#TokenAirdropTransactionBody) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenCancelAirdrop | [TokenCancelAirdropTransactionBody](#TokenCancelAirdropTransactionBody) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | tokenClaimAirdrop | [TokenClaimAirdropTransactionBody](#TokenClaimAirdropTransactionBody) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | tssMessage | [com.hedera.hapi.services.auxiliary.tss.TssMessageTransactionBody](#com.hedera.hapi.services.auxiliary.tss.TssMessageTransactionBody) |  | |
| | A | [*](#*) |  | |
| |  | [](#) |  | |
| | tssVote | [com.hedera.hapi.services.auxiliary.tss.TssVoteTransactionBody](#com.hedera.hapi.services.auxiliary.tss.TssVoteTransactionBody) |  | |


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


<a name="transaction_output.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_output.proto

<BR>Output from a transaction.<BR>The values in transaction outputs SHALL be data that is neither present<BR>in the original transaction nor present in state changes.<BR>> Note<BR>>> Only a few transactions produce output that is not in the transaction<BR>>> and also not reflected in state changes. All other transaction types<BR>>> are _currently_ not included here. We have, however, allocated names<BR>>> and indexes for those transaction types to preserve consistency if we<BR>>> add them later.<BR><!--<BR>Reserved definitions:<BR>import "stream/output/consensus_service.proto";<BR>SubmitMessageOutput submit_message;<BR>import "stream/smart_contract_service.proto";<BR>UpdateContractOutput contract_update;<BR>DeleteContractOutput contract_delete;<BR>SystemDeleteContractOutput<BR>SystemUnDeleteContractOutput<BR>CreateTopicOutput create_topic;<BR>UpdateTopicOutput update_topic;<BR>import "stream/file_service.proto";<BR>CreateFileOutput file_create;<BR>AppendFileOutput file_append;<BR>UpdateFileOutput file_update;<BR>DeleteFileOutput file_delete;<BR>SystemDeleteOutput system_delete;<BR>SystemUndeleteOutput system_undelete;<BR>import "stream/crypto_service.proto";<BR>UpdateNodeStakeOutput update_node_stake;<BR>ApproveAllowanceOutput approve_allowance;<BR>DeleteAllowanceOutput delete_allowance;<BR>CreateAccountOutput create_account;<BR>UpdateAccountOutput update_account;<BR>DeleteAccountOutput delete_account;<BR>import "stream/token_service.proto";<BR>CreateTokenOutput create_token;<BR>DeleteTokenOutput delete_token;<BR>FreezeTokenAccountOutput freeze_token_account;<BR>UnfreezeTokenAccountOutput unfreeze_token_account;<BR>GrantTokenKycOutput grant_token_account_kyc;<BR>RevokeTokenKycOutput revoke_token_account_kyc;<BR>UpdateTokenOutput update_token;<BR>UpdateTokenNftsOutput update_token_nfts;<BR>MintTokenOutput mint_token;<BR>BurnTokenOutput burn_token;<BR>WipeTokenAccountOutput wipe_token_account;<BR>AssociateTokenOutput associate_token;<BR>DissociateTokenOutput dissociate_token;<BR>UpdateTokenFeeScheduleOutput update_token_fee_schedule;<BR>PauseTokenOutput pause_token;<BR>UnpauseTokenOutput unpause_token;<BR>import "stream/consensus_service.proto";<BR>DeleteTopicOutput delete_topic;<BR>import "stream/schedule_service.proto";<BR>DeleteScheduleOutput delete_schedule;<BR>import "stream/network_service.proto";<BR>FreezeOutput freeze_network;<BR>-->

<a name="TransactionOutput"></a>

### TransactionOutput


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| transaction | oneof |  | |
| | Output | [*](#*) |  | |
| |  | [](#) |  | |
| | crypto_transfer | [CryptoTransferOutput](#CryptoTransferOutput) |  | |
| | Output | [*](#*) |  | |
| | deterministic | [*](#*) |  | |
| |  | [](#) |  | |
| | util_prng | [UtilPrngOutput](#UtilPrngOutput) |  | |
| | Output | [*](#*) |  | |
| |  | [](#) |  | |
| | contract_call | [CallContractOutput](#CallContractOutput) |  | |
| | Output | [*](#*) |  | |
| |  | [](#) |  | |
| | ethereum_call | [EthereumOutput](#EthereumOutput) |  | |
| | Output | [*](#*) |  | |
| |  | [](#) |  | |
| | contract_create | [CreateContractOutput](#CreateContractOutput) |  | |
| | Output | [*](#*) |  | |
| | immediately | [*](#*) |  | |
| |  | [](#) |  | |
| | create_schedule | [CreateScheduleOutput](#CreateScheduleOutput) |  | |
| | Output | [*](#*) |  | |
| | executing | [*](#*) |  | |
| |  | [](#) |  | |
| | sign_schedule | [SignScheduleOutput](#SignScheduleOutput) |  | |
| | Output | [*](#*) |  | |
| |  | [](#) |  | |
| | token_airdrop | [TokenAirdropOutput](#TokenAirdropOutput) |  | |


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
| received | [*](#*) |  | |
| This | [*](#*) |  | |
| value | [*](#*) |  | |
| All | [*](#*) |  | |
| The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| consensus | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| consensus | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| consensus | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| consensus | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| (48 | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| If | [*](#*) |  | |
| are, | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| consensus | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| consensus | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| (48 | [*](#*) |  | |
|  | [*](#*) |  | |
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
| In | [*](#*) |  | |
| An | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |


<a name="transaction_record.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_record.proto

<BR>Response when the client sends the node TransactionGetRecordResponse

<a name="PendingAirdropRecord"></a>

### PendingAirdropRecord
<BR>A record of a new pending airdrop.

| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| pending_airdrop_id | [PendingAirdropId](#PendingAirdropId) |  | |
| A | [*](#*) |  | |
| If | [*](#*) |  | |
| and | [*](#*) |  | |
| If | [*](#*) |  | |
| be | [*](#*) |  | |
|  | [](#) |  | |
| pending_airdrop_value | [PendingAirdropValue](#PendingAirdropValue) |  | |


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
| A | [*](#*) |  | |
| Each | [*](#*) |  | |
| sending | [*](#*) |  | |
| issued | [*](#*) |  | |
| recipient | [*](#*) |  | |
| A | [*](#*) |  | |
| An | [*](#*) |  | |
| available | [*](#*) |  | |
| has | [*](#*) |  | |
|  | [](#) |  | |
| new_pending_airdrops | [PendingAirdropRecord](#PendingAirdropRecord) |  | |


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


<a name="transaction_result.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transaction_result.proto

<BR>While we have the state changes as part of the block stream,<BR>we may not have the full data set needed. To surface information<BR>such as staking rewards, fees, etc. we need to include some of the<BR>data from the original TransactionRecord.<BR>> REVIEW NOTE<BR>>> Should we have custom fees here, and remove that from the<BR>>> CryptoTransfer output message? That would make more sense, as I believe<BR>>> TokenTransfer output would also need custom fees, and we may wish<BR>>> to add custom fees to other transactions in the future.

<a name="TransactionResult"></a>

### TransactionResult


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| status | [proto.ResponseCodeEnum](#proto.ResponseCodeEnum) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| reached | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| consensus_timestamp | [proto.Timestamp](#proto.Timestamp) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| The | [*](#*) |  | |
| transaction, | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| part | [*](#*) |  | |
|  | [](#) |  | |
| parent_consensus_timestamp | [proto.Timestamp](#proto.Timestamp) |  | |
| A | [*](#*) |  | |
| was | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| the | [*](#*) |  | |
|  | [](#) |  | |
| schedule_ref | [proto.ScheduleID](#proto.ScheduleID) |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| transactionFee | [*](#*) |  | |
|  | [](#) |  | |
| transaction_fee_charged |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| of | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>Each | [*](#*) |  | |
| <li>All | [*](#*) |  | |
| <li>All | [*](#*) |  | |
| this | [*](#*) |  | |
| <li>Any | [*](#*) |  | |
| with | [*](#*) |  | |
| <li>Any | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| by | [*](#*) |  | |
| are | [*](#*) |  | |
|  | [](#) |  | |
| transfer_list | [proto.TransferList](#proto.TransferList) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| result | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| <li>Each | [*](#*) |  | |
| <li>All | [*](#*) |  | |
| <li>Any | [*](#*) |  | |
| with | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| token_transfer_lists | [proto.TokenTransferList](#proto.TokenTransferList) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| while | [*](#*) |  | |
|  | [](#) |  | |
| automatic_token_associations | [proto.TokenAssociation](#proto.TokenAssociation) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| of | [*](#*) |  | |
| Each | [*](#*) |  | |
|  | [](#) |  | |
| paid_staking_rewards | [proto.AccountAmount](#proto.AccountAmount) |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| fees | [*](#*) |  | |
|  | [](#) |  | |
| congestion_pricing_multiplier |  |  | |


<a name="tss_message.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## tss_message.proto

 A transaction body to to send a Threshold Signature Scheme (TSS)<BR>Message.<br/><BR>This is a wrapper around several different TSS message types that a node<BR>might communicate with other nodes in the network.<BR>- A `TssMessageTransactionBody` MUST identify the hash of the roster<BR>containing the node generating this TssMessage<BR>- A `TssMessageTransactionBody` MUST identify the hash of the roster that<BR>the TSS messages is for<BR>- A `TssMessageTransactionBody` SHALL contain the specificc TssMessage data<BR>that has been generated by the node for the share_index.

<a name="TssMessageTransactionBody"></a>

### TssMessageTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| an | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| source_roster_hash |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| target_roster_hash |  |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
| A | [*](#*) |  | |
| shares | [*](#*) |  | |
| A | [*](#*) |  | |
| returned | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| share_index |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| for | [*](#*) |  | |
|  | [](#) |  | |
| tss_message |  |  | |


<a name="tss_message_map_key.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## tss_message_map_key.proto

<BR>A key for use in the Threshold Signature Scheme (TSS) TssMessageMaps.<BR>This key SHALL be used to uniquely identify entries in the Message Maps.

<a name="TssMessageMapKey"></a>

### TssMessageMapKey


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| in | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| roster_hash |  |  | |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
| <p>This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| sequence_number |  |  | |


<a name="tss_vote.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## tss_vote.proto

<BR>A transaction body to vote on the validity of Threshold Signature Scheme<BR>(TSS) Messages for a candidate roster.<BR>- A `TssVoteTransactionBody` MUST identify the hash of the roster containing<BR>the node generating this TssVote<BR>- A `TssVoteTransactionBody` MUST identify the hash of the roster that the<BR>TSS messages is for<BR>- If the candidate roster has received enough yes votes, the candidate<BR>roster SHALL be adopted.<BR>- Switching to the candidate roster MUST not happen until enough nodes have<BR>voted that they have verified a threshold number of TSS messages from the<BR>active roster.<BR>- A vote consists of a bit vector of message statuses where each bit<BR>corresponds to the order of TssMessages as they have come through<BR>consensus.<BR>- The threshold for votes to adopt a candidate roster SHALL be at least 1/3<BR>of the consensus weight of the active roster to ensure that at least 1<BR>honest node has validated the TSS key material.

<a name="TssVoteTransactionBody"></a>

### TssVoteTransactionBody


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
|  | [](#) |  | |
| source_roster_hash |  |  | |
| A | [*](#*) |  | |
|  | [](#) |  | |
| target_roster_hash |  |  | |
| An | [*](#*) |  | |
|  | [*](#*) |  | |
|  | [](#) |  | |
| ledger_id |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| the | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| node_signature |  |  | |
| A | [*](#*) |  | |
|  | [*](#*) |  | |
| #### | [*](#*) |  | |
| <ul><li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
| <li>The | [*](#*) |  | |
|  | [*](#*) |  | |
| A | [*](#*) |  | |
| with | [*](#*) |  | |
| received, | [*](#*) |  | |
| A | [*](#*) |  | |
| received | [*](#*) |  | |
|  | [](#) |  | |
| tss_vote |  |  | |


<a name="tss_vote_map_key.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## tss_vote_map_key.proto

<BR>A key for use in the Threshold Signature Scheme (TSS) TssVoteMaps.<BR>This key SHALL be used to uniquely identify entries in the Vote Maps.

<a name="TssVoteMapKey"></a>

### TssVoteMapKey


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| A | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| roster_hash |  |  | |
| This | [*](#*) |  | |
|  | [*](#*) |  | |
| This | [*](#*) |  | |
| This | [*](#*) |  | |
|  | [](#) |  | |
| node_id |  |  | |


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


<a name="util_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## util_service.proto

<BR>Block data produced by `prng` transactions submitted to the `Util` service.<BR>The `entropy` reported in this block stream message is deterministically<BR>produced, but has high dispersion and is very difficult to predict.<BR>This message SHALL NOT duplicate information already contained in<BR>the original transaction.

<a name="UtilPrngOutput"></a>

### UtilPrngOutput


| Field | Type | Description |   |
| ----- | ---- | ----------- | - |
| entropy | oneof |  | |
| | A | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | `UtilService` | [*](#*) |  | |
| |  | [](#) |  | |
| | prng_bytes |  |  | |
| | A | [*](#*) |  | |
| | specified | [*](#*) |  | |
| |  | [*](#*) |  | |
| | This | [*](#*) |  | |
| | `prng` | [*](#*) |  | |
| | Note | [*](#*) |  | |
| | output | [*](#*) |  | |
| |  | [](#) |  | |
| | prng_number |  |  | |

