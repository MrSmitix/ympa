# GenerateGoodsTurnoverRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **Int64** | Идентификатор кампании. | 
**Date** | **System.DateTime** | Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата. | [optional] 

## Examples

- Prepare the resource
```powershell
$GenerateGoodsTurnoverRequest = Initialize-ympa_powershell_clientGenerateGoodsTurnoverRequest  -CampaignId null `
 -Date null
```

- Convert the resource to JSON
```powershell
$GenerateGoodsTurnoverRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

