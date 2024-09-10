# ympa_r_client::OrdersStatsPaymentDTO

Информация о денежных переводах по заказу.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Идентификатор денежного перевода. | [optional] 
**date** | **character** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**type** | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] [Enum: ] 
**source** | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] [Enum: ] 
**total** | **numeric** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**paymentOrder** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 


