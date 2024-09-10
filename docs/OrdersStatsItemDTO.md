# OrdersStatsItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferName** | Pointer to **string** | Название товара. | [optional] 
**MarketSku** | Pointer to **int64** | SKU на Маркете. | [optional] 
**ShopSku** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Count** | Pointer to **int32** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  | [optional] 
**Prices** | Pointer to [**[]OrdersStatsPriceDTO**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. | [optional] 
**Warehouse** | Pointer to [**OrdersStatsWarehouseDTO**](OrdersStatsWarehouseDTO.md) |  | [optional] 
**Details** | Pointer to [**[]OrdersStatsDetailsDTO**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. | [optional] 
**CisList** | Pointer to **[]string** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] 
**InitialCount** | Pointer to **int32** | Первоначальное количество единиц товара. | [optional] 
**BidFee** | Pointer to **int32** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  | [optional] 
**CofinanceThreshold** | Pointer to **float32** | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  | [optional] 
**CofinanceValue** | Pointer to **float32** | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  | [optional] 

## Methods

### NewOrdersStatsItemDTO

`func NewOrdersStatsItemDTO() *OrdersStatsItemDTO`

NewOrdersStatsItemDTO instantiates a new OrdersStatsItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrdersStatsItemDTOWithDefaults

`func NewOrdersStatsItemDTOWithDefaults() *OrdersStatsItemDTO`

NewOrdersStatsItemDTOWithDefaults instantiates a new OrdersStatsItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferName

`func (o *OrdersStatsItemDTO) GetOfferName() string`

GetOfferName returns the OfferName field if non-nil, zero value otherwise.

### GetOfferNameOk

`func (o *OrdersStatsItemDTO) GetOfferNameOk() (*string, bool)`

GetOfferNameOk returns a tuple with the OfferName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferName

`func (o *OrdersStatsItemDTO) SetOfferName(v string)`

SetOfferName sets OfferName field to given value.

### HasOfferName

`func (o *OrdersStatsItemDTO) HasOfferName() bool`

HasOfferName returns a boolean if a field has been set.

### GetMarketSku

`func (o *OrdersStatsItemDTO) GetMarketSku() int64`

GetMarketSku returns the MarketSku field if non-nil, zero value otherwise.

### GetMarketSkuOk

`func (o *OrdersStatsItemDTO) GetMarketSkuOk() (*int64, bool)`

GetMarketSkuOk returns a tuple with the MarketSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketSku

`func (o *OrdersStatsItemDTO) SetMarketSku(v int64)`

SetMarketSku sets MarketSku field to given value.

### HasMarketSku

`func (o *OrdersStatsItemDTO) HasMarketSku() bool`

HasMarketSku returns a boolean if a field has been set.

### GetShopSku

`func (o *OrdersStatsItemDTO) GetShopSku() string`

GetShopSku returns the ShopSku field if non-nil, zero value otherwise.

### GetShopSkuOk

`func (o *OrdersStatsItemDTO) GetShopSkuOk() (*string, bool)`

GetShopSkuOk returns a tuple with the ShopSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopSku

`func (o *OrdersStatsItemDTO) SetShopSku(v string)`

SetShopSku sets ShopSku field to given value.

### HasShopSku

`func (o *OrdersStatsItemDTO) HasShopSku() bool`

HasShopSku returns a boolean if a field has been set.

### GetCount

`func (o *OrdersStatsItemDTO) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *OrdersStatsItemDTO) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *OrdersStatsItemDTO) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *OrdersStatsItemDTO) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetPrices

`func (o *OrdersStatsItemDTO) GetPrices() []OrdersStatsPriceDTO`

GetPrices returns the Prices field if non-nil, zero value otherwise.

### GetPricesOk

`func (o *OrdersStatsItemDTO) GetPricesOk() (*[]OrdersStatsPriceDTO, bool)`

GetPricesOk returns a tuple with the Prices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrices

`func (o *OrdersStatsItemDTO) SetPrices(v []OrdersStatsPriceDTO)`

SetPrices sets Prices field to given value.

### HasPrices

`func (o *OrdersStatsItemDTO) HasPrices() bool`

HasPrices returns a boolean if a field has been set.

### SetPricesNil

`func (o *OrdersStatsItemDTO) SetPricesNil(b bool)`

 SetPricesNil sets the value for Prices to be an explicit nil

### UnsetPrices
`func (o *OrdersStatsItemDTO) UnsetPrices()`

UnsetPrices ensures that no value is present for Prices, not even an explicit nil
### GetWarehouse

`func (o *OrdersStatsItemDTO) GetWarehouse() OrdersStatsWarehouseDTO`

GetWarehouse returns the Warehouse field if non-nil, zero value otherwise.

### GetWarehouseOk

`func (o *OrdersStatsItemDTO) GetWarehouseOk() (*OrdersStatsWarehouseDTO, bool)`

GetWarehouseOk returns a tuple with the Warehouse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouse

`func (o *OrdersStatsItemDTO) SetWarehouse(v OrdersStatsWarehouseDTO)`

SetWarehouse sets Warehouse field to given value.

### HasWarehouse

`func (o *OrdersStatsItemDTO) HasWarehouse() bool`

HasWarehouse returns a boolean if a field has been set.

### GetDetails

`func (o *OrdersStatsItemDTO) GetDetails() []OrdersStatsDetailsDTO`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *OrdersStatsItemDTO) GetDetailsOk() (*[]OrdersStatsDetailsDTO, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *OrdersStatsItemDTO) SetDetails(v []OrdersStatsDetailsDTO)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *OrdersStatsItemDTO) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### SetDetailsNil

`func (o *OrdersStatsItemDTO) SetDetailsNil(b bool)`

 SetDetailsNil sets the value for Details to be an explicit nil

### UnsetDetails
`func (o *OrdersStatsItemDTO) UnsetDetails()`

UnsetDetails ensures that no value is present for Details, not even an explicit nil
### GetCisList

`func (o *OrdersStatsItemDTO) GetCisList() []string`

GetCisList returns the CisList field if non-nil, zero value otherwise.

### GetCisListOk

`func (o *OrdersStatsItemDTO) GetCisListOk() (*[]string, bool)`

GetCisListOk returns a tuple with the CisList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCisList

`func (o *OrdersStatsItemDTO) SetCisList(v []string)`

SetCisList sets CisList field to given value.

### HasCisList

`func (o *OrdersStatsItemDTO) HasCisList() bool`

HasCisList returns a boolean if a field has been set.

### SetCisListNil

`func (o *OrdersStatsItemDTO) SetCisListNil(b bool)`

 SetCisListNil sets the value for CisList to be an explicit nil

### UnsetCisList
`func (o *OrdersStatsItemDTO) UnsetCisList()`

UnsetCisList ensures that no value is present for CisList, not even an explicit nil
### GetInitialCount

`func (o *OrdersStatsItemDTO) GetInitialCount() int32`

GetInitialCount returns the InitialCount field if non-nil, zero value otherwise.

### GetInitialCountOk

`func (o *OrdersStatsItemDTO) GetInitialCountOk() (*int32, bool)`

GetInitialCountOk returns a tuple with the InitialCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitialCount

`func (o *OrdersStatsItemDTO) SetInitialCount(v int32)`

SetInitialCount sets InitialCount field to given value.

### HasInitialCount

`func (o *OrdersStatsItemDTO) HasInitialCount() bool`

HasInitialCount returns a boolean if a field has been set.

### GetBidFee

`func (o *OrdersStatsItemDTO) GetBidFee() int32`

GetBidFee returns the BidFee field if non-nil, zero value otherwise.

### GetBidFeeOk

`func (o *OrdersStatsItemDTO) GetBidFeeOk() (*int32, bool)`

GetBidFeeOk returns a tuple with the BidFee field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidFee

`func (o *OrdersStatsItemDTO) SetBidFee(v int32)`

SetBidFee sets BidFee field to given value.

### HasBidFee

`func (o *OrdersStatsItemDTO) HasBidFee() bool`

HasBidFee returns a boolean if a field has been set.

### GetCofinanceThreshold

`func (o *OrdersStatsItemDTO) GetCofinanceThreshold() float32`

GetCofinanceThreshold returns the CofinanceThreshold field if non-nil, zero value otherwise.

### GetCofinanceThresholdOk

`func (o *OrdersStatsItemDTO) GetCofinanceThresholdOk() (*float32, bool)`

GetCofinanceThresholdOk returns a tuple with the CofinanceThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCofinanceThreshold

`func (o *OrdersStatsItemDTO) SetCofinanceThreshold(v float32)`

SetCofinanceThreshold sets CofinanceThreshold field to given value.

### HasCofinanceThreshold

`func (o *OrdersStatsItemDTO) HasCofinanceThreshold() bool`

HasCofinanceThreshold returns a boolean if a field has been set.

### GetCofinanceValue

`func (o *OrdersStatsItemDTO) GetCofinanceValue() float32`

GetCofinanceValue returns the CofinanceValue field if non-nil, zero value otherwise.

### GetCofinanceValueOk

`func (o *OrdersStatsItemDTO) GetCofinanceValueOk() (*float32, bool)`

GetCofinanceValueOk returns a tuple with the CofinanceValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCofinanceValue

`func (o *OrdersStatsItemDTO) SetCofinanceValue(v float32)`

SetCofinanceValue sets CofinanceValue field to given value.

### HasCofinanceValue

`func (o *OrdersStatsItemDTO) HasCofinanceValue() bool`

HasCofinanceValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


