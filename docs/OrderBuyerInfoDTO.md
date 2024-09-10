# OrderBuyerInfoDTO

Информация о покупателе и его номере телефона.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Идентификатор покупателя. | [optional] 
**last_name** | **str** | Фамилия покупателя. | [optional] 
**first_name** | **str** | Имя покупателя. | [optional] 
**middle_name** | **str** | Отчество покупателя. | [optional] 
**type** | [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] 
**phone** | **str** | Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.order_buyer_info_dto import OrderBuyerInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderBuyerInfoDTO from a JSON string
order_buyer_info_dto_instance = OrderBuyerInfoDTO.from_json(json)
# print the JSON string representation of the object
print(OrderBuyerInfoDTO.to_json())

# convert the object into a dict
order_buyer_info_dto_dict = order_buyer_info_dto_instance.to_dict()
# create an instance of OrderBuyerInfoDTO from a dict
order_buyer_info_dto_from_dict = OrderBuyerInfoDTO.from_dict(order_buyer_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


