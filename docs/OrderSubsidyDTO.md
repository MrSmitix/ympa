# OrderSubsidyDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OrderSubsidyType**](OrderSubsidyType.md) |  | [optional] 
**Amount** | **Decimal** | Сумма субсидии. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderSubsidyDTO = Initialize-ympa_powershell_clientOrderSubsidyDTO  -Type null `
 -Amount null
```

- Convert the resource to JSON
```powershell
$OrderSubsidyDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

