# WWW::OpenAPIClient::Object::GetQuarantineOffersRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetQuarantineOffersRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **ARRAY[string]** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] 
**card_statuses** | [**ARRAY[OfferCardStatusType]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**category_ids** | **ARRAY[int]** | Фильтр по категориям на Маркете. | [optional] 
**vendor_names** | **ARRAY[string]** | Фильтр по брендам. | [optional] 
**tags** | **ARRAY[string]** | Фильтр по тегам. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


