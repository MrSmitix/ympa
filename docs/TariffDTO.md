# OpenapiClient::TariffDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**TariffType**](TariffType.md) |  |  |
| **percent** | **Float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  | [optional] |
| **amount** | **Float** | Значение тарифа в рублях. |  |
| **parameters** | [**Array&lt;TariffParameterDTO&gt;**](TariffParameterDTO.md) | Параметры расчета тарифа. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::TariffDTO.new(
  type: null,
  percent: null,
  amount: null,
  parameters: null
)
```

