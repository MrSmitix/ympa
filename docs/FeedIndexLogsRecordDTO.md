# ympa_csharp_client.Model.FeedIndexLogsRecordDTO
Список отчетов по индексации прайс-листа.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DownloadTime** | **DateTime** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**FileTime** | **DateTime** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**GenerationId** | **long** | Идентификатор индексации. | [optional] 
**IndexType** | **FeedIndexLogsIndexType** |  | [optional] 
**PublishedTime** | **DateTime** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**Status** | **FeedIndexLogsStatusType** |  | [optional] 
**Error** | [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] 
**Offers** | [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

