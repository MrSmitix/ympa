# OpenapiClient::GetOrdersStatsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date_from** | **Date** | Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  | [optional] |
| **date_to** | **Date** | Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  | [optional] |
| **update_from** | **Date** | Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  | [optional] |
| **update_to** | **Date** | Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  | [optional] |
| **orders** | **Array&lt;Integer&gt;** | Список идентификаторов заказов. | [optional] |
| **statuses** | [**Array&lt;OrderStatsStatusType&gt;**](OrderStatsStatusType.md) | Список статусов заказов. | [optional] |
| **has_cis** | **Boolean** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetOrdersStatsRequest.new(
  date_from: null,
  date_to: null,
  update_from: null,
  update_to: null,
  orders: null,
  statuses: null,
  has_cis: null
)
```

