# GoodsFeedbackListDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedbacks** | [**GoodsFeedbackDTO[]**](GoodsFeedbackDTO.md) | Список отзывов. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackListDTO = Initialize-ympa_powershell_clientGoodsFeedbackListDTO  -Feedbacks null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackListDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

