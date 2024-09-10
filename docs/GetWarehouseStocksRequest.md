# GetWarehouseStocksRequest

Фильтры для запроса остатков. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**with_turnover** | **bool** | **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — &#x60;false&#x60;. Если информация нужна, передайте значение &#x60;true&#x60;.  | [optional] [default to False]
**archived** | **bool** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращается информация о товарах, которые не находятся в архиве.  | [optional] 
**offer_ids** | **List[str]** | Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60; * &#x60;archived&#x60;  {% endnote %}     | [optional] 

## Example

```python
from ympa_python_client.models.get_warehouse_stocks_request import GetWarehouseStocksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetWarehouseStocksRequest from a JSON string
get_warehouse_stocks_request_instance = GetWarehouseStocksRequest.from_json(json)
# print the JSON string representation of the object
print(GetWarehouseStocksRequest.to_json())

# convert the object into a dict
get_warehouse_stocks_request_dict = get_warehouse_stocks_request_instance.to_dict()
# create an instance of GetWarehouseStocksRequest from a dict
get_warehouse_stocks_request_from_dict = GetWarehouseStocksRequest.from_dict(get_warehouse_stocks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


