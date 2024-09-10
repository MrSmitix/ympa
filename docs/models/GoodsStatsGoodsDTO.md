

# GoodsStatsGoodsDTO

Информация о товаре.

The class is defined in **[GoodsStatsGoodsDTO.java](../../src/main/java/org/openapitools/model/GoodsStatsGoodsDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shopSku** | `String` | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional property]
**marketSku** | `Long` | SKU на Маркете. |  [optional property]
**name** | `String` | Название товара. |  [optional property]
**price** | `BigDecimal` | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). |  [optional property]
**categoryId** | `Long` | Идентификатор категории товара на Маркете. |  [optional property]
**categoryName** | `String` | Название категории товара на Маркете. |  [optional property]
**weightDimensions** | [`GoodsStatsWeightDimensionsDTO`](GoodsStatsWeightDimensionsDTO.md) |  |  [optional property]
**warehouses** | [`List&lt;GoodsStatsWarehouseDTO&gt;`](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  |  [optional property]
**tariffs** | [`List&lt;TariffDTO&gt;`](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  |  [optional property]
**pictures** | `List&lt;String&gt;` | Ссылки (URL) изображений товара в хорошем качестве. |  [optional property]












