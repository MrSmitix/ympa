# OrdersStatsPaymentOrderDTO

Информация о платежном получении.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Номер платежного поручения. | [optional] 
**var_date** | **date** | Дата платежного поручения.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.orders_stats_payment_order_dto import OrdersStatsPaymentOrderDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsPaymentOrderDTO from a JSON string
orders_stats_payment_order_dto_instance = OrdersStatsPaymentOrderDTO.from_json(json)
# print the JSON string representation of the object
print(OrdersStatsPaymentOrderDTO.to_json())

# convert the object into a dict
orders_stats_payment_order_dto_dict = orders_stats_payment_order_dto_instance.to_dict()
# create an instance of OrdersStatsPaymentOrderDTO from a dict
orders_stats_payment_order_dto_from_dict = OrdersStatsPaymentOrderDTO.from_dict(orders_stats_payment_order_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


