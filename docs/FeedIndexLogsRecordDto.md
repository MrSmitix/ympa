# FeedIndexLogsRecordDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_time** | Option<**String**> | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional]
**file_time** | Option<**String**> | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional]
**generation_id** | Option<**i64**> | Идентификатор индексации. | [optional]
**index_type** | Option<[**models::FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md)> |  | [optional]
**published_time** | Option<**String**> | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional]
**status** | Option<[**models::FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md)> |  | [optional]
**error** | Option<[**models::FeedIndexLogsErrorDto**](FeedIndexLogsErrorDTO.md)> |  | [optional]
**offers** | Option<[**models::FeedIndexLogsOffersDto**](FeedIndexLogsOffersDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


