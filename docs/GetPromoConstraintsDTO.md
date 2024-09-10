# OpenapiClient::GetPromoConstraintsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **warehouse_ids** | **Array&lt;Integer&gt;** | Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetPromoConstraintsDTO.new(
  warehouse_ids: null
)
```

