# GetOrderLabelsDataResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OrderLabelDTO**](OrderLabelDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOrderLabelsDataResponse = Initialize-ympa_powershell_clientGetOrderLabelsDataResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetOrderLabelsDataResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

