# UpdateOfferMappingResultDTO

Ошибки и предупреждения, которые появились из-за переданных характеристик.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**errors** | [**List[OfferMappingErrorDTO]**](OfferMappingErrorDTO.md) | Ошибки — информация в каталоге не обновится. | [optional] 
**warnings** | [**List[OfferMappingErrorDTO]**](OfferMappingErrorDTO.md) | Предупреждения — информация в каталоге обновится. | [optional] 

## Example

```python
from ympa_python_client.models.update_offer_mapping_result_dto import UpdateOfferMappingResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOfferMappingResultDTO from a JSON string
update_offer_mapping_result_dto_instance = UpdateOfferMappingResultDTO.from_json(json)
# print the JSON string representation of the object
print(UpdateOfferMappingResultDTO.to_json())

# convert the object into a dict
update_offer_mapping_result_dto_dict = update_offer_mapping_result_dto_instance.to_dict()
# create an instance of UpdateOfferMappingResultDTO from a dict
update_offer_mapping_result_dto_from_dict = UpdateOfferMappingResultDTO.from_dict(update_offer_mapping_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


