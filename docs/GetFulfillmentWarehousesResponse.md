# GetFulfillmentWarehousesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**FulfillmentWarehousesDTO**](FulfillmentWarehousesDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetFulfillmentWarehousesResponse = Initialize-ympa_powershell_clientGetFulfillmentWarehousesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetFulfillmentWarehousesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

