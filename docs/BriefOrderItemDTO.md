# BriefOrderItemDTO

Информация о маркированном товаре.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] 
**vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] 
**count** | **int** | Количество единиц товара. | [optional] 
**price** | **float** | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  | [optional] 
**offer_name** | **str** | Название товара. | [optional] 
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**instances** | [**List[OrderItemInstanceDTO]**](OrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.brief_order_item_dto import BriefOrderItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of BriefOrderItemDTO from a JSON string
brief_order_item_dto_instance = BriefOrderItemDTO.from_json(json)
# print the JSON string representation of the object
print BriefOrderItemDTO.to_json()

# convert the object into a dict
brief_order_item_dto_dict = brief_order_item_dto_instance.to_dict()
# create an instance of BriefOrderItemDTO from a dict
brief_order_item_dto_from_dict = BriefOrderItemDTO.from_dict(brief_order_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


