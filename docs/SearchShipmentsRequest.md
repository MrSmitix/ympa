# OpenapiClient::SearchShipmentsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date_from** | **Date** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  |
| **date_to** | **Date** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  |
| **statuses** | [**Array&lt;ShipmentStatusType&gt;**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] |
| **order_ids** | **Array&lt;Integer&gt;** | Список идентификаторов заказов из отгрузок. | [optional] |
| **cancelled_orders** | **Boolean** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional][default to true] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::SearchShipmentsRequest.new(
  date_from: null,
  date_to: null,
  statuses: null,
  order_ids: null,
  cancelled_orders: null
)
```

