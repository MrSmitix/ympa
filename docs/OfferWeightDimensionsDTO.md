# OfferWeightDimensionsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Length** | **Decimal** | Длина упаковки в см.  | 
**Width** | **Decimal** | Ширина упаковки в см.  | 
**Height** | **Decimal** | Высота упаковки в см.  | 
**Weight** | **Decimal** | Вес товара в кг с учетом упаковки (брутто).  | 

## Examples

- Prepare the resource
```powershell
$OfferWeightDimensionsDTO = Initialize-ympa_powershell_clientOfferWeightDimensionsDTO  -Length 65.55 `
 -Width 50.7 `
 -Height 20 `
 -Weight 1.001
```

- Convert the resource to JSON
```powershell
$OfferWeightDimensionsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

