# AddOffersToArchiveResponse

Результат архивации товаров.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**AddOffersToArchiveDTO**](AddOffersToArchiveDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.add_offers_to_archive_response import AddOffersToArchiveResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AddOffersToArchiveResponse from a JSON string
add_offers_to_archive_response_instance = AddOffersToArchiveResponse.from_json(json)
# print the JSON string representation of the object
print AddOffersToArchiveResponse.to_json()

# convert the object into a dict
add_offers_to_archive_response_dict = add_offers_to_archive_response_instance.to_dict()
# create an instance of AddOffersToArchiveResponse from a dict
add_offers_to_archive_response_from_dict = AddOffersToArchiveResponse.from_dict(add_offers_to_archive_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


