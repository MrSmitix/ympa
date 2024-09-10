# PromoPeriodDTO

Время проведения акции.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_time_from** | **datetime** | Дата и время начала акции. | 
**date_time_to** | **datetime** | Дата и время окончания акции. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.promo_period_dto import PromoPeriodDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PromoPeriodDTO from a JSON string
promo_period_dto_instance = PromoPeriodDTO.from_json(json)
# print the JSON string representation of the object
print PromoPeriodDTO.to_json()

# convert the object into a dict
promo_period_dto_dict = promo_period_dto_instance.to_dict()
# create an instance of PromoPeriodDTO from a dict
promo_period_dto_from_dict = PromoPeriodDTO.from_dict(promo_period_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


