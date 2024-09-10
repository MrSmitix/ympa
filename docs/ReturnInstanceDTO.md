# ReturnInstanceDTO

Логистическая информация по возврату.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stock_type** | [**ReturnInstanceStockType**](ReturnInstanceStockType.md) |  | [optional] 
**status** | [**ReturnInstanceStatusType**](ReturnInstanceStatusType.md) |  | [optional] 
**cis** | **str** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] 
**imei** | **str** | Международный идентификатор мобильного оборудования. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.return_instance_dto import ReturnInstanceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ReturnInstanceDTO from a JSON string
return_instance_dto_instance = ReturnInstanceDTO.from_json(json)
# print the JSON string representation of the object
print ReturnInstanceDTO.to_json()

# convert the object into a dict
return_instance_dto_dict = return_instance_dto_instance.to_dict()
# create an instance of ReturnInstanceDTO from a dict
return_instance_dto_from_dict = ReturnInstanceDTO.from_dict(return_instance_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


