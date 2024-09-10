# UpdateStockItemDTO

Информация об остатках товара. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | Количество доступного товара.  | 
**updated_at** | **datetime** | Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.update_stock_item_dto import UpdateStockItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateStockItemDTO from a JSON string
update_stock_item_dto_instance = UpdateStockItemDTO.from_json(json)
# print the JSON string representation of the object
print(UpdateStockItemDTO.to_json())

# convert the object into a dict
update_stock_item_dto_dict = update_stock_item_dto_instance.to_dict()
# create an instance of UpdateStockItemDTO from a dict
update_stock_item_dto_from_dict = UpdateStockItemDTO.from_dict(update_stock_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


