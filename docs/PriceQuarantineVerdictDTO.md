# OpenapiClient::PriceQuarantineVerdictDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**PriceQuarantineVerdictType**](PriceQuarantineVerdictType.md) |  | [optional] |
| **params** | [**Array&lt;PriceQuarantineVerdictParameterDTO&gt;**](PriceQuarantineVerdictParameterDTO.md) | Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PriceQuarantineVerdictDTO.new(
  type: null,
  params: null
)
```

