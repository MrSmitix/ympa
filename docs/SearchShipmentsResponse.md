# SearchShipmentsResponse

Ответ на запрос информации об отгрузках.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**SearchShipmentsResponseDTO**](SearchShipmentsResponseDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.search_shipments_response import SearchShipmentsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SearchShipmentsResponse from a JSON string
search_shipments_response_instance = SearchShipmentsResponse.from_json(json)
# print the JSON string representation of the object
print SearchShipmentsResponse.to_json()

# convert the object into a dict
search_shipments_response_dict = search_shipments_response_instance.to_dict()
# create an instance of SearchShipmentsResponse from a dict
search_shipments_response_from_dict = SearchShipmentsResponse.from_dict(search_shipments_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


