# UpdateOrderStatusDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор заказа. | [optional] 
**Status** | Pointer to [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**Substatus** | Pointer to [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**UpdateStatus** | Pointer to [**OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] 
**ErrorDetails** | Pointer to **string** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] 

## Methods

### NewUpdateOrderStatusDTO

`func NewUpdateOrderStatusDTO() *UpdateOrderStatusDTO`

NewUpdateOrderStatusDTO instantiates a new UpdateOrderStatusDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOrderStatusDTOWithDefaults

`func NewUpdateOrderStatusDTOWithDefaults() *UpdateOrderStatusDTO`

NewUpdateOrderStatusDTOWithDefaults instantiates a new UpdateOrderStatusDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *UpdateOrderStatusDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *UpdateOrderStatusDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *UpdateOrderStatusDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *UpdateOrderStatusDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetStatus

`func (o *UpdateOrderStatusDTO) GetStatus() OrderStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *UpdateOrderStatusDTO) GetStatusOk() (*OrderStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *UpdateOrderStatusDTO) SetStatus(v OrderStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *UpdateOrderStatusDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSubstatus

`func (o *UpdateOrderStatusDTO) GetSubstatus() OrderSubstatusType`

GetSubstatus returns the Substatus field if non-nil, zero value otherwise.

### GetSubstatusOk

`func (o *UpdateOrderStatusDTO) GetSubstatusOk() (*OrderSubstatusType, bool)`

GetSubstatusOk returns a tuple with the Substatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubstatus

`func (o *UpdateOrderStatusDTO) SetSubstatus(v OrderSubstatusType)`

SetSubstatus sets Substatus field to given value.

### HasSubstatus

`func (o *UpdateOrderStatusDTO) HasSubstatus() bool`

HasSubstatus returns a boolean if a field has been set.

### GetUpdateStatus

`func (o *UpdateOrderStatusDTO) GetUpdateStatus() OrderUpdateStatusType`

GetUpdateStatus returns the UpdateStatus field if non-nil, zero value otherwise.

### GetUpdateStatusOk

`func (o *UpdateOrderStatusDTO) GetUpdateStatusOk() (*OrderUpdateStatusType, bool)`

GetUpdateStatusOk returns a tuple with the UpdateStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateStatus

`func (o *UpdateOrderStatusDTO) SetUpdateStatus(v OrderUpdateStatusType)`

SetUpdateStatus sets UpdateStatus field to given value.

### HasUpdateStatus

`func (o *UpdateOrderStatusDTO) HasUpdateStatus() bool`

HasUpdateStatus returns a boolean if a field has been set.

### GetErrorDetails

`func (o *UpdateOrderStatusDTO) GetErrorDetails() string`

GetErrorDetails returns the ErrorDetails field if non-nil, zero value otherwise.

### GetErrorDetailsOk

`func (o *UpdateOrderStatusDTO) GetErrorDetailsOk() (*string, bool)`

GetErrorDetailsOk returns a tuple with the ErrorDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorDetails

`func (o *UpdateOrderStatusDTO) SetErrorDetails(v string)`

SetErrorDetails sets ErrorDetails field to given value.

### HasErrorDetails

`func (o *UpdateOrderStatusDTO) HasErrorDetails() bool`

HasErrorDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


