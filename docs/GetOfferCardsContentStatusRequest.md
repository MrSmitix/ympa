# GetOfferCardsContentStatusRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] 
**card_statuses** | [**List[OfferCardStatusType]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**category_ids** | **List[int]** | Фильтр по категориям на Маркете. | [optional] 

## Example

```python
from ympa_python_client.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferCardsContentStatusRequest from a JSON string
get_offer_cards_content_status_request_instance = GetOfferCardsContentStatusRequest.from_json(json)
# print the JSON string representation of the object
print(GetOfferCardsContentStatusRequest.to_json())

# convert the object into a dict
get_offer_cards_content_status_request_dict = get_offer_cards_content_status_request_instance.to_dict()
# create an instance of GetOfferCardsContentStatusRequest from a dict
get_offer_cards_content_status_request_from_dict = GetOfferCardsContentStatusRequest.from_dict(get_offer_cards_content_status_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


