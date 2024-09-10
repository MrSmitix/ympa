# OrderStatusChangeDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**OrderStatusType**](OrderStatusType.md) |  | 
**Substatus** | Pointer to [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**Delivery** | Pointer to [**OrderStatusChangeDeliveryDTO**](OrderStatusChangeDeliveryDTO.md) |  | [optional] 

## Methods

### NewOrderStatusChangeDTO

`func NewOrderStatusChangeDTO(status OrderStatusType, ) *OrderStatusChangeDTO`

NewOrderStatusChangeDTO instantiates a new OrderStatusChangeDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderStatusChangeDTOWithDefaults

`func NewOrderStatusChangeDTOWithDefaults() *OrderStatusChangeDTO`

NewOrderStatusChangeDTOWithDefaults instantiates a new OrderStatusChangeDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *OrderStatusChangeDTO) GetStatus() OrderStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OrderStatusChangeDTO) GetStatusOk() (*OrderStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OrderStatusChangeDTO) SetStatus(v OrderStatusType)`

SetStatus sets Status field to given value.


### GetSubstatus

`func (o *OrderStatusChangeDTO) GetSubstatus() OrderSubstatusType`

GetSubstatus returns the Substatus field if non-nil, zero value otherwise.

### GetSubstatusOk

`func (o *OrderStatusChangeDTO) GetSubstatusOk() (*OrderSubstatusType, bool)`

GetSubstatusOk returns a tuple with the Substatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubstatus

`func (o *OrderStatusChangeDTO) SetSubstatus(v OrderSubstatusType)`

SetSubstatus sets Substatus field to given value.

### HasSubstatus

`func (o *OrderStatusChangeDTO) HasSubstatus() bool`

HasSubstatus returns a boolean if a field has been set.

### GetDelivery

`func (o *OrderStatusChangeDTO) GetDelivery() OrderStatusChangeDeliveryDTO`

GetDelivery returns the Delivery field if non-nil, zero value otherwise.

### GetDeliveryOk

`func (o *OrderStatusChangeDTO) GetDeliveryOk() (*OrderStatusChangeDeliveryDTO, bool)`

GetDeliveryOk returns a tuple with the Delivery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelivery

`func (o *OrderStatusChangeDTO) SetDelivery(v OrderStatusChangeDeliveryDTO)`

SetDelivery sets Delivery field to given value.

### HasDelivery

`func (o *OrderStatusChangeDTO) HasDelivery() bool`

HasDelivery returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


