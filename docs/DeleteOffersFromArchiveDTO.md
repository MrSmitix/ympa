# DeleteOffersFromArchiveDTO

Товары, которые не удалось восстановить из архива.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**not_unarchived_offer_ids** | **List[str]** | Список товаров, которые не удалось восстановить из архива. | [optional] 

## Example

```python
from ympa_python_client.models.delete_offers_from_archive_dto import DeleteOffersFromArchiveDTO

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteOffersFromArchiveDTO from a JSON string
delete_offers_from_archive_dto_instance = DeleteOffersFromArchiveDTO.from_json(json)
# print the JSON string representation of the object
print(DeleteOffersFromArchiveDTO.to_json())

# convert the object into a dict
delete_offers_from_archive_dto_dict = delete_offers_from_archive_dto_instance.to_dict()
# create an instance of DeleteOffersFromArchiveDTO from a dict
delete_offers_from_archive_dto_from_dict = DeleteOffersFromArchiveDTO.from_dict(delete_offers_from_archive_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


