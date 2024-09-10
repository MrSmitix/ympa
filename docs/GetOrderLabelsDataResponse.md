# GetOrderLabelsDataResponse

Ответ с информацией для печати ярлыков.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OrderLabelDTO**](OrderLabelDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_order_labels_data_response import GetOrderLabelsDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOrderLabelsDataResponse from a JSON string
get_order_labels_data_response_instance = GetOrderLabelsDataResponse.from_json(json)
# print the JSON string representation of the object
print GetOrderLabelsDataResponse.to_json()

# convert the object into a dict
get_order_labels_data_response_dict = get_order_labels_data_response_instance.to_dict()
# create an instance of GetOrderLabelsDataResponse from a dict
get_order_labels_data_response_from_dict = GetOrderLabelsDataResponse.from_dict(get_order_labels_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


