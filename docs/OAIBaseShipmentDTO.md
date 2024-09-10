# OAIBaseShipmentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор отгрузки. | [optional] 
**planIntervalFrom** | **NSDate*** | Начало планового интервала отгрузки. | [optional] 
**planIntervalTo** | **NSDate*** | Конец планового интервала отгрузки. | [optional] 
**shipmentType** | [**OAIShipmentType***](OAIShipmentType.md) |  | [optional] 
**warehouse** | [**OAIPartnerShipmentWarehouseDTO***](OAIPartnerShipmentWarehouseDTO.md) |  | [optional] 
**warehouseTo** | [**OAIPartnerShipmentWarehouseDTO***](OAIPartnerShipmentWarehouseDTO.md) |  | [optional] 
**externalId** | **NSString*** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**deliveryService** | [**OAIDeliveryServiceDTO***](OAIDeliveryServiceDTO.md) |  | [optional] 
**palletsCount** | [**OAIPalletsCountDTO***](OAIPalletsCountDTO.md) |  | [optional] 
**orderIds** | **OAISet&lt;NSNumber*&gt;*** | Идентификаторы заказов в отгрузке. | 
**draftCount** | **NSNumber*** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**plannedCount** | **NSNumber*** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**factCount** | **NSNumber*** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


