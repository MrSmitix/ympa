# DeleteCampaignOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**DeleteCampaignOffersDTO**](DeleteCampaignOffersDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteCampaignOffersResponse = Initialize-ympa_powershell_clientDeleteCampaignOffersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$DeleteCampaignOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

