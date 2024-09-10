# SetOrderDeliveryDateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dates** | [**OrderDeliveryDateDTO**](OrderDeliveryDateDTO.md) |  | 
**Reason** | [**OrderDeliveryDateReasonType**](OrderDeliveryDateReasonType.md) |  | 

## Examples

- Prepare the resource
```powershell
$SetOrderDeliveryDateRequest = Initialize-ympa_powershell_clientSetOrderDeliveryDateRequest  -Dates null `
 -Reason null
```

- Convert the resource to JSON
```powershell
$SetOrderDeliveryDateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

