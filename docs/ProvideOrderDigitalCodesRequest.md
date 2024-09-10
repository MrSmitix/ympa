# ProvideOrderDigitalCodesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]OrderDigitalItemDTO**](OrderDigitalItemDTO.md) | Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же.  | 

## Methods

### NewProvideOrderDigitalCodesRequest

`func NewProvideOrderDigitalCodesRequest(items []OrderDigitalItemDTO, ) *ProvideOrderDigitalCodesRequest`

NewProvideOrderDigitalCodesRequest instantiates a new ProvideOrderDigitalCodesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProvideOrderDigitalCodesRequestWithDefaults

`func NewProvideOrderDigitalCodesRequestWithDefaults() *ProvideOrderDigitalCodesRequest`

NewProvideOrderDigitalCodesRequestWithDefaults instantiates a new ProvideOrderDigitalCodesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *ProvideOrderDigitalCodesRequest) GetItems() []OrderDigitalItemDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ProvideOrderDigitalCodesRequest) GetItemsOk() (*[]OrderDigitalItemDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ProvideOrderDigitalCodesRequest) SetItems(v []OrderDigitalItemDTO)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


