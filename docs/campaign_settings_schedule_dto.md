# campaign_settings_schedule_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available_on_holidays** | **int** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] 
**custom_holidays** | **list_t \*** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**custom_working_days** | **list_t \*** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**period** | [**campaign_settings_time_period_dto_t**](campaign_settings_time_period_dto.md) \* |  | [optional] 
**total_holidays** | **list_t \*** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**weekly_holidays** | **list_t \*** | Список выходных дней недели и государственных праздников. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


