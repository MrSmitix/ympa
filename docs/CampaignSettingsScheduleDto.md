# CampaignSettingsScheduleDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available_on_holidays** | **bool** | Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  | [optional] [default to None]
**custom_holidays** | **Vec<models::DateDdMmYyyy>** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**custom_working_days** | **Vec<models::DateDdMmYyyy>** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**period** | [***models::CampaignSettingsTimePeriodDto**](CampaignSettingsTimePeriodDTO.md) |  | [optional] [default to None]
**total_holidays** | **Vec<models::DateDdMmYyyy>** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**weekly_holidays** | **Vec<i32>** | Список выходных дней недели и государственных праздников. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


