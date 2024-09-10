# OrdersStatsPaymentDTO

Информация о денежных переводах по заказу.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Идентификатор денежного перевода. | [optional] 
**var_date** | **date** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**type** | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] 
**source** | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] 
**total** | **float** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**payment_order** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.orders_stats_payment_dto import OrdersStatsPaymentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsPaymentDTO from a JSON string
orders_stats_payment_dto_instance = OrdersStatsPaymentDTO.from_json(json)
# print the JSON string representation of the object
print OrdersStatsPaymentDTO.to_json()

# convert the object into a dict
orders_stats_payment_dto_dict = orders_stats_payment_dto_instance.to_dict()
# create an instance of OrdersStatsPaymentDTO from a dict
orders_stats_payment_dto_from_dict = OrdersStatsPaymentDTO.from_dict(orders_stats_payment_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


