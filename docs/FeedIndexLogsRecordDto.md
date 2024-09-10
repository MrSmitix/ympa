# FeedIndexLogsRecordDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadTime** | **String!** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to null]
**fileTime** | **String!** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to null]
**generationId** | **Int!** | Идентификатор индексации. | [optional] [default to null]
**indexType** | [***FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] [default to null]
**publishedTime** | **String!** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to null]
**status** | [***FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] [default to null]
**error** | [***FeedIndexLogsErrorDto**](FeedIndexLogsErrorDTO.md) |  | [optional] [default to null]
**offers** | [***FeedIndexLogsOffersDto**](FeedIndexLogsOffersDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


