# OfferContentErrorDTO

Текст ошибки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OfferContentErrorType**](OfferContentErrorType.md) |  | 
**parameter_id** | **int** | Идентификатор характеристики, с которой связана ошибка. | [optional] 
**message** | **str** | Текст ошибки. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_content_error_dto import OfferContentErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferContentErrorDTO from a JSON string
offer_content_error_dto_instance = OfferContentErrorDTO.from_json(json)
# print the JSON string representation of the object
print OfferContentErrorDTO.to_json()

# convert the object into a dict
offer_content_error_dto_dict = offer_content_error_dto_instance.to_dict()
# create an instance of OfferContentErrorDTO from a dict
offer_content_error_dto_from_dict = OfferContentErrorDTO.from_dict(offer_content_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


