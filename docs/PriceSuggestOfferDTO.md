# PriceSuggestOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketSku** | Pointer to **int64** | SKU на Маркете. | [optional] 
**OfferId** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**PriceSuggestion** | Pointer to [**[]PriceSuggestDTO**](PriceSuggestDTO.md) | Цены для продвижения.  | [optional] 

## Methods

### NewPriceSuggestOfferDTO

`func NewPriceSuggestOfferDTO() *PriceSuggestOfferDTO`

NewPriceSuggestOfferDTO instantiates a new PriceSuggestOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPriceSuggestOfferDTOWithDefaults

`func NewPriceSuggestOfferDTOWithDefaults() *PriceSuggestOfferDTO`

NewPriceSuggestOfferDTOWithDefaults instantiates a new PriceSuggestOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMarketSku

`func (o *PriceSuggestOfferDTO) GetMarketSku() int64`

GetMarketSku returns the MarketSku field if non-nil, zero value otherwise.

### GetMarketSkuOk

`func (o *PriceSuggestOfferDTO) GetMarketSkuOk() (*int64, bool)`

GetMarketSkuOk returns a tuple with the MarketSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketSku

`func (o *PriceSuggestOfferDTO) SetMarketSku(v int64)`

SetMarketSku sets MarketSku field to given value.

### HasMarketSku

`func (o *PriceSuggestOfferDTO) HasMarketSku() bool`

HasMarketSku returns a boolean if a field has been set.

### GetOfferId

`func (o *PriceSuggestOfferDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *PriceSuggestOfferDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *PriceSuggestOfferDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.

### HasOfferId

`func (o *PriceSuggestOfferDTO) HasOfferId() bool`

HasOfferId returns a boolean if a field has been set.

### GetPriceSuggestion

`func (o *PriceSuggestOfferDTO) GetPriceSuggestion() []PriceSuggestDTO`

GetPriceSuggestion returns the PriceSuggestion field if non-nil, zero value otherwise.

### GetPriceSuggestionOk

`func (o *PriceSuggestOfferDTO) GetPriceSuggestionOk() (*[]PriceSuggestDTO, bool)`

GetPriceSuggestionOk returns a tuple with the PriceSuggestion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceSuggestion

`func (o *PriceSuggestOfferDTO) SetPriceSuggestion(v []PriceSuggestDTO)`

SetPriceSuggestion sets PriceSuggestion field to given value.

### HasPriceSuggestion

`func (o *PriceSuggestOfferDTO) HasPriceSuggestion() bool`

HasPriceSuggestion returns a boolean if a field has been set.

### SetPriceSuggestionNil

`func (o *PriceSuggestOfferDTO) SetPriceSuggestionNil(b bool)`

 SetPriceSuggestionNil sets the value for PriceSuggestion to be an explicit nil

### UnsetPriceSuggestion
`func (o *PriceSuggestOfferDTO) UnsetPriceSuggestion()`

UnsetPriceSuggestion ensures that no value is present for PriceSuggestion, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


