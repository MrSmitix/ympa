# OfferProcessingNoteDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**OfferProcessingNoteType**](OfferProcessingNoteType.md) |  | [optional] 
**Payload** | Pointer to **string** | Дополнительная информация о причине отклонения товара.  | [optional] 

## Methods

### NewOfferProcessingNoteDTO

`func NewOfferProcessingNoteDTO() *OfferProcessingNoteDTO`

NewOfferProcessingNoteDTO instantiates a new OfferProcessingNoteDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferProcessingNoteDTOWithDefaults

`func NewOfferProcessingNoteDTOWithDefaults() *OfferProcessingNoteDTO`

NewOfferProcessingNoteDTOWithDefaults instantiates a new OfferProcessingNoteDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OfferProcessingNoteDTO) GetType() OfferProcessingNoteType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OfferProcessingNoteDTO) GetTypeOk() (*OfferProcessingNoteType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OfferProcessingNoteDTO) SetType(v OfferProcessingNoteType)`

SetType sets Type field to given value.

### HasType

`func (o *OfferProcessingNoteDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetPayload

`func (o *OfferProcessingNoteDTO) GetPayload() string`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *OfferProcessingNoteDTO) GetPayloadOk() (*string, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *OfferProcessingNoteDTO) SetPayload(v string)`

SetPayload sets Payload field to given value.

### HasPayload

`func (o *OfferProcessingNoteDTO) HasPayload() bool`

HasPayload returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


