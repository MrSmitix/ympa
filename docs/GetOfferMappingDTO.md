# GetOfferMappingDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | [**GetOfferDTO**](GetOfferDTO.md) |  | [optional] 
**Mapping** | [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOfferMappingDTO = Initialize-ympa_powershell_clientGetOfferMappingDTO  -Offer null `
 -Mapping null
```

- Convert the resource to JSON
```powershell
$GetOfferMappingDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

