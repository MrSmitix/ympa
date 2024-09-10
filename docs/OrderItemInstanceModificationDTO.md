# OrderItemInstanceModificationDTO

Позиция в корзине, требующая маркировки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**instances** | [**List[BriefOrderItemInstanceDTO]**](BriefOrderItemInstanceDTO.md) | Список кодов маркировки единиц товара.  | 

## Example

```python
from ympa_python_client.models.order_item_instance_modification_dto import OrderItemInstanceModificationDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderItemInstanceModificationDTO from a JSON string
order_item_instance_modification_dto_instance = OrderItemInstanceModificationDTO.from_json(json)
# print the JSON string representation of the object
print(OrderItemInstanceModificationDTO.to_json())

# convert the object into a dict
order_item_instance_modification_dto_dict = order_item_instance_modification_dto_instance.to_dict()
# create an instance of OrderItemInstanceModificationDTO from a dict
order_item_instance_modification_dto_from_dict = OrderItemInstanceModificationDTO.from_dict(order_item_instance_modification_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


