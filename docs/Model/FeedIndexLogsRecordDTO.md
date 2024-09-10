# FeedIndexLogsRecordDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadTime** | **\DateTime** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. | [optional] 
**fileTime** | **\DateTime** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. | [optional] 
**generationId** | **int** | Идентификатор индексации. | [optional] 
**indexType** | [**OpenAPI\Server\Model\FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] 
**publishedTime** | **\DateTime** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. | [optional] 
**status** | [**OpenAPI\Server\Model\FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] 
**error** | [**OpenAPI\Server\Model\FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] 
**offers** | [**OpenAPI\Server\Model\FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


