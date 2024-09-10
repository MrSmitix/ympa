# GetCampaignOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | Option<**Vec<String>**> | Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     | [optional]
**statuses** | Option<[**Vec<models::OfferCampaignStatusType>**](OfferCampaignStatusType.md)> | Фильтр по статусам товаров.  | [optional]
**category_ids** | Option<**Vec<i32>**> | Фильтр по категориям на Маркете. | [optional]
**vendor_names** | Option<**Vec<String>**> | Фильтр по брендам. | [optional]
**tags** | Option<**Vec<String>**> | Фильтр по тегам. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


