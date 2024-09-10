# base_shipment_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор отгрузки. | [optional] 
**plan_interval_from** | **char \*** | Начало планового интервала отгрузки. | [optional] 
**plan_interval_to** | **char \*** | Конец планового интервала отгрузки. | [optional] 
**shipment_type** | **shipment_type_t \*** |  | [optional] 
**warehouse** | [**partner_shipment_warehouse_dto_t**](partner_shipment_warehouse_dto.md) \* |  | [optional] 
**warehouse_to** | [**partner_shipment_warehouse_dto_t**](partner_shipment_warehouse_dto.md) \* |  | [optional] 
**external_id** | **char \*** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**delivery_service** | [**delivery_service_dto_t**](delivery_service_dto.md) \* |  | [optional] 
**pallets_count** | [**pallets_count_dto_t**](pallets_count_dto.md) \* |  | [optional] 
**order_ids** | **list_t \*** | Идентификаторы заказов в отгрузке. | 
**draft_count** | **int** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**planned_count** | **int** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**fact_count** | **int** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


