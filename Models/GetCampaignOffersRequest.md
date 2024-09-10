# GetCampaignOffersRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **offerIds** | **List** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] [default to null] |
| **statuses** | [**List**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] [default to null] |
| **categoryIds** | **List** | Фильтр по категориям на Маркете. | [optional] [default to null] |
| **vendorNames** | **List** | Фильтр по брендам. | [optional] [default to null] |
| **tags** | **List** | Фильтр по тегам. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

