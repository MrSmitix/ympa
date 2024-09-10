# GoodsStatsGoodsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**MarketSku** | **Int64** | SKU на Маркете. | [optional] 
**Name** | **String** | Название товара. | [optional] 
**Price** | **Decimal** | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). | [optional] 
**CategoryId** | **Int64** | Идентификатор категории товара на Маркете. | [optional] 
**CategoryName** | **String** | Название категории товара на Маркете. | [optional] 
**WeightDimensions** | [**GoodsStatsWeightDimensionsDTO**](GoodsStatsWeightDimensionsDTO.md) |  | [optional] 
**Warehouses** | [**GoodsStatsWarehouseDTO[]**](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  | [optional] 
**Tariffs** | [**TariffDTO[]**](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | [optional] 
**Pictures** | **String[]** | Ссылки (URL) изображений товара в хорошем качестве. | [optional] 

## Examples

- Prepare the resource
```powershell
$GoodsStatsGoodsDTO = Initialize-ympa_powershell_clientGoodsStatsGoodsDTO  -ShopSku null `
 -MarketSku null `
 -Name null `
 -Price null `
 -CategoryId null `
 -CategoryName null `
 -WeightDimensions null `
 -Warehouses null `
 -Tariffs null `
 -Pictures null
```

- Convert the resource to JSON
```powershell
$GoodsStatsGoodsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

