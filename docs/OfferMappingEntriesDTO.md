# OfferMappingEntriesDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**OfferMappingEntries** | [**[]OfferMappingEntryDTO**](OfferMappingEntryDTO.md) | Информация о товарах в каталоге. | 

## Methods

### NewOfferMappingEntriesDTO

`func NewOfferMappingEntriesDTO(offerMappingEntries []OfferMappingEntryDTO, ) *OfferMappingEntriesDTO`

NewOfferMappingEntriesDTO instantiates a new OfferMappingEntriesDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferMappingEntriesDTOWithDefaults

`func NewOfferMappingEntriesDTOWithDefaults() *OfferMappingEntriesDTO`

NewOfferMappingEntriesDTOWithDefaults instantiates a new OfferMappingEntriesDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaging

`func (o *OfferMappingEntriesDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *OfferMappingEntriesDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *OfferMappingEntriesDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *OfferMappingEntriesDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetOfferMappingEntries

`func (o *OfferMappingEntriesDTO) GetOfferMappingEntries() []OfferMappingEntryDTO`

GetOfferMappingEntries returns the OfferMappingEntries field if non-nil, zero value otherwise.

### GetOfferMappingEntriesOk

`func (o *OfferMappingEntriesDTO) GetOfferMappingEntriesOk() (*[]OfferMappingEntryDTO, bool)`

GetOfferMappingEntriesOk returns a tuple with the OfferMappingEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferMappingEntries

`func (o *OfferMappingEntriesDTO) SetOfferMappingEntries(v []OfferMappingEntryDTO)`

SetOfferMappingEntries sets OfferMappingEntries field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


