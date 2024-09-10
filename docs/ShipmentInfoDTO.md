
# ShipmentInfoDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **orderIds** | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Идентификаторы заказов в отгрузке. |  |
| **id** | **kotlin.Long** | Идентификатор отгрузки. |  [optional] |
| **planIntervalFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Начало планового интервала отгрузки. |  [optional] |
| **planIntervalTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Конец планового интервала отгрузки. |  [optional] |
| **shipmentType** | [**ShipmentType**](ShipmentType.md) |  |  [optional] |
| **warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  |  [optional] |
| **warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  |  [optional] |
| **externalId** | **kotlin.String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. |  [optional] |
| **deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  |  [optional] |
| **palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  |  [optional] |
| **draftCount** | **kotlin.Int** | Количество заказов, которое Маркет запланировал к отгрузке. |  [optional] |
| **plannedCount** | **kotlin.Int** | Количество заказов, которое Маркет подтвердил к отгрузке. |  [optional] |
| **factCount** | **kotlin.Int** | Количество заказов, принятых в сортировочном центре или пункте приема. |  [optional] |
| **status** | [**ShipmentStatusType**](ShipmentStatusType.md) |  |  [optional] |
| **statusDescription** | **kotlin.String** | Описание статуса отгрузки. |  [optional] |
| **statusUpdateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Время последнего изменения статуса отгрузки. |  [optional] |



