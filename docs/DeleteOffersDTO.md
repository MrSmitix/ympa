# DeleteOffersDTO

Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**not_deleted_offer_ids** | **List[str]** | Список SKU товаров, которые не удалось удалить. | [optional] 

## Example

```python
from ympa_python_client.models.delete_offers_dto import DeleteOffersDTO

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteOffersDTO from a JSON string
delete_offers_dto_instance = DeleteOffersDTO.from_json(json)
# print the JSON string representation of the object
print(DeleteOffersDTO.to_json())

# convert the object into a dict
delete_offers_dto_dict = delete_offers_dto_instance.to_dict()
# create an instance of DeleteOffersDTO from a dict
delete_offers_dto_from_dict = DeleteOffersDTO.from_dict(delete_offers_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


