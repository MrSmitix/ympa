# UpdatePricesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**OfferPriceDTO[]**](OfferPriceDTO.md) | Список товаров. | 

## Examples

- Prepare the resource
```powershell
$UpdatePricesRequest = Initialize-ympa_powershell_clientUpdatePricesRequest  -Offers null
```

- Convert the resource to JSON
```powershell
$UpdatePricesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

