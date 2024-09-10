# OfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Price** | Pointer to **float32** | Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  | [optional] 
**FeedId** | Pointer to **int64** | Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**Id** | Pointer to **string** | Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**ShopCategoryId** | Pointer to **string** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**MarketCategoryId** | Pointer to **int32** | Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**PreDiscountPrice** | Pointer to **float32** | Цена предложения без скидки. | [optional] 
**Discount** | Pointer to **int32** | Скидка на предложение в процентах. | [optional] 
**CutPrice** | Pointer to **bool** | Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  | [optional] 
**Url** | Pointer to **string** | URL-адрес предложения на сайте магазина. | [optional] 
**ModelId** | **int64** | Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %}  | 
**Name** | Pointer to **string** | Наименование предложения. | [optional] 
**Currency** | Pointer to [**CurrencyType**](CurrencyType.md) |  | [optional] 
**Bid** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] 
**Cbid** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] 
**Fee** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  | [optional] 
**Blocked** | Pointer to **bool** | Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  | [optional] 

## Methods

### NewOfferDTO

`func NewOfferDTO(modelId int64, ) *OfferDTO`

NewOfferDTO instantiates a new OfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferDTOWithDefaults

`func NewOfferDTOWithDefaults() *OfferDTO`

NewOfferDTOWithDefaults instantiates a new OfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPrice

`func (o *OfferDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *OfferDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *OfferDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *OfferDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetFeedId

`func (o *OfferDTO) GetFeedId() int64`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *OfferDTO) GetFeedIdOk() (*int64, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *OfferDTO) SetFeedId(v int64)`

SetFeedId sets FeedId field to given value.

### HasFeedId

`func (o *OfferDTO) HasFeedId() bool`

HasFeedId returns a boolean if a field has been set.

### GetId

`func (o *OfferDTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OfferDTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OfferDTO) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OfferDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetShopCategoryId

`func (o *OfferDTO) GetShopCategoryId() string`

GetShopCategoryId returns the ShopCategoryId field if non-nil, zero value otherwise.

### GetShopCategoryIdOk

`func (o *OfferDTO) GetShopCategoryIdOk() (*string, bool)`

GetShopCategoryIdOk returns a tuple with the ShopCategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopCategoryId

`func (o *OfferDTO) SetShopCategoryId(v string)`

SetShopCategoryId sets ShopCategoryId field to given value.

### HasShopCategoryId

`func (o *OfferDTO) HasShopCategoryId() bool`

HasShopCategoryId returns a boolean if a field has been set.

### GetMarketCategoryId

`func (o *OfferDTO) GetMarketCategoryId() int32`

GetMarketCategoryId returns the MarketCategoryId field if non-nil, zero value otherwise.

### GetMarketCategoryIdOk

`func (o *OfferDTO) GetMarketCategoryIdOk() (*int32, bool)`

GetMarketCategoryIdOk returns a tuple with the MarketCategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketCategoryId

`func (o *OfferDTO) SetMarketCategoryId(v int32)`

SetMarketCategoryId sets MarketCategoryId field to given value.

### HasMarketCategoryId

`func (o *OfferDTO) HasMarketCategoryId() bool`

HasMarketCategoryId returns a boolean if a field has been set.

### GetPreDiscountPrice

`func (o *OfferDTO) GetPreDiscountPrice() float32`

GetPreDiscountPrice returns the PreDiscountPrice field if non-nil, zero value otherwise.

### GetPreDiscountPriceOk

`func (o *OfferDTO) GetPreDiscountPriceOk() (*float32, bool)`

GetPreDiscountPriceOk returns a tuple with the PreDiscountPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreDiscountPrice

`func (o *OfferDTO) SetPreDiscountPrice(v float32)`

SetPreDiscountPrice sets PreDiscountPrice field to given value.

### HasPreDiscountPrice

`func (o *OfferDTO) HasPreDiscountPrice() bool`

HasPreDiscountPrice returns a boolean if a field has been set.

### GetDiscount

`func (o *OfferDTO) GetDiscount() int32`

GetDiscount returns the Discount field if non-nil, zero value otherwise.

### GetDiscountOk

`func (o *OfferDTO) GetDiscountOk() (*int32, bool)`

GetDiscountOk returns a tuple with the Discount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscount

`func (o *OfferDTO) SetDiscount(v int32)`

SetDiscount sets Discount field to given value.

### HasDiscount

`func (o *OfferDTO) HasDiscount() bool`

HasDiscount returns a boolean if a field has been set.

### GetCutPrice

`func (o *OfferDTO) GetCutPrice() bool`

GetCutPrice returns the CutPrice field if non-nil, zero value otherwise.

### GetCutPriceOk

`func (o *OfferDTO) GetCutPriceOk() (*bool, bool)`

GetCutPriceOk returns a tuple with the CutPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCutPrice

`func (o *OfferDTO) SetCutPrice(v bool)`

SetCutPrice sets CutPrice field to given value.

### HasCutPrice

`func (o *OfferDTO) HasCutPrice() bool`

HasCutPrice returns a boolean if a field has been set.

### GetUrl

`func (o *OfferDTO) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *OfferDTO) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *OfferDTO) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *OfferDTO) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetModelId

`func (o *OfferDTO) GetModelId() int64`

GetModelId returns the ModelId field if non-nil, zero value otherwise.

### GetModelIdOk

`func (o *OfferDTO) GetModelIdOk() (*int64, bool)`

GetModelIdOk returns a tuple with the ModelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModelId

`func (o *OfferDTO) SetModelId(v int64)`

SetModelId sets ModelId field to given value.


### GetName

`func (o *OfferDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OfferDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OfferDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *OfferDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetCurrency

`func (o *OfferDTO) GetCurrency() CurrencyType`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *OfferDTO) GetCurrencyOk() (*CurrencyType, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *OfferDTO) SetCurrency(v CurrencyType)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *OfferDTO) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetBid

`func (o *OfferDTO) GetBid() float32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *OfferDTO) GetBidOk() (*float32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *OfferDTO) SetBid(v float32)`

SetBid sets Bid field to given value.

### HasBid

`func (o *OfferDTO) HasBid() bool`

HasBid returns a boolean if a field has been set.

### GetCbid

`func (o *OfferDTO) GetCbid() float32`

GetCbid returns the Cbid field if non-nil, zero value otherwise.

### GetCbidOk

`func (o *OfferDTO) GetCbidOk() (*float32, bool)`

GetCbidOk returns a tuple with the Cbid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCbid

`func (o *OfferDTO) SetCbid(v float32)`

SetCbid sets Cbid field to given value.

### HasCbid

`func (o *OfferDTO) HasCbid() bool`

HasCbid returns a boolean if a field has been set.

### GetFee

`func (o *OfferDTO) GetFee() float32`

GetFee returns the Fee field if non-nil, zero value otherwise.

### GetFeeOk

`func (o *OfferDTO) GetFeeOk() (*float32, bool)`

GetFeeOk returns a tuple with the Fee field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFee

`func (o *OfferDTO) SetFee(v float32)`

SetFee sets Fee field to given value.

### HasFee

`func (o *OfferDTO) HasFee() bool`

HasFee returns a boolean if a field has been set.

### GetBlocked

`func (o *OfferDTO) GetBlocked() bool`

GetBlocked returns the Blocked field if non-nil, zero value otherwise.

### GetBlockedOk

`func (o *OfferDTO) GetBlockedOk() (*bool, bool)`

GetBlockedOk returns a tuple with the Blocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlocked

`func (o *OfferDTO) SetBlocked(v bool)`

SetBlocked sets Blocked field to given value.

### HasBlocked

`func (o *OfferDTO) HasBlocked() bool`

HasBlocked returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


