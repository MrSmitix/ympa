# FeedIndexLogsRecordDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadTime** | **ZonedDateTime** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to nothing]
**fileTime** | **ZonedDateTime** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to nothing]
**generationId** | **Int64** | Идентификатор индексации. | [optional] [default to nothing]
**indexType** | [***FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] [default to nothing]
**publishedTime** | **ZonedDateTime** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to nothing]
**status** | [***FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] [default to nothing]
**error** | [***FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] [default to nothing]
**offers** | [***FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


