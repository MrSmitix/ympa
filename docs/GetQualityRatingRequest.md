# GetQualityRatingRequest

Запрос информации по индексу качества.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **date** | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  | [optional] 
**date_to** | **date** | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  | [optional] 
**campaign_ids** | **List[int]** | Список идентификаторов магазинов. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_quality_rating_request import GetQualityRatingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetQualityRatingRequest from a JSON string
get_quality_rating_request_instance = GetQualityRatingRequest.from_json(json)
# print the JSON string representation of the object
print GetQualityRatingRequest.to_json()

# convert the object into a dict
get_quality_rating_request_dict = get_quality_rating_request_instance.to_dict()
# create an instance of GetQualityRatingRequest from a dict
get_quality_rating_request_from_dict = GetQualityRatingRequest.from_dict(get_quality_rating_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


