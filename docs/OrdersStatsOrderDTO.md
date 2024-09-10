# OrdersStatsOrderDTO

Информация о заказе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**creation_date** | **date** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**status_update_date** | **datetime** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] 
**status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] 
**partner_order_id** | **str** | Идентификатор заказа в информационной системе магазина. | [optional] 
**payment_type** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] 
**fake** | **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**delivery_region** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] 
**items** | [**List[OrdersStatsItemDTO]**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**initial_items** | [**List[OrdersStatsItemDTO]**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] 
**payments** | [**List[OrdersStatsPaymentDTO]**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**commissions** | [**List[OrdersStatsCommissionDTO]**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 

## Example

```python
from ympa_python_client.models.orders_stats_order_dto import OrdersStatsOrderDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsOrderDTO from a JSON string
orders_stats_order_dto_instance = OrdersStatsOrderDTO.from_json(json)
# print the JSON string representation of the object
print(OrdersStatsOrderDTO.to_json())

# convert the object into a dict
orders_stats_order_dto_dict = orders_stats_order_dto_instance.to_dict()
# create an instance of OrdersStatsOrderDTO from a dict
orders_stats_order_dto_from_dict = OrdersStatsOrderDTO.from_dict(orders_stats_order_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


