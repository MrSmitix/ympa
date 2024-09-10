# SHIPMENT_INFO_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор отгрузки. | [optional] [default to null]
**plan_interval_from** | [**DATE_TIME**](DATE_TIME.md) | Начало планового интервала отгрузки. | [optional] [default to null]
**plan_interval_to** | [**DATE_TIME**](DATE_TIME.md) | Конец планового интервала отгрузки. | [optional] [default to null]
**shipment_type** | [**SHIPMENT_TYPE**](ShipmentType.md) |  | [optional] [default to null]
**warehouse** | [**PARTNER_SHIPMENT_WAREHOUSE_DTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to null]
**warehouse_to** | [**PARTNER_SHIPMENT_WAREHOUSE_DTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to null]
**external_id** | [**STRING_32**](STRING_32.md) | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] [default to null]
**delivery_service** | [**DELIVERY_SERVICE_DTO**](DeliveryServiceDTO.md) |  | [optional] [default to null]
**pallets_count** | [**PALLETS_COUNT_DTO**](PalletsCountDTO.md) |  | [optional] [default to null]
**order_ids** | **LIST [INTEGER_64]** | Идентификаторы заказов в отгрузке. | [default to null]
**draft_count** | **INTEGER_32** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] [default to null]
**planned_count** | **INTEGER_32** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] [default to null]
**fact_count** | **INTEGER_32** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] [default to null]
**status** | [**SHIPMENT_STATUS_TYPE**](ShipmentStatusType.md) |  | [optional] [default to null]
**status_description** | [**STRING_32**](STRING_32.md) | Описание статуса отгрузки. | [optional] [default to null]
**status_update_time** | [**DATE_TIME**](DATE_TIME.md) | Время последнего изменения статуса отгрузки. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


