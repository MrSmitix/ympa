# OfferProcessingStateDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**OfferProcessingStatusType**](OfferProcessingStatusType.md) |  | [optional] 
**Notes** | Pointer to [**[]OfferProcessingNoteDTO**](OfferProcessingNoteDTO.md) | Причины, по которым товар не прошел модерацию. | [optional] 

## Methods

### NewOfferProcessingStateDTO

`func NewOfferProcessingStateDTO() *OfferProcessingStateDTO`

NewOfferProcessingStateDTO instantiates a new OfferProcessingStateDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferProcessingStateDTOWithDefaults

`func NewOfferProcessingStateDTOWithDefaults() *OfferProcessingStateDTO`

NewOfferProcessingStateDTOWithDefaults instantiates a new OfferProcessingStateDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *OfferProcessingStateDTO) GetStatus() OfferProcessingStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OfferProcessingStateDTO) GetStatusOk() (*OfferProcessingStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OfferProcessingStateDTO) SetStatus(v OfferProcessingStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *OfferProcessingStateDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetNotes

`func (o *OfferProcessingStateDTO) GetNotes() []OfferProcessingNoteDTO`

GetNotes returns the Notes field if non-nil, zero value otherwise.

### GetNotesOk

`func (o *OfferProcessingStateDTO) GetNotesOk() (*[]OfferProcessingNoteDTO, bool)`

GetNotesOk returns a tuple with the Notes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotes

`func (o *OfferProcessingStateDTO) SetNotes(v []OfferProcessingNoteDTO)`

SetNotes sets Notes field to given value.

### HasNotes

`func (o *OfferProcessingStateDTO) HasNotes() bool`

HasNotes returns a boolean if a field has been set.

### SetNotesNil

`func (o *OfferProcessingStateDTO) SetNotesNil(b bool)`

 SetNotesNil sets the value for Notes to be an explicit nil

### UnsetNotes
`func (o *OfferProcessingStateDTO) UnsetNotes()`

UnsetNotes ensures that no value is present for Notes, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


