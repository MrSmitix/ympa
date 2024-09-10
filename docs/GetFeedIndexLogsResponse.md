# GetFeedIndexLogsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**FeedIndexLogsResultDTO**](FeedIndexLogsResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetFeedIndexLogsResponse = Initialize-ympa_powershell_clientGetFeedIndexLogsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetFeedIndexLogsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

