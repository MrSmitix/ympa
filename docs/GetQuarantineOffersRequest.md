
# GetQuarantineOffersRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **offerIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  |  [optional] |
| **cardStatuses** | [**kotlin.collections.List&lt;OfferCardStatusType&gt;**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  |  [optional] |
| **categoryIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Фильтр по категориям на Маркете. |  [optional] |
| **vendorNames** | **kotlin.collections.List&lt;kotlin.String&gt;** | Фильтр по брендам. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Фильтр по тегам. |  [optional] |



