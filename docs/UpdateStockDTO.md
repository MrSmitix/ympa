# UpdateStockDTO

Информация об остатках одного товара на одном из складов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sku** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**items** | [**List[UpdateStockItemDTO]**](UpdateStockItemDTO.md) | Информация об остатках товара.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_stock_dto import UpdateStockDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateStockDTO from a JSON string
update_stock_dto_instance = UpdateStockDTO.from_json(json)
# print the JSON string representation of the object
print UpdateStockDTO.to_json()

# convert the object into a dict
update_stock_dto_dict = update_stock_dto_instance.to_dict()
# create an instance of UpdateStockDTO from a dict
update_stock_dto_from_dict = UpdateStockDTO.from_dict(update_stock_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


