# OpenapiClient::AddOffersToArchiveDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **not_archived_offers** | [**Array&lt;AddOffersToArchiveErrorDTO&gt;**](AddOffersToArchiveErrorDTO.md) | Список товаров, которые не удалось поместить в архив. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::AddOffersToArchiveDTO.new(
  not_archived_offers: null
)
```

