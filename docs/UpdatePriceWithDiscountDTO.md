# UpdatePriceWithDiscountDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **float32** | Значение. | 
**CurrencyId** | [**CurrencyType**](CurrencyType.md) |  | 
**DiscountBase** | Pointer to **float32** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 

## Methods

### NewUpdatePriceWithDiscountDTO

`func NewUpdatePriceWithDiscountDTO(value float32, currencyId CurrencyType, ) *UpdatePriceWithDiscountDTO`

NewUpdatePriceWithDiscountDTO instantiates a new UpdatePriceWithDiscountDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePriceWithDiscountDTOWithDefaults

`func NewUpdatePriceWithDiscountDTOWithDefaults() *UpdatePriceWithDiscountDTO`

NewUpdatePriceWithDiscountDTOWithDefaults instantiates a new UpdatePriceWithDiscountDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValue

`func (o *UpdatePriceWithDiscountDTO) GetValue() float32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *UpdatePriceWithDiscountDTO) GetValueOk() (*float32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *UpdatePriceWithDiscountDTO) SetValue(v float32)`

SetValue sets Value field to given value.


### GetCurrencyId

`func (o *UpdatePriceWithDiscountDTO) GetCurrencyId() CurrencyType`

GetCurrencyId returns the CurrencyId field if non-nil, zero value otherwise.

### GetCurrencyIdOk

`func (o *UpdatePriceWithDiscountDTO) GetCurrencyIdOk() (*CurrencyType, bool)`

GetCurrencyIdOk returns a tuple with the CurrencyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrencyId

`func (o *UpdatePriceWithDiscountDTO) SetCurrencyId(v CurrencyType)`

SetCurrencyId sets CurrencyId field to given value.


### GetDiscountBase

`func (o *UpdatePriceWithDiscountDTO) GetDiscountBase() float32`

GetDiscountBase returns the DiscountBase field if non-nil, zero value otherwise.

### GetDiscountBaseOk

`func (o *UpdatePriceWithDiscountDTO) GetDiscountBaseOk() (*float32, bool)`

GetDiscountBaseOk returns a tuple with the DiscountBase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountBase

`func (o *UpdatePriceWithDiscountDTO) SetDiscountBase(v float32)`

SetDiscountBase sets DiscountBase field to given value.

### HasDiscountBase

`func (o *UpdatePriceWithDiscountDTO) HasDiscountBase() bool`

HasDiscountBase returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


