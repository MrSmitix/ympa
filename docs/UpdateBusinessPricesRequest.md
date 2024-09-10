# UpdateBusinessPricesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**UpdateBusinessOfferPriceDTO[]**](UpdateBusinessOfferPriceDTO.md) | Список товаров с ценами. | 

## Examples

- Prepare the resource
```powershell
$UpdateBusinessPricesRequest = Initialize-ympa_powershell_clientUpdateBusinessPricesRequest  -Offers null
```

- Convert the resource to JSON
```powershell
$UpdateBusinessPricesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

