# UpdateTimeDTO

Время последнего обновления.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updated_at** | **datetime** | Время последнего обновления. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_time_dto import UpdateTimeDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateTimeDTO from a JSON string
update_time_dto_instance = UpdateTimeDTO.from_json(json)
# print the JSON string representation of the object
print UpdateTimeDTO.to_json()

# convert the object into a dict
update_time_dto_dict = update_time_dto_instance.to_dict()
# create an instance of UpdateTimeDTO from a dict
update_time_dto_from_dict = UpdateTimeDTO.from_dict(update_time_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


