# OpenapiClient::CalculateTariffsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **parameters** | [**CalculateTariffsParametersDTO**](CalculateTariffsParametersDTO.md) |  |  |
| **offers** | [**Array&lt;CalculateTariffsOfferDTO&gt;**](CalculateTariffsOfferDTO.md) | Товары, для которых нужно рассчитать стоимость услуг. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CalculateTariffsRequest.new(
  parameters: null,
  offers: null
)
```

