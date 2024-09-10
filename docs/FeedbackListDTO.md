# FeedbackListDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**FeedbackList** | [**FeedbackDTO[]**](FeedbackDTO.md) | Список отзывов.  Содержит не более 20 отзывов.  | 

## Examples

- Prepare the resource
```powershell
$FeedbackListDTO = Initialize-ympa_powershell_clientFeedbackListDTO  -Paging null `
 -FeedbackList null
```

- Convert the resource to JSON
```powershell
$FeedbackListDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

