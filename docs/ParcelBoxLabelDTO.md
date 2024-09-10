# OpenapiClient::ParcelBoxLabelDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **url** | **String** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  |  |
| **supplier_name** | **String** | Юридическое название магазина. |  |
| **delivery_service_name** | **String** | Юридическое название службы доставки. |  |
| **order_id** | **Integer** | Идентификатор заказа в системе Маркета. |  |
| **order_num** | **String** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  |  |
| **recipient_name** | **String** | Фамилия и инициалы получателя заказа. |  |
| **box_id** | **Integer** | Идентификатор коробки. |  |
| **fulfilment_id** | **String** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  |  |
| **place** | **String** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  |  |
| **weight** | **String** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  |  |
| **delivery_service_id** | **String** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). |  |
| **delivery_address** | **String** | Адрес получателя. | [optional] |
| **shipment_date** | **String** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ParcelBoxLabelDTO.new(
  url: null,
  supplier_name: null,
  delivery_service_name: null,
  order_id: null,
  order_num: null,
  recipient_name: null,
  box_id: null,
  fulfilment_id: null,
  place: null,
  weight: null,
  delivery_service_id: null,
  delivery_address: null,
  shipment_date: null
)
```

