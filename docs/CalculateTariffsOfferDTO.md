# CalculateTariffsOfferDTO

Параметры товара, для которого нужно рассчитать стоимость услуг.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **int** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | **float** | Цена на товар в рублях. | 
**length** | **float** | Длина товара в сантиметрах. | 
**width** | **float** | Ширина товара в сантиметрах. | 
**height** | **float** | Высота товара в сантиметрах. | 
**weight** | **float** | Вес товара в килограммах. | 
**quantity** | **int** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]

## Example

```python
from ympa_python_pydantic_v1_client.models.calculate_tariffs_offer_dto import CalculateTariffsOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CalculateTariffsOfferDTO from a JSON string
calculate_tariffs_offer_dto_instance = CalculateTariffsOfferDTO.from_json(json)
# print the JSON string representation of the object
print CalculateTariffsOfferDTO.to_json()

# convert the object into a dict
calculate_tariffs_offer_dto_dict = calculate_tariffs_offer_dto_instance.to_dict()
# create an instance of CalculateTariffsOfferDTO from a dict
calculate_tariffs_offer_dto_from_dict = CalculateTariffsOfferDTO.from_dict(calculate_tariffs_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


