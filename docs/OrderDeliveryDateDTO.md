# OrderDeliveryDateDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ToDate** | **string** | Новая дата доставки заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Methods

### NewOrderDeliveryDateDTO

`func NewOrderDeliveryDateDTO(toDate string, ) *OrderDeliveryDateDTO`

NewOrderDeliveryDateDTO instantiates a new OrderDeliveryDateDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderDeliveryDateDTOWithDefaults

`func NewOrderDeliveryDateDTOWithDefaults() *OrderDeliveryDateDTO`

NewOrderDeliveryDateDTOWithDefaults instantiates a new OrderDeliveryDateDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetToDate

`func (o *OrderDeliveryDateDTO) GetToDate() string`

GetToDate returns the ToDate field if non-nil, zero value otherwise.

### GetToDateOk

`func (o *OrderDeliveryDateDTO) GetToDateOk() (*string, bool)`

GetToDateOk returns a tuple with the ToDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToDate

`func (o *OrderDeliveryDateDTO) SetToDate(v string)`

SetToDate sets ToDate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


