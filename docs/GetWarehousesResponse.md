# GetWarehousesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**WarehousesDTO**](WarehousesDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetWarehousesResponse = Initialize-ympa_powershell_clientGetWarehousesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetWarehousesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

