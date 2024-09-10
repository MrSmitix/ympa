# OrderBoxLayoutItemDTO

Информация о товаре в коробке.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | 
**full_count** | **int** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  | [optional] 
**partial_count** | [**OrderBoxLayoutPartialCountDTO**](OrderBoxLayoutPartialCountDTO.md) |  | [optional] 
**instances** | [**List[BriefOrderItemInstanceDTO]**](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 

## Example

```python
from ympa_python_client.models.order_box_layout_item_dto import OrderBoxLayoutItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderBoxLayoutItemDTO from a JSON string
order_box_layout_item_dto_instance = OrderBoxLayoutItemDTO.from_json(json)
# print the JSON string representation of the object
print(OrderBoxLayoutItemDTO.to_json())

# convert the object into a dict
order_box_layout_item_dto_dict = order_box_layout_item_dto_instance.to_dict()
# create an instance of OrderBoxLayoutItemDTO from a dict
order_box_layout_item_dto_from_dict = OrderBoxLayoutItemDTO.from_dict(order_box_layout_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


