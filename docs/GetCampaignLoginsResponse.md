# GetCampaignLoginsResponse

Ответ на запрос списка логинов, связанных с магазином.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logins** | **List[str]** | Список логинов. | 

## Example

```python
from ympa_python_client.models.get_campaign_logins_response import GetCampaignLoginsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignLoginsResponse from a JSON string
get_campaign_logins_response_instance = GetCampaignLoginsResponse.from_json(json)
# print the JSON string representation of the object
print(GetCampaignLoginsResponse.to_json())

# convert the object into a dict
get_campaign_logins_response_dict = get_campaign_logins_response_instance.to_dict()
# create an instance of GetCampaignLoginsResponse from a dict
get_campaign_logins_response_from_dict = GetCampaignLoginsResponse.from_dict(get_campaign_logins_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


