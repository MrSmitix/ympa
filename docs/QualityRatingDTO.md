# QualityRatingDTO

Информация об индексе качества.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rating** | **int** | Значение индекса качества. | 
**calculation_date** | **date** | Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  | 
**components** | [**List[QualityRatingComponentDTO]**](QualityRatingComponentDTO.md) | Составляющие индекса качества. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.quality_rating_dto import QualityRatingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of QualityRatingDTO from a JSON string
quality_rating_dto_instance = QualityRatingDTO.from_json(json)
# print the JSON string representation of the object
print QualityRatingDTO.to_json()

# convert the object into a dict
quality_rating_dto_dict = quality_rating_dto_instance.to_dict()
# create an instance of QualityRatingDTO from a dict
quality_rating_dto_from_dict = QualityRatingDTO.from_dict(quality_rating_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


