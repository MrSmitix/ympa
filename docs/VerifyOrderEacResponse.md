# VerifyOrderEacResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**EacVerificationResultDTO**](EacVerificationResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.verify_order_eac_response import VerifyOrderEacResponse

# TODO update the JSON string below
json = "{}"
# create an instance of VerifyOrderEacResponse from a JSON string
verify_order_eac_response_instance = VerifyOrderEacResponse.from_json(json)
# print the JSON string representation of the object
print VerifyOrderEacResponse.to_json()

# convert the object into a dict
verify_order_eac_response_dict = verify_order_eac_response_instance.to_dict()
# create an instance of VerifyOrderEacResponse from a dict
verify_order_eac_response_from_dict = VerifyOrderEacResponse.from_dict(verify_order_eac_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


