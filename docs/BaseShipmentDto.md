# BaseShipmentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор отгрузки. | [optional] [default to None]
**plan_interval_from** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Начало планового интервала отгрузки. | [optional] [default to None]
**plan_interval_to** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Конец планового интервала отгрузки. | [optional] [default to None]
**shipment_type** | [***models::ShipmentType**](ShipmentType.md) |  | [optional] [default to None]
**warehouse** | [***models::PartnerShipmentWarehouseDto**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to None]
**warehouse_to** | [***models::PartnerShipmentWarehouseDto**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to None]
**external_id** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. | [optional] [default to None]
**delivery_service** | [***models::DeliveryServiceDto**](DeliveryServiceDTO.md) |  | [optional] [default to None]
**pallets_count** | [***models::PalletsCountDto**](PalletsCountDTO.md) |  | [optional] [default to None]
**order_ids** | **Vec<i64>** | Идентификаторы заказов в отгрузке. | 
**draft_count** | **i32** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] [default to None]
**planned_count** | **i32** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] [default to None]
**fact_count** | **i32** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


