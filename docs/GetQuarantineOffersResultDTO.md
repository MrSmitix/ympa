# GetQuarantineOffersResultDTO

Список товаров в карантине.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**offers** | [**List[QuarantineOfferDTO]**](QuarantineOfferDTO.md) | Страница списка товаров в карантине. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_quarantine_offers_result_dto import GetQuarantineOffersResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetQuarantineOffersResultDTO from a JSON string
get_quarantine_offers_result_dto_instance = GetQuarantineOffersResultDTO.from_json(json)
# print the JSON string representation of the object
print GetQuarantineOffersResultDTO.to_json()

# convert the object into a dict
get_quarantine_offers_result_dto_dict = get_quarantine_offers_result_dto_instance.to_dict()
# create an instance of GetQuarantineOffersResultDTO from a dict
get_quarantine_offers_result_dto_from_dict = GetQuarantineOffersResultDTO.from_dict(get_quarantine_offers_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


