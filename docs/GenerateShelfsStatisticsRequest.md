# GenerateShelfsStatisticsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **Int64** | Идентификатор бизнеса. | 
**DateFrom** | **System.DateTime** | Начало периода, включительно. | 
**DateTo** | **System.DateTime** | Конец периода, включительно. | 
**AttributionType** | [**ShelfsStatisticsAttributionType**](ShelfsStatisticsAttributionType.md) |  | 

## Examples

- Prepare the resource
```powershell
$GenerateShelfsStatisticsRequest = Initialize-ympa_powershell_clientGenerateShelfsStatisticsRequest  -BusinessId null `
 -DateFrom null `
 -DateTo null `
 -AttributionType null
```

- Convert the resource to JSON
```powershell
$GenerateShelfsStatisticsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

