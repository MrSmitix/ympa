# DeleteOffersFromArchiveRequest

Товары, которые нужно восстановить из архива. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Список товаров, которые нужно восстановить из архива. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteOffersFromArchiveRequest from a JSON string
delete_offers_from_archive_request_instance = DeleteOffersFromArchiveRequest.from_json(json)
# print the JSON string representation of the object
print DeleteOffersFromArchiveRequest.to_json()

# convert the object into a dict
delete_offers_from_archive_request_dict = delete_offers_from_archive_request_instance.to_dict()
# create an instance of DeleteOffersFromArchiveRequest from a dict
delete_offers_from_archive_request_from_dict = DeleteOffersFromArchiveRequest.from_dict(delete_offers_from_archive_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


