# OrderBusinessBuyerDTO

Информация о покупателе. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inn** | **str** | ИНН. | [optional] 
**kpp** | **str** | КПП. | [optional] 
**organization_name** | **str** | Наименование юридического лица. | [optional] 
**organization_jur_address** | **str** | Юридический адрес. | [optional] 

## Example

```python
from ympa_python_client.models.order_business_buyer_dto import OrderBusinessBuyerDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderBusinessBuyerDTO from a JSON string
order_business_buyer_dto_instance = OrderBusinessBuyerDTO.from_json(json)
# print the JSON string representation of the object
print(OrderBusinessBuyerDTO.to_json())

# convert the object into a dict
order_business_buyer_dto_dict = order_business_buyer_dto_instance.to_dict()
# create an instance of OrderBusinessBuyerDTO from a dict
order_business_buyer_dto_from_dict = OrderBusinessBuyerDTO.from_dict(order_business_buyer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


