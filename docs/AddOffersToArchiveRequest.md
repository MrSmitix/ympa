# AddOffersToArchiveRequest

Товары, которые нужно поместить в архив. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Список товаров, которые нужно поместить в архив. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.add_offers_to_archive_request import AddOffersToArchiveRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddOffersToArchiveRequest from a JSON string
add_offers_to_archive_request_instance = AddOffersToArchiveRequest.from_json(json)
# print the JSON string representation of the object
print AddOffersToArchiveRequest.to_json()

# convert the object into a dict
add_offers_to_archive_request_dict = add_offers_to_archive_request_instance.to_dict()
# create an instance of AddOffersToArchiveRequest from a dict
add_offers_to_archive_request_from_dict = AddOffersToArchiveRequest.from_dict(add_offers_to_archive_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


