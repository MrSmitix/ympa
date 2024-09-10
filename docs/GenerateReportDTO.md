# OpenapiClient::GenerateReportDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_id** | **String** | Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. |  |
| **estimated_generation_time** | **Integer** | Ожидаемая продолжительность генерации в миллисекундах. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateReportDTO.new(
  report_id: null,
  estimated_generation_time: null
)
```

