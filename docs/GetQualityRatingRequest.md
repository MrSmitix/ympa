# GetQualityRatingRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateFrom** | **System.DateTime** | Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.  | [optional] 
**DateTo** | **System.DateTime** | Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.  | [optional] 
**CampaignIds** | **Int64[]** | Список идентификаторов магазинов. | 

## Examples

- Prepare the resource
```powershell
$GetQualityRatingRequest = Initialize-ympa_powershell_clientGetQualityRatingRequest  -DateFrom null `
 -DateTo null `
 -CampaignIds null
```

- Convert the resource to JSON
```powershell
$GetQualityRatingRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

