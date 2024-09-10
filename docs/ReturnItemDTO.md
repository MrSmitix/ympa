# ReturnItemDTO

Список товаров в возврате.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_sku** | **int** | SKU на Маркете. | [optional] 
**shop_sku** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**count** | **int** | Количество единиц товара. | 
**decisions** | [**List[ReturnDecisionDTO]**](ReturnDecisionDTO.md) | Список решений по возврату. | [optional] 
**instances** | [**List[ReturnInstanceDTO]**](ReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional] 
**tracks** | [**List[TrackDTO]**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional] 

## Example

```python
from ympa_python_client.models.return_item_dto import ReturnItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ReturnItemDTO from a JSON string
return_item_dto_instance = ReturnItemDTO.from_json(json)
# print the JSON string representation of the object
print(ReturnItemDTO.to_json())

# convert the object into a dict
return_item_dto_dict = return_item_dto_instance.to_dict()
# create an instance of ReturnItemDTO from a dict
return_item_dto_from_dict = ReturnItemDTO.from_dict(return_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


