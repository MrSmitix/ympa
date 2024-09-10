# GetWarehouseStocksResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetWarehouseStocksDTO**](GetWarehouseStocksDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_warehouse_stocks_response import GetWarehouseStocksResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWarehouseStocksResponse from a JSON string
get_warehouse_stocks_response_instance = GetWarehouseStocksResponse.from_json(json)
# print the JSON string representation of the object
print GetWarehouseStocksResponse.to_json()

# convert the object into a dict
get_warehouse_stocks_response_dict = get_warehouse_stocks_response_instance.to_dict()
# create an instance of GetWarehouseStocksResponse from a dict
get_warehouse_stocks_response_from_dict = GetWarehouseStocksResponse.from_dict(get_warehouse_stocks_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


