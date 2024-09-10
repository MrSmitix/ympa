# SuggestPricesResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**PriceSuggestOfferDTO[]**](PriceSuggestOfferDTO.md) | Список товаров с ценами для продвижения. | 

## Examples

- Prepare the resource
```powershell
$SuggestPricesResultDTO = Initialize-ympa_powershell_clientSuggestPricesResultDTO  -Offers null
```

- Convert the resource to JSON
```powershell
$SuggestPricesResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

