# ympa_r_client::ParcelBoxLabelDTO

Информация о ярлыке для коробки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **character** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**supplierName** | **character** | Юридическое название магазина. | 
**deliveryServiceName** | **character** | Юридическое название службы доставки. | 
**orderId** | **integer** | Идентификатор заказа в системе Маркета. | 
**orderNum** | **character** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | 
**recipientName** | **character** | Фамилия и инициалы получателя заказа. | 
**boxId** | **integer** | Идентификатор коробки. | 
**fulfilmentId** | **character** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | 
**place** | **character** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | 
**weight** | **character** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | 
**deliveryServiceId** | **character** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**deliveryAddress** | **character** | Адрес получателя. | [optional] 
**shipmentDate** | **character** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] 


