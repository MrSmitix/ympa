# SuggestOfferPriceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**MarketSku** | Pointer to **int64** | SKU на Маркете. | [optional] 

## Methods

### NewSuggestOfferPriceDTO

`func NewSuggestOfferPriceDTO() *SuggestOfferPriceDTO`

NewSuggestOfferPriceDTO instantiates a new SuggestOfferPriceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSuggestOfferPriceDTOWithDefaults

`func NewSuggestOfferPriceDTOWithDefaults() *SuggestOfferPriceDTO`

NewSuggestOfferPriceDTOWithDefaults instantiates a new SuggestOfferPriceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *SuggestOfferPriceDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *SuggestOfferPriceDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *SuggestOfferPriceDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.

### HasOfferId

`func (o *SuggestOfferPriceDTO) HasOfferId() bool`

HasOfferId returns a boolean if a field has been set.

### GetMarketSku

`func (o *SuggestOfferPriceDTO) GetMarketSku() int64`

GetMarketSku returns the MarketSku field if non-nil, zero value otherwise.

### GetMarketSkuOk

`func (o *SuggestOfferPriceDTO) GetMarketSkuOk() (*int64, bool)`

GetMarketSkuOk returns a tuple with the MarketSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketSku

`func (o *SuggestOfferPriceDTO) SetMarketSku(v int64)`

SetMarketSku sets MarketSku field to given value.

### HasMarketSku

`func (o *SuggestOfferPriceDTO) HasMarketSku() bool`

HasMarketSku returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


