# GoodsStatsGoodsDTO

Информация о товаре.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shop_sku** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**market_sku** | **int** | SKU на Маркете. | [optional] 
**name** | **str** | Название товара. | [optional] 
**price** | **float** | Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). | [optional] 
**category_id** | **int** | Идентификатор категории товара на Маркете. | [optional] 
**category_name** | **str** | Название категории товара на Маркете. | [optional] 
**weight_dimensions** | [**GoodsStatsWeightDimensionsDTO**](GoodsStatsWeightDimensionsDTO.md) |  | [optional] 
**warehouses** | [**List[GoodsStatsWarehouseDTO]**](GoodsStatsWarehouseDTO.md) | Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  | [optional] 
**tariffs** | [**List[TariffDTO]**](TariffDTO.md) | Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | [optional] 
**pictures** | **List[str]** | Ссылки (URL) изображений товара в хорошем качестве. | [optional] 

## Example

```python
from ympa_python_client.models.goods_stats_goods_dto import GoodsStatsGoodsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsStatsGoodsDTO from a JSON string
goods_stats_goods_dto_instance = GoodsStatsGoodsDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsStatsGoodsDTO.to_json())

# convert the object into a dict
goods_stats_goods_dto_dict = goods_stats_goods_dto_instance.to_dict()
# create an instance of GoodsStatsGoodsDTO from a dict
goods_stats_goods_dto_from_dict = GoodsStatsGoodsDTO.from_dict(goods_stats_goods_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


