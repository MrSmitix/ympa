# OfferPriceListResponseDTO

Список цен на товары.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[OfferPriceResponseDTO]**](OfferPriceResponseDTO.md) | Страница списка. | 
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**total** | **int** | Количество всех цен магазина, измененных через API. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_price_list_response_dto import OfferPriceListResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferPriceListResponseDTO from a JSON string
offer_price_list_response_dto_instance = OfferPriceListResponseDTO.from_json(json)
# print the JSON string representation of the object
print OfferPriceListResponseDTO.to_json()

# convert the object into a dict
offer_price_list_response_dto_dict = offer_price_list_response_dto_instance.to_dict()
# create an instance of OfferPriceListResponseDTO from a dict
offer_price_list_response_dto_from_dict = OfferPriceListResponseDTO.from_dict(offer_price_list_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


