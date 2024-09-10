# UpdateOfferMappingEntryDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**AwaitingModerationMapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**RejectedMapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**Offer** | Pointer to [**UpdateMappingsOfferDTO**](UpdateMappingsOfferDTO.md) |  | [optional] 

## Methods

### NewUpdateOfferMappingEntryDTO

`func NewUpdateOfferMappingEntryDTO() *UpdateOfferMappingEntryDTO`

NewUpdateOfferMappingEntryDTO instantiates a new UpdateOfferMappingEntryDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOfferMappingEntryDTOWithDefaults

`func NewUpdateOfferMappingEntryDTOWithDefaults() *UpdateOfferMappingEntryDTO`

NewUpdateOfferMappingEntryDTOWithDefaults instantiates a new UpdateOfferMappingEntryDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMapping

`func (o *UpdateOfferMappingEntryDTO) GetMapping() OfferMappingDTO`

GetMapping returns the Mapping field if non-nil, zero value otherwise.

### GetMappingOk

`func (o *UpdateOfferMappingEntryDTO) GetMappingOk() (*OfferMappingDTO, bool)`

GetMappingOk returns a tuple with the Mapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMapping

`func (o *UpdateOfferMappingEntryDTO) SetMapping(v OfferMappingDTO)`

SetMapping sets Mapping field to given value.

### HasMapping

`func (o *UpdateOfferMappingEntryDTO) HasMapping() bool`

HasMapping returns a boolean if a field has been set.

### GetAwaitingModerationMapping

`func (o *UpdateOfferMappingEntryDTO) GetAwaitingModerationMapping() OfferMappingDTO`

GetAwaitingModerationMapping returns the AwaitingModerationMapping field if non-nil, zero value otherwise.

### GetAwaitingModerationMappingOk

`func (o *UpdateOfferMappingEntryDTO) GetAwaitingModerationMappingOk() (*OfferMappingDTO, bool)`

GetAwaitingModerationMappingOk returns a tuple with the AwaitingModerationMapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAwaitingModerationMapping

`func (o *UpdateOfferMappingEntryDTO) SetAwaitingModerationMapping(v OfferMappingDTO)`

SetAwaitingModerationMapping sets AwaitingModerationMapping field to given value.

### HasAwaitingModerationMapping

`func (o *UpdateOfferMappingEntryDTO) HasAwaitingModerationMapping() bool`

HasAwaitingModerationMapping returns a boolean if a field has been set.

### GetRejectedMapping

`func (o *UpdateOfferMappingEntryDTO) GetRejectedMapping() OfferMappingDTO`

GetRejectedMapping returns the RejectedMapping field if non-nil, zero value otherwise.

### GetRejectedMappingOk

`func (o *UpdateOfferMappingEntryDTO) GetRejectedMappingOk() (*OfferMappingDTO, bool)`

GetRejectedMappingOk returns a tuple with the RejectedMapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedMapping

`func (o *UpdateOfferMappingEntryDTO) SetRejectedMapping(v OfferMappingDTO)`

SetRejectedMapping sets RejectedMapping field to given value.

### HasRejectedMapping

`func (o *UpdateOfferMappingEntryDTO) HasRejectedMapping() bool`

HasRejectedMapping returns a boolean if a field has been set.

### GetOffer

`func (o *UpdateOfferMappingEntryDTO) GetOffer() UpdateMappingsOfferDTO`

GetOffer returns the Offer field if non-nil, zero value otherwise.

### GetOfferOk

`func (o *UpdateOfferMappingEntryDTO) GetOfferOk() (*UpdateMappingsOfferDTO, bool)`

GetOfferOk returns a tuple with the Offer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffer

`func (o *UpdateOfferMappingEntryDTO) SetOffer(v UpdateMappingsOfferDTO)`

SetOffer sets Offer field to given value.

### HasOffer

`func (o *UpdateOfferMappingEntryDTO) HasOffer() bool`

HasOffer returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


