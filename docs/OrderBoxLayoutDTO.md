# OrderBoxLayoutDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]OrderBoxLayoutItemDTO**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  | 

## Methods

### NewOrderBoxLayoutDTO

`func NewOrderBoxLayoutDTO(items []OrderBoxLayoutItemDTO, ) *OrderBoxLayoutDTO`

NewOrderBoxLayoutDTO instantiates a new OrderBoxLayoutDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderBoxLayoutDTOWithDefaults

`func NewOrderBoxLayoutDTOWithDefaults() *OrderBoxLayoutDTO`

NewOrderBoxLayoutDTOWithDefaults instantiates a new OrderBoxLayoutDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *OrderBoxLayoutDTO) GetItems() []OrderBoxLayoutItemDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *OrderBoxLayoutDTO) GetItemsOk() (*[]OrderBoxLayoutItemDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *OrderBoxLayoutDTO) SetItems(v []OrderBoxLayoutItemDTO)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


