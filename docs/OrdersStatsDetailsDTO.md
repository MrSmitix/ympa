
# Table `OrdersStatsDetailsDTO`
(mapped from: OrdersStatsDetailsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemStatus** | itemStatus | long |  | [**OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md) |  |  [optional] [foreignkey]
**itemCount** | itemCount | long |  | **kotlin.Long** | Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;. |  [optional]
**updateDate** | updateDate | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  [optional]
**stockType** | stockType | long |  | [**OrdersStatsStockType**](OrdersStatsStockType.md) |  |  [optional] [foreignkey]






