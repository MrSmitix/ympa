# OpenapiClient::GenerateShipmentListDocumentReportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании. |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. | [optional] |
| **order_ids** | **Array&lt;Integer&gt;** | Фильтр по идентификаторам заказа в отгрузке. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateShipmentListDocumentReportRequest.new(
  campaign_id: null,
  shipment_id: null,
  order_ids: null
)
```

