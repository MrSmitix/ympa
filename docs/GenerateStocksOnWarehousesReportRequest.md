# GenerateStocksOnWarehousesReportRequest

Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор магазина. | 
**warehouse_ids** | **List[int]** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**report_date** | **date** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**category_ids** | **List[int]** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**has_stocks** | **bool** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 

## Example

```python
from ympa_python_client.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateStocksOnWarehousesReportRequest from a JSON string
generate_stocks_on_warehouses_report_request_instance = GenerateStocksOnWarehousesReportRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateStocksOnWarehousesReportRequest.to_json())

# convert the object into a dict
generate_stocks_on_warehouses_report_request_dict = generate_stocks_on_warehouses_report_request_instance.to_dict()
# create an instance of GenerateStocksOnWarehousesReportRequest from a dict
generate_stocks_on_warehouses_report_request_from_dict = GenerateStocksOnWarehousesReportRequest.from_dict(generate_stocks_on_warehouses_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


