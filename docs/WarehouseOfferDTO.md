# WarehouseOfferDTO

Информация об остатках товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**turnover_summary** | [**TurnoverDTO**](TurnoverDTO.md) |  | [optional] 
**stocks** | [**List[WarehouseStockDTO]**](WarehouseStockDTO.md) | Информация об остатках. | 
**updated_at** | **datetime** | Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.warehouse_offer_dto import WarehouseOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of WarehouseOfferDTO from a JSON string
warehouse_offer_dto_instance = WarehouseOfferDTO.from_json(json)
# print the JSON string representation of the object
print(WarehouseOfferDTO.to_json())

# convert the object into a dict
warehouse_offer_dto_dict = warehouse_offer_dto_instance.to_dict()
# create an instance of WarehouseOfferDTO from a dict
warehouse_offer_dto_from_dict = WarehouseOfferDTO.from_dict(warehouse_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


