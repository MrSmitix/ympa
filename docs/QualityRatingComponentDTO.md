# QualityRatingComponentDTO

Составляющая индекса качества.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** | Значение составляющей в процентах. | 
**component_type** | [**QualityRatingComponentType**](QualityRatingComponentType.md) |  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.quality_rating_component_dto import QualityRatingComponentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of QualityRatingComponentDTO from a JSON string
quality_rating_component_dto_instance = QualityRatingComponentDTO.from_json(json)
# print the JSON string representation of the object
print QualityRatingComponentDTO.to_json()

# convert the object into a dict
quality_rating_component_dto_dict = quality_rating_component_dto_instance.to_dict()
# create an instance of QualityRatingComponentDTO from a dict
quality_rating_component_dto_from_dict = QualityRatingComponentDTO.from_dict(quality_rating_component_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


