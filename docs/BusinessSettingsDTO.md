# BusinessSettingsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OnlyDefaultPrice** | Pointer to **bool** | Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену.  | [optional] 
**Currency** | Pointer to [**CurrencyType**](CurrencyType.md) |  | [optional] 

## Methods

### NewBusinessSettingsDTO

`func NewBusinessSettingsDTO() *BusinessSettingsDTO`

NewBusinessSettingsDTO instantiates a new BusinessSettingsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessSettingsDTOWithDefaults

`func NewBusinessSettingsDTOWithDefaults() *BusinessSettingsDTO`

NewBusinessSettingsDTOWithDefaults instantiates a new BusinessSettingsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOnlyDefaultPrice

`func (o *BusinessSettingsDTO) GetOnlyDefaultPrice() bool`

GetOnlyDefaultPrice returns the OnlyDefaultPrice field if non-nil, zero value otherwise.

### GetOnlyDefaultPriceOk

`func (o *BusinessSettingsDTO) GetOnlyDefaultPriceOk() (*bool, bool)`

GetOnlyDefaultPriceOk returns a tuple with the OnlyDefaultPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlyDefaultPrice

`func (o *BusinessSettingsDTO) SetOnlyDefaultPrice(v bool)`

SetOnlyDefaultPrice sets OnlyDefaultPrice field to given value.

### HasOnlyDefaultPrice

`func (o *BusinessSettingsDTO) HasOnlyDefaultPrice() bool`

HasOnlyDefaultPrice returns a boolean if a field has been set.

### GetCurrency

`func (o *BusinessSettingsDTO) GetCurrency() CurrencyType`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *BusinessSettingsDTO) GetCurrencyOk() (*CurrencyType, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *BusinessSettingsDTO) SetCurrency(v CurrencyType)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *BusinessSettingsDTO) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


