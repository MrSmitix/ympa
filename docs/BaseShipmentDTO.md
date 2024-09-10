# OpenapiClient::BaseShipmentDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор отгрузки. | [optional] |
| **plan_interval_from** | **Time** | Начало планового интервала отгрузки. | [optional] |
| **plan_interval_to** | **Time** | Конец планового интервала отгрузки. | [optional] |
| **shipment_type** | [**ShipmentType**](ShipmentType.md) |  | [optional] |
| **warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] |
| **warehouse_to** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] |
| **external_id** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] |
| **delivery_service** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] |
| **pallets_count** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] |
| **order_ids** | **Array&lt;Integer&gt;** | Идентификаторы заказов в отгрузке. |  |
| **draft_count** | **Integer** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] |
| **planned_count** | **Integer** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] |
| **fact_count** | **Integer** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BaseShipmentDTO.new(
  id: null,
  plan_interval_from: null,
  plan_interval_to: null,
  shipment_type: null,
  warehouse: null,
  warehouse_to: null,
  external_id: null,
  delivery_service: null,
  pallets_count: null,
  order_ids: null,
  draft_count: null,
  planned_count: null,
  fact_count: null
)
```

