# GetCampaignOffersRequest

Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 
**statuses** | [**List[OfferCampaignStatusType]**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] 
**category_ids** | **List[int]** | Фильтр по категориям на Маркете. | [optional] 
**vendor_names** | **List[str]** | Фильтр по брендам. | [optional] 
**tags** | **List[str]** | Фильтр по тегам. | [optional] 

## Example

```python
from ympa_python_client.models.get_campaign_offers_request import GetCampaignOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignOffersRequest from a JSON string
get_campaign_offers_request_instance = GetCampaignOffersRequest.from_json(json)
# print the JSON string representation of the object
print(GetCampaignOffersRequest.to_json())

# convert the object into a dict
get_campaign_offers_request_dict = get_campaign_offers_request_instance.to_dict()
# create an instance of GetCampaignOffersRequest from a dict
get_campaign_offers_request_from_dict = GetCampaignOffersRequest.from_dict(get_campaign_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


