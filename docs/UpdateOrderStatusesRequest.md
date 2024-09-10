# UpdateOrderStatusesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Orders** | [**OrderStateDTO[]**](OrderStateDTO.md) | Список заказов. | 

## Examples

- Prepare the resource
```powershell
$UpdateOrderStatusesRequest = Initialize-ympa_powershell_clientUpdateOrderStatusesRequest  -Orders null
```

- Convert the resource to JSON
```powershell
$UpdateOrderStatusesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

