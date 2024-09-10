# GenerateShowsSalesReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **Int64** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**CampaignId** | **Int64** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**DateFrom** | **System.DateTime** | Начало периода, включительно. | 
**DateTo** | **System.DateTime** | Конец периода, включительно. | 
**Grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | 

## Examples

- Prepare the resource
```powershell
$GenerateShowsSalesReportRequest = Initialize-ympa_powershell_clientGenerateShowsSalesReportRequest  -BusinessId null `
 -CampaignId null `
 -DateFrom null `
 -DateTo null `
 -Grouping null
```

- Convert the resource to JSON
```powershell
$GenerateShowsSalesReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

