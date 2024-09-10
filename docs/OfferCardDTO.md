# OfferCardDTO

Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**mapping** | [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 
**parameter_values** | [**List[ParameterValueDTO]**](ParameterValueDTO.md) | Список характеристик с их значениями.  | [optional] 
**card_status** | [**OfferCardStatusType**](OfferCardStatusType.md) |  | [optional] 
**content_rating** | **int** | Процент заполненности карточки. | [optional] 
**recommendations** | [**List[OfferCardRecommendationDTO]**](OfferCardRecommendationDTO.md) | Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  | [optional] 
**errors** | [**List[OfferErrorDTO]**](OfferErrorDTO.md) | Ошибки в контенте, препятствующие размещению товара на витрине. | [optional] 
**warnings** | [**List[OfferErrorDTO]**](OfferErrorDTO.md) | Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. | [optional] 

## Example

```python
from ympa_python_client.models.offer_card_dto import OfferCardDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferCardDTO from a JSON string
offer_card_dto_instance = OfferCardDTO.from_json(json)
# print the JSON string representation of the object
print(OfferCardDTO.to_json())

# convert the object into a dict
offer_card_dto_dict = offer_card_dto_instance.to_dict()
# create an instance of OfferCardDTO from a dict
offer_card_dto_from_dict = OfferCardDTO.from_dict(offer_card_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


