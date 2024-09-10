# CampaignSettingsScheduleDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvailableOnHolidays** | **Boolean** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] 
**CustomHolidays** | **String[]** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**CustomWorkingDays** | **String[]** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**Period** | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] 
**TotalHolidays** | **String[]** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**WeeklyHolidays** | **Int32[]** | Список выходных дней недели и государственных праздников. | 

## Examples

- Prepare the resource
```powershell
$CampaignSettingsScheduleDTO = Initialize-ympa_powershell_clientCampaignSettingsScheduleDTO  -AvailableOnHolidays null `
 -CustomHolidays null `
 -CustomWorkingDays null `
 -Period null `
 -TotalHolidays null `
 -WeeklyHolidays null
```

- Convert the resource to JSON
```powershell
$CampaignSettingsScheduleDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

