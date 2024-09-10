# ProvideOrderItemIdentifiersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[OrderItemInstanceModificationDTO]**](OrderItemInstanceModificationDTO.md) | Список позиций, требующих маркировки.  | 

## Example

```python
from ympa_python_client.models.provide_order_item_identifiers_request import ProvideOrderItemIdentifiersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProvideOrderItemIdentifiersRequest from a JSON string
provide_order_item_identifiers_request_instance = ProvideOrderItemIdentifiersRequest.from_json(json)
# print the JSON string representation of the object
print(ProvideOrderItemIdentifiersRequest.to_json())

# convert the object into a dict
provide_order_item_identifiers_request_dict = provide_order_item_identifiers_request_instance.to_dict()
# create an instance of ProvideOrderItemIdentifiersRequest from a dict
provide_order_item_identifiers_request_from_dict = ProvideOrderItemIdentifiersRequest.from_dict(provide_order_item_identifiers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


