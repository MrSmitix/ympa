# GET_CAMPAIGN_OFFERS_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | [**LIST [STRING_32]**](STRING_32.md) | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] [default to null]
**statuses** | [**LIST [OFFER_CAMPAIGN_STATUS_TYPE]**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] [default to null]
**category_ids** | **LIST [INTEGER_32]** | Фильтр по категориям на Маркете. | [optional] [default to null]
**vendor_names** | [**LIST [STRING_32]**](STRING_32.md) | Фильтр по брендам. | [optional] [default to null]
**tags** | [**LIST [STRING_32]**](STRING_32.md) | Фильтр по тегам. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


