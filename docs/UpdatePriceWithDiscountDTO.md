# UpdatePriceWithDiscountDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **Decimal** | Значение. | 
**CurrencyId** | [**CurrencyType**](CurrencyType.md) |  | 
**DiscountBase** | **Decimal** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdatePriceWithDiscountDTO = Initialize-ympa_powershell_clientUpdatePriceWithDiscountDTO  -Value null `
 -CurrencyId null `
 -DiscountBase null
```

- Convert the resource to JSON
```powershell
$UpdatePriceWithDiscountDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

