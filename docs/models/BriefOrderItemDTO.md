

# BriefOrderItemDTO

Информация о маркированном товаре.

The class is defined in **[BriefOrderItemDTO.java](../../src/main/java/org/openapitools/model/BriefOrderItemDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  |  [optional property]
**vat** | `OrderVatType` |  |  [optional property]
**count** | `Integer` | Количество единиц товара. |  [optional property]
**price** | `BigDecimal` | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  |  [optional property]
**offerName** | `String` | Название товара. |  [optional property]
**offerId** | `String` | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional property]
**instances** | [`List&lt;OrderItemInstanceDTO&gt;`](OrderItemInstanceDTO.md) | Переданные вами коды маркировки. |  [optional property]









