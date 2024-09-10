# DeleteOffersRequest

Фильтрации удаляемых товаров по offerIds. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Список SKU товаров, которые нужно удалить. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.delete_offers_request import DeleteOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteOffersRequest from a JSON string
delete_offers_request_instance = DeleteOffersRequest.from_json(json)
# print the JSON string representation of the object
print DeleteOffersRequest.to_json()

# convert the object into a dict
delete_offers_request_dict = delete_offers_request_instance.to_dict()
# create an instance of DeleteOffersRequest from a dict
delete_offers_request_from_dict = DeleteOffersRequest.from_dict(delete_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


