# SuggestPricesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**SuggestPricesResultDTO**](SuggestPricesResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SuggestPricesResponse = Initialize-ympa_powershell_clientSuggestPricesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$SuggestPricesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

