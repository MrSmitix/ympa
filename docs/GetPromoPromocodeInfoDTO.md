# GetPromoPromocodeInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Promocode** | **String** | Промокод. | 
**Discount** | **Int32** | Процент скидки по промокоду. | 

## Examples

- Prepare the resource
```powershell
$GetPromoPromocodeInfoDTO = Initialize-ympa_powershell_clientGetPromoPromocodeInfoDTO  -Promocode null `
 -Discount null
```

- Convert the resource to JSON
```powershell
$GetPromoPromocodeInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

