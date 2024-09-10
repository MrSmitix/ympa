# OrderDeliveryDatesDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_date** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] [default to None]
**to_date** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] [default to None]
**from_time** | **String** | Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.  | [optional] [default to None]
**to_time** | **String** | Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.  | [optional] [default to None]
**real_delivery_date** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


