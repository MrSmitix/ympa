# PromoPeriodDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateTimeFrom** | **System.DateTime** | Дата и время начала акции. | 
**DateTimeTo** | **System.DateTime** | Дата и время окончания акции. | 

## Examples

- Prepare the resource
```powershell
$PromoPeriodDTO = Initialize-ympa_powershell_clientPromoPeriodDTO  -DateTimeFrom null `
 -DateTimeTo null
```

- Convert the resource to JSON
```powershell
$PromoPeriodDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

