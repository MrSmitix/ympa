# OAICampaignSettingsScheduleDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableOnHolidays** | **NSNumber*** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] 
**customHolidays** | **NSArray&lt;NSString*&gt;*** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**customWorkingDays** | **NSArray&lt;NSString*&gt;*** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**period** | [**OAICampaignSettingsTimePeriodDTO***](OAICampaignSettingsTimePeriodDTO.md) |  | [optional] 
**totalHolidays** | **NSArray&lt;NSString*&gt;*** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**weeklyHolidays** | **NSArray&lt;NSNumber*&gt;*** | Список выходных дней недели и государственных праздников. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


