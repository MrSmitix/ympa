# BaseShipmentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор отгрузки. | [optional] 
**planIntervalFrom** | **Date** | Начало планового интервала отгрузки. | [optional] 
**planIntervalTo** | **Date** | Конец планового интервала отгрузки. | [optional] 
**shipmentType** | [**ShipmentType**](ShipmentType.md) |  | [optional] 
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**externalId** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**orderIds** | **Set<Int64>** | Идентификаторы заказов в отгрузке. | 
**draftCount** | **Int** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**plannedCount** | **Int** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**factCount** | **Int** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


