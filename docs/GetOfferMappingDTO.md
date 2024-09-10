# GetOfferMappingDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | Pointer to [**GetOfferDTO**](GetOfferDTO.md) |  | [optional] 
**Mapping** | Pointer to [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 

## Methods

### NewGetOfferMappingDTO

`func NewGetOfferMappingDTO() *GetOfferMappingDTO`

NewGetOfferMappingDTO instantiates a new GetOfferMappingDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOfferMappingDTOWithDefaults

`func NewGetOfferMappingDTOWithDefaults() *GetOfferMappingDTO`

NewGetOfferMappingDTOWithDefaults instantiates a new GetOfferMappingDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffer

`func (o *GetOfferMappingDTO) GetOffer() GetOfferDTO`

GetOffer returns the Offer field if non-nil, zero value otherwise.

### GetOfferOk

`func (o *GetOfferMappingDTO) GetOfferOk() (*GetOfferDTO, bool)`

GetOfferOk returns a tuple with the Offer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffer

`func (o *GetOfferMappingDTO) SetOffer(v GetOfferDTO)`

SetOffer sets Offer field to given value.

### HasOffer

`func (o *GetOfferMappingDTO) HasOffer() bool`

HasOffer returns a boolean if a field has been set.

### GetMapping

`func (o *GetOfferMappingDTO) GetMapping() GetMappingDTO`

GetMapping returns the Mapping field if non-nil, zero value otherwise.

### GetMappingOk

`func (o *GetOfferMappingDTO) GetMappingOk() (*GetMappingDTO, bool)`

GetMappingOk returns a tuple with the Mapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMapping

`func (o *GetOfferMappingDTO) SetMapping(v GetMappingDTO)`

SetMapping sets Mapping field to given value.

### HasMapping

`func (o *GetOfferMappingDTO) HasMapping() bool`

HasMapping returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


