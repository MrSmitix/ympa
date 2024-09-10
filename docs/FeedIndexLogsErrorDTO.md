# FeedIndexLogsErrorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HttpStatusCode** | **Int32** | HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**Type** | [**FeedIndexLogsErrorType**](FeedIndexLogsErrorType.md) |  | [optional] 
**Description** | **String** | Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedIndexLogsErrorDTO = Initialize-ympa_powershell_clientFeedIndexLogsErrorDTO  -HttpStatusCode null `
 -Type null `
 -Description null
```

- Convert the resource to JSON
```powershell
$FeedIndexLogsErrorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

