# OrdersStatsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Orders** | [**OrdersStatsOrderDTO[]**](OrdersStatsOrderDTO.md) | Список заказов. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrdersStatsDTO = Initialize-ympa_powershell_clientOrdersStatsDTO  -Orders null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$OrdersStatsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

