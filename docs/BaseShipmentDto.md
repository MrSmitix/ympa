# BaseShipmentDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор отгрузки. | [optional]
**plan_interval_from** | Option<**String**> | Начало планового интервала отгрузки. | [optional]
**plan_interval_to** | Option<**String**> | Конец планового интервала отгрузки. | [optional]
**shipment_type** | Option<[**models::ShipmentType**](ShipmentType.md)> |  | [optional]
**warehouse** | Option<[**models::PartnerShipmentWarehouseDto**](PartnerShipmentWarehouseDTO.md)> |  | [optional]
**warehouse_to** | Option<[**models::PartnerShipmentWarehouseDto**](PartnerShipmentWarehouseDTO.md)> |  | [optional]
**external_id** | Option<**String**> | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. | [optional]
**delivery_service** | Option<[**models::DeliveryServiceDto**](DeliveryServiceDTO.md)> |  | [optional]
**pallets_count** | Option<[**models::PalletsCountDto**](PalletsCountDTO.md)> |  | [optional]
**order_ids** | **Vec<i64>** | Идентификаторы заказов в отгрузке. | 
**draft_count** | Option<**i32**> | Количество заказов, которое Маркет запланировал к отгрузке. | [optional]
**planned_count** | Option<**i32**> | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional]
**fact_count** | Option<**i32**> | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


