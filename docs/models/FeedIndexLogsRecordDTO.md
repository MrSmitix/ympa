

# FeedIndexLogsRecordDTO

Список отчетов по индексации прайс-листа.

The class is defined in **[FeedIndexLogsRecordDTO.java](../../src/main/java/org/openapitools/model/FeedIndexLogsRecordDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadTime** | `OffsetDateTime` | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional property]
**fileTime** | `OffsetDateTime` | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional property]
**generationId** | `Long` | Идентификатор индексации. |  [optional property]
**indexType** | `FeedIndexLogsIndexType` |  |  [optional property]
**publishedTime** | `OffsetDateTime` | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  |  [optional property]
**status** | `FeedIndexLogsStatusType` |  |  [optional property]
**error** | [`FeedIndexLogsErrorDTO`](FeedIndexLogsErrorDTO.md) |  |  [optional property]
**offers** | [`FeedIndexLogsOffersDTO`](FeedIndexLogsOffersDTO.md) |  |  [optional property]










