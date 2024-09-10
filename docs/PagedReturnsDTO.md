# PagedReturnsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 
**Returns** | [**[]ReturnDTO**](ReturnDTO.md) | Список возвратов. | 

## Methods

### NewPagedReturnsDTO

`func NewPagedReturnsDTO(returns []ReturnDTO, ) *PagedReturnsDTO`

NewPagedReturnsDTO instantiates a new PagedReturnsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPagedReturnsDTOWithDefaults

`func NewPagedReturnsDTOWithDefaults() *PagedReturnsDTO`

NewPagedReturnsDTOWithDefaults instantiates a new PagedReturnsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaging

`func (o *PagedReturnsDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *PagedReturnsDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *PagedReturnsDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *PagedReturnsDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetReturns

`func (o *PagedReturnsDTO) GetReturns() []ReturnDTO`

GetReturns returns the Returns field if non-nil, zero value otherwise.

### GetReturnsOk

`func (o *PagedReturnsDTO) GetReturnsOk() (*[]ReturnDTO, bool)`

GetReturnsOk returns a tuple with the Returns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturns

`func (o *PagedReturnsDTO) SetReturns(v []ReturnDTO)`

SetReturns sets Returns field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


