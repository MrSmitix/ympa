# FeedIndexLogsOffersDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedCount** | **Int64** | Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. | [optional] 
**TotalCount** | **Int64** | Количество предложений в прайс-листе. | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedIndexLogsOffersDTO = Initialize-ympa_powershell_clientFeedIndexLogsOffersDTO  -RejectedCount null `
 -TotalCount null
```

- Convert the resource to JSON
```powershell
$FeedIndexLogsOffersDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

