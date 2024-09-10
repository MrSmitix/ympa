# GetOrdersStatsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OrdersStatsDTO**](OrdersStatsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOrdersStatsResponse = Initialize-ympa_powershell_clientGetOrdersStatsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetOrdersStatsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

