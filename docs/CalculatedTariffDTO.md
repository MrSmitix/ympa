# OpenapiClient::CalculatedTariffDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**CalculatedTariffType**](CalculatedTariffType.md) |  |  |
| **amount** | **Float** | Стоимость услуги в рублях. | [optional] |
| **parameters** | [**Array&lt;TariffParameterDTO&gt;**](TariffParameterDTO.md) | Параметры расчета тарифа. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CalculatedTariffDTO.new(
  type: null,
  amount: null,
  parameters: null
)
```

