# GpsDTO

GPS-координаты широты и долготы. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **float** | Широта. | 
**longitude** | **float** | Долгота. | 

## Example

```python
from ympa_python_client.models.gps_dto import GpsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GpsDTO from a JSON string
gps_dto_instance = GpsDTO.from_json(json)
# print the JSON string representation of the object
print(GpsDTO.to_json())

# convert the object into a dict
gps_dto_dict = gps_dto_instance.to_dict()
# create an instance of GpsDTO from a dict
gps_dto_from_dict = GpsDTO.from_dict(gps_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


