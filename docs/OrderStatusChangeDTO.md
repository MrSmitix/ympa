# OrderStatusChangeDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**OrderStatusType**](OrderStatusType.md) |  | 
**Substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**Delivery** | [**OrderStatusChangeDeliveryDTO**](OrderStatusChangeDeliveryDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderStatusChangeDTO = Initialize-ympa_powershell_clientOrderStatusChangeDTO  -Status null `
 -Substatus null `
 -Delivery null
```

- Convert the resource to JSON
```powershell
$OrderStatusChangeDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

