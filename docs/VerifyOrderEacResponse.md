# VerifyOrderEacResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**EacVerificationResultDTO**](EacVerificationResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$VerifyOrderEacResponse = Initialize-ympa_powershell_clientVerifyOrderEacResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$VerifyOrderEacResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

