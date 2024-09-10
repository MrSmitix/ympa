# CampaignSettingsScheduleDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableOnHolidays** | **Bool** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] [default to nothing]
**customHolidays** | **Vector{String}** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | [default to nothing]
**customWorkingDays** | **Vector{String}** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | [default to nothing]
**period** | [***CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] [default to nothing]
**totalHolidays** | **Vector{String}** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | [default to nothing]
**weeklyHolidays** | **Vector{Int64}** | Список выходных дней недели и государственных праздников. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


