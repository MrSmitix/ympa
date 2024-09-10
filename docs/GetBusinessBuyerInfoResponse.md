# GetBusinessBuyerInfoResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OrderBusinessBuyerDTO**](OrderBusinessBuyerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_business_buyer_info_response import GetBusinessBuyerInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessBuyerInfoResponse from a JSON string
get_business_buyer_info_response_instance = GetBusinessBuyerInfoResponse.from_json(json)
# print the JSON string representation of the object
print(GetBusinessBuyerInfoResponse.to_json())

# convert the object into a dict
get_business_buyer_info_response_dict = get_business_buyer_info_response_instance.to_dict()
# create an instance of GetBusinessBuyerInfoResponse from a dict
get_business_buyer_info_response_from_dict = GetBusinessBuyerInfoResponse.from_dict(get_business_buyer_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


