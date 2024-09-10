# ParcelBoxLabelDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | [default to nothing]
**supplierName** | **String** | Юридическое название магазина. | [default to nothing]
**deliveryServiceName** | **String** | Юридическое название службы доставки. | [default to nothing]
**orderId** | **Int64** | Идентификатор заказа в системе Маркета. | [default to nothing]
**orderNum** | **String** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | [default to nothing]
**recipientName** | **String** | Фамилия и инициалы получателя заказа. | [default to nothing]
**boxId** | **Int64** | Идентификатор коробки. | [default to nothing]
**fulfilmentId** | **String** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | [default to nothing]
**place** | **String** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | [default to nothing]
**weight** | **String** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | [default to nothing]
**deliveryServiceId** | **String** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | [default to nothing]
**deliveryAddress** | **String** | Адрес получателя. | [optional] [default to nothing]
**shipmentDate** | **String** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


