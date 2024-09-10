# UpdateStocksRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Skus** | [**UpdateStockDTO[]**](UpdateStockDTO.md) | Данные об остатках товаров.  | 

## Examples

- Prepare the resource
```powershell
$UpdateStocksRequest = Initialize-ympa_powershell_clientUpdateStocksRequest  -Skus null
```

- Convert the resource to JSON
```powershell
$UpdateStocksRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

