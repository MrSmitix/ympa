

# OrdersStatsPaymentDTO

Информация о денежных переводах по заказу.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор денежного перевода. |  [optional]
**date** | **LocalDate** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  [optional]
**`type`** | **OrdersStatsPaymentType** |  |  [optional]
**source** | **OrdersStatsPaymentSourceType** |  |  [optional]
**total** | **BigDecimal** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  |  [optional]
**paymentOrder** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  |  [optional]



