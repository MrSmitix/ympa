# ParcelBoxLabelDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**supplier_name** | **String** | Юридическое название магазина. | 
**delivery_service_name** | **String** | Юридическое название службы доставки. | 
**order_id** | **i64** | Идентификатор заказа в системе Маркета. | 
**order_num** | **String** | Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.  | 
**recipient_name** | **String** | Фамилия и инициалы получателя заказа. | 
**box_id** | **i64** | Идентификатор коробки. | 
**fulfilment_id** | **String** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.  | 
**place** | **String** | Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.  | 
**weight** | **String** | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.  | 
**delivery_service_id** | **String** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**delivery_address** | **String** | Адрес получателя. | [optional] [default to None]
**shipment_date** | **String** | Дата отгрузки в формате `dd.MM.yyyy`. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


