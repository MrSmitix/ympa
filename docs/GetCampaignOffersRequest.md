
# GetCampaignOffersRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **offerIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     |  [optional] |
| **statuses** | [**kotlin.collections.List&lt;OfferCampaignStatusType&gt;**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  |  [optional] |
| **categoryIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Фильтр по категориям на Маркете. |  [optional] |
| **vendorNames** | **kotlin.collections.List&lt;kotlin.String&gt;** | Фильтр по брендам. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Фильтр по тегам. |  [optional] |



