# OpenapiClient::GoodsStatsGoodsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **shop_sku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] |
| **market_sku** | **Integer** | SKU на Маркете. | [optional] |
| **name** | **String** | Название товара. | [optional] |
| **price** | **Float** | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). | [optional] |
| **category_id** | **Integer** | Идентификатор категории товара на Маркете. | [optional] |
| **category_name** | **String** | Название категории товара на Маркете. | [optional] |
| **weight_dimensions** | [**GoodsStatsWeightDimensionsDTO**](GoodsStatsWeightDimensionsDTO.md) |  | [optional] |
| **warehouses** | [**Array&lt;GoodsStatsWarehouseDTO&gt;**](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  | [optional] |
| **tariffs** | [**Array&lt;TariffDTO&gt;**](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | [optional] |
| **pictures** | **Array&lt;String&gt;** | Ссылки (URL) изображений товара в хорошем качестве. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GoodsStatsGoodsDTO.new(
  shop_sku: null,
  market_sku: null,
  name: null,
  price: null,
  category_id: null,
  category_name: null,
  weight_dimensions: null,
  warehouses: null,
  tariffs: null,
  pictures: null
)
```

