# GetSuggestedOfferMappingsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**SuggestedOfferDTO[]**](SuggestedOfferDTO.md) | Список товаров. | [optional] 

## Examples

- Prepare the resource
```powershell
$GetSuggestedOfferMappingsRequest = Initialize-ympa_powershell_clientGetSuggestedOfferMappingsRequest  -Offers null
```

- Convert the resource to JSON
```powershell
$GetSuggestedOfferMappingsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

