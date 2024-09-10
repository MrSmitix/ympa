

# OrdersStatsPaymentDTO

Информация о денежных переводах по заказу.

The class is defined in **[OrdersStatsPaymentDTO.java](../../src/main/java/org/openapitools/model/OrdersStatsPaymentDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Идентификатор денежного перевода. |  [optional property]
**date** | `LocalDate` | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  [optional property]
**type** | `OrdersStatsPaymentType` |  |  [optional property]
**source** | `OrdersStatsPaymentSourceType` |  |  [optional property]
**total** | `BigDecimal` | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  |  [optional property]
**paymentOrder** | [`OrdersStatsPaymentOrderDTO`](OrdersStatsPaymentOrderDTO.md) |  |  [optional property]








