# TransferOrdersFromShipmentRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderIds** | **Int64[]** | Список заказов, которые вы не успеваете подготовить. | 

## Examples

- Prepare the resource
```powershell
$TransferOrdersFromShipmentRequest = Initialize-ympa_powershell_clientTransferOrdersFromShipmentRequest  -OrderIds null
```

- Convert the resource to JSON
```powershell
$TransferOrdersFromShipmentRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

