# SetOrderBoxLayoutResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OrderBoxesLayoutDTO**](OrderBoxesLayoutDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.set_order_box_layout_response import SetOrderBoxLayoutResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SetOrderBoxLayoutResponse from a JSON string
set_order_box_layout_response_instance = SetOrderBoxLayoutResponse.from_json(json)
# print the JSON string representation of the object
print SetOrderBoxLayoutResponse.to_json()

# convert the object into a dict
set_order_box_layout_response_dict = set_order_box_layout_response_instance.to_dict()
# create an instance of SetOrderBoxLayoutResponse from a dict
set_order_box_layout_response_from_dict = SetOrderBoxLayoutResponse.from_dict(set_order_box_layout_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


