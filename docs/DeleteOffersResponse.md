# DeleteOffersResponse

Результат удаления товаров.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**DeleteOffersDTO**](DeleteOffersDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.delete_offers_response import DeleteOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteOffersResponse from a JSON string
delete_offers_response_instance = DeleteOffersResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteOffersResponse.to_json())

# convert the object into a dict
delete_offers_response_dict = delete_offers_response_instance.to_dict()
# create an instance of DeleteOffersResponse from a dict
delete_offers_response_from_dict = DeleteOffersResponse.from_dict(delete_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


