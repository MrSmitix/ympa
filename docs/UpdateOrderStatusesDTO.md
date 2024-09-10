# UpdateOrderStatusesDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Orders** | [**[]UpdateOrderStatusDTO**](UpdateOrderStatusDTO.md) | Список с обновленными заказами. | 

## Methods

### NewUpdateOrderStatusesDTO

`func NewUpdateOrderStatusesDTO(orders []UpdateOrderStatusDTO, ) *UpdateOrderStatusesDTO`

NewUpdateOrderStatusesDTO instantiates a new UpdateOrderStatusesDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOrderStatusesDTOWithDefaults

`func NewUpdateOrderStatusesDTOWithDefaults() *UpdateOrderStatusesDTO`

NewUpdateOrderStatusesDTOWithDefaults instantiates a new UpdateOrderStatusesDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrders

`func (o *UpdateOrderStatusesDTO) GetOrders() []UpdateOrderStatusDTO`

GetOrders returns the Orders field if non-nil, zero value otherwise.

### GetOrdersOk

`func (o *UpdateOrderStatusesDTO) GetOrdersOk() (*[]UpdateOrderStatusDTO, bool)`

GetOrdersOk returns a tuple with the Orders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrders

`func (o *UpdateOrderStatusesDTO) SetOrders(v []UpdateOrderStatusDTO)`

SetOrders sets Orders field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


