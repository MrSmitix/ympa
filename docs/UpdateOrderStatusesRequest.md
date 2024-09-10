# UpdateOrderStatusesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Orders** | [**[]OrderStateDTO**](OrderStateDTO.md) | Список заказов. | 

## Methods

### NewUpdateOrderStatusesRequest

`func NewUpdateOrderStatusesRequest(orders []OrderStateDTO, ) *UpdateOrderStatusesRequest`

NewUpdateOrderStatusesRequest instantiates a new UpdateOrderStatusesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOrderStatusesRequestWithDefaults

`func NewUpdateOrderStatusesRequestWithDefaults() *UpdateOrderStatusesRequest`

NewUpdateOrderStatusesRequestWithDefaults instantiates a new UpdateOrderStatusesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrders

`func (o *UpdateOrderStatusesRequest) GetOrders() []OrderStateDTO`

GetOrders returns the Orders field if non-nil, zero value otherwise.

### GetOrdersOk

`func (o *UpdateOrderStatusesRequest) GetOrdersOk() (*[]OrderStateDTO, bool)`

GetOrdersOk returns a tuple with the Orders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrders

`func (o *UpdateOrderStatusesRequest) SetOrders(v []OrderStateDTO)`

SetOrders sets Orders field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


