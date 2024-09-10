# DeleteOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**DeleteOffersDTO**](DeleteOffersDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteOffersResponse = Initialize-ympa_powershell_clientDeleteOffersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$DeleteOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

