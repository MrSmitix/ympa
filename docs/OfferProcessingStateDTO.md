
# Table `OfferProcessingStateDTO`
(mapped from: OfferProcessingStateDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**OfferProcessingStatusType**](OfferProcessingStatusType.md) |  |  [optional] [foreignkey]
**notes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferProcessingNoteDTO&gt;**](OfferProcessingNoteDTO.md) | Причины, по которым товар не прошел модерацию. |  [optional]



# **Table `OfferProcessingStateDTOOfferProcessingNoteDTO`**
(mapped from: OfferProcessingStateDTOOfferProcessingNoteDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
offerProcessingStateDTO | offerProcessingStateDTO | long | | kotlin.Long | Primary Key | *one*
offerProcessingNoteDTO | offerProcessingNoteDTO | long | | kotlin.Long | Foreign Key | *many*



