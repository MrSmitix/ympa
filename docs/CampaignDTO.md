# CampaignDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Domain** | **String** | URL магазина. | [optional] 
**Id** | **Int64** | Идентификатор кампании. | [optional] 
**ClientId** | **Int64** | Идентификатор плательщика в Яндекс Балансе. | [optional] 
**Business** | [**BusinessDTO**](BusinessDTO.md) |  | [optional] 
**PlacementType** | [**PlacementType**](PlacementType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignDTO = Initialize-ympa_powershell_clientCampaignDTO  -Domain null `
 -Id null `
 -ClientId null `
 -Business null `
 -PlacementType null
```

- Convert the resource to JSON
```powershell
$CampaignDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

