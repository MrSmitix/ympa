# GoodsStatsGoodsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShopSku** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**MarketSku** | Pointer to **int64** | SKU на Маркете. | [optional] 
**Name** | Pointer to **string** | Название товара. | [optional] 
**Price** | Pointer to **float32** | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). | [optional] 
**CategoryId** | Pointer to **int64** | Идентификатор категории товара на Маркете. | [optional] 
**CategoryName** | Pointer to **string** | Название категории товара на Маркете. | [optional] 
**WeightDimensions** | Pointer to [**GoodsStatsWeightDimensionsDTO**](GoodsStatsWeightDimensionsDTO.md) |  | [optional] 
**Warehouses** | Pointer to [**[]GoodsStatsWarehouseDTO**](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  | [optional] 
**Tariffs** | Pointer to [**[]TariffDTO**](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | [optional] 
**Pictures** | Pointer to **[]string** | Ссылки (URL) изображений товара в хорошем качестве. | [optional] 

## Methods

### NewGoodsStatsGoodsDTO

`func NewGoodsStatsGoodsDTO() *GoodsStatsGoodsDTO`

NewGoodsStatsGoodsDTO instantiates a new GoodsStatsGoodsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGoodsStatsGoodsDTOWithDefaults

`func NewGoodsStatsGoodsDTOWithDefaults() *GoodsStatsGoodsDTO`

NewGoodsStatsGoodsDTOWithDefaults instantiates a new GoodsStatsGoodsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetShopSku

`func (o *GoodsStatsGoodsDTO) GetShopSku() string`

GetShopSku returns the ShopSku field if non-nil, zero value otherwise.

### GetShopSkuOk

`func (o *GoodsStatsGoodsDTO) GetShopSkuOk() (*string, bool)`

GetShopSkuOk returns a tuple with the ShopSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopSku

`func (o *GoodsStatsGoodsDTO) SetShopSku(v string)`

SetShopSku sets ShopSku field to given value.

### HasShopSku

`func (o *GoodsStatsGoodsDTO) HasShopSku() bool`

HasShopSku returns a boolean if a field has been set.

### GetMarketSku

`func (o *GoodsStatsGoodsDTO) GetMarketSku() int64`

GetMarketSku returns the MarketSku field if non-nil, zero value otherwise.

### GetMarketSkuOk

`func (o *GoodsStatsGoodsDTO) GetMarketSkuOk() (*int64, bool)`

GetMarketSkuOk returns a tuple with the MarketSku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarketSku

`func (o *GoodsStatsGoodsDTO) SetMarketSku(v int64)`

SetMarketSku sets MarketSku field to given value.

### HasMarketSku

`func (o *GoodsStatsGoodsDTO) HasMarketSku() bool`

HasMarketSku returns a boolean if a field has been set.

### GetName

`func (o *GoodsStatsGoodsDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GoodsStatsGoodsDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GoodsStatsGoodsDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GoodsStatsGoodsDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPrice

`func (o *GoodsStatsGoodsDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *GoodsStatsGoodsDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *GoodsStatsGoodsDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *GoodsStatsGoodsDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetCategoryId

`func (o *GoodsStatsGoodsDTO) GetCategoryId() int64`

GetCategoryId returns the CategoryId field if non-nil, zero value otherwise.

### GetCategoryIdOk

`func (o *GoodsStatsGoodsDTO) GetCategoryIdOk() (*int64, bool)`

GetCategoryIdOk returns a tuple with the CategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryId

`func (o *GoodsStatsGoodsDTO) SetCategoryId(v int64)`

SetCategoryId sets CategoryId field to given value.

### HasCategoryId

`func (o *GoodsStatsGoodsDTO) HasCategoryId() bool`

HasCategoryId returns a boolean if a field has been set.

### GetCategoryName

`func (o *GoodsStatsGoodsDTO) GetCategoryName() string`

GetCategoryName returns the CategoryName field if non-nil, zero value otherwise.

### GetCategoryNameOk

`func (o *GoodsStatsGoodsDTO) GetCategoryNameOk() (*string, bool)`

GetCategoryNameOk returns a tuple with the CategoryName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryName

`func (o *GoodsStatsGoodsDTO) SetCategoryName(v string)`

SetCategoryName sets CategoryName field to given value.

### HasCategoryName

`func (o *GoodsStatsGoodsDTO) HasCategoryName() bool`

HasCategoryName returns a boolean if a field has been set.

### GetWeightDimensions

`func (o *GoodsStatsGoodsDTO) GetWeightDimensions() GoodsStatsWeightDimensionsDTO`

GetWeightDimensions returns the WeightDimensions field if non-nil, zero value otherwise.

### GetWeightDimensionsOk

`func (o *GoodsStatsGoodsDTO) GetWeightDimensionsOk() (*GoodsStatsWeightDimensionsDTO, bool)`

GetWeightDimensionsOk returns a tuple with the WeightDimensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightDimensions

`func (o *GoodsStatsGoodsDTO) SetWeightDimensions(v GoodsStatsWeightDimensionsDTO)`

SetWeightDimensions sets WeightDimensions field to given value.

### HasWeightDimensions

`func (o *GoodsStatsGoodsDTO) HasWeightDimensions() bool`

HasWeightDimensions returns a boolean if a field has been set.

### GetWarehouses

`func (o *GoodsStatsGoodsDTO) GetWarehouses() []GoodsStatsWarehouseDTO`

GetWarehouses returns the Warehouses field if non-nil, zero value otherwise.

### GetWarehousesOk

`func (o *GoodsStatsGoodsDTO) GetWarehousesOk() (*[]GoodsStatsWarehouseDTO, bool)`

GetWarehousesOk returns a tuple with the Warehouses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouses

`func (o *GoodsStatsGoodsDTO) SetWarehouses(v []GoodsStatsWarehouseDTO)`

SetWarehouses sets Warehouses field to given value.

### HasWarehouses

`func (o *GoodsStatsGoodsDTO) HasWarehouses() bool`

HasWarehouses returns a boolean if a field has been set.

### SetWarehousesNil

`func (o *GoodsStatsGoodsDTO) SetWarehousesNil(b bool)`

 SetWarehousesNil sets the value for Warehouses to be an explicit nil

### UnsetWarehouses
`func (o *GoodsStatsGoodsDTO) UnsetWarehouses()`

UnsetWarehouses ensures that no value is present for Warehouses, not even an explicit nil
### GetTariffs

`func (o *GoodsStatsGoodsDTO) GetTariffs() []TariffDTO`

GetTariffs returns the Tariffs field if non-nil, zero value otherwise.

### GetTariffsOk

`func (o *GoodsStatsGoodsDTO) GetTariffsOk() (*[]TariffDTO, bool)`

GetTariffsOk returns a tuple with the Tariffs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTariffs

`func (o *GoodsStatsGoodsDTO) SetTariffs(v []TariffDTO)`

SetTariffs sets Tariffs field to given value.

### HasTariffs

`func (o *GoodsStatsGoodsDTO) HasTariffs() bool`

HasTariffs returns a boolean if a field has been set.

### SetTariffsNil

`func (o *GoodsStatsGoodsDTO) SetTariffsNil(b bool)`

 SetTariffsNil sets the value for Tariffs to be an explicit nil

### UnsetTariffs
`func (o *GoodsStatsGoodsDTO) UnsetTariffs()`

UnsetTariffs ensures that no value is present for Tariffs, not even an explicit nil
### GetPictures

`func (o *GoodsStatsGoodsDTO) GetPictures() []string`

GetPictures returns the Pictures field if non-nil, zero value otherwise.

### GetPicturesOk

`func (o *GoodsStatsGoodsDTO) GetPicturesOk() (*[]string, bool)`

GetPicturesOk returns a tuple with the Pictures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPictures

`func (o *GoodsStatsGoodsDTO) SetPictures(v []string)`

SetPictures sets Pictures field to given value.

### HasPictures

`func (o *GoodsStatsGoodsDTO) HasPictures() bool`

HasPictures returns a boolean if a field has been set.

### SetPicturesNil

`func (o *GoodsStatsGoodsDTO) SetPicturesNil(b bool)`

 SetPicturesNil sets the value for Pictures to be an explicit nil

### UnsetPictures
`func (o *GoodsStatsGoodsDTO) UnsetPictures()`

UnsetPictures ensures that no value is present for Pictures, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


