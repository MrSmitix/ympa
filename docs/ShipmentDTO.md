# ympa_csharp_client.Model.ShipmentDTO
Информация об отгрузке.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор отгрузки. | [optional] 
**PlanIntervalFrom** | **DateTime** | Начало планового интервала отгрузки. | [optional] 
**PlanIntervalTo** | **DateTime** | Конец планового интервала отгрузки. | [optional] 
**ShipmentType** | **ShipmentType** |  | [optional] 
**Warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**WarehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**ExternalId** | **string** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**DeliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**PalletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**OrderIds** | **List&lt;long&gt;** | Идентификаторы заказов в отгрузке. | 
**DraftCount** | **int** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**PlannedCount** | **int** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**FactCount** | **int** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 
**CurrentStatus** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**AvailableActions** | [**List&lt;ShipmentActionType&gt;**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

