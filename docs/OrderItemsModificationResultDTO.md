# OrderItemsModificationResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**BriefOrderItemDTO[]**](BriefOrderItemDTO.md) | Список позиций в заказе, подлежащих маркировке. | 

## Examples

- Prepare the resource
```powershell
$OrderItemsModificationResultDTO = Initialize-ympa_powershell_clientOrderItemsModificationResultDTO  -Items null
```

- Convert the resource to JSON
```powershell
$OrderItemsModificationResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

