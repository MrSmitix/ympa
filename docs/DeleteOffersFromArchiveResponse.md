# DeleteOffersFromArchiveResponse

Результат разархивации товаров.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**DeleteOffersFromArchiveDTO**](DeleteOffersFromArchiveDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteOffersFromArchiveResponse from a JSON string
delete_offers_from_archive_response_instance = DeleteOffersFromArchiveResponse.from_json(json)
# print the JSON string representation of the object
print DeleteOffersFromArchiveResponse.to_json()

# convert the object into a dict
delete_offers_from_archive_response_dict = delete_offers_from_archive_response_instance.to_dict()
# create an instance of DeleteOffersFromArchiveResponse from a dict
delete_offers_from_archive_response_from_dict = DeleteOffersFromArchiveResponse.from_dict(delete_offers_from_archive_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


