
# Table `ParcelBoxLabelDTO`
(mapped from: ParcelBoxLabelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**url** | url | text NOT NULL |  | **kotlin.String** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**supplierName** | supplierName | text NOT NULL |  | **kotlin.String** | Юридическое название магазина. | 
**deliveryServiceName** | deliveryServiceName | text NOT NULL |  | **kotlin.String** | Юридическое название службы доставки. | 
**orderId** | orderId | long NOT NULL |  | **kotlin.Long** | Идентификатор заказа в системе Маркета. | 
**orderNum** | orderNum | text NOT NULL |  | **kotlin.String** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | 
**recipientName** | recipientName | text NOT NULL |  | **kotlin.String** | Фамилия и инициалы получателя заказа. | 
**boxId** | boxId | long NOT NULL |  | **kotlin.Long** | Идентификатор коробки. | 
**fulfilmentId** | fulfilmentId | text NOT NULL |  | **kotlin.String** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | 
**place** | place | text NOT NULL |  | **kotlin.String** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | 
**weight** | weight | text NOT NULL |  | **kotlin.String** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | 
**deliveryServiceId** | deliveryServiceId | text NOT NULL |  | **kotlin.String** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**deliveryAddress** | deliveryAddress | text |  | **kotlin.String** | Адрес получателя. |  [optional]
**shipmentDate** | shipmentDate | text |  | **kotlin.String** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. |  [optional]















