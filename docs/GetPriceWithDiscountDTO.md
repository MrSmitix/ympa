# GetPriceWithDiscountDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **Decimal** | Значение. | 
**CurrencyId** | [**CurrencyType**](CurrencyType.md) |  | 
**DiscountBase** | **Decimal** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 
**UpdatedAt** | **System.DateTime** | Время последнего обновления. | 

## Examples

- Prepare the resource
```powershell
$GetPriceWithDiscountDTO = Initialize-ympa_powershell_clientGetPriceWithDiscountDTO  -Value null `
 -CurrencyId null `
 -DiscountBase null `
 -UpdatedAt null
```

- Convert the resource to JSON
```powershell
$GetPriceWithDiscountDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

