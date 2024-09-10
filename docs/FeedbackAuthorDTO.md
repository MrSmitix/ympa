# FeedbackAuthorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Имя автора отзыва. | [optional] 
**Region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedbackAuthorDTO = Initialize-ympa_powershell_clientFeedbackAuthorDTO  -Name null `
 -Region null
```

- Convert the resource to JSON
```powershell
$FeedbackAuthorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

