# UpdateOrderStorageLimitRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NewDate** | **string** | Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Methods

### NewUpdateOrderStorageLimitRequest

`func NewUpdateOrderStorageLimitRequest(newDate string, ) *UpdateOrderStorageLimitRequest`

NewUpdateOrderStorageLimitRequest instantiates a new UpdateOrderStorageLimitRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOrderStorageLimitRequestWithDefaults

`func NewUpdateOrderStorageLimitRequestWithDefaults() *UpdateOrderStorageLimitRequest`

NewUpdateOrderStorageLimitRequestWithDefaults instantiates a new UpdateOrderStorageLimitRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNewDate

`func (o *UpdateOrderStorageLimitRequest) GetNewDate() string`

GetNewDate returns the NewDate field if non-nil, zero value otherwise.

### GetNewDateOk

`func (o *UpdateOrderStorageLimitRequest) GetNewDateOk() (*string, bool)`

GetNewDateOk returns a tuple with the NewDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewDate

`func (o *UpdateOrderStorageLimitRequest) SetNewDate(v string)`

SetNewDate sets NewDate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


