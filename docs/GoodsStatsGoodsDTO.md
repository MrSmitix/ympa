
# Table `GoodsStatsGoodsDTO`
(mapped from: GoodsStatsGoodsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**shopSku** | shopSku | text |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional]
**marketSku** | marketSku | long |  | **kotlin.Long** | SKU на Маркете. |  [optional]
**name** | name | text |  | **kotlin.String** | Название товара. |  [optional]
**price** | price | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). |  [optional]
**categoryId** | categoryId | long |  | **kotlin.Long** | Идентификатор категории товара на Маркете. |  [optional]
**categoryName** | categoryName | text |  | **kotlin.String** | Название категории товара на Маркете. |  [optional]
**weightDimensions** | weightDimensions | long |  | [**GoodsStatsWeightDimensionsDTO**](GoodsStatsWeightDimensionsDTO.md) |  |  [optional] [foreignkey]
**warehouses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GoodsStatsWarehouseDTO&gt;**](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  |  [optional]
**tariffs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TariffDTO&gt;**](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  |  [optional]
**pictures** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Ссылки (URL) изображений товара в хорошем качестве. |  [optional]









# **Table `GoodsStatsGoodsDTOGoodsStatsWarehouseDTO`**
(mapped from: GoodsStatsGoodsDTOGoodsStatsWarehouseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsStatsGoodsDTO | goodsStatsGoodsDTO | long | | kotlin.Long | Primary Key | *one*
goodsStatsWarehouseDTO | goodsStatsWarehouseDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `GoodsStatsGoodsDTOTariffDTO`**
(mapped from: GoodsStatsGoodsDTOTariffDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsStatsGoodsDTO | goodsStatsGoodsDTO | long | | kotlin.Long | Primary Key | *one*
tariffDTO | tariffDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `GoodsStatsGoodsDTOPictures`**
(mapped from: GoodsStatsGoodsDTOPictures)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsStatsGoodsDTO | goodsStatsGoodsDTO | long | | kotlin.Long | Primary Key | *one*
pictures | pictures | text | | kotlin.String | Foreign Key | *many*



