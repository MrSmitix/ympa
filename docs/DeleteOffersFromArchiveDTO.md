# OpenapiClient::DeleteOffersFromArchiveDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **not_unarchived_offer_ids** | **Array&lt;String&gt;** | Список товаров, которые не удалось восстановить из архива. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::DeleteOffersFromArchiveDTO.new(
  not_unarchived_offer_ids: null
)
```

