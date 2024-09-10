# TransferOrdersFromShipmentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderIds** | **[]int64** | Список заказов, которые вы не успеваете подготовить. | 

## Methods

### NewTransferOrdersFromShipmentRequest

`func NewTransferOrdersFromShipmentRequest(orderIds []int64, ) *TransferOrdersFromShipmentRequest`

NewTransferOrdersFromShipmentRequest instantiates a new TransferOrdersFromShipmentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTransferOrdersFromShipmentRequestWithDefaults

`func NewTransferOrdersFromShipmentRequestWithDefaults() *TransferOrdersFromShipmentRequest`

NewTransferOrdersFromShipmentRequestWithDefaults instantiates a new TransferOrdersFromShipmentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrderIds

`func (o *TransferOrdersFromShipmentRequest) GetOrderIds() []int64`

GetOrderIds returns the OrderIds field if non-nil, zero value otherwise.

### GetOrderIdsOk

`func (o *TransferOrdersFromShipmentRequest) GetOrderIdsOk() (*[]int64, bool)`

GetOrderIdsOk returns a tuple with the OrderIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIds

`func (o *TransferOrdersFromShipmentRequest) SetOrderIds(v []int64)`

SetOrderIds sets OrderIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


