# GetPromosResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Promos** | [**GetPromoDTO[]**](GetPromoDTO.md) | Акции Маркета. | 

## Examples

- Prepare the resource
```powershell
$GetPromosResultDTO = Initialize-ympa_powershell_clientGetPromosResultDTO  -Promos null
```

- Convert the resource to JSON
```powershell
$GetPromosResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

