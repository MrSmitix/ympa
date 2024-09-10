# OrdersShipmentInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderIdsWithLabels** | **[]int64** | Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. | 
**OrderIdsWithoutLabels** | **[]int64** | Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. | 

## Methods

### NewOrdersShipmentInfoDTO

`func NewOrdersShipmentInfoDTO(orderIdsWithLabels []int64, orderIdsWithoutLabels []int64, ) *OrdersShipmentInfoDTO`

NewOrdersShipmentInfoDTO instantiates a new OrdersShipmentInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrdersShipmentInfoDTOWithDefaults

`func NewOrdersShipmentInfoDTOWithDefaults() *OrdersShipmentInfoDTO`

NewOrdersShipmentInfoDTOWithDefaults instantiates a new OrdersShipmentInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrderIdsWithLabels

`func (o *OrdersShipmentInfoDTO) GetOrderIdsWithLabels() []int64`

GetOrderIdsWithLabels returns the OrderIdsWithLabels field if non-nil, zero value otherwise.

### GetOrderIdsWithLabelsOk

`func (o *OrdersShipmentInfoDTO) GetOrderIdsWithLabelsOk() (*[]int64, bool)`

GetOrderIdsWithLabelsOk returns a tuple with the OrderIdsWithLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIdsWithLabels

`func (o *OrdersShipmentInfoDTO) SetOrderIdsWithLabels(v []int64)`

SetOrderIdsWithLabels sets OrderIdsWithLabels field to given value.


### GetOrderIdsWithoutLabels

`func (o *OrdersShipmentInfoDTO) GetOrderIdsWithoutLabels() []int64`

GetOrderIdsWithoutLabels returns the OrderIdsWithoutLabels field if non-nil, zero value otherwise.

### GetOrderIdsWithoutLabelsOk

`func (o *OrdersShipmentInfoDTO) GetOrderIdsWithoutLabelsOk() (*[]int64, bool)`

GetOrderIdsWithoutLabelsOk returns a tuple with the OrderIdsWithoutLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIdsWithoutLabels

`func (o *OrdersShipmentInfoDTO) SetOrderIdsWithoutLabels(v []int64)`

SetOrderIdsWithoutLabels sets OrderIdsWithoutLabels field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


