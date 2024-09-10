# OpenapiClient::FeedIndexLogsRecordDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **download_time** | **Time** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] |
| **file_time** | **Time** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] |
| **generation_id** | **Integer** | Идентификатор индексации. | [optional] |
| **index_type** | [**FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] |
| **published_time** | **Time** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] |
| **status** | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] |
| **error** | [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] |
| **offers** | [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedIndexLogsRecordDTO.new(
  download_time: null,
  file_time: null,
  generation_id: null,
  index_type: null,
  published_time: null,
  status: null,
  error: null,
  offers: null
)
```

