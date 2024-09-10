# GetOfferCardsContentStatusResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OfferCardsContentStatusDTO**](OfferCardsContentStatusDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOfferCardsContentStatusResponse = Initialize-ympa_powershell_clientGetOfferCardsContentStatusResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetOfferCardsContentStatusResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

