# OffersDTO

Найденные предложения магазина.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[OfferDTO]**](OfferDTO.md) | Список предложений магазина. | 

## Example

```python
from ympa_python_client.models.offers_dto import OffersDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OffersDTO from a JSON string
offers_dto_instance = OffersDTO.from_json(json)
# print the JSON string representation of the object
print(OffersDTO.to_json())

# convert the object into a dict
offers_dto_dict = offers_dto_instance.to_dict()
# create an instance of OffersDTO from a dict
offers_dto_from_dict = OffersDTO.from_dict(offers_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


