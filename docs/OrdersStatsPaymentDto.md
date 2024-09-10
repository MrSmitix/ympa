# OrdersStatsPaymentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | Идентификатор денежного перевода. | [optional] [default to null]
**date** | **String!** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] [default to null]
**Type_** | [***OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] [default to null]
**source** | [***OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] [default to null]
**total** | **Float!** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] [default to null]
**paymentOrder** | [***OrdersStatsPaymentOrderDto**](OrdersStatsPaymentOrderDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


