# OrderItemsModificationResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]BriefOrderItemDTO**](BriefOrderItemDTO.md) | Список позиций в заказе, подлежащих маркировке. | 

## Methods

### NewOrderItemsModificationResultDTO

`func NewOrderItemsModificationResultDTO(items []BriefOrderItemDTO, ) *OrderItemsModificationResultDTO`

NewOrderItemsModificationResultDTO instantiates a new OrderItemsModificationResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderItemsModificationResultDTOWithDefaults

`func NewOrderItemsModificationResultDTOWithDefaults() *OrderItemsModificationResultDTO`

NewOrderItemsModificationResultDTOWithDefaults instantiates a new OrderItemsModificationResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *OrderItemsModificationResultDTO) GetItems() []BriefOrderItemDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *OrderItemsModificationResultDTO) GetItemsOk() (*[]BriefOrderItemDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *OrderItemsModificationResultDTO) SetItems(v []BriefOrderItemDTO)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


