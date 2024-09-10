# OpenapiClient::GetPricesByOfferIdsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_ids** | **Array&lt;String&gt;** | Список SKU.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetPricesByOfferIdsRequest.new(
  offer_ids: null
)
```

