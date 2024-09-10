# OfferConditionDTO

Состояние уцененного товара. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OfferConditionType**](OfferConditionType.md) |  | [optional] 
**quality** | [**OfferConditionQualityType**](OfferConditionQualityType.md) |  | [optional] 
**reason** | **str** | Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_condition_dto import OfferConditionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferConditionDTO from a JSON string
offer_condition_dto_instance = OfferConditionDTO.from_json(json)
# print the JSON string representation of the object
print OfferConditionDTO.to_json()

# convert the object into a dict
offer_condition_dto_dict = offer_condition_dto_instance.to_dict()
# create an instance of OfferConditionDTO from a dict
offer_condition_dto_from_dict = OfferConditionDTO.from_dict(offer_condition_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


