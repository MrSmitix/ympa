
# BriefOrderItemDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  |  [optional] |
| **vat** | [**OrderVatType**](OrderVatType.md) |  |  [optional] |
| **count** | **kotlin.Int** | Количество единиц товара. |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  |  [optional] |
| **offerName** | **kotlin.String** | Название товара. |  [optional] |
| **offerId** | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional] |
| **instances** | [**kotlin.collections.List&lt;OrderItemInstanceDTO&gt;**](OrderItemInstanceDTO.md) | Переданные вами коды маркировки. |  [optional] |



