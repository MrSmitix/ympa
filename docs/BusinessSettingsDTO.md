# OpenapiClient::BusinessSettingsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **only_default_price** | **Boolean** | Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену.  | [optional] |
| **currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BusinessSettingsDTO.new(
  only_default_price: null,
  currency: null
)
```

