# ModelOfferDTO

Информация о предложении.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount** | **int** | Скидка на предложение в процентах. | [optional] 
**name** | **str** | Наименование предложения. | [optional] 
**pos** | **int** | Позиция предложения в выдаче Маркета на карточке модели. | [optional] 
**pre_discount_price** | **float** | Цена предложения без скидки магазина. | [optional] 
**price** | **float** | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. | [optional] 
**region_id** | **int** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них.  | [optional] 
**shipping_cost** | **float** | Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  | [optional] 
**shop_name** | **str** | Название магазина (в том виде, в котором отображается на Маркете). | [optional] 
**shop_rating** | **int** | Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;.  | [optional] 
**in_stock** | **int** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 

## Example

```python
from ympa_python_client.models.model_offer_dto import ModelOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ModelOfferDTO from a JSON string
model_offer_dto_instance = ModelOfferDTO.from_json(json)
# print the JSON string representation of the object
print(ModelOfferDTO.to_json())

# convert the object into a dict
model_offer_dto_dict = model_offer_dto_instance.to_dict()
# create an instance of ModelOfferDTO from a dict
model_offer_dto_from_dict = ModelOfferDTO.from_dict(model_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


