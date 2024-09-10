# GetSuggestedOfferMappingEntriesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OfferMappingSuggestionsListDTO**](OfferMappingSuggestionsListDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetSuggestedOfferMappingEntriesResponse = Initialize-ympa_powershell_clientGetSuggestedOfferMappingEntriesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetSuggestedOfferMappingEntriesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

