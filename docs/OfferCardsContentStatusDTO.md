# OfferCardsContentStatusDTO

Список товаров с информацией о состоянии карточек.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_cards** | [**List[OfferCardDTO]**](OfferCardDTO.md) | Страница списка товаров с информацией о состоянии карточек. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.offer_cards_content_status_dto import OfferCardsContentStatusDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferCardsContentStatusDTO from a JSON string
offer_cards_content_status_dto_instance = OfferCardsContentStatusDTO.from_json(json)
# print the JSON string representation of the object
print(OfferCardsContentStatusDTO.to_json())

# convert the object into a dict
offer_cards_content_status_dto_dict = offer_cards_content_status_dto_instance.to_dict()
# create an instance of OfferCardsContentStatusDTO from a dict
offer_cards_content_status_dto_from_dict = OfferCardsContentStatusDTO.from_dict(offer_cards_content_status_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


