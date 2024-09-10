# CreateOutletResponse

Ответ на запрос о создании точки продаж.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OutletResponseDTO**](OutletResponseDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.create_outlet_response import CreateOutletResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateOutletResponse from a JSON string
create_outlet_response_instance = CreateOutletResponse.from_json(json)
# print the JSON string representation of the object
print CreateOutletResponse.to_json()

# convert the object into a dict
create_outlet_response_dict = create_outlet_response_instance.to_dict()
# create an instance of CreateOutletResponse from a dict
create_outlet_response_from_dict = CreateOutletResponse.from_dict(create_outlet_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


