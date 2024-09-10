# GetOrdersStatsRequest

Запрос информации по заказам.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **date** | Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  | [optional] 
**date_to** | **date** | Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.  | [optional] 
**update_from** | **date** | Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  | [optional] 
**update_to** | **date** | Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.  | [optional] 
**orders** | **List[int]** | Список идентификаторов заказов. | [optional] 
**statuses** | [**List[OrderStatsStatusType]**](OrderStatsStatusType.md) | Список статусов заказов. | [optional] 
**has_cis** | **bool** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_orders_stats_request import GetOrdersStatsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetOrdersStatsRequest from a JSON string
get_orders_stats_request_instance = GetOrdersStatsRequest.from_json(json)
# print the JSON string representation of the object
print GetOrdersStatsRequest.to_json()

# convert the object into a dict
get_orders_stats_request_dict = get_orders_stats_request_instance.to_dict()
# create an instance of GetOrdersStatsRequest from a dict
get_orders_stats_request_from_dict = GetOrdersStatsRequest.from_dict(get_orders_stats_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


