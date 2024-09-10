# OrdersStatsPaymentDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор денежного перевода. | [optional] [default to nothing]
**date** | **Date** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] [default to nothing]
**type** | [***OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] [default to nothing]
**source** | [***OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] [default to nothing]
**total** | **Float64** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] [default to nothing]
**paymentOrder** | [***OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


