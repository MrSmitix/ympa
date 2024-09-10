# UpdateOfferContentResponse

Описывает проблемы, которые появились при сохранении товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**results** | [**List[UpdateOfferContentResultDTO]**](UpdateOfferContentResultDTO.md) | Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  | [optional] 

## Example

```python
from ympa_python_client.models.update_offer_content_response import UpdateOfferContentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOfferContentResponse from a JSON string
update_offer_content_response_instance = UpdateOfferContentResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateOfferContentResponse.to_json())

# convert the object into a dict
update_offer_content_response_dict = update_offer_content_response_instance.to_dict()
# create an instance of UpdateOfferContentResponse from a dict
update_offer_content_response_from_dict = UpdateOfferContentResponse.from_dict(update_offer_content_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


