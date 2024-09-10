# OfferMappingInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**AwaitingModerationMapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**RejectedMapping** | Pointer to [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 

## Methods

### NewOfferMappingInfoDTO

`func NewOfferMappingInfoDTO() *OfferMappingInfoDTO`

NewOfferMappingInfoDTO instantiates a new OfferMappingInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferMappingInfoDTOWithDefaults

`func NewOfferMappingInfoDTOWithDefaults() *OfferMappingInfoDTO`

NewOfferMappingInfoDTOWithDefaults instantiates a new OfferMappingInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMapping

`func (o *OfferMappingInfoDTO) GetMapping() OfferMappingDTO`

GetMapping returns the Mapping field if non-nil, zero value otherwise.

### GetMappingOk

`func (o *OfferMappingInfoDTO) GetMappingOk() (*OfferMappingDTO, bool)`

GetMappingOk returns a tuple with the Mapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMapping

`func (o *OfferMappingInfoDTO) SetMapping(v OfferMappingDTO)`

SetMapping sets Mapping field to given value.

### HasMapping

`func (o *OfferMappingInfoDTO) HasMapping() bool`

HasMapping returns a boolean if a field has been set.

### GetAwaitingModerationMapping

`func (o *OfferMappingInfoDTO) GetAwaitingModerationMapping() OfferMappingDTO`

GetAwaitingModerationMapping returns the AwaitingModerationMapping field if non-nil, zero value otherwise.

### GetAwaitingModerationMappingOk

`func (o *OfferMappingInfoDTO) GetAwaitingModerationMappingOk() (*OfferMappingDTO, bool)`

GetAwaitingModerationMappingOk returns a tuple with the AwaitingModerationMapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAwaitingModerationMapping

`func (o *OfferMappingInfoDTO) SetAwaitingModerationMapping(v OfferMappingDTO)`

SetAwaitingModerationMapping sets AwaitingModerationMapping field to given value.

### HasAwaitingModerationMapping

`func (o *OfferMappingInfoDTO) HasAwaitingModerationMapping() bool`

HasAwaitingModerationMapping returns a boolean if a field has been set.

### GetRejectedMapping

`func (o *OfferMappingInfoDTO) GetRejectedMapping() OfferMappingDTO`

GetRejectedMapping returns the RejectedMapping field if non-nil, zero value otherwise.

### GetRejectedMappingOk

`func (o *OfferMappingInfoDTO) GetRejectedMappingOk() (*OfferMappingDTO, bool)`

GetRejectedMappingOk returns a tuple with the RejectedMapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedMapping

`func (o *OfferMappingInfoDTO) SetRejectedMapping(v OfferMappingDTO)`

SetRejectedMapping sets RejectedMapping field to given value.

### HasRejectedMapping

`func (o *OfferMappingInfoDTO) HasRejectedMapping() bool`

HasRejectedMapping returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


