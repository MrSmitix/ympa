# SuggestedOfferMappingDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | Pointer to [**SuggestedOfferDTO**](SuggestedOfferDTO.md) |  | [optional] 
**Mapping** | Pointer to [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 

## Methods

### NewSuggestedOfferMappingDTO

`func NewSuggestedOfferMappingDTO() *SuggestedOfferMappingDTO`

NewSuggestedOfferMappingDTO instantiates a new SuggestedOfferMappingDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSuggestedOfferMappingDTOWithDefaults

`func NewSuggestedOfferMappingDTOWithDefaults() *SuggestedOfferMappingDTO`

NewSuggestedOfferMappingDTOWithDefaults instantiates a new SuggestedOfferMappingDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffer

`func (o *SuggestedOfferMappingDTO) GetOffer() SuggestedOfferDTO`

GetOffer returns the Offer field if non-nil, zero value otherwise.

### GetOfferOk

`func (o *SuggestedOfferMappingDTO) GetOfferOk() (*SuggestedOfferDTO, bool)`

GetOfferOk returns a tuple with the Offer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffer

`func (o *SuggestedOfferMappingDTO) SetOffer(v SuggestedOfferDTO)`

SetOffer sets Offer field to given value.

### HasOffer

`func (o *SuggestedOfferMappingDTO) HasOffer() bool`

HasOffer returns a boolean if a field has been set.

### GetMapping

`func (o *SuggestedOfferMappingDTO) GetMapping() GetMappingDTO`

GetMapping returns the Mapping field if non-nil, zero value otherwise.

### GetMappingOk

`func (o *SuggestedOfferMappingDTO) GetMappingOk() (*GetMappingDTO, bool)`

GetMappingOk returns a tuple with the Mapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMapping

`func (o *SuggestedOfferMappingDTO) SetMapping(v GetMappingDTO)`

SetMapping sets Mapping field to given value.

### HasMapping

`func (o *SuggestedOfferMappingDTO) HasMapping() bool`

HasMapping returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


