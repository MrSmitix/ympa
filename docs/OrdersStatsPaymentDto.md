# OrdersStatsPaymentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор денежного перевода. | [optional] [default to None]
**date** | [***chrono::naive::NaiveDate**](date.md) | Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional] [default to None]
**r#type** | [***models::OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] [default to None]
**source** | [***models::OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] [default to None]
**total** | **f64** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] [default to None]
**payment_order** | [***models::OrdersStatsPaymentOrderDto**](OrdersStatsPaymentOrderDTO.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


