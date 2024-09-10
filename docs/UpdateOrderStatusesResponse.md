# UpdateOrderStatusesResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**UpdateOrderStatusesDTO**](UpdateOrderStatusesDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_order_statuses_response import UpdateOrderStatusesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOrderStatusesResponse from a JSON string
update_order_statuses_response_instance = UpdateOrderStatusesResponse.from_json(json)
# print the JSON string representation of the object
print UpdateOrderStatusesResponse.to_json()

# convert the object into a dict
update_order_statuses_response_dict = update_order_statuses_response_instance.to_dict()
# create an instance of UpdateOrderStatusesResponse from a dict
update_order_statuses_response_from_dict = UpdateOrderStatusesResponse.from_dict(update_order_statuses_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


