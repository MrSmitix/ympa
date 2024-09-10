# Api.ShipmentInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Идентификатор отгрузки. | [optional] 
**planIntervalFrom** | **Date** | Начало планового интервала отгрузки. | [optional] 
**planIntervalTo** | **Date** | Конец планового интервала отгрузки. | [optional] 
**shipmentType** | [**ShipmentType**](ShipmentType.md) |  | [optional] 
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**externalId** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**orderIds** | **[Number]** | Идентификаторы заказов в отгрузке. | 
**draftCount** | **Number** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**plannedCount** | **Number** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**factCount** | **Number** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 
**status** | [**ShipmentStatusType**](ShipmentStatusType.md) |  | [optional] 
**statusDescription** | **String** | Описание статуса отгрузки. | [optional] 
**statusUpdateTime** | **Date** | Время последнего изменения статуса отгрузки. | [optional] 


