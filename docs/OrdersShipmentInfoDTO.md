# OrdersShipmentInfoDTO

Годные/негодные ярлыки по заказам в отгрузке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_ids_with_labels** | **List[int]** | Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. | 
**order_ids_without_labels** | **List[int]** | Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.orders_shipment_info_dto import OrdersShipmentInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersShipmentInfoDTO from a JSON string
orders_shipment_info_dto_instance = OrdersShipmentInfoDTO.from_json(json)
# print the JSON string representation of the object
print OrdersShipmentInfoDTO.to_json()

# convert the object into a dict
orders_shipment_info_dto_dict = orders_shipment_info_dto_instance.to_dict()
# create an instance of OrdersShipmentInfoDTO from a dict
orders_shipment_info_dto_from_dict = OrdersShipmentInfoDTO.from_dict(orders_shipment_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


