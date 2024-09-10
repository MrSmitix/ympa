
# Table `FeedIndexLogsRecordDTO`
(mapped from: FeedIndexLogsRecordDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**downloadTime** | downloadTime | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional]
**fileTime** | fileTime | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional]
**generationId** | generationId | long |  | **kotlin.Long** | Идентификатор индексации. |  [optional]
**indexType** | indexType | long |  | [**FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  |  [optional] [foreignkey]
**publishedTime** | publishedTime | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional]
**status** | status | long |  | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  |  [optional] [foreignkey]
**error** | error | long |  | [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  |  [optional] [foreignkey]
**offers** | offers | long |  | [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  |  [optional] [foreignkey]










