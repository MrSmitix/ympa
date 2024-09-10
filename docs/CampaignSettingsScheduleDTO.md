# ympa_csharp_client.Model.CampaignSettingsScheduleDTO
Расписание работы службы доставки в своем регионе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvailableOnHolidays** | **bool** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] 
**CustomHolidays** | **List&lt;string&gt;** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**CustomWorkingDays** | **List&lt;string&gt;** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**Period** | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] 
**TotalHolidays** | **List&lt;string&gt;** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**WeeklyHolidays** | **List&lt;int&gt;** | Список выходных дней недели и государственных праздников. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

