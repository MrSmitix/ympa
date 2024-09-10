# OrdersStatsPriceDTO

Цена или скидки на товар.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OrdersStatsPriceType**](OrdersStatsPriceType.md) |  | [optional] 
**cost_per_item** | **float** | Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  | [optional] 
**total** | **float** | Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  | [optional] 

## Example

```python
from ympa_python_client.models.orders_stats_price_dto import OrdersStatsPriceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsPriceDTO from a JSON string
orders_stats_price_dto_instance = OrdersStatsPriceDTO.from_json(json)
# print the JSON string representation of the object
print(OrdersStatsPriceDTO.to_json())

# convert the object into a dict
orders_stats_price_dto_dict = orders_stats_price_dto_instance.to_dict()
# create an instance of OrdersStatsPriceDTO from a dict
orders_stats_price_dto_from_dict = OrdersStatsPriceDTO.from_dict(orders_stats_price_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


