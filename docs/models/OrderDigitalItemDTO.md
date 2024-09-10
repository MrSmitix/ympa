

# OrderDigitalItemDTO

Ключ цифрового товара.

The class is defined in **[OrderDigitalItemDTO.java](../../src/main/java/org/openapitools/model/OrderDigitalItemDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**code** | `String` | Сам ключ. | 
**slip** | `String` | Инструкция по активации. | 
**activateTill** | `LocalDate` | Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 






