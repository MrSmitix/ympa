# OrderStateDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор заказа. | 
**Status** | [**OrderStatusType**](OrderStatusType.md) |  | 
**Substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderStateDTO = Initialize-ympa_powershell_clientOrderStateDTO  -Id null `
 -Status null `
 -Substatus null
```

- Convert the resource to JSON
```powershell
$OrderStateDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

