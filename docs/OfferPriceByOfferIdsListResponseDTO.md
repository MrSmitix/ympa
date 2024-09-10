# OfferPriceByOfferIdsListResponseDTO

Список цен.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[OfferPriceByOfferIdsResponseDTO]**](OfferPriceByOfferIdsResponseDTO.md) | Страница списка цен. | 
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_price_by_offer_ids_list_response_dto import OfferPriceByOfferIdsListResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferPriceByOfferIdsListResponseDTO from a JSON string
offer_price_by_offer_ids_list_response_dto_instance = OfferPriceByOfferIdsListResponseDTO.from_json(json)
# print the JSON string representation of the object
print OfferPriceByOfferIdsListResponseDTO.to_json()

# convert the object into a dict
offer_price_by_offer_ids_list_response_dto_dict = offer_price_by_offer_ids_list_response_dto_instance.to_dict()
# create an instance of OfferPriceByOfferIdsListResponseDTO from a dict
offer_price_by_offer_ids_list_response_dto_from_dict = OfferPriceByOfferIdsListResponseDTO.from_dict(offer_price_by_offer_ids_list_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


