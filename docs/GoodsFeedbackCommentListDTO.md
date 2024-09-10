# GoodsFeedbackCommentListDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Comments** | [**GoodsFeedbackCommentDTO[]**](GoodsFeedbackCommentDTO.md) | Список комментариев. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackCommentListDTO = Initialize-ympa_powershell_clientGoodsFeedbackCommentListDTO  -Comments null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackCommentListDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

