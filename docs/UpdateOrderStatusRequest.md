# UpdateOrderStatusRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Order** | [**OrderStatusChangeDTO**](OrderStatusChangeDTO.md) |  | 

## Methods

### NewUpdateOrderStatusRequest

`func NewUpdateOrderStatusRequest(order OrderStatusChangeDTO, ) *UpdateOrderStatusRequest`

NewUpdateOrderStatusRequest instantiates a new UpdateOrderStatusRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOrderStatusRequestWithDefaults

`func NewUpdateOrderStatusRequestWithDefaults() *UpdateOrderStatusRequest`

NewUpdateOrderStatusRequestWithDefaults instantiates a new UpdateOrderStatusRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrder

`func (o *UpdateOrderStatusRequest) GetOrder() OrderStatusChangeDTO`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *UpdateOrderStatusRequest) GetOrderOk() (*OrderStatusChangeDTO, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *UpdateOrderStatusRequest) SetOrder(v OrderStatusChangeDTO)`

SetOrder sets Order field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


