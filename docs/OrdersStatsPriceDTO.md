# OrdersStatsPriceDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OrdersStatsPriceType**](OrdersStatsPriceType.md) |  | [optional] 
**CostPerItem** | **Decimal** | Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  | [optional] 
**Total** | **Decimal** | Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrdersStatsPriceDTO = Initialize-ympa_powershell_clientOrdersStatsPriceDTO  -Type null `
 -CostPerItem null `
 -Total null
```

- Convert the resource to JSON
```powershell
$OrdersStatsPriceDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

