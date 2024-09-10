# OpenapiClient::GetOfferCardsContentStatusRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_ids** | **Array&lt;String&gt;** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] |
| **card_statuses** | [**Array&lt;OfferCardStatusType&gt;**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] |
| **category_ids** | **Array&lt;Integer&gt;** | Фильтр по категориям на Маркете. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetOfferCardsContentStatusRequest.new(
  offer_ids: null,
  card_statuses: null,
  category_ids: null
)
```

