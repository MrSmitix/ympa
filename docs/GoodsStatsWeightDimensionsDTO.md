# GoodsStatsWeightDimensionsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Length** | **Decimal** | Длина товара в сантиметрах. | [optional] 
**Width** | **Decimal** | Ширина товара в сантиметрах. | [optional] 
**Height** | **Decimal** | Высота товара в сантиметрах. | [optional] 
**Weight** | **Decimal** | Вес товара в килограммах. | [optional] 

## Examples

- Prepare the resource
```powershell
$GoodsStatsWeightDimensionsDTO = Initialize-ympa_powershell_clientGoodsStatsWeightDimensionsDTO  -Length null `
 -Width null `
 -Height null `
 -Weight null
```

- Convert the resource to JSON
```powershell
$GoodsStatsWeightDimensionsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

