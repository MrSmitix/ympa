# SkuBidRecommendationItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Sku** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Bid** | **int32** | Значение ставки. | 
**BidRecommendations** | Pointer to [**[]BidRecommendationItemDTO**](BidRecommendationItemDTO.md) | Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  | [optional] 
**PriceRecommendations** | Pointer to [**[]PriceRecommendationItemDTO**](PriceRecommendationItemDTO.md) | Рекомендованные цены. | [optional] 

## Methods

### NewSkuBidRecommendationItemDTO

`func NewSkuBidRecommendationItemDTO(sku string, bid int32, ) *SkuBidRecommendationItemDTO`

NewSkuBidRecommendationItemDTO instantiates a new SkuBidRecommendationItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSkuBidRecommendationItemDTOWithDefaults

`func NewSkuBidRecommendationItemDTOWithDefaults() *SkuBidRecommendationItemDTO`

NewSkuBidRecommendationItemDTOWithDefaults instantiates a new SkuBidRecommendationItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSku

`func (o *SkuBidRecommendationItemDTO) GetSku() string`

GetSku returns the Sku field if non-nil, zero value otherwise.

### GetSkuOk

`func (o *SkuBidRecommendationItemDTO) GetSkuOk() (*string, bool)`

GetSkuOk returns a tuple with the Sku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSku

`func (o *SkuBidRecommendationItemDTO) SetSku(v string)`

SetSku sets Sku field to given value.


### GetBid

`func (o *SkuBidRecommendationItemDTO) GetBid() int32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *SkuBidRecommendationItemDTO) GetBidOk() (*int32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *SkuBidRecommendationItemDTO) SetBid(v int32)`

SetBid sets Bid field to given value.


### GetBidRecommendations

`func (o *SkuBidRecommendationItemDTO) GetBidRecommendations() []BidRecommendationItemDTO`

GetBidRecommendations returns the BidRecommendations field if non-nil, zero value otherwise.

### GetBidRecommendationsOk

`func (o *SkuBidRecommendationItemDTO) GetBidRecommendationsOk() (*[]BidRecommendationItemDTO, bool)`

GetBidRecommendationsOk returns a tuple with the BidRecommendations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidRecommendations

`func (o *SkuBidRecommendationItemDTO) SetBidRecommendations(v []BidRecommendationItemDTO)`

SetBidRecommendations sets BidRecommendations field to given value.

### HasBidRecommendations

`func (o *SkuBidRecommendationItemDTO) HasBidRecommendations() bool`

HasBidRecommendations returns a boolean if a field has been set.

### SetBidRecommendationsNil

`func (o *SkuBidRecommendationItemDTO) SetBidRecommendationsNil(b bool)`

 SetBidRecommendationsNil sets the value for BidRecommendations to be an explicit nil

### UnsetBidRecommendations
`func (o *SkuBidRecommendationItemDTO) UnsetBidRecommendations()`

UnsetBidRecommendations ensures that no value is present for BidRecommendations, not even an explicit nil
### GetPriceRecommendations

`func (o *SkuBidRecommendationItemDTO) GetPriceRecommendations() []PriceRecommendationItemDTO`

GetPriceRecommendations returns the PriceRecommendations field if non-nil, zero value otherwise.

### GetPriceRecommendationsOk

`func (o *SkuBidRecommendationItemDTO) GetPriceRecommendationsOk() (*[]PriceRecommendationItemDTO, bool)`

GetPriceRecommendationsOk returns a tuple with the PriceRecommendations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceRecommendations

`func (o *SkuBidRecommendationItemDTO) SetPriceRecommendations(v []PriceRecommendationItemDTO)`

SetPriceRecommendations sets PriceRecommendations field to given value.

### HasPriceRecommendations

`func (o *SkuBidRecommendationItemDTO) HasPriceRecommendations() bool`

HasPriceRecommendations returns a boolean if a field has been set.

### SetPriceRecommendationsNil

`func (o *SkuBidRecommendationItemDTO) SetPriceRecommendationsNil(b bool)`

 SetPriceRecommendationsNil sets the value for PriceRecommendations to be an explicit nil

### UnsetPriceRecommendations
`func (o *SkuBidRecommendationItemDTO) UnsetPriceRecommendations()`

UnsetPriceRecommendations ensures that no value is present for PriceRecommendations, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


