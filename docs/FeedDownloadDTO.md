# FeedDownloadDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**VarError** | [**FeedDownloadErrorDTO**](FeedDownloadErrorDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedDownloadDTO = Initialize-ympa_powershell_clientFeedDownloadDTO  -Status null `
 -VarError null
```

- Convert the resource to JSON
```powershell
$FeedDownloadDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

