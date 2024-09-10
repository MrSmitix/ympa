# OpenapiClient::OrderLabelDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **places_number** | **Integer** | Количество коробок в заказе. |  |
| **url** | **String** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  |  |
| **parcel_box_labels** | [**Array&lt;ParcelBoxLabelDTO&gt;**](ParcelBoxLabelDTO.md) | Информация на ярлыке. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderLabelDTO.new(
  order_id: null,
  places_number: null,
  url: null,
  parcel_box_labels: null
)
```

