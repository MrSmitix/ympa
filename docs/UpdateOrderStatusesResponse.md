# UpdateOrderStatusesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**UpdateOrderStatusesDTO**](UpdateOrderStatusesDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateOrderStatusesResponse = Initialize-ympa_powershell_clientUpdateOrderStatusesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$UpdateOrderStatusesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

