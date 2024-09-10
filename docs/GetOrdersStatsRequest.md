# GetOrdersStatsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | Option<[**String**](string.md)> | Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  | [optional]
**date_to** | Option<[**String**](string.md)> | Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  | [optional]
**update_from** | Option<[**String**](string.md)> | Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  | [optional]
**update_to** | Option<[**String**](string.md)> | Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  | [optional]
**orders** | Option<**Vec<i64>**> | Список идентификаторов заказов. | [optional]
**statuses** | Option<[**Vec<models::OrderStatsStatusType>**](OrderStatsStatusType.md)> | Список статусов заказов. | [optional]
**has_cis** | Option<**bool**> | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


