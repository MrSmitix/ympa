# OrderItemSubsidyDTO

Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OrderItemSubsidyType**](OrderItemSubsidyType.md) |  | [optional] 
**amount** | **float** | Сумма субсидии. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_item_subsidy_dto import OrderItemSubsidyDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderItemSubsidyDTO from a JSON string
order_item_subsidy_dto_instance = OrderItemSubsidyDTO.from_json(json)
# print the JSON string representation of the object
print OrderItemSubsidyDTO.to_json()

# convert the object into a dict
order_item_subsidy_dto_dict = order_item_subsidy_dto_instance.to_dict()
# create an instance of OrderItemSubsidyDTO from a dict
order_item_subsidy_dto_from_dict = OrderItemSubsidyDTO.from_dict(order_item_subsidy_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


