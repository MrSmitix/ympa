

# BaseShipmentDTO

Информация об отгрузке.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор отгрузки. |  [optional]
**planIntervalFrom** | **OffsetDateTime** | Начало планового интервала отгрузки. |  [optional]
**planIntervalTo** | **OffsetDateTime** | Конец планового интервала отгрузки. |  [optional]
**shipmentType** | **ShipmentType** |  |  [optional]
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  |  [optional]
**warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  |  [optional]
**externalId** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. |  [optional]
**deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  |  [optional]
**palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  |  [optional]
**orderIds** | **Set&lt;Long&gt;** | Идентификаторы заказов в отгрузке. | 
**draftCount** | **Int** | Количество заказов, которое Маркет запланировал к отгрузке. |  [optional]
**plannedCount** | **Int** | Количество заказов, которое Маркет подтвердил к отгрузке. |  [optional]
**factCount** | **Int** | Количество заказов, принятых в сортировочном центре или пункте приема. |  [optional]


