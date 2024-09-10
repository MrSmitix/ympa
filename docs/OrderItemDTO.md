# OrderItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] 
**OfferId** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**OfferName** | Pointer to **string** | Название товара. | [optional] 
**Price** | Pointer to **float32** | Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;).  | [optional] 
**BuyerPrice** | Pointer to **float32** | Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  | [optional] 
**BuyerPriceBeforeDiscount** | Pointer to **float32** | Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**PriceBeforeDiscount** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  | [optional] 
**Count** | Pointer to **int32** | Количество единиц товара. | [optional] 
**Vat** | Pointer to [**OrderVatType**](OrderVatType.md) |  | [optional] 
**ShopSku** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Subsidy** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  | [optional] 
**PartnerWarehouseId** | Pointer to **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  | [optional] 
**Promos** | Pointer to [**[]OrderItemPromoDTO**](OrderItemPromoDTO.md) | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. | [optional] 
**Instances** | Pointer to [**[]OrderItemInstanceDTO**](OrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует.  | [optional] 
**Details** | Pointer to [**[]OrderItemDetailDTO**](OrderItemDetailDTO.md) | Информация об удалении товара из заказа.  | [optional] 
**Subsidies** | Pointer to [**[]OrderItemSubsidyDTO**](OrderItemSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**RequiredInstanceTypes** | Pointer to [**[]OrderItemInstanceType**](OrderItemInstanceType.md) | Список необходимых маркировок товара. | [optional] 

## Methods

### NewOrderItemDTO

`func NewOrderItemDTO() *OrderItemDTO`

NewOrderItemDTO instantiates a new OrderItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderItemDTOWithDefaults

`func NewOrderItemDTOWithDefaults() *OrderItemDTO`

NewOrderItemDTOWithDefaults instantiates a new OrderItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderItemDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderItemDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderItemDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *OrderItemDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetOfferId

`func (o *OrderItemDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *OrderItemDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *OrderItemDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.

### HasOfferId

`func (o *OrderItemDTO) HasOfferId() bool`

HasOfferId returns a boolean if a field has been set.

### GetOfferName

`func (o *OrderItemDTO) GetOfferName() string`

GetOfferName returns the OfferName field if non-nil, zero value otherwise.

### GetOfferNameOk

`func (o *OrderItemDTO) GetOfferNameOk() (*string, bool)`

GetOfferNameOk returns a tuple with the OfferName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferName

`func (o *OrderItemDTO) SetOfferName(v string)`

SetOfferName sets OfferName field to given value.

### HasOfferName

`func (o *OrderItemDTO) HasOfferName() bool`

HasOfferName returns a boolean if a field has been set.

### GetPrice

`func (o *OrderItemDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *OrderItemDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *OrderItemDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *OrderItemDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetBuyerPrice

`func (o *OrderItemDTO) GetBuyerPrice() float32`

GetBuyerPrice returns the BuyerPrice field if non-nil, zero value otherwise.

### GetBuyerPriceOk

`func (o *OrderItemDTO) GetBuyerPriceOk() (*float32, bool)`

GetBuyerPriceOk returns a tuple with the BuyerPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuyerPrice

`func (o *OrderItemDTO) SetBuyerPrice(v float32)`

SetBuyerPrice sets BuyerPrice field to given value.

### HasBuyerPrice

`func (o *OrderItemDTO) HasBuyerPrice() bool`

HasBuyerPrice returns a boolean if a field has been set.

### GetBuyerPriceBeforeDiscount

`func (o *OrderItemDTO) GetBuyerPriceBeforeDiscount() float32`

GetBuyerPriceBeforeDiscount returns the BuyerPriceBeforeDiscount field if non-nil, zero value otherwise.

### GetBuyerPriceBeforeDiscountOk

`func (o *OrderItemDTO) GetBuyerPriceBeforeDiscountOk() (*float32, bool)`

GetBuyerPriceBeforeDiscountOk returns a tuple with the BuyerPriceBeforeDiscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuyerPriceBeforeDiscount

`func (o *OrderItemDTO) SetBuyerPriceBeforeDiscount(v float32)`

SetBuyerPriceBeforeDiscount sets BuyerPriceBeforeDiscount field to given value.

### HasBuyerPriceBeforeDiscount

`func (o *OrderItemDTO) HasBuyerPriceBeforeDiscount() bool`

HasBuyerPriceBeforeDiscount returns a boolean if a field has been set.

### GetPriceBeforeDiscount

`func (o *OrderItemDTO) GetPriceBeforeDiscount() float32`

GetPriceBeforeDiscount returns the PriceBeforeDiscount field if non-nil, zero value otherwise.

### GetPriceBeforeDiscountOk

`func (o *OrderItemDTO) GetPriceBeforeDiscountOk() (*float32, bool)`

GetPriceBeforeDiscountOk returns a tuple with the PriceBeforeDiscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceBeforeDiscount

`func (o *OrderItemDTO) SetPriceBeforeDiscount(v float32)`

SetPriceBeforeDiscount sets PriceBeforeDiscount field to given value.

### HasPriceBeforeDiscount

`func (o *OrderItemDTO) HasPriceBeforeDiscount() bool`

HasPriceBeforeDiscount returns a boolean if a field has been set.

### GetCount

`func (o *OrderItemDTO) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *OrderItemDTO) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *OrderItemDTO) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *OrderItemDTO) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetVat

`func (o *OrderItemDTO) GetVat() OrderVatType`

GetVat returns the Vat field if non-nil, zero value otherwise.

### GetVatOk

`func (o *OrderItemDTO) GetVatOk() (*OrderVatType, bool)`

GetVatOk returns a tuple with the Vat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVat

`func (o *OrderItemDTO) SetVat(v OrderVatType)`

SetVat sets Vat field to given value.

### HasVat

`func (o *OrderItemDTO) HasVat() bool`

HasVat returns a boolean if a field has been set.

### GetShopSku

`func (o *OrderItemDTO) GetShopSku() string`

GetShopSku returns the ShopSku field if non-nil, zero value otherwise.

### GetShopSkuOk

`func (o *OrderItemDTO) GetShopSkuOk() (*string, bool)`

GetShopSkuOk returns a tuple with the ShopSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopSku

`func (o *OrderItemDTO) SetShopSku(v string)`

SetShopSku sets ShopSku field to given value.

### HasShopSku

`func (o *OrderItemDTO) HasShopSku() bool`

HasShopSku returns a boolean if a field has been set.

### GetSubsidy

`func (o *OrderItemDTO) GetSubsidy() float32`

GetSubsidy returns the Subsidy field if non-nil, zero value otherwise.

### GetSubsidyOk

`func (o *OrderItemDTO) GetSubsidyOk() (*float32, bool)`

GetSubsidyOk returns a tuple with the Subsidy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubsidy

`func (o *OrderItemDTO) SetSubsidy(v float32)`

SetSubsidy sets Subsidy field to given value.

### HasSubsidy

`func (o *OrderItemDTO) HasSubsidy() bool`

HasSubsidy returns a boolean if a field has been set.

### GetPartnerWarehouseId

`func (o *OrderItemDTO) GetPartnerWarehouseId() string`

GetPartnerWarehouseId returns the PartnerWarehouseId field if non-nil, zero value otherwise.

### GetPartnerWarehouseIdOk

`func (o *OrderItemDTO) GetPartnerWarehouseIdOk() (*string, bool)`

GetPartnerWarehouseIdOk returns a tuple with the PartnerWarehouseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerWarehouseId

`func (o *OrderItemDTO) SetPartnerWarehouseId(v string)`

SetPartnerWarehouseId sets PartnerWarehouseId field to given value.

### HasPartnerWarehouseId

`func (o *OrderItemDTO) HasPartnerWarehouseId() bool`

HasPartnerWarehouseId returns a boolean if a field has been set.

### GetPromos

`func (o *OrderItemDTO) GetPromos() []OrderItemPromoDTO`

GetPromos returns the Promos field if non-nil, zero value otherwise.

### GetPromosOk

`func (o *OrderItemDTO) GetPromosOk() (*[]OrderItemPromoDTO, bool)`

GetPromosOk returns a tuple with the Promos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromos

`func (o *OrderItemDTO) SetPromos(v []OrderItemPromoDTO)`

SetPromos sets Promos field to given value.

### HasPromos

`func (o *OrderItemDTO) HasPromos() bool`

HasPromos returns a boolean if a field has been set.

### SetPromosNil

`func (o *OrderItemDTO) SetPromosNil(b bool)`

 SetPromosNil sets the value for Promos to be an explicit nil

### UnsetPromos
`func (o *OrderItemDTO) UnsetPromos()`

UnsetPromos ensures that no value is present for Promos, not even an explicit nil
### GetInstances

`func (o *OrderItemDTO) GetInstances() []OrderItemInstanceDTO`

GetInstances returns the Instances field if non-nil, zero value otherwise.

### GetInstancesOk

`func (o *OrderItemDTO) GetInstancesOk() (*[]OrderItemInstanceDTO, bool)`

GetInstancesOk returns a tuple with the Instances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstances

`func (o *OrderItemDTO) SetInstances(v []OrderItemInstanceDTO)`

SetInstances sets Instances field to given value.

### HasInstances

`func (o *OrderItemDTO) HasInstances() bool`

HasInstances returns a boolean if a field has been set.

### SetInstancesNil

`func (o *OrderItemDTO) SetInstancesNil(b bool)`

 SetInstancesNil sets the value for Instances to be an explicit nil

### UnsetInstances
`func (o *OrderItemDTO) UnsetInstances()`

UnsetInstances ensures that no value is present for Instances, not even an explicit nil
### GetDetails

`func (o *OrderItemDTO) GetDetails() []OrderItemDetailDTO`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *OrderItemDTO) GetDetailsOk() (*[]OrderItemDetailDTO, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *OrderItemDTO) SetDetails(v []OrderItemDetailDTO)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *OrderItemDTO) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### SetDetailsNil

`func (o *OrderItemDTO) SetDetailsNil(b bool)`

 SetDetailsNil sets the value for Details to be an explicit nil

### UnsetDetails
`func (o *OrderItemDTO) UnsetDetails()`

UnsetDetails ensures that no value is present for Details, not even an explicit nil
### GetSubsidies

`func (o *OrderItemDTO) GetSubsidies() []OrderItemSubsidyDTO`

GetSubsidies returns the Subsidies field if non-nil, zero value otherwise.

### GetSubsidiesOk

`func (o *OrderItemDTO) GetSubsidiesOk() (*[]OrderItemSubsidyDTO, bool)`

GetSubsidiesOk returns a tuple with the Subsidies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubsidies

`func (o *OrderItemDTO) SetSubsidies(v []OrderItemSubsidyDTO)`

SetSubsidies sets Subsidies field to given value.

### HasSubsidies

`func (o *OrderItemDTO) HasSubsidies() bool`

HasSubsidies returns a boolean if a field has been set.

### SetSubsidiesNil

`func (o *OrderItemDTO) SetSubsidiesNil(b bool)`

 SetSubsidiesNil sets the value for Subsidies to be an explicit nil

### UnsetSubsidies
`func (o *OrderItemDTO) UnsetSubsidies()`

UnsetSubsidies ensures that no value is present for Subsidies, not even an explicit nil
### GetRequiredInstanceTypes

`func (o *OrderItemDTO) GetRequiredInstanceTypes() []OrderItemInstanceType`

GetRequiredInstanceTypes returns the RequiredInstanceTypes field if non-nil, zero value otherwise.

### GetRequiredInstanceTypesOk

`func (o *OrderItemDTO) GetRequiredInstanceTypesOk() (*[]OrderItemInstanceType, bool)`

GetRequiredInstanceTypesOk returns a tuple with the RequiredInstanceTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredInstanceTypes

`func (o *OrderItemDTO) SetRequiredInstanceTypes(v []OrderItemInstanceType)`

SetRequiredInstanceTypes sets RequiredInstanceTypes field to given value.

### HasRequiredInstanceTypes

`func (o *OrderItemDTO) HasRequiredInstanceTypes() bool`

HasRequiredInstanceTypes returns a boolean if a field has been set.

### SetRequiredInstanceTypesNil

`func (o *OrderItemDTO) SetRequiredInstanceTypesNil(b bool)`

 SetRequiredInstanceTypesNil sets the value for RequiredInstanceTypes to be an explicit nil

### UnsetRequiredInstanceTypes
`func (o *OrderItemDTO) UnsetRequiredInstanceTypes()`

UnsetRequiredInstanceTypes ensures that no value is present for RequiredInstanceTypes, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


