# OpenapiClient::FeedIndexLogsResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed** | [**FeedIndexLogsFeedDTO**](FeedIndexLogsFeedDTO.md) |  | [optional] |
| **index_log_records** | [**Array&lt;FeedIndexLogsRecordDTO&gt;**](FeedIndexLogsRecordDTO.md) | Список отчетов по индексации прайс-листа. |  |
| **total** | **Integer** | Количество отчетов на всех страницах выходных данных. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedIndexLogsResultDTO.new(
  feed: null,
  index_log_records: null,
  total: null
)
```

