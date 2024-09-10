# OrderStatusChangeDeliveryDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dates** | [**OrderStatusChangeDeliveryDatesDTO**](OrderStatusChangeDeliveryDatesDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderStatusChangeDeliveryDTO = Initialize-ympa_powershell_clientOrderStatusChangeDeliveryDTO  -Dates null
```

- Convert the resource to JSON
```powershell
$OrderStatusChangeDeliveryDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

