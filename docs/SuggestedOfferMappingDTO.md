# SuggestedOfferMappingDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | [**SuggestedOfferDTO**](SuggestedOfferDTO.md) |  | [optional] 
**Mapping** | [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SuggestedOfferMappingDTO = Initialize-ympa_powershell_clientSuggestedOfferMappingDTO  -Offer null `
 -Mapping null
```

- Convert the resource to JSON
```powershell
$SuggestedOfferMappingDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

