# openapi.model.CampaignSettingsScheduleDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableOnHolidays** | **bool** | Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  | [optional] 
**customHolidays** | **List<String>** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | [default to const []]
**customWorkingDays** | **List<String>** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | [default to const []]
**period** | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] 
**totalHolidays** | **List<String>** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | [default to const []]
**weeklyHolidays** | **List<int>** | Список выходных дней недели и государственных праздников. | [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


