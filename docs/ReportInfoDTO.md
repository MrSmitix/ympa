# OpenapiClient::ReportInfoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**ReportStatusType**](ReportStatusType.md) |  |  |
| **sub_status** | [**ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] |
| **generation_requested_at** | **Time** | Дата и время запроса на генерацию. |  |
| **generation_finished_at** | **Time** | Дата и время завершения генерации. | [optional] |
| **file** | **String** | Ссылка на готовый отчет. | [optional] |
| **estimated_generation_time** | **Integer** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ReportInfoDTO.new(
  status: null,
  sub_status: null,
  generation_requested_at: null,
  generation_finished_at: null,
  file: null,
  estimated_generation_time: null
)
```

