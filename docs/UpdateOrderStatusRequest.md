# UpdateOrderStatusRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Order** | [**OrderStatusChangeDTO**](OrderStatusChangeDTO.md) |  | 

## Examples

- Prepare the resource
```powershell
$UpdateOrderStatusRequest = Initialize-ympa_powershell_clientUpdateOrderStatusRequest  -Order null
```

- Convert the resource to JSON
```powershell
$UpdateOrderStatusRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

