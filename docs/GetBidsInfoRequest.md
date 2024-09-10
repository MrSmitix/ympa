# OpenapiClient::GetBidsInfoRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **skus** | **Array&lt;String&gt;** | Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры &#x60;page_token&#x60; и &#x60;limit&#x60; игнорируются.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetBidsInfoRequest.new(
  skus: null
)
```

