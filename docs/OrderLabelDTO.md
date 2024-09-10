# OrderLabelDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderId** | **int64** | Идентификатор заказа. | 
**PlacesNumber** | **int32** | Количество коробок в заказе. | 
**Url** | **string** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**ParcelBoxLabels** | [**[]ParcelBoxLabelDTO**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 

## Methods

### NewOrderLabelDTO

`func NewOrderLabelDTO(orderId int64, placesNumber int32, url string, parcelBoxLabels []ParcelBoxLabelDTO, ) *OrderLabelDTO`

NewOrderLabelDTO instantiates a new OrderLabelDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderLabelDTOWithDefaults

`func NewOrderLabelDTOWithDefaults() *OrderLabelDTO`

NewOrderLabelDTOWithDefaults instantiates a new OrderLabelDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrderId

`func (o *OrderLabelDTO) GetOrderId() int64`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *OrderLabelDTO) GetOrderIdOk() (*int64, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *OrderLabelDTO) SetOrderId(v int64)`

SetOrderId sets OrderId field to given value.


### GetPlacesNumber

`func (o *OrderLabelDTO) GetPlacesNumber() int32`

GetPlacesNumber returns the PlacesNumber field if non-nil, zero value otherwise.

### GetPlacesNumberOk

`func (o *OrderLabelDTO) GetPlacesNumberOk() (*int32, bool)`

GetPlacesNumberOk returns a tuple with the PlacesNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacesNumber

`func (o *OrderLabelDTO) SetPlacesNumber(v int32)`

SetPlacesNumber sets PlacesNumber field to given value.


### GetUrl

`func (o *OrderLabelDTO) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *OrderLabelDTO) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *OrderLabelDTO) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetParcelBoxLabels

`func (o *OrderLabelDTO) GetParcelBoxLabels() []ParcelBoxLabelDTO`

GetParcelBoxLabels returns the ParcelBoxLabels field if non-nil, zero value otherwise.

### GetParcelBoxLabelsOk

`func (o *OrderLabelDTO) GetParcelBoxLabelsOk() (*[]ParcelBoxLabelDTO, bool)`

GetParcelBoxLabelsOk returns a tuple with the ParcelBoxLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParcelBoxLabels

`func (o *OrderLabelDTO) SetParcelBoxLabels(v []ParcelBoxLabelDTO)`

SetParcelBoxLabels sets ParcelBoxLabels field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


