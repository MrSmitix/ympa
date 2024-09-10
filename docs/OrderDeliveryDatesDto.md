# OrderDeliveryDatesDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_date** | Option<**String**> | Формат даты: `ДД-ММ-ГГГГ`.  | [optional]
**to_date** | Option<**String**> | Формат даты: `ДД-ММ-ГГГГ`.  | [optional]
**from_time** | Option<**String**> | Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.  | [optional]
**to_time** | Option<**String**> | Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.  | [optional]
**real_delivery_date** | Option<**String**> | Формат даты: `ДД-ММ-ГГГГ`.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


