
# OrdersStatsPaymentDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Идентификатор денежного перевода. |  [optional] |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  [optional] |
| **type** | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  |  [optional] |
| **source** | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  |  [optional] |
| **total** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  |  [optional] |
| **paymentOrder** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  |  [optional] |



