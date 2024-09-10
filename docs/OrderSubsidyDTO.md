# OrderSubsidyDTO

Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OrderSubsidyType**](OrderSubsidyType.md) |  | [optional] 
**amount** | **float** | Сумма субсидии. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_subsidy_dto import OrderSubsidyDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderSubsidyDTO from a JSON string
order_subsidy_dto_instance = OrderSubsidyDTO.from_json(json)
# print the JSON string representation of the object
print OrderSubsidyDTO.to_json()

# convert the object into a dict
order_subsidy_dto_dict = order_subsidy_dto_instance.to_dict()
# create an instance of OrderSubsidyDTO from a dict
order_subsidy_dto_from_dict = OrderSubsidyDTO.from_dict(order_subsidy_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


