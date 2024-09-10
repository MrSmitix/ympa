# GetBusinessSettingsInfoDTO

Информация о кабинете и его настройках.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**info** | [**BusinessDTO**](BusinessDTO.md) |  | [optional] 
**settings** | [**BusinessSettingsDTO**](BusinessSettingsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_business_settings_info_dto import GetBusinessSettingsInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessSettingsInfoDTO from a JSON string
get_business_settings_info_dto_instance = GetBusinessSettingsInfoDTO.from_json(json)
# print the JSON string representation of the object
print(GetBusinessSettingsInfoDTO.to_json())

# convert the object into a dict
get_business_settings_info_dto_dict = get_business_settings_info_dto_instance.to_dict()
# create an instance of GetBusinessSettingsInfoDTO from a dict
get_business_settings_info_dto_from_dict = GetBusinessSettingsInfoDTO.from_dict(get_business_settings_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


