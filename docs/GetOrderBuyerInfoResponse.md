# GetOrderBuyerInfoResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OrderBuyerInfoDTO**](OrderBuyerInfoDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOrderBuyerInfoResponse = Initialize-ympa_powershell_clientGetOrderBuyerInfoResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetOrderBuyerInfoResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

