# CampaignSettingsDeliveryDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schedule** | [**CampaignSettingsScheduleDTO**](CampaignSettingsScheduleDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignSettingsDeliveryDTO = Initialize-ympa_powershell_clientCampaignSettingsDeliveryDTO  -Schedule null
```

- Convert the resource to JSON
```powershell
$CampaignSettingsDeliveryDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

