# FEED_INDEX_LOGS_RECORD_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_time** | [**DATE_TIME**](DATE_TIME.md) | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to null]
**file_time** | [**DATE_TIME**](DATE_TIME.md) | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to null]
**generation_id** | **INTEGER_64** | Идентификатор индексации. | [optional] [default to null]
**index_type** | [**FEED_INDEX_LOGS_INDEX_TYPE**](FeedIndexLogsIndexType.md) |  | [optional] [default to null]
**published_time** | [**DATE_TIME**](DATE_TIME.md) | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] [default to null]
**status** | [**FEED_INDEX_LOGS_STATUS_TYPE**](FeedIndexLogsStatusType.md) |  | [optional] [default to null]
**error** | [**FEED_INDEX_LOGS_ERROR_DTO**](FeedIndexLogsErrorDTO.md) |  | [optional] [default to null]
**offers** | [**FEED_INDEX_LOGS_OFFERS_DTO**](FeedIndexLogsOffersDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


