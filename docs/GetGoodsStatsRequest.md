# GetGoodsStatsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShopSkus** | **String[]** | Список ваших идентификаторов SKU.  | 

## Examples

- Prepare the resource
```powershell
$GetGoodsStatsRequest = Initialize-ympa_powershell_clientGetGoodsStatsRequest  -ShopSkus null
```

- Convert the resource to JSON
```powershell
$GetGoodsStatsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

