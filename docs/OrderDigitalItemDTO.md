
# OrderDigitalItemDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  |  |
| **code** | **kotlin.String** | Сам ключ. |  |
| **slip** | **kotlin.String** | Инструкция по активации. |  |
| **activateTill** | [**java.time.LocalDate**](java.time.LocalDate.md) | Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  |



