# OpenapiClient::FeedContentDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rejected_offers_count** | **Integer** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] |
| **status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] |
| **total_offers_count** | **Integer** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] |
| **error** | [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedContentDTO.new(
  rejected_offers_count: null,
  status: null,
  total_offers_count: null,
  error: null
)
```

