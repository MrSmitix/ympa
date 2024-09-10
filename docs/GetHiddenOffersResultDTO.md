# GetHiddenOffersResultDTO

Список скрытых вами товаров. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**hidden_offers** | [**List[HiddenOfferDTO]**](HiddenOfferDTO.md) | Список скрытых товаров. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_hidden_offers_result_dto import GetHiddenOffersResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetHiddenOffersResultDTO from a JSON string
get_hidden_offers_result_dto_instance = GetHiddenOffersResultDTO.from_json(json)
# print the JSON string representation of the object
print GetHiddenOffersResultDTO.to_json()

# convert the object into a dict
get_hidden_offers_result_dto_dict = get_hidden_offers_result_dto_instance.to_dict()
# create an instance of GetHiddenOffersResultDTO from a dict
get_hidden_offers_result_dto_from_dict = GetHiddenOffersResultDTO.from_dict(get_hidden_offers_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


