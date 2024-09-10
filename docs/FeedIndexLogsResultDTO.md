# FeedIndexLogsResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feed** | [**FeedIndexLogsFeedDTO**](FeedIndexLogsFeedDTO.md) |  | [optional] 
**IndexLogRecords** | [**FeedIndexLogsRecordDTO[]**](FeedIndexLogsRecordDTO.md) | Список отчетов по индексации прайс-листа. | 
**Total** | **Int64** | Количество отчетов на всех страницах выходных данных. | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedIndexLogsResultDTO = Initialize-ympa_powershell_clientFeedIndexLogsResultDTO  -Feed null `
 -IndexLogRecords null `
 -Total null
```

- Convert the resource to JSON
```powershell
$FeedIndexLogsResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

