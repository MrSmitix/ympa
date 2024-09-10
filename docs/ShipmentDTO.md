# ShipmentDTO

Информация об отгрузке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отгрузки. | [optional] 
**plan_interval_from** | **datetime** | Начало планового интервала отгрузки. | [optional] 
**plan_interval_to** | **datetime** | Конец планового интервала отгрузки. | [optional] 
**shipment_type** | [**ShipmentType**](ShipmentType.md) |  | [optional] 
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**warehouse_to** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**external_id** | **str** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**delivery_service** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**pallets_count** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**order_ids** | **List[int]** | Идентификаторы заказов в отгрузке. | 
**draft_count** | **int** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**planned_count** | **int** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**fact_count** | **int** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 
**current_status** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**available_actions** | [**List[ShipmentActionType]**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.shipment_dto import ShipmentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ShipmentDTO from a JSON string
shipment_dto_instance = ShipmentDTO.from_json(json)
# print the JSON string representation of the object
print ShipmentDTO.to_json()

# convert the object into a dict
shipment_dto_dict = shipment_dto_instance.to_dict()
# create an instance of ShipmentDTO from a dict
shipment_dto_from_dict = ShipmentDTO.from_dict(shipment_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


