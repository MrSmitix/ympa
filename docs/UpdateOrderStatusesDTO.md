# UpdateOrderStatusesDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Orders** | [**UpdateOrderStatusDTO[]**](UpdateOrderStatusDTO.md) | Список с обновленными заказами. | 

## Examples

- Prepare the resource
```powershell
$UpdateOrderStatusesDTO = Initialize-ympa_powershell_clientUpdateOrderStatusesDTO  -Orders null
```

- Convert the resource to JSON
```powershell
$UpdateOrderStatusesDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

