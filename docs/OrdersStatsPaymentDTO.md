# Api.OrdersStatsPaymentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор денежного перевода. | [optional] 
**date** | **Date** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**type** | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] 
**source** | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] 
**total** | **Number** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**paymentOrder** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 


