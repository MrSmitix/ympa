# parcel_box_label_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **char \*** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**supplier_name** | **char \*** | Юридическое название магазина. | 
**delivery_service_name** | **char \*** | Юридическое название службы доставки. | 
**order_id** | **long** | Идентификатор заказа в системе Маркета. | 
**order_num** | **char \*** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | 
**recipient_name** | **char \*** | Фамилия и инициалы получателя заказа. | 
**box_id** | **long** | Идентификатор коробки. | 
**fulfilment_id** | **char \*** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | 
**place** | **char \*** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | 
**weight** | **char \*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | 
**delivery_service_id** | **char \*** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**delivery_address** | **char \*** | Адрес получателя. | [optional] 
**shipment_date** | **char \*** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


