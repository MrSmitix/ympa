# GetSuggestedOfferMappingEntriesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**MappingsOfferDTO[]**](MappingsOfferDTO.md) | Список товаров. | 

## Examples

- Prepare the resource
```powershell
$GetSuggestedOfferMappingEntriesRequest = Initialize-ympa_powershell_clientGetSuggestedOfferMappingEntriesRequest  -Offers null
```

- Convert the resource to JSON
```powershell
$GetSuggestedOfferMappingEntriesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

