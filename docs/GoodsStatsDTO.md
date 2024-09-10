# GoodsStatsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShopSkus** | [**GoodsStatsGoodsDTO[]**](GoodsStatsGoodsDTO.md) | Список товаров. | 

## Examples

- Prepare the resource
```powershell
$GoodsStatsDTO = Initialize-ympa_powershell_clientGoodsStatsDTO  -ShopSkus null
```

- Convert the resource to JSON
```powershell
$GoodsStatsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

