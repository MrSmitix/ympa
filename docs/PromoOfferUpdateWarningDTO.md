# OpenapiClient::PromoOfferUpdateWarningDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | [**PromoOfferUpdateWarningCodeType**](PromoOfferUpdateWarningCodeType.md) |  |  |
| **campaign_ids** | **Array&lt;Integer&gt;** | Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PromoOfferUpdateWarningDTO.new(
  code: null,
  campaign_ids: null
)
```

