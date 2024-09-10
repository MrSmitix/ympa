# GetWarehouseStocksResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetWarehouseStocksDTO**](GetWarehouseStocksDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetWarehouseStocksResponse = Initialize-ympa_powershell_clientGetWarehouseStocksResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetWarehouseStocksResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

