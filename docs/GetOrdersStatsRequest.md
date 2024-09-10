# GetOrdersStatsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | [***chrono::naive::NaiveDate**](date.md) | Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  | [optional] [default to None]
**date_to** | [***chrono::naive::NaiveDate**](date.md) | Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  | [optional] [default to None]
**update_from** | [***chrono::naive::NaiveDate**](date.md) | Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  | [optional] [default to None]
**update_to** | [***chrono::naive::NaiveDate**](date.md) | Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  | [optional] [default to None]
**orders** | **Vec<i64>** | Список идентификаторов заказов. | [optional] [default to None]
**statuses** | [**Vec<models::OrderStatsStatusType>**](OrderStatsStatusType.md) | Список статусов заказов. | [optional] [default to None]
**has_cis** | **bool** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


