# TrackDTO

Информация о трек-номерах.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**track_code** | **str** | Трек-код почтового отправления. | [optional] 

## Example

```python
from ympa_python_client.models.track_dto import TrackDTO

# TODO update the JSON string below
json = "{}"
# create an instance of TrackDTO from a JSON string
track_dto_instance = TrackDTO.from_json(json)
# print the JSON string representation of the object
print(TrackDTO.to_json())

# convert the object into a dict
track_dto_dict = track_dto_instance.to_dict()
# create an instance of TrackDTO from a dict
track_dto_from_dict = TrackDTO.from_dict(track_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


