# SearchShipmentsRequest

Запрос информации об отгрузках.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **date** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**date_to** | **date** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**statuses** | [**List[ShipmentStatusType]**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] 
**order_ids** | **List[int]** | Список идентификаторов заказов из отгрузок. | [optional] 
**cancelled_orders** | **bool** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to True]

## Example

```python
from ympa_python_client.models.search_shipments_request import SearchShipmentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SearchShipmentsRequest from a JSON string
search_shipments_request_instance = SearchShipmentsRequest.from_json(json)
# print the JSON string representation of the object
print(SearchShipmentsRequest.to_json())

# convert the object into a dict
search_shipments_request_dict = search_shipments_request_instance.to_dict()
# create an instance of SearchShipmentsRequest from a dict
search_shipments_request_from_dict = SearchShipmentsRequest.from_dict(search_shipments_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


