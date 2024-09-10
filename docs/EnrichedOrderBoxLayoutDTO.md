# EnrichedOrderBoxLayoutDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]OrderBoxLayoutItemDTO**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  | 
**BoxId** | Pointer to **int64** | Идентификатор коробки. | [optional] 

## Methods

### NewEnrichedOrderBoxLayoutDTO

`func NewEnrichedOrderBoxLayoutDTO(items []OrderBoxLayoutItemDTO, ) *EnrichedOrderBoxLayoutDTO`

NewEnrichedOrderBoxLayoutDTO instantiates a new EnrichedOrderBoxLayoutDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrichedOrderBoxLayoutDTOWithDefaults

`func NewEnrichedOrderBoxLayoutDTOWithDefaults() *EnrichedOrderBoxLayoutDTO`

NewEnrichedOrderBoxLayoutDTOWithDefaults instantiates a new EnrichedOrderBoxLayoutDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *EnrichedOrderBoxLayoutDTO) GetItems() []OrderBoxLayoutItemDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *EnrichedOrderBoxLayoutDTO) GetItemsOk() (*[]OrderBoxLayoutItemDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *EnrichedOrderBoxLayoutDTO) SetItems(v []OrderBoxLayoutItemDTO)`

SetItems sets Items field to given value.


### GetBoxId

`func (o *EnrichedOrderBoxLayoutDTO) GetBoxId() int64`

GetBoxId returns the BoxId field if non-nil, zero value otherwise.

### GetBoxIdOk

`func (o *EnrichedOrderBoxLayoutDTO) GetBoxIdOk() (*int64, bool)`

GetBoxIdOk returns a tuple with the BoxId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxId

`func (o *EnrichedOrderBoxLayoutDTO) SetBoxId(v int64)`

SetBoxId sets BoxId field to given value.

### HasBoxId

`func (o *EnrichedOrderBoxLayoutDTO) HasBoxId() bool`

HasBoxId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


