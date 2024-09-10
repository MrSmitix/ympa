# OpenapiClient::GetCampaignOffersRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_ids** | **Array&lt;String&gt;** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] |
| **statuses** | [**Array&lt;OfferCampaignStatusType&gt;**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] |
| **category_ids** | **Array&lt;Integer&gt;** | Фильтр по категориям на Маркете. | [optional] |
| **vendor_names** | **Array&lt;String&gt;** | Фильтр по брендам. | [optional] |
| **tags** | **Array&lt;String&gt;** | Фильтр по тегам. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetCampaignOffersRequest.new(
  offer_ids: null,
  statuses: null,
  category_ids: null,
  vendor_names: null,
  tags: null
)
```

