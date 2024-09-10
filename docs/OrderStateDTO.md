# OrderStateDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор заказа. | 
**Status** | [**OrderStatusType**](OrderStatusType.md) |  | 
**Substatus** | Pointer to [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 

## Methods

### NewOrderStateDTO

`func NewOrderStateDTO(id int64, status OrderStatusType, ) *OrderStateDTO`

NewOrderStateDTO instantiates a new OrderStateDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderStateDTOWithDefaults

`func NewOrderStateDTOWithDefaults() *OrderStateDTO`

NewOrderStateDTOWithDefaults instantiates a new OrderStateDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderStateDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderStateDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderStateDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetStatus

`func (o *OrderStateDTO) GetStatus() OrderStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OrderStateDTO) GetStatusOk() (*OrderStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OrderStateDTO) SetStatus(v OrderStatusType)`

SetStatus sets Status field to given value.


### GetSubstatus

`func (o *OrderStateDTO) GetSubstatus() OrderSubstatusType`

GetSubstatus returns the Substatus field if non-nil, zero value otherwise.

### GetSubstatusOk

`func (o *OrderStateDTO) GetSubstatusOk() (*OrderSubstatusType, bool)`

GetSubstatusOk returns a tuple with the Substatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubstatus

`func (o *OrderStateDTO) SetSubstatus(v OrderSubstatusType)`

SetSubstatus sets Substatus field to given value.

### HasSubstatus

`func (o *OrderStateDTO) HasSubstatus() bool`

HasSubstatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


