# ympa_csharp_client.Model.ParcelBoxLabelDTO
Информация о ярлыке для коробки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **string** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**SupplierName** | **string** | Юридическое название магазина. | 
**DeliveryServiceName** | **string** | Юридическое название службы доставки. | 
**OrderId** | **long** | Идентификатор заказа в системе Маркета. | 
**OrderNum** | **string** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | 
**RecipientName** | **string** | Фамилия и инициалы получателя заказа. | 
**BoxId** | **long** | Идентификатор коробки. | 
**FulfilmentId** | **string** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | 
**Place** | **string** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | 
**Weight** | **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | 
**DeliveryServiceId** | **string** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**DeliveryAddress** | **string** | Адрес получателя. | [optional] 
**ShipmentDate** | **string** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

