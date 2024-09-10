# OfferPriceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Price** | Pointer to [**PriceDTO**](PriceDTO.md) |  | [optional] 

## Methods

### NewOfferPriceDTO

`func NewOfferPriceDTO() *OfferPriceDTO`

NewOfferPriceDTO instantiates a new OfferPriceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferPriceDTOWithDefaults

`func NewOfferPriceDTOWithDefaults() *OfferPriceDTO`

NewOfferPriceDTOWithDefaults instantiates a new OfferPriceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *OfferPriceDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *OfferPriceDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *OfferPriceDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.

### HasOfferId

`func (o *OfferPriceDTO) HasOfferId() bool`

HasOfferId returns a boolean if a field has been set.

### GetPrice

`func (o *OfferPriceDTO) GetPrice() PriceDTO`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *OfferPriceDTO) GetPriceOk() (*PriceDTO, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *OfferPriceDTO) SetPrice(v PriceDTO)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *OfferPriceDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


