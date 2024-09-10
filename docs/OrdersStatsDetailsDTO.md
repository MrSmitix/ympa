# OrdersStatsDetailsDTO

Информация об удалении товара из заказа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_status** | [**OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md) |  | [optional] 
**item_count** | **int** | Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;. | [optional] 
**update_date** | **date** | Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**stock_type** | [**OrdersStatsStockType**](OrdersStatsStockType.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.orders_stats_details_dto import OrdersStatsDetailsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsDetailsDTO from a JSON string
orders_stats_details_dto_instance = OrdersStatsDetailsDTO.from_json(json)
# print the JSON string representation of the object
print OrdersStatsDetailsDTO.to_json()

# convert the object into a dict
orders_stats_details_dto_dict = orders_stats_details_dto_instance.to_dict()
# create an instance of OrdersStatsDetailsDTO from a dict
orders_stats_details_dto_from_dict = OrdersStatsDetailsDTO.from_dict(orders_stats_details_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


