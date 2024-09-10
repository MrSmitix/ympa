# GetCampaignOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetCampaignOffersResultDTO**](GetCampaignOffersResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetCampaignOffersResponse = Initialize-ympa_powershell_clientGetCampaignOffersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetCampaignOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

