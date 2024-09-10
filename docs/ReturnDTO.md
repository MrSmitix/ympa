# OpenapiClient::ReturnDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор возврата. | [optional] |
| **order_id** | **Integer** | Номер заказа. | [optional] |
| **creation_date** | **Time** | Дата создания возврата клиентом. | [optional] |
| **update_date** | **Time** | Дата обновления возврата. | [optional] |
| **refund_status** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] |
| **logistic_pickup_point** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] |
| **shipment_recipient_type** | [**RecipientType**](RecipientType.md) |  | [optional] |
| **shipment_status** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] |
| **refund_amount** | **Integer** | Сумма возврата. | [optional] |
| **items** | [**Array&lt;ReturnItemDTO&gt;**](ReturnItemDTO.md) | Список товаров в возврате. |  |
| **return_type** | [**ReturnType**](ReturnType.md) |  | [optional] |
| **fast_return** | **Boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ReturnDTO.new(
  id: null,
  order_id: null,
  creation_date: null,
  update_date: null,
  refund_status: null,
  logistic_pickup_point: null,
  shipment_recipient_type: null,
  shipment_status: null,
  refund_amount: null,
  items: null,
  return_type: null,
  fast_return: null
)
```

