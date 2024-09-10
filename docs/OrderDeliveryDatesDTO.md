# OrderDeliveryDatesDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FromDate** | Pointer to **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**ToDate** | Pointer to **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**FromTime** | Pointer to **string** | Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;.  | [optional] 
**ToTime** | Pointer to **string** | Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;.  | [optional] 
**RealDeliveryDate** | Pointer to **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Methods

### NewOrderDeliveryDatesDTO

`func NewOrderDeliveryDatesDTO() *OrderDeliveryDatesDTO`

NewOrderDeliveryDatesDTO instantiates a new OrderDeliveryDatesDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderDeliveryDatesDTOWithDefaults

`func NewOrderDeliveryDatesDTOWithDefaults() *OrderDeliveryDatesDTO`

NewOrderDeliveryDatesDTOWithDefaults instantiates a new OrderDeliveryDatesDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFromDate

`func (o *OrderDeliveryDatesDTO) GetFromDate() string`

GetFromDate returns the FromDate field if non-nil, zero value otherwise.

### GetFromDateOk

`func (o *OrderDeliveryDatesDTO) GetFromDateOk() (*string, bool)`

GetFromDateOk returns a tuple with the FromDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromDate

`func (o *OrderDeliveryDatesDTO) SetFromDate(v string)`

SetFromDate sets FromDate field to given value.

### HasFromDate

`func (o *OrderDeliveryDatesDTO) HasFromDate() bool`

HasFromDate returns a boolean if a field has been set.

### GetToDate

`func (o *OrderDeliveryDatesDTO) GetToDate() string`

GetToDate returns the ToDate field if non-nil, zero value otherwise.

### GetToDateOk

`func (o *OrderDeliveryDatesDTO) GetToDateOk() (*string, bool)`

GetToDateOk returns a tuple with the ToDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToDate

`func (o *OrderDeliveryDatesDTO) SetToDate(v string)`

SetToDate sets ToDate field to given value.

### HasToDate

`func (o *OrderDeliveryDatesDTO) HasToDate() bool`

HasToDate returns a boolean if a field has been set.

### GetFromTime

`func (o *OrderDeliveryDatesDTO) GetFromTime() string`

GetFromTime returns the FromTime field if non-nil, zero value otherwise.

### GetFromTimeOk

`func (o *OrderDeliveryDatesDTO) GetFromTimeOk() (*string, bool)`

GetFromTimeOk returns a tuple with the FromTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromTime

`func (o *OrderDeliveryDatesDTO) SetFromTime(v string)`

SetFromTime sets FromTime field to given value.

### HasFromTime

`func (o *OrderDeliveryDatesDTO) HasFromTime() bool`

HasFromTime returns a boolean if a field has been set.

### GetToTime

`func (o *OrderDeliveryDatesDTO) GetToTime() string`

GetToTime returns the ToTime field if non-nil, zero value otherwise.

### GetToTimeOk

`func (o *OrderDeliveryDatesDTO) GetToTimeOk() (*string, bool)`

GetToTimeOk returns a tuple with the ToTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToTime

`func (o *OrderDeliveryDatesDTO) SetToTime(v string)`

SetToTime sets ToTime field to given value.

### HasToTime

`func (o *OrderDeliveryDatesDTO) HasToTime() bool`

HasToTime returns a boolean if a field has been set.

### GetRealDeliveryDate

`func (o *OrderDeliveryDatesDTO) GetRealDeliveryDate() string`

GetRealDeliveryDate returns the RealDeliveryDate field if non-nil, zero value otherwise.

### GetRealDeliveryDateOk

`func (o *OrderDeliveryDatesDTO) GetRealDeliveryDateOk() (*string, bool)`

GetRealDeliveryDateOk returns a tuple with the RealDeliveryDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealDeliveryDate

`func (o *OrderDeliveryDatesDTO) SetRealDeliveryDate(v string)`

SetRealDeliveryDate sets RealDeliveryDate field to given value.

### HasRealDeliveryDate

`func (o *OrderDeliveryDatesDTO) HasRealDeliveryDate() bool`

HasRealDeliveryDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


