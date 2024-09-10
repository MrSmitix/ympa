# ModelOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discount** | Pointer to **int32** | Скидка на предложение в процентах. | [optional] 
**Name** | Pointer to **string** | Наименование предложения. | [optional] 
**Pos** | Pointer to **int32** | Позиция предложения в выдаче Маркета на карточке модели. | [optional] 
**PreDiscountPrice** | Pointer to **float32** | Цена предложения без скидки магазина. | [optional] 
**Price** | Pointer to **float32** | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. | [optional] 
**RegionId** | Pointer to **int64** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них.  | [optional] 
**ShippingCost** | Pointer to **float32** | Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  | [optional] 
**ShopName** | Pointer to **string** | Название магазина (в том виде, в котором отображается на Маркете). | [optional] 
**ShopRating** | Pointer to **int32** | Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;.  | [optional] 
**InStock** | Pointer to **int32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 

## Methods

### NewModelOfferDTO

`func NewModelOfferDTO() *ModelOfferDTO`

NewModelOfferDTO instantiates a new ModelOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModelOfferDTOWithDefaults

`func NewModelOfferDTOWithDefaults() *ModelOfferDTO`

NewModelOfferDTOWithDefaults instantiates a new ModelOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscount

`func (o *ModelOfferDTO) GetDiscount() int32`

GetDiscount returns the Discount field if non-nil, zero value otherwise.

### GetDiscountOk

`func (o *ModelOfferDTO) GetDiscountOk() (*int32, bool)`

GetDiscountOk returns a tuple with the Discount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscount

`func (o *ModelOfferDTO) SetDiscount(v int32)`

SetDiscount sets Discount field to given value.

### HasDiscount

`func (o *ModelOfferDTO) HasDiscount() bool`

HasDiscount returns a boolean if a field has been set.

### GetName

`func (o *ModelOfferDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModelOfferDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModelOfferDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModelOfferDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPos

`func (o *ModelOfferDTO) GetPos() int32`

GetPos returns the Pos field if non-nil, zero value otherwise.

### GetPosOk

`func (o *ModelOfferDTO) GetPosOk() (*int32, bool)`

GetPosOk returns a tuple with the Pos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPos

`func (o *ModelOfferDTO) SetPos(v int32)`

SetPos sets Pos field to given value.

### HasPos

`func (o *ModelOfferDTO) HasPos() bool`

HasPos returns a boolean if a field has been set.

### GetPreDiscountPrice

`func (o *ModelOfferDTO) GetPreDiscountPrice() float32`

GetPreDiscountPrice returns the PreDiscountPrice field if non-nil, zero value otherwise.

### GetPreDiscountPriceOk

`func (o *ModelOfferDTO) GetPreDiscountPriceOk() (*float32, bool)`

GetPreDiscountPriceOk returns a tuple with the PreDiscountPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreDiscountPrice

`func (o *ModelOfferDTO) SetPreDiscountPrice(v float32)`

SetPreDiscountPrice sets PreDiscountPrice field to given value.

### HasPreDiscountPrice

`func (o *ModelOfferDTO) HasPreDiscountPrice() bool`

HasPreDiscountPrice returns a boolean if a field has been set.

### GetPrice

`func (o *ModelOfferDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *ModelOfferDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *ModelOfferDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *ModelOfferDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetRegionId

`func (o *ModelOfferDTO) GetRegionId() int64`

GetRegionId returns the RegionId field if non-nil, zero value otherwise.

### GetRegionIdOk

`func (o *ModelOfferDTO) GetRegionIdOk() (*int64, bool)`

GetRegionIdOk returns a tuple with the RegionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegionId

`func (o *ModelOfferDTO) SetRegionId(v int64)`

SetRegionId sets RegionId field to given value.

### HasRegionId

`func (o *ModelOfferDTO) HasRegionId() bool`

HasRegionId returns a boolean if a field has been set.

### GetShippingCost

`func (o *ModelOfferDTO) GetShippingCost() float32`

GetShippingCost returns the ShippingCost field if non-nil, zero value otherwise.

### GetShippingCostOk

`func (o *ModelOfferDTO) GetShippingCostOk() (*float32, bool)`

GetShippingCostOk returns a tuple with the ShippingCost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingCost

`func (o *ModelOfferDTO) SetShippingCost(v float32)`

SetShippingCost sets ShippingCost field to given value.

### HasShippingCost

`func (o *ModelOfferDTO) HasShippingCost() bool`

HasShippingCost returns a boolean if a field has been set.

### GetShopName

`func (o *ModelOfferDTO) GetShopName() string`

GetShopName returns the ShopName field if non-nil, zero value otherwise.

### GetShopNameOk

`func (o *ModelOfferDTO) GetShopNameOk() (*string, bool)`

GetShopNameOk returns a tuple with the ShopName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopName

`func (o *ModelOfferDTO) SetShopName(v string)`

SetShopName sets ShopName field to given value.

### HasShopName

`func (o *ModelOfferDTO) HasShopName() bool`

HasShopName returns a boolean if a field has been set.

### GetShopRating

`func (o *ModelOfferDTO) GetShopRating() int32`

GetShopRating returns the ShopRating field if non-nil, zero value otherwise.

### GetShopRatingOk

`func (o *ModelOfferDTO) GetShopRatingOk() (*int32, bool)`

GetShopRatingOk returns a tuple with the ShopRating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopRating

`func (o *ModelOfferDTO) SetShopRating(v int32)`

SetShopRating sets ShopRating field to given value.

### HasShopRating

`func (o *ModelOfferDTO) HasShopRating() bool`

HasShopRating returns a boolean if a field has been set.

### GetInStock

`func (o *ModelOfferDTO) GetInStock() int32`

GetInStock returns the InStock field if non-nil, zero value otherwise.

### GetInStockOk

`func (o *ModelOfferDTO) GetInStockOk() (*int32, bool)`

GetInStockOk returns a tuple with the InStock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInStock

`func (o *ModelOfferDTO) SetInStock(v int32)`

SetInStock sets InStock field to given value.

### HasInStock

`func (o *ModelOfferDTO) HasInStock() bool`

HasInStock returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


