# UpdateOfferMappingDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | [**UpdateOfferDTO**](UpdateOfferDTO.md) |  | 
**Mapping** | Pointer to [**UpdateMappingDTO**](UpdateMappingDTO.md) |  | [optional] 

## Methods

### NewUpdateOfferMappingDTO

`func NewUpdateOfferMappingDTO(offer UpdateOfferDTO, ) *UpdateOfferMappingDTO`

NewUpdateOfferMappingDTO instantiates a new UpdateOfferMappingDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOfferMappingDTOWithDefaults

`func NewUpdateOfferMappingDTOWithDefaults() *UpdateOfferMappingDTO`

NewUpdateOfferMappingDTOWithDefaults instantiates a new UpdateOfferMappingDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffer

`func (o *UpdateOfferMappingDTO) GetOffer() UpdateOfferDTO`

GetOffer returns the Offer field if non-nil, zero value otherwise.

### GetOfferOk

`func (o *UpdateOfferMappingDTO) GetOfferOk() (*UpdateOfferDTO, bool)`

GetOfferOk returns a tuple with the Offer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffer

`func (o *UpdateOfferMappingDTO) SetOffer(v UpdateOfferDTO)`

SetOffer sets Offer field to given value.


### GetMapping

`func (o *UpdateOfferMappingDTO) GetMapping() UpdateMappingDTO`

GetMapping returns the Mapping field if non-nil, zero value otherwise.

### GetMappingOk

`func (o *UpdateOfferMappingDTO) GetMappingOk() (*UpdateMappingDTO, bool)`

GetMappingOk returns a tuple with the Mapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMapping

`func (o *UpdateOfferMappingDTO) SetMapping(v UpdateMappingDTO)`

SetMapping sets Mapping field to given value.

### HasMapping

`func (o *UpdateOfferMappingDTO) HasMapping() bool`

HasMapping returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


