# OrderItemSubsidyDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OrderItemSubsidyType**](OrderItemSubsidyType.md) |  | [optional] 
**Amount** | **Decimal** | Сумма субсидии. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderItemSubsidyDTO = Initialize-ympa_powershell_clientOrderItemSubsidyDTO  -Type null `
 -Amount null
```

- Convert the resource to JSON
```powershell
$OrderItemSubsidyDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

