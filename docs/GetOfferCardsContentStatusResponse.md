# GetOfferCardsContentStatusResponse

Ответ со списком состояний товаров и пагинацией.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OfferCardsContentStatusDTO**](OfferCardsContentStatusDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferCardsContentStatusResponse from a JSON string
get_offer_cards_content_status_response_instance = GetOfferCardsContentStatusResponse.from_json(json)
# print the JSON string representation of the object
print GetOfferCardsContentStatusResponse.to_json()

# convert the object into a dict
get_offer_cards_content_status_response_dict = get_offer_cards_content_status_response_instance.to_dict()
# create an instance of GetOfferCardsContentStatusResponse from a dict
get_offer_cards_content_status_response_from_dict = GetOfferCardsContentStatusResponse.from_dict(get_offer_cards_content_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


