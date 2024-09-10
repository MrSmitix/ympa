# OrdersStatsCommissionDTO

Информация о стоимости услуг.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OrdersStatsCommissionType**](OrdersStatsCommissionType.md) |  | [optional] 
**actual** | **float** | Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  | [optional] 

## Example

```python
from ympa_python_client.models.orders_stats_commission_dto import OrdersStatsCommissionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsCommissionDTO from a JSON string
orders_stats_commission_dto_instance = OrdersStatsCommissionDTO.from_json(json)
# print the JSON string representation of the object
print(OrdersStatsCommissionDTO.to_json())

# convert the object into a dict
orders_stats_commission_dto_dict = orders_stats_commission_dto_instance.to_dict()
# create an instance of OrdersStatsCommissionDTO from a dict
orders_stats_commission_dto_from_dict = OrdersStatsCommissionDTO.from_dict(orders_stats_commission_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


