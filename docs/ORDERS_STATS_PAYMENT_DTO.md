# ORDERS_STATS_PAYMENT_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Идентификатор денежного перевода. | [optional] [default to null]
**date** | [**DATE**](DATE.md) | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] [default to null]
**type** | [**ORDERS_STATS_PAYMENT_TYPE**](OrdersStatsPaymentType.md) |  | [optional] [default to null]
**source** | [**ORDERS_STATS_PAYMENT_SOURCE_TYPE**](OrdersStatsPaymentSourceType.md) |  | [optional] [default to null]
**total** | **REAL_32** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] [default to null]
**payment_order** | [**ORDERS_STATS_PAYMENT_ORDER_DTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


