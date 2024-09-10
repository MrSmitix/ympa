# OrdersStatsPaymentDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | Идентификатор денежного перевода. | [optional]
**date** | Option<[**String**](string.md)> | Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional]
**r#type** | Option<[**models::OrdersStatsPaymentType**](OrdersStatsPaymentType.md)> |  | [optional]
**source** | Option<[**models::OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md)> |  | [optional]
**total** | Option<**f64**> | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional]
**payment_order** | Option<[**models::OrdersStatsPaymentOrderDto**](OrdersStatsPaymentOrderDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


