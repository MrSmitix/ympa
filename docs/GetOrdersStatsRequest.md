
# GetOrdersStatsRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) | Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  |  [optional] |
| **dateTo** | [**java.time.LocalDate**](java.time.LocalDate.md) | Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  |  [optional] |
| **updateFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) | Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  |  [optional] |
| **updateTo** | [**java.time.LocalDate**](java.time.LocalDate.md) | Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  |  [optional] |
| **orders** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Список идентификаторов заказов. |  [optional] |
| **statuses** | [**kotlin.collections.List&lt;OrderStatsStatusType&gt;**](OrderStatsStatusType.md) | Список статусов заказов. |  [optional] |
| **hasCis** | **kotlin.Boolean** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  |  [optional] |



