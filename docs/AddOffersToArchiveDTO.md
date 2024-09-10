# AddOffersToArchiveDTO

Товары, которые не удалось поместить в архив.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**not_archived_offers** | [**List[AddOffersToArchiveErrorDTO]**](AddOffersToArchiveErrorDTO.md) | Список товаров, которые не удалось поместить в архив. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.add_offers_to_archive_dto import AddOffersToArchiveDTO

# TODO update the JSON string below
json = "{}"
# create an instance of AddOffersToArchiveDTO from a JSON string
add_offers_to_archive_dto_instance = AddOffersToArchiveDTO.from_json(json)
# print the JSON string representation of the object
print AddOffersToArchiveDTO.to_json()

# convert the object into a dict
add_offers_to_archive_dto_dict = add_offers_to_archive_dto_instance.to_dict()
# create an instance of AddOffersToArchiveDTO from a dict
add_offers_to_archive_dto_from_dict = AddOffersToArchiveDTO.from_dict(add_offers_to_archive_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


