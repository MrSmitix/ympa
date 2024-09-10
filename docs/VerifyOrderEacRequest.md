# VerifyOrderEacRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Код для подтверждения ЭАПП. | [optional] 

## Example

```python
from ympa_python_client.models.verify_order_eac_request import VerifyOrderEacRequest

# TODO update the JSON string below
json = "{}"
# create an instance of VerifyOrderEacRequest from a JSON string
verify_order_eac_request_instance = VerifyOrderEacRequest.from_json(json)
# print the JSON string representation of the object
print(VerifyOrderEacRequest.to_json())

# convert the object into a dict
verify_order_eac_request_dict = verify_order_eac_request_instance.to_dict()
# create an instance of VerifyOrderEacRequest from a dict
verify_order_eac_request_from_dict = VerifyOrderEacRequest.from_dict(verify_order_eac_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


