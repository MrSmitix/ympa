# GenerateGoodsRealizationReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **Int64** | Идентификатор кампании. | 
**Year** | **Int32** | Год. | 
**Month** | **Int32** | Номер месяца. | 

## Examples

- Prepare the resource
```powershell
$GenerateGoodsRealizationReportRequest = Initialize-ympa_powershell_clientGenerateGoodsRealizationReportRequest  -CampaignId null `
 -Year null `
 -Month null
```

- Convert the resource to JSON
```powershell
$GenerateGoodsRealizationReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

