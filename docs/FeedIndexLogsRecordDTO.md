# FeedIndexLogsRecordDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DownloadTime** | **System.DateTime** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**FileTime** | **System.DateTime** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**GenerationId** | **Int64** | Идентификатор индексации. | [optional] 
**IndexType** | [**FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] 
**PublishedTime** | **System.DateTime** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**Status** | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] 
**VarError** | [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] 
**Offers** | [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedIndexLogsRecordDTO = Initialize-ympa_powershell_clientFeedIndexLogsRecordDTO  -DownloadTime null `
 -FileTime null `
 -GenerationId null `
 -IndexType null `
 -PublishedTime null `
 -Status null `
 -VarError null `
 -Offers null
```

- Convert the resource to JSON
```powershell
$FeedIndexLogsRecordDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

