# WWW::OpenAPIClient::Object::FeedIndexLogsRecordDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FeedIndexLogsRecordDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_time** | **DATE_TIME** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**file_time** | **DATE_TIME** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**generation_id** | **int** | Идентификатор индексации. | [optional] 
**index_type** | [**FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] 
**published_time** | **DATE_TIME** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**status** | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] 
**error** | [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] 
**offers** | [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


