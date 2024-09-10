# GetBidsInfoResponse

description.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetBidsInfoResponseDTO**](GetBidsInfoResponseDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_bids_info_response import GetBidsInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetBidsInfoResponse from a JSON string
get_bids_info_response_instance = GetBidsInfoResponse.from_json(json)
# print the JSON string representation of the object
print(GetBidsInfoResponse.to_json())

# convert the object into a dict
get_bids_info_response_dict = get_bids_info_response_instance.to_dict()
# create an instance of GetBidsInfoResponse from a dict
get_bids_info_response_from_dict = GetBidsInfoResponse.from_dict(get_bids_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


