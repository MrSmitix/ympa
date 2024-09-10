# OrdersStatsCommissionDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OrdersStatsCommissionType**](OrdersStatsCommissionType.md) |  | [optional] 
**Actual** | **Decimal** | Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrdersStatsCommissionDTO = Initialize-ympa_powershell_clientOrdersStatsCommissionDTO  -Type null `
 -Actual null
```

- Convert the resource to JSON
```powershell
$OrdersStatsCommissionDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

