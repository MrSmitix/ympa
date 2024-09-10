# ModelDTO

Модель товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор модели товара. | [optional] 
**name** | **str** | Название модели товара. | [optional] 
**prices** | [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.model_dto import ModelDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ModelDTO from a JSON string
model_dto_instance = ModelDTO.from_json(json)
# print the JSON string representation of the object
print ModelDTO.to_json()

# convert the object into a dict
model_dto_dict = model_dto_instance.to_dict()
# create an instance of ModelDTO from a dict
model_dto_from_dict = ModelDTO.from_dict(model_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


