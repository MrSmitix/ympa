# BaseShipmentDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Long** | Идентификатор отгрузки. | [optional] [default to null] |
| **planIntervalFrom** | **Date** | Начало планового интервала отгрузки. | [optional] [default to null] |
| **planIntervalTo** | **Date** | Конец планового интервала отгрузки. | [optional] [default to null] |
| **shipmentType** | [**ShipmentType**](ShipmentType.md) |  | [optional] [default to null] |
| **warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to null] |
| **warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to null] |
| **externalId** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] [default to null] |
| **deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] [default to null] |
| **palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] [default to null] |
| **orderIds** | **Set** | Идентификаторы заказов в отгрузке. | [default to null] |
| **draftCount** | **Integer** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] [default to null] |
| **plannedCount** | **Integer** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] [default to null] |
| **factCount** | **Integer** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

