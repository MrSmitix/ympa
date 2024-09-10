# FeedIndexLogsRecordDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_time** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional] [default to None]
**file_time** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional] [default to None]
**generation_id** | **i64** | Идентификатор индексации. | [optional] [default to None]
**index_type** | [***models::FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] [default to None]
**published_time** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional] [default to None]
**status** | [***models::FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] [default to None]
**error** | [***models::FeedIndexLogsErrorDto**](FeedIndexLogsErrorDTO.md) |  | [optional] [default to None]
**offers** | [***models::FeedIndexLogsOffersDto**](FeedIndexLogsOffersDTO.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


