# OrderItemModificationDTO

Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  | 
**count** | **int** | Новое количество товара. | 
**instances** | [**List[BriefOrderItemInstanceDTO]**](BriefOrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_item_modification_dto import OrderItemModificationDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderItemModificationDTO from a JSON string
order_item_modification_dto_instance = OrderItemModificationDTO.from_json(json)
# print the JSON string representation of the object
print OrderItemModificationDTO.to_json()

# convert the object into a dict
order_item_modification_dto_dict = order_item_modification_dto_instance.to_dict()
# create an instance of OrderItemModificationDTO from a dict
order_item_modification_dto_from_dict = OrderItemModificationDTO.from_dict(order_item_modification_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


