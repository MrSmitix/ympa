# GetBusinessSettingsResponse

Ответ на запрос настроек кабинета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetBusinessSettingsInfoDTO**](GetBusinessSettingsInfoDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_business_settings_response import GetBusinessSettingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessSettingsResponse from a JSON string
get_business_settings_response_instance = GetBusinessSettingsResponse.from_json(json)
# print the JSON string representation of the object
print GetBusinessSettingsResponse.to_json()

# convert the object into a dict
get_business_settings_response_dict = get_business_settings_response_instance.to_dict()
# create an instance of GetBusinessSettingsResponse from a dict
get_business_settings_response_from_dict = GetBusinessSettingsResponse.from_dict(get_business_settings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


