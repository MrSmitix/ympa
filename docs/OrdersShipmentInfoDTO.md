# OrdersShipmentInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderIdsWithLabels** | **Int64[]** | Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. | 
**OrderIdsWithoutLabels** | **Int64[]** | Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. | 

## Examples

- Prepare the resource
```powershell
$OrdersShipmentInfoDTO = Initialize-ympa_powershell_clientOrdersShipmentInfoDTO  -OrderIdsWithLabels null `
 -OrderIdsWithoutLabels null
```

- Convert the resource to JSON
```powershell
$OrdersShipmentInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

