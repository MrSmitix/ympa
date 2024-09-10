# CampaignSettingsLocalRegionDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор региона. | [optional] 
**Name** | **String** | Название региона. | [optional] 
**Type** | [**RegionType**](RegionType.md) |  | [optional] 
**DeliveryOptionsSource** | [**CampaignSettingsScheduleSourceType**](CampaignSettingsScheduleSourceType.md) |  | [optional] 
**Delivery** | [**CampaignSettingsDeliveryDTO**](CampaignSettingsDeliveryDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignSettingsLocalRegionDTO = Initialize-ympa_powershell_clientCampaignSettingsLocalRegionDTO  -Id null `
 -Name null `
 -Type null `
 -DeliveryOptionsSource null `
 -Delivery null
```

- Convert the resource to JSON
```powershell
$CampaignSettingsLocalRegionDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

