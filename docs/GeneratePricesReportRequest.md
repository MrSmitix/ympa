# GeneratePricesReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **Int64** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.  | [optional] 
**CampaignId** | **Int64** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.  | [optional] 
**CategoryIds** | **Int64[]** | Фильтр по категориям на Маркете. | [optional] 
**CreationDateFrom** | **System.DateTime** | Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**CreationDateTo** | **System.DateTime** | Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$GeneratePricesReportRequest = Initialize-ympa_powershell_clientGeneratePricesReportRequest  -BusinessId null `
 -CampaignId null `
 -CategoryIds null `
 -CreationDateFrom null `
 -CreationDateTo null
```

- Convert the resource to JSON
```powershell
$GeneratePricesReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

