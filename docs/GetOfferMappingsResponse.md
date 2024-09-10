# GetOfferMappingsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetOfferMappingsResultDTO**](GetOfferMappingsResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOfferMappingsResponse = Initialize-ympa_powershell_clientGetOfferMappingsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetOfferMappingsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

