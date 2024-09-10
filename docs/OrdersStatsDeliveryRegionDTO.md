# OrdersStatsDeliveryRegionDTO

Информация о регионе доставки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор региона доставки. | [optional] 
**name** | **str** | Название региона доставки. | [optional] 

## Example

```python
from ympa_python_client.models.orders_stats_delivery_region_dto import OrdersStatsDeliveryRegionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsDeliveryRegionDTO from a JSON string
orders_stats_delivery_region_dto_instance = OrdersStatsDeliveryRegionDTO.from_json(json)
# print the JSON string representation of the object
print(OrdersStatsDeliveryRegionDTO.to_json())

# convert the object into a dict
orders_stats_delivery_region_dto_dict = orders_stats_delivery_region_dto_instance.to_dict()
# create an instance of OrdersStatsDeliveryRegionDTO from a dict
orders_stats_delivery_region_dto_from_dict = OrdersStatsDeliveryRegionDTO.from_dict(orders_stats_delivery_region_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


