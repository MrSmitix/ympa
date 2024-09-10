
# Table `GetOrdersStatsRequest`
(mapped from: GetOrdersStatsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateFrom** | dateFrom | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  |  [optional]
**dateTo** | dateTo | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  |  [optional]
**updateFrom** | updateFrom | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  |  [optional]
**updateTo** | updateTo | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  |  [optional]
**orders** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Список идентификаторов заказов. |  [optional]
**statuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderStatsStatusType&gt;**](OrderStatsStatusType.md) | Список статусов заказов. |  [optional]
**hasCis** | hasCis | boolean |  | **kotlin.Boolean** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  |  [optional]






# **Table `GetOrdersStatsRequestOrders`**
(mapped from: GetOrdersStatsRequestOrders)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOrdersStatsRequest | getOrdersStatsRequest | long | | kotlin.Long | Primary Key | *one*
orders | orders | long | | kotlin.Long | Foreign Key | *many*



# **Table `GetOrdersStatsRequestOrderStatsStatusType`**
(mapped from: GetOrdersStatsRequestOrderStatsStatusType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOrdersStatsRequest | getOrdersStatsRequest | long | | kotlin.Long | Primary Key | *one*
orderStatsStatusType | orderStatsStatusType | long | | kotlin.Long | Foreign Key | *many*




