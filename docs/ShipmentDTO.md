# ShipmentDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор отгрузки. | [optional] [default to nothing]
**planIntervalFrom** | **ZonedDateTime** | Начало планового интервала отгрузки. | [optional] [default to nothing]
**planIntervalTo** | **ZonedDateTime** | Конец планового интервала отгрузки. | [optional] [default to nothing]
**shipmentType** | [***ShipmentType**](ShipmentType.md) |  | [optional] [default to nothing]
**warehouse** | [***PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to nothing]
**warehouseTo** | [***PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to nothing]
**externalId** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] [default to nothing]
**deliveryService** | [***DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] [default to nothing]
**palletsCount** | [***PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] [default to nothing]
**orderIds** | **Vector{Int64}** | Идентификаторы заказов в отгрузке. | [default to nothing]
**draftCount** | **Int64** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] [default to nothing]
**plannedCount** | **Int64** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] [default to nothing]
**factCount** | **Int64** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] [default to nothing]
**currentStatus** | [***ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] [default to nothing]
**availableActions** | [**Vector{ShipmentActionType}**](ShipmentActionType.md) | Доступные действия над отгрузкой. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


