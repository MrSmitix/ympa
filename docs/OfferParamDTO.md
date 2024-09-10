# OfferParamDTO

Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же `name`, но разными `value`.  {% cut \"Пример\" %}  ```json \"params\": [   {     \"name\": \"Цвет\",     \"value\": \"Зеленый\"   },   {     \"name\": \"Цвет\",     \"value\": \"Желтый\"   } ] ```  {% endcut %} 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  | 
**value** | **str** | Значение.  | 

## Example

```python
from ympa_python_client.models.offer_param_dto import OfferParamDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferParamDTO from a JSON string
offer_param_dto_instance = OfferParamDTO.from_json(json)
# print the JSON string representation of the object
print(OfferParamDTO.to_json())

# convert the object into a dict
offer_param_dto_dict = offer_param_dto_instance.to_dict()
# create an instance of OfferParamDTO from a dict
offer_param_dto_from_dict = OfferParamDTO.from_dict(offer_param_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


