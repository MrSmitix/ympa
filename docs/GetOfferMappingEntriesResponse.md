# GetOfferMappingEntriesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OfferMappingEntriesDTO**](OfferMappingEntriesDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOfferMappingEntriesResponse = Initialize-ympa_powershell_clientGetOfferMappingEntriesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetOfferMappingEntriesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

