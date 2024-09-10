# ModelPriceDTO

Информация о ценах на модель товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avg** | **float** | Средняя цена предложения для модели в регионе. | [optional] 
**max** | **float** | Максимальная цена предложения для модели в регионе. | [optional] 
**min** | **float** | Минимальная цена предложения для модели в регионе. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.model_price_dto import ModelPriceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ModelPriceDTO from a JSON string
model_price_dto_instance = ModelPriceDTO.from_json(json)
# print the JSON string representation of the object
print ModelPriceDTO.to_json()

# convert the object into a dict
model_price_dto_dict = model_price_dto_instance.to_dict()
# create an instance of ModelPriceDTO from a dict
model_price_dto_from_dict = ModelPriceDTO.from_dict(model_price_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


