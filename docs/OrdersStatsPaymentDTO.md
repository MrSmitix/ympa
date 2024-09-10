
# Table `OrdersStatsPaymentDTO`
(mapped from: OrdersStatsPaymentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Идентификатор денежного перевода. |  [optional]
**date** | date | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  [optional]
**type** | type | long |  | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  |  [optional] [foreignkey]
**source** | source | long |  | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  |  [optional] [foreignkey]
**total** | total | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  |  [optional]
**paymentOrder** | paymentOrder | long |  | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  |  [optional] [foreignkey]








