# GetOrderBuyerInfoResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OrderBuyerInfoDTO**](OrderBuyerInfoDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_order_buyer_info_response import GetOrderBuyerInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOrderBuyerInfoResponse from a JSON string
get_order_buyer_info_response_instance = GetOrderBuyerInfoResponse.from_json(json)
# print the JSON string representation of the object
print(GetOrderBuyerInfoResponse.to_json())

# convert the object into a dict
get_order_buyer_info_response_dict = get_order_buyer_info_response_instance.to_dict()
# create an instance of GetOrderBuyerInfoResponse from a dict
get_order_buyer_info_response_from_dict = GetOrderBuyerInfoResponse.from_dict(get_order_buyer_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


