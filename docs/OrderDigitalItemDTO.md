# OrderDigitalItemDTO

Ключ цифрового товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**code** | **str** | Сам ключ. | 
**slip** | **str** | Инструкция по активации. | 
**activate_till** | **date** | Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_digital_item_dto import OrderDigitalItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderDigitalItemDTO from a JSON string
order_digital_item_dto_instance = OrderDigitalItemDTO.from_json(json)
# print the JSON string representation of the object
print OrderDigitalItemDTO.to_json()

# convert the object into a dict
order_digital_item_dto_dict = order_digital_item_dto_instance.to_dict()
# create an instance of OrderDigitalItemDTO from a dict
order_digital_item_dto_from_dict = OrderDigitalItemDTO.from_dict(order_digital_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


