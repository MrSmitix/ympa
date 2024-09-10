# OfferMappingEntryDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**AwaitingModerationMapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**RejectedMapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**Offer** | Pointer to [**MappingsOfferDTO**](MappingsOfferDTO.md) |  | [optional] 

## Methods

### NewOfferMappingEntryDTO

`func NewOfferMappingEntryDTO() *OfferMappingEntryDTO`

NewOfferMappingEntryDTO instantiates a new OfferMappingEntryDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferMappingEntryDTOWithDefaults

`func NewOfferMappingEntryDTOWithDefaults() *OfferMappingEntryDTO`

NewOfferMappingEntryDTOWithDefaults instantiates a new OfferMappingEntryDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMapping

`func (o *OfferMappingEntryDTO) GetMapping() OfferMappingDTO`

GetMapping returns the Mapping field if non-nil, zero value otherwise.

### GetMappingOk

`func (o *OfferMappingEntryDTO) GetMappingOk() (*OfferMappingDTO, bool)`

GetMappingOk returns a tuple with the Mapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMapping

`func (o *OfferMappingEntryDTO) SetMapping(v OfferMappingDTO)`

SetMapping sets Mapping field to given value.

### HasMapping

`func (o *OfferMappingEntryDTO) HasMapping() bool`

HasMapping returns a boolean if a field has been set.

### GetAwaitingModerationMapping

`func (o *OfferMappingEntryDTO) GetAwaitingModerationMapping() OfferMappingDTO`

GetAwaitingModerationMapping returns the AwaitingModerationMapping field if non-nil, zero value otherwise.

### GetAwaitingModerationMappingOk

`func (o *OfferMappingEntryDTO) GetAwaitingModerationMappingOk() (*OfferMappingDTO, bool)`

GetAwaitingModerationMappingOk returns a tuple with the AwaitingModerationMapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAwaitingModerationMapping

`func (o *OfferMappingEntryDTO) SetAwaitingModerationMapping(v OfferMappingDTO)`

SetAwaitingModerationMapping sets AwaitingModerationMapping field to given value.

### HasAwaitingModerationMapping

`func (o *OfferMappingEntryDTO) HasAwaitingModerationMapping() bool`

HasAwaitingModerationMapping returns a boolean if a field has been set.

### GetRejectedMapping

`func (o *OfferMappingEntryDTO) GetRejectedMapping() OfferMappingDTO`

GetRejectedMapping returns the RejectedMapping field if non-nil, zero value otherwise.

### GetRejectedMappingOk

`func (o *OfferMappingEntryDTO) GetRejectedMappingOk() (*OfferMappingDTO, bool)`

GetRejectedMappingOk returns a tuple with the RejectedMapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedMapping

`func (o *OfferMappingEntryDTO) SetRejectedMapping(v OfferMappingDTO)`

SetRejectedMapping sets RejectedMapping field to given value.

### HasRejectedMapping

`func (o *OfferMappingEntryDTO) HasRejectedMapping() bool`

HasRejectedMapping returns a boolean if a field has been set.

### GetOffer

`func (o *OfferMappingEntryDTO) GetOffer() MappingsOfferDTO`

GetOffer returns the Offer field if non-nil, zero value otherwise.

### GetOfferOk

`func (o *OfferMappingEntryDTO) GetOfferOk() (*MappingsOfferDTO, bool)`

GetOfferOk returns a tuple with the Offer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffer

`func (o *OfferMappingEntryDTO) SetOffer(v MappingsOfferDTO)`

SetOffer sets Offer field to given value.

### HasOffer

`func (o *OfferMappingEntryDTO) HasOffer() bool`

HasOffer returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


