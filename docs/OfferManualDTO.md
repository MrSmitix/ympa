# OfferManualDTO

Инструкция по использованию товара. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | Ссылка на инструкцию. | 
**title** | **str** | Название инструкции, которое будет отображаться на карточке товара.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_manual_dto import OfferManualDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferManualDTO from a JSON string
offer_manual_dto_instance = OfferManualDTO.from_json(json)
# print the JSON string representation of the object
print OfferManualDTO.to_json()

# convert the object into a dict
offer_manual_dto_dict = offer_manual_dto_instance.to_dict()
# create an instance of OfferManualDTO from a dict
offer_manual_dto_from_dict = OfferManualDTO.from_dict(offer_manual_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


