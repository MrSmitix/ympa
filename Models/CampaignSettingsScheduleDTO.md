# CampaignSettingsScheduleDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **availableOnHolidays** | **Boolean** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] [default to null] |
| **customHolidays** | **List** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | [default to null] |
| **customWorkingDays** | **List** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | [default to null] |
| **period** | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] [default to null] |
| **totalHolidays** | **List** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | [default to null] |
| **weeklyHolidays** | **List** | Список выходных дней недели и государственных праздников. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

