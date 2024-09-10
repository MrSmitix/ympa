# WWW::OpenAPIClient::Object::ShipmentDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ShipmentDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отгрузки. | [optional] 
**plan_interval_from** | **DATE_TIME** | Начало планового интервала отгрузки. | [optional] 
**plan_interval_to** | **DATE_TIME** | Конец планового интервала отгрузки. | [optional] 
**shipment_type** | [**ShipmentType**](ShipmentType.md) |  | [optional] 
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**warehouse_to** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**external_id** | **string** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**delivery_service** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**pallets_count** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**order_ids** | **ARRAY[int]** | Идентификаторы заказов в отгрузке. | 
**draft_count** | **int** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**planned_count** | **int** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**fact_count** | **int** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 
**current_status** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**available_actions** | [**ARRAY[ShipmentActionType]**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


