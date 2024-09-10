# GetGoodsStatsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GoodsStatsDTO**](GoodsStatsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetGoodsStatsResponse = Initialize-ympa_powershell_clientGetGoodsStatsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetGoodsStatsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

