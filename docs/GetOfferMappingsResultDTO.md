# GetOfferMappingsResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**OfferMappings** | [**[]GetOfferMappingDTO**](GetOfferMappingDTO.md) | Информация о товарах. | 

## Methods

### NewGetOfferMappingsResultDTO

`func NewGetOfferMappingsResultDTO(offerMappings []GetOfferMappingDTO, ) *GetOfferMappingsResultDTO`

NewGetOfferMappingsResultDTO instantiates a new GetOfferMappingsResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOfferMappingsResultDTOWithDefaults

`func NewGetOfferMappingsResultDTOWithDefaults() *GetOfferMappingsResultDTO`

NewGetOfferMappingsResultDTOWithDefaults instantiates a new GetOfferMappingsResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaging

`func (o *GetOfferMappingsResultDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetOfferMappingsResultDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetOfferMappingsResultDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetOfferMappingsResultDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetOfferMappings

`func (o *GetOfferMappingsResultDTO) GetOfferMappings() []GetOfferMappingDTO`

GetOfferMappings returns the OfferMappings field if non-nil, zero value otherwise.

### GetOfferMappingsOk

`func (o *GetOfferMappingsResultDTO) GetOfferMappingsOk() (*[]GetOfferMappingDTO, bool)`

GetOfferMappingsOk returns a tuple with the OfferMappings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferMappings

`func (o *GetOfferMappingsResultDTO) SetOfferMappings(v []GetOfferMappingDTO)`

SetOfferMappings sets OfferMappings field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


