# CAMPAIGN_SETTINGS_SCHEDULE_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available_on_holidays** | **BOOLEAN** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] [default to null]
**custom_holidays** | [**LIST [STRING_32]**](STRING_32.md) | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | [default to null]
**custom_working_days** | [**LIST [STRING_32]**](STRING_32.md) | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | [default to null]
**period** | [**CAMPAIGN_SETTINGS_TIME_PERIOD_DTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] [default to null]
**total_holidays** | [**LIST [STRING_32]**](STRING_32.md) | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | [default to null]
**weekly_holidays** | **LIST [INTEGER_32]** | Список выходных дней недели и государственных праздников. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


