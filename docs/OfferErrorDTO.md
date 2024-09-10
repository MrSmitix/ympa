# OfferErrorDTO

Сообщение об ошибке, связанной с размещением товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Тип ошибки. | [optional] 
**comment** | **str** | Пояснение. | [optional] 

## Example

```python
from ympa_python_client.models.offer_error_dto import OfferErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferErrorDTO from a JSON string
offer_error_dto_instance = OfferErrorDTO.from_json(json)
# print the JSON string representation of the object
print(OfferErrorDTO.to_json())

# convert the object into a dict
offer_error_dto_dict = offer_error_dto_instance.to_dict()
# create an instance of OfferErrorDTO from a dict
offer_error_dto_from_dict = OfferErrorDTO.from_dict(offer_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


