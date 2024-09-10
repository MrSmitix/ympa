# ORDER_DELIVERY_DATES_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_date** | [**STRING_32**](STRING_32.md) | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null]
**to_date** | [**STRING_32**](STRING_32.md) | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null]
**from_time** | [**STRING_32**](STRING_32.md) | Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;.  | [optional] [default to null]
**to_time** | [**STRING_32**](STRING_32.md) | Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;.  | [optional] [default to null]
**real_delivery_date** | [**STRING_32**](STRING_32.md) | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


