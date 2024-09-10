# ProvideOrderItemIdentifiersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OrderItemsModificationResultDTO**](OrderItemsModificationResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ProvideOrderItemIdentifiersResponse = Initialize-ympa_powershell_clientProvideOrderItemIdentifiersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$ProvideOrderItemIdentifiersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

