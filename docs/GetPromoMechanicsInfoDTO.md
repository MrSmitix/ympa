# GetPromoMechanicsInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**MechanicsType**](MechanicsType.md) |  | 
**PromocodeInfo** | [**GetPromoPromocodeInfoDTO**](GetPromoPromocodeInfoDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoMechanicsInfoDTO = Initialize-ympa_powershell_clientGetPromoMechanicsInfoDTO  -Type null `
 -PromocodeInfo null
```

- Convert the resource to JSON
```powershell
$GetPromoMechanicsInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

