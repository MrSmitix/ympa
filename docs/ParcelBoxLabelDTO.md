
# ParcelBoxLabelDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **url** | **kotlin.String** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  |  |
| **supplierName** | **kotlin.String** | Юридическое название магазина. |  |
| **deliveryServiceName** | **kotlin.String** | Юридическое название службы доставки. |  |
| **orderId** | **kotlin.Long** | Идентификатор заказа в системе Маркета. |  |
| **orderNum** | **kotlin.String** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  |  |
| **recipientName** | **kotlin.String** | Фамилия и инициалы получателя заказа. |  |
| **boxId** | **kotlin.Long** | Идентификатор коробки. |  |
| **fulfilmentId** | **kotlin.String** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  |  |
| **place** | **kotlin.String** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  |  |
| **weight** | **kotlin.String** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  |  |
| **deliveryServiceId** | **kotlin.String** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). |  |
| **deliveryAddress** | **kotlin.String** | Адрес получателя. |  [optional] |
| **shipmentDate** | **kotlin.String** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. |  [optional] |



