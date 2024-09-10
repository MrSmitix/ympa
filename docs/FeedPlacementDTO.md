# OpenapiClient::FeedPlacementDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] |
| **total_offers_count** | **Integer** | Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedPlacementDTO.new(
  status: null,
  total_offers_count: null
)
```

