# GetGoodsFeedbackResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GoodsFeedbackListDTO**](GoodsFeedbackListDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetGoodsFeedbackResponse = Initialize-ympa_powershell_clientGetGoodsFeedbackResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetGoodsFeedbackResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

