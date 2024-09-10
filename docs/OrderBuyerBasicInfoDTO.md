# OrderBuyerBasicInfoDTO

Информация о покупателе с базовыми полями.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Идентификатор покупателя. | [optional] 
**last_name** | **str** | Фамилия покупателя. | [optional] 
**first_name** | **str** | Имя покупателя. | [optional] 
**middle_name** | **str** | Отчество покупателя. | [optional] 
**type** | [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.order_buyer_basic_info_dto import OrderBuyerBasicInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderBuyerBasicInfoDTO from a JSON string
order_buyer_basic_info_dto_instance = OrderBuyerBasicInfoDTO.from_json(json)
# print the JSON string representation of the object
print(OrderBuyerBasicInfoDTO.to_json())

# convert the object into a dict
order_buyer_basic_info_dto_dict = order_buyer_basic_info_dto_instance.to_dict()
# create an instance of OrderBuyerBasicInfoDTO from a dict
order_buyer_basic_info_dto_from_dict = OrderBuyerBasicInfoDTO.from_dict(order_buyer_basic_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


