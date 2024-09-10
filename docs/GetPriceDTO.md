# GetPriceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **float32** | Значение. | 
**CurrencyId** | [**CurrencyType**](CurrencyType.md) |  | 
**UpdatedAt** | **time.Time** | Время последнего обновления. | 

## Methods

### NewGetPriceDTO

`func NewGetPriceDTO(value float32, currencyId CurrencyType, updatedAt time.Time, ) *GetPriceDTO`

NewGetPriceDTO instantiates a new GetPriceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPriceDTOWithDefaults

`func NewGetPriceDTOWithDefaults() *GetPriceDTO`

NewGetPriceDTOWithDefaults instantiates a new GetPriceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValue

`func (o *GetPriceDTO) GetValue() float32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *GetPriceDTO) GetValueOk() (*float32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *GetPriceDTO) SetValue(v float32)`

SetValue sets Value field to given value.


### GetCurrencyId

`func (o *GetPriceDTO) GetCurrencyId() CurrencyType`

GetCurrencyId returns the CurrencyId field if non-nil, zero value otherwise.

### GetCurrencyIdOk

`func (o *GetPriceDTO) GetCurrencyIdOk() (*CurrencyType, bool)`

GetCurrencyIdOk returns a tuple with the CurrencyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrencyId

`func (o *GetPriceDTO) SetCurrencyId(v CurrencyType)`

SetCurrencyId sets CurrencyId field to given value.


### GetUpdatedAt

`func (o *GetPriceDTO) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *GetPriceDTO) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *GetPriceDTO) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


