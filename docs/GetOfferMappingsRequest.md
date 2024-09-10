# OpenapiClient::GetOfferMappingsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_ids** | **Array&lt;String&gt;** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}     | [optional] |
| **card_statuses** | [**Array&lt;OfferCardStatusType&gt;**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] |
| **category_ids** | **Array&lt;Integer&gt;** | Фильтр по категориям на Маркете. | [optional] |
| **vendor_names** | **Array&lt;String&gt;** | Фильтр по брендам. | [optional] |
| **tags** | **Array&lt;String&gt;** | Фильтр по тегам. | [optional] |
| **archived** | **Boolean** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetOfferMappingsRequest.new(
  offer_ids: null,
  card_statuses: null,
  category_ids: null,
  vendor_names: null,
  tags: null,
  archived: null
)
```

