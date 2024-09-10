# OfferErrorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **String** | Тип ошибки. | [optional] 
**Comment** | **String** | Пояснение. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferErrorDTO = Initialize-ympa_powershell_clientOfferErrorDTO  -Message null `
 -Comment null
```

- Convert the resource to JSON
```powershell
$OfferErrorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

