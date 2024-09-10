# ShipmentInfoDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отгрузки. | [optional] 
**planIntervalFrom** | **\DateTime** | Начало планового интервала отгрузки. | [optional] 
**planIntervalTo** | **\DateTime** | Конец планового интервала отгрузки. | [optional] 
**shipmentType** | [**OpenAPI\Server\Model\ShipmentType**](ShipmentType.md) |  | [optional] 
**warehouse** | [**OpenAPI\Server\Model\PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**warehouseTo** | [**OpenAPI\Server\Model\PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**externalId** | **string** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**deliveryService** | [**OpenAPI\Server\Model\DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**palletsCount** | [**OpenAPI\Server\Model\PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**orderIds** | **int** | Идентификаторы заказов в отгрузке. | 
**draftCount** | **int** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**plannedCount** | **int** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**factCount** | **int** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 
**status** | [**OpenAPI\Server\Model\ShipmentStatusType**](ShipmentStatusType.md) |  | [optional] 
**statusDescription** | **string** | Описание статуса отгрузки. | [optional] 
**statusUpdateTime** | **\DateTime** | Время последнего изменения статуса отгрузки. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


