
# Table `BriefOrderItemDTO`
(mapped from: BriefOrderItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  |  [optional]
**vat** | vat | long |  | [**OrderVatType**](OrderVatType.md) |  |  [optional] [foreignkey]
**count** | count | int |  | **kotlin.Int** | Количество единиц товара. |  [optional]
**price** | price | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  |  [optional]
**offerName** | offerName | text |  | **kotlin.String** | Название товара. |  [optional]
**offerId** | offerId | text |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional]
**instances** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderItemInstanceDTO&gt;**](OrderItemInstanceDTO.md) | Переданные вами коды маркировки. |  [optional]








# **Table `BriefOrderItemDTOOrderItemInstanceDTO`**
(mapped from: BriefOrderItemDTOOrderItemInstanceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
briefOrderItemDTO | briefOrderItemDTO | long | | kotlin.Long | Primary Key | *one*
orderItemInstanceDTO | orderItemInstanceDTO | long | | kotlin.Long | Foreign Key | *many*



