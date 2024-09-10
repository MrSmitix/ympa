# GetOrdersStatsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateFrom** | **System.DateTime** | Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  | [optional] 
**DateTo** | **System.DateTime** | Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  | [optional] 
**UpdateFrom** | **System.DateTime** | Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  | [optional] 
**UpdateTo** | **System.DateTime** | Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  | [optional] 
**Orders** | **Int64[]** | Список идентификаторов заказов. | [optional] 
**Statuses** | [**OrderStatsStatusType[]**](OrderStatsStatusType.md) | Список статусов заказов. | [optional] 
**HasCis** | **Boolean** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOrdersStatsRequest = Initialize-ympa_powershell_clientGetOrdersStatsRequest  -DateFrom null `
 -DateTo null `
 -UpdateFrom null `
 -UpdateTo null `
 -Orders null `
 -Statuses null `
 -HasCis null
```

- Convert the resource to JSON
```powershell
$GetOrdersStatsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

