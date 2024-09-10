# GetCampaignsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Campaigns** | [**CampaignDTO[]**](CampaignDTO.md) | Список с информацией по каждому магазину. | 
**Pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetCampaignsResponse = Initialize-ympa_powershell_clientGetCampaignsResponse  -Campaigns null `
 -Pager null
```

- Convert the resource to JSON
```powershell
$GetCampaignsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

