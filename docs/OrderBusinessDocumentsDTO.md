# OrderBusinessDocumentsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Upd** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 
**Ukd** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 
**TorgTwelve** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 
**Sf** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 
**Ksf** | [**DocumentDTO**](DocumentDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderBusinessDocumentsDTO = Initialize-ympa_powershell_clientOrderBusinessDocumentsDTO  -Upd null `
 -Ukd null `
 -TorgTwelve null `
 -Sf null `
 -Ksf null
```

- Convert the resource to JSON
```powershell
$OrderBusinessDocumentsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

