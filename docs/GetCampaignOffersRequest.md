# GetCampaignOffersRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **Vec<models::ShopSku>** | Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     | [optional] [default to None]
**statuses** | [**Vec<models::OfferCampaignStatusType>**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] [default to None]
**category_ids** | **Vec<i32>** | Фильтр по категориям на Маркете. | [optional] [default to None]
**vendor_names** | **Vec<String>** | Фильтр по брендам. | [optional] [default to None]
**tags** | **Vec<String>** | Фильтр по тегам. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


