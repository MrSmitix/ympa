# ympa_r_client::ShipmentDTO

Информация об отгрузке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор отгрузки. | [optional] 
**planIntervalFrom** | **character** | Начало планового интервала отгрузки. | [optional] 
**planIntervalTo** | **character** | Конец планового интервала отгрузки. | [optional] 
**shipmentType** | [**ShipmentType**](ShipmentType.md) |  | [optional] [Enum: ] 
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**externalId** | **character** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**orderIds** | **set[integer]** | Идентификаторы заказов в отгрузке. | 
**draftCount** | **integer** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**plannedCount** | **integer** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**factCount** | **integer** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 
**currentStatus** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**availableActions** | [**set[ShipmentActionType]**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 


