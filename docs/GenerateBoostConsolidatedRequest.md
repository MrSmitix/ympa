# GenerateBoostConsolidatedRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **Int64** | Идентификатор бизнеса. | 
**DateFrom** | **System.DateTime** | Начало периода, включительно. | 
**DateTo** | **System.DateTime** | Конец периода, включительно. | 

## Examples

- Prepare the resource
```powershell
$GenerateBoostConsolidatedRequest = Initialize-ympa_powershell_clientGenerateBoostConsolidatedRequest  -BusinessId null `
 -DateFrom null `
 -DateTo null
```

- Convert the resource to JSON
```powershell
$GenerateBoostConsolidatedRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

