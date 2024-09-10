# PromoOfferDiscountParamsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Price** | Pointer to **int64** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] 
**PromoPrice** | Pointer to **int64** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] 
**MaxPromoPrice** | **int64** | Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  | 

## Methods

### NewPromoOfferDiscountParamsDTO

`func NewPromoOfferDiscountParamsDTO(maxPromoPrice int64, ) *PromoOfferDiscountParamsDTO`

NewPromoOfferDiscountParamsDTO instantiates a new PromoOfferDiscountParamsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPromoOfferDiscountParamsDTOWithDefaults

`func NewPromoOfferDiscountParamsDTOWithDefaults() *PromoOfferDiscountParamsDTO`

NewPromoOfferDiscountParamsDTOWithDefaults instantiates a new PromoOfferDiscountParamsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPrice

`func (o *PromoOfferDiscountParamsDTO) GetPrice() int64`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *PromoOfferDiscountParamsDTO) GetPriceOk() (*int64, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *PromoOfferDiscountParamsDTO) SetPrice(v int64)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *PromoOfferDiscountParamsDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetPromoPrice

`func (o *PromoOfferDiscountParamsDTO) GetPromoPrice() int64`

GetPromoPrice returns the PromoPrice field if non-nil, zero value otherwise.

### GetPromoPriceOk

`func (o *PromoOfferDiscountParamsDTO) GetPromoPriceOk() (*int64, bool)`

GetPromoPriceOk returns a tuple with the PromoPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoPrice

`func (o *PromoOfferDiscountParamsDTO) SetPromoPrice(v int64)`

SetPromoPrice sets PromoPrice field to given value.

### HasPromoPrice

`func (o *PromoOfferDiscountParamsDTO) HasPromoPrice() bool`

HasPromoPrice returns a boolean if a field has been set.

### GetMaxPromoPrice

`func (o *PromoOfferDiscountParamsDTO) GetMaxPromoPrice() int64`

GetMaxPromoPrice returns the MaxPromoPrice field if non-nil, zero value otherwise.

### GetMaxPromoPriceOk

`func (o *PromoOfferDiscountParamsDTO) GetMaxPromoPriceOk() (*int64, bool)`

GetMaxPromoPriceOk returns a tuple with the MaxPromoPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxPromoPrice

`func (o *PromoOfferDiscountParamsDTO) SetMaxPromoPrice(v int64)`

SetMaxPromoPrice sets MaxPromoPrice field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


