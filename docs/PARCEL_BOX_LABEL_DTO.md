# PARCEL_BOX_LABEL_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**STRING_32**](STRING_32.md) | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | [default to null]
**supplier_name** | [**STRING_32**](STRING_32.md) | Юридическое название магазина. | [default to null]
**delivery_service_name** | [**STRING_32**](STRING_32.md) | Юридическое название службы доставки. | [default to null]
**order_id** | **INTEGER_64** | Идентификатор заказа в системе Маркета. | [default to null]
**order_num** | [**STRING_32**](STRING_32.md) | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | [default to null]
**recipient_name** | [**STRING_32**](STRING_32.md) | Фамилия и инициалы получателя заказа. | [default to null]
**box_id** | **INTEGER_64** | Идентификатор коробки. | [default to null]
**fulfilment_id** | [**STRING_32**](STRING_32.md) | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | [default to null]
**place** | [**STRING_32**](STRING_32.md) | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | [default to null]
**weight** | [**STRING_32**](STRING_32.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | [default to null]
**delivery_service_id** | [**STRING_32**](STRING_32.md) | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | [default to null]
**delivery_address** | [**STRING_32**](STRING_32.md) | Адрес получателя. | [optional] [default to null]
**shipment_date** | [**STRING_32**](STRING_32.md) | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


