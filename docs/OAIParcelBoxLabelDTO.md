# OAIParcelBoxLabelDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **NSString*** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**supplierName** | **NSString*** | Юридическое название магазина. | 
**deliveryServiceName** | **NSString*** | Юридическое название службы доставки. | 
**orderId** | **NSNumber*** | Идентификатор заказа в системе Маркета. | 
**orderNum** | **NSString*** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | 
**recipientName** | **NSString*** | Фамилия и инициалы получателя заказа. | 
**boxId** | **NSNumber*** | Идентификатор коробки. | 
**fulfilmentId** | **NSString*** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | 
**place** | **NSString*** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | 
**weight** | **NSString*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | 
**deliveryServiceId** | **NSString*** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**deliveryAddress** | **NSString*** | Адрес получателя. | [optional] 
**shipmentDate** | **NSString*** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


