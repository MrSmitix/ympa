# ProvideOrderItemIdentifiersResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OrderItemsModificationResultDTO**](OrderItemsModificationResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.provide_order_item_identifiers_response import ProvideOrderItemIdentifiersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProvideOrderItemIdentifiersResponse from a JSON string
provide_order_item_identifiers_response_instance = ProvideOrderItemIdentifiersResponse.from_json(json)
# print the JSON string representation of the object
print(ProvideOrderItemIdentifiersResponse.to_json())

# convert the object into a dict
provide_order_item_identifiers_response_dict = provide_order_item_identifiers_response_instance.to_dict()
# create an instance of ProvideOrderItemIdentifiersResponse from a dict
provide_order_item_identifiers_response_from_dict = ProvideOrderItemIdentifiersResponse.from_dict(provide_order_item_identifiers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


