# FeedDownloadErrorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HttpStatusCode** | **Int32** | HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**Type** | [**FeedDownloadErrorType**](FeedDownloadErrorType.md) |  | [optional] 
**Description** | **String** | Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedDownloadErrorDTO = Initialize-ympa_powershell_clientFeedDownloadErrorDTO  -HttpStatusCode null `
 -Type null `
 -Description null
```

- Convert the resource to JSON
```powershell
$FeedDownloadErrorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

