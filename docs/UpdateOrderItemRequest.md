# UpdateOrderItemRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]OrderItemModificationDTO**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | 
**Reason** | Pointer to [**OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  | [optional] 

## Methods

### NewUpdateOrderItemRequest

`func NewUpdateOrderItemRequest(items []OrderItemModificationDTO, ) *UpdateOrderItemRequest`

NewUpdateOrderItemRequest instantiates a new UpdateOrderItemRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOrderItemRequestWithDefaults

`func NewUpdateOrderItemRequestWithDefaults() *UpdateOrderItemRequest`

NewUpdateOrderItemRequestWithDefaults instantiates a new UpdateOrderItemRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *UpdateOrderItemRequest) GetItems() []OrderItemModificationDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *UpdateOrderItemRequest) GetItemsOk() (*[]OrderItemModificationDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *UpdateOrderItemRequest) SetItems(v []OrderItemModificationDTO)`

SetItems sets Items field to given value.


### GetReason

`func (o *UpdateOrderItemRequest) GetReason() OrderItemsModificationRequestReasonType`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *UpdateOrderItemRequest) GetReasonOk() (*OrderItemsModificationRequestReasonType, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *UpdateOrderItemRequest) SetReason(v OrderItemsModificationRequestReasonType)`

SetReason sets Reason field to given value.

### HasReason

`func (o *UpdateOrderItemRequest) HasReason() bool`

HasReason returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


