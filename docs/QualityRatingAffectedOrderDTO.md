# QualityRatingAffectedOrderDTO

Информация о заказе, который повлиял на индекс качества.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **int** | Идентификатор заказа. | 
**description** | **str** | Описание проблемы. | 
**component_type** | [**AffectedOrderQualityRatingComponentType**](AffectedOrderQualityRatingComponentType.md) |  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.quality_rating_affected_order_dto import QualityRatingAffectedOrderDTO

# TODO update the JSON string below
json = "{}"
# create an instance of QualityRatingAffectedOrderDTO from a JSON string
quality_rating_affected_order_dto_instance = QualityRatingAffectedOrderDTO.from_json(json)
# print the JSON string representation of the object
print QualityRatingAffectedOrderDTO.to_json()

# convert the object into a dict
quality_rating_affected_order_dto_dict = quality_rating_affected_order_dto_instance.to_dict()
# create an instance of QualityRatingAffectedOrderDTO from a dict
quality_rating_affected_order_dto_from_dict = QualityRatingAffectedOrderDTO.from_dict(quality_rating_affected_order_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


