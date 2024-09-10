# OrdersStatsPaymentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Идентификатор денежного перевода. | [optional] 
**Date** | Pointer to **string** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**Type** | Pointer to [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] 
**Source** | Pointer to [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] 
**Total** | Pointer to **float32** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**PaymentOrder** | Pointer to [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 

## Methods

### NewOrdersStatsPaymentDTO

`func NewOrdersStatsPaymentDTO() *OrdersStatsPaymentDTO`

NewOrdersStatsPaymentDTO instantiates a new OrdersStatsPaymentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrdersStatsPaymentDTOWithDefaults

`func NewOrdersStatsPaymentDTOWithDefaults() *OrdersStatsPaymentDTO`

NewOrdersStatsPaymentDTOWithDefaults instantiates a new OrdersStatsPaymentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrdersStatsPaymentDTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrdersStatsPaymentDTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrdersStatsPaymentDTO) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OrdersStatsPaymentDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetDate

`func (o *OrdersStatsPaymentDTO) GetDate() string`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *OrdersStatsPaymentDTO) GetDateOk() (*string, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *OrdersStatsPaymentDTO) SetDate(v string)`

SetDate sets Date field to given value.

### HasDate

`func (o *OrdersStatsPaymentDTO) HasDate() bool`

HasDate returns a boolean if a field has been set.

### GetType

`func (o *OrdersStatsPaymentDTO) GetType() OrdersStatsPaymentType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrdersStatsPaymentDTO) GetTypeOk() (*OrdersStatsPaymentType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrdersStatsPaymentDTO) SetType(v OrdersStatsPaymentType)`

SetType sets Type field to given value.

### HasType

`func (o *OrdersStatsPaymentDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetSource

`func (o *OrdersStatsPaymentDTO) GetSource() OrdersStatsPaymentSourceType`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *OrdersStatsPaymentDTO) GetSourceOk() (*OrdersStatsPaymentSourceType, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *OrdersStatsPaymentDTO) SetSource(v OrdersStatsPaymentSourceType)`

SetSource sets Source field to given value.

### HasSource

`func (o *OrdersStatsPaymentDTO) HasSource() bool`

HasSource returns a boolean if a field has been set.

### GetTotal

`func (o *OrdersStatsPaymentDTO) GetTotal() float32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *OrdersStatsPaymentDTO) GetTotalOk() (*float32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *OrdersStatsPaymentDTO) SetTotal(v float32)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *OrdersStatsPaymentDTO) HasTotal() bool`

HasTotal returns a boolean if a field has been set.

### GetPaymentOrder

`func (o *OrdersStatsPaymentDTO) GetPaymentOrder() OrdersStatsPaymentOrderDTO`

GetPaymentOrder returns the PaymentOrder field if non-nil, zero value otherwise.

### GetPaymentOrderOk

`func (o *OrdersStatsPaymentDTO) GetPaymentOrderOk() (*OrdersStatsPaymentOrderDTO, bool)`

GetPaymentOrderOk returns a tuple with the PaymentOrder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentOrder

`func (o *OrdersStatsPaymentDTO) SetPaymentOrder(v OrdersStatsPaymentOrderDTO)`

SetPaymentOrder sets PaymentOrder field to given value.

### HasPaymentOrder

`func (o *OrdersStatsPaymentDTO) HasPaymentOrder() bool`

HasPaymentOrder returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


