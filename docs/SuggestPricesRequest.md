# SuggestPricesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**SuggestOfferPriceDTO[]**](SuggestOfferPriceDTO.md) | Список товаров. | 

## Examples

- Prepare the resource
```powershell
$SuggestPricesRequest = Initialize-ympa_powershell_clientSuggestPricesRequest  -Offers null
```

- Convert the resource to JSON
```powershell
$SuggestPricesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

