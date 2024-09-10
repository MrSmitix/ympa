# OpenapiClient::GetQuarantineOffersRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_ids** | **Array&lt;String&gt;** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] |
| **card_statuses** | [**Array&lt;OfferCardStatusType&gt;**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] |
| **category_ids** | **Array&lt;Integer&gt;** | Фильтр по категориям на Маркете. | [optional] |
| **vendor_names** | **Array&lt;String&gt;** | Фильтр по брендам. | [optional] |
| **tags** | **Array&lt;String&gt;** | Фильтр по тегам. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetQuarantineOffersRequest.new(
  offer_ids: null,
  card_statuses: null,
  category_ids: null,
  vendor_names: null,
  tags: null
)
```

