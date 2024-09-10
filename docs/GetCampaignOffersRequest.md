# WWW::OpenAPIClient::Object::GetCampaignOffersRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetCampaignOffersRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **ARRAY[string]** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 
**statuses** | [**ARRAY[OfferCampaignStatusType]**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] 
**category_ids** | **ARRAY[int]** | Фильтр по категориям на Маркете. | [optional] 
**vendor_names** | **ARRAY[string]** | Фильтр по брендам. | [optional] 
**tags** | **ARRAY[string]** | Фильтр по тегам. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


