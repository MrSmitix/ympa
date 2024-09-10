
# GoodsStatsGoodsDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **shopSku** | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional] |
| **marketSku** | **kotlin.Long** | SKU на Маркете. |  [optional] |
| **name** | **kotlin.String** | Название товара. |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). |  [optional] |
| **categoryId** | **kotlin.Long** | Идентификатор категории товара на Маркете. |  [optional] |
| **categoryName** | **kotlin.String** | Название категории товара на Маркете. |  [optional] |
| **weightDimensions** | [**GoodsStatsWeightDimensionsDTO**](GoodsStatsWeightDimensionsDTO.md) |  |  [optional] |
| **warehouses** | [**kotlin.collections.List&lt;GoodsStatsWarehouseDTO&gt;**](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  |  [optional] |
| **tariffs** | [**kotlin.collections.List&lt;TariffDTO&gt;**](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  |  [optional] |
| **pictures** | **kotlin.collections.List&lt;kotlin.String&gt;** | Ссылки (URL) изображений товара в хорошем качестве. |  [optional] |



