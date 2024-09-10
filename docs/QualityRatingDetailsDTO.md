# QualityRatingDetailsDTO

Информация о заказах, которые повлияли на индекс качества.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affected_orders** | [**List[QualityRatingAffectedOrderDTO]**](QualityRatingAffectedOrderDTO.md) | Список заказов, которые повлияли на индекс качества. | 

## Example

```python
from ympa_python_client.models.quality_rating_details_dto import QualityRatingDetailsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of QualityRatingDetailsDTO from a JSON string
quality_rating_details_dto_instance = QualityRatingDetailsDTO.from_json(json)
# print the JSON string representation of the object
print(QualityRatingDetailsDTO.to_json())

# convert the object into a dict
quality_rating_details_dto_dict = quality_rating_details_dto_instance.to_dict()
# create an instance of QualityRatingDetailsDTO from a dict
quality_rating_details_dto_from_dict = QualityRatingDetailsDTO.from_dict(quality_rating_details_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


