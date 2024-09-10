# WWW::OpenAPIClient::Object::CampaignSettingsScheduleDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CampaignSettingsScheduleDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available_on_holidays** | **boolean** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] 
**custom_holidays** | **ARRAY[string]** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**custom_working_days** | **ARRAY[string]** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**period** | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] 
**total_holidays** | **ARRAY[string]** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**weekly_holidays** | **ARRAY[int]** | Список выходных дней недели и государственных праздников. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


