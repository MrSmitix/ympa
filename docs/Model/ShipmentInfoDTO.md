# # ShipmentInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отгрузки. | [optional]
**plan_interval_from** | **\DateTime** | Начало планового интервала отгрузки. | [optional]
**plan_interval_to** | **\DateTime** | Конец планового интервала отгрузки. | [optional]
**shipment_type** | [**\OpenAPI\Client\Model\ShipmentType**](ShipmentType.md) |  | [optional]
**warehouse** | [**\OpenAPI\Client\Model\PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional]
**warehouse_to** | [**\OpenAPI\Client\Model\PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional]
**external_id** | **string** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional]
**delivery_service** | [**\OpenAPI\Client\Model\DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional]
**pallets_count** | [**\OpenAPI\Client\Model\PalletsCountDTO**](PalletsCountDTO.md) |  | [optional]
**order_ids** | **int[]** | Идентификаторы заказов в отгрузке. |
**draft_count** | **int** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional]
**planned_count** | **int** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional]
**fact_count** | **int** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional]
**status** | [**\OpenAPI\Client\Model\ShipmentStatusType**](ShipmentStatusType.md) |  | [optional]
**status_description** | **string** | Описание статуса отгрузки. | [optional]
**status_update_time** | **\DateTime** | Время последнего изменения статуса отгрузки. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
