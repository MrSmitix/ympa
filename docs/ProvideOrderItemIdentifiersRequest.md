# ProvideOrderItemIdentifiersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**OrderItemInstanceModificationDTO[]**](OrderItemInstanceModificationDTO.md) | Список позиций, требующих маркировки.  | 

## Examples

- Prepare the resource
```powershell
$ProvideOrderItemIdentifiersRequest = Initialize-ympa_powershell_clientProvideOrderItemIdentifiersRequest  -Items null
```

- Convert the resource to JSON
```powershell
$ProvideOrderItemIdentifiersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

