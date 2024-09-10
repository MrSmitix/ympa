# OrdersStatsCommissionDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**OrdersStatsCommissionType**](OrdersStatsCommissionType.md) |  | [optional] 
**Actual** | Pointer to **float32** | Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  | [optional] 

## Methods

### NewOrdersStatsCommissionDTO

`func NewOrdersStatsCommissionDTO() *OrdersStatsCommissionDTO`

NewOrdersStatsCommissionDTO instantiates a new OrdersStatsCommissionDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrdersStatsCommissionDTOWithDefaults

`func NewOrdersStatsCommissionDTOWithDefaults() *OrdersStatsCommissionDTO`

NewOrdersStatsCommissionDTOWithDefaults instantiates a new OrdersStatsCommissionDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OrdersStatsCommissionDTO) GetType() OrdersStatsCommissionType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrdersStatsCommissionDTO) GetTypeOk() (*OrdersStatsCommissionType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrdersStatsCommissionDTO) SetType(v OrdersStatsCommissionType)`

SetType sets Type field to given value.

### HasType

`func (o *OrdersStatsCommissionDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetActual

`func (o *OrdersStatsCommissionDTO) GetActual() float32`

GetActual returns the Actual field if non-nil, zero value otherwise.

### GetActualOk

`func (o *OrdersStatsCommissionDTO) GetActualOk() (*float32, bool)`

GetActualOk returns a tuple with the Actual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActual

`func (o *OrdersStatsCommissionDTO) SetActual(v float32)`

SetActual sets Actual field to given value.

### HasActual

`func (o *OrdersStatsCommissionDTO) HasActual() bool`

HasActual returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


