
# FeedIndexLogsRecordDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **downloadTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional] |
| **fileTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional] |
| **generationId** | **kotlin.Long** | Идентификатор индексации. |  [optional] |
| **indexType** | [**FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  |  [optional] |
| **publishedTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional] |
| **status** | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  |  [optional] |
| **error** | [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  |  [optional] |
| **offers** | [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  |  [optional] |



