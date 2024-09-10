# GetQuarantineOffersRequest

Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] 
**card_statuses** | [**List[OfferCardStatusType]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**category_ids** | **List[int]** | Фильтр по категориям на Маркете. | [optional] 
**vendor_names** | **List[str]** | Фильтр по брендам. | [optional] 
**tags** | **List[str]** | Фильтр по тегам. | [optional] 

## Example

```python
from ympa_python_client.models.get_quarantine_offers_request import GetQuarantineOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetQuarantineOffersRequest from a JSON string
get_quarantine_offers_request_instance = GetQuarantineOffersRequest.from_json(json)
# print the JSON string representation of the object
print(GetQuarantineOffersRequest.to_json())

# convert the object into a dict
get_quarantine_offers_request_dict = get_quarantine_offers_request_instance.to_dict()
# create an instance of GetQuarantineOffersRequest from a dict
get_quarantine_offers_request_from_dict = GetQuarantineOffersRequest.from_dict(get_quarantine_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


