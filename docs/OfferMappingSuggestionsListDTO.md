# OfferMappingSuggestionsListDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**EnrichedMappingsOfferDTO[]**](EnrichedMappingsOfferDTO.md) | Список товаров. | 

## Examples

- Prepare the resource
```powershell
$OfferMappingSuggestionsListDTO = Initialize-ympa_powershell_clientOfferMappingSuggestionsListDTO  -Offers null
```

- Convert the resource to JSON
```powershell
$OfferMappingSuggestionsListDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

