# ShipmentInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | Идентификатор отгрузки. | [optional] [default to null]
**planIntervalFrom** | **String!** | Начало планового интервала отгрузки. | [optional] [default to null]
**planIntervalTo** | **String!** | Конец планового интервала отгрузки. | [optional] [default to null]
**shipmentType** | [***ShipmentType**](ShipmentType.md) |  | [optional] [default to null]
**warehouse** | [***PartnerShipmentWarehouseDto**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to null]
**warehouseTo** | [***PartnerShipmentWarehouseDto**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to null]
**externalId** | **String!** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] [default to null]
**deliveryService** | [***DeliveryServiceDto**](DeliveryServiceDTO.md) |  | [optional] [default to null]
**palletsCount** | [***PalletsCountDto**](PalletsCountDTO.md) |  | [optional] [default to null]
**orderIds** | **Int!** | Идентификаторы заказов в отгрузке. | [default to null]
**draftCount** | **Int!** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] [default to null]
**plannedCount** | **Int!** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] [default to null]
**factCount** | **Int!** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] [default to null]
**status** | [***ShipmentStatusType**](ShipmentStatusType.md) |  | [optional] [default to null]
**statusDescription** | **String!** | Описание статуса отгрузки. | [optional] [default to null]
**statusUpdateTime** | **String!** | Время последнего изменения статуса отгрузки. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


