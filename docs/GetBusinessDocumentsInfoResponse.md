# GetBusinessDocumentsInfoResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OrderBusinessDocumentsDTO**](OrderBusinessDocumentsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_business_documents_info_response import GetBusinessDocumentsInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessDocumentsInfoResponse from a JSON string
get_business_documents_info_response_instance = GetBusinessDocumentsInfoResponse.from_json(json)
# print the JSON string representation of the object
print GetBusinessDocumentsInfoResponse.to_json()

# convert the object into a dict
get_business_documents_info_response_dict = get_business_documents_info_response_instance.to_dict()
# create an instance of GetBusinessDocumentsInfoResponse from a dict
get_business_documents_info_response_from_dict = GetBusinessDocumentsInfoResponse.from_dict(get_business_documents_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


