# ParcelBoxLabelDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **string** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). | 
**supplierName** | **string** | Юридическое название магазина. | 
**deliveryServiceName** | **string** | Юридическое название службы доставки. | 
**orderId** | **int** | Идентификатор заказа в системе Маркета. | 
**orderNum** | **string** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина. | 
**recipientName** | **string** | Фамилия и инициалы получателя заказа. | 
**boxId** | **int** | Идентификатор коробки. | 
**fulfilmentId** | **string** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д. | 
**place** | **string** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;. | 
**weight** | **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;. | 
**deliveryServiceId** | **string** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**deliveryAddress** | **string** | Адрес получателя. | [optional] 
**shipmentDate** | **string** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


