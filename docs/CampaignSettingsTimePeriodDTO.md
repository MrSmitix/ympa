# CampaignSettingsTimePeriodDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FromDate** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**ToDate** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignSettingsTimePeriodDTO = Initialize-ympa_powershell_clientCampaignSettingsTimePeriodDTO  -FromDate 23-09-2022 `
 -ToDate 23-09-2022
```

- Convert the resource to JSON
```powershell
$CampaignSettingsTimePeriodDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

