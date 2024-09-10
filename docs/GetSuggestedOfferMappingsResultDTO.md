# GetSuggestedOfferMappingsResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**SuggestedOfferMappingDTO[]**](SuggestedOfferMappingDTO.md) | Список товаров. | 

## Examples

- Prepare the resource
```powershell
$GetSuggestedOfferMappingsResultDTO = Initialize-ympa_powershell_clientGetSuggestedOfferMappingsResultDTO  -Offers null
```

- Convert the resource to JSON
```powershell
$GetSuggestedOfferMappingsResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

