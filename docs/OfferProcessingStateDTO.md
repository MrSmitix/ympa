# OfferProcessingStateDTO

Информация о статусе публикации товара на Маркете.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**OfferProcessingStatusType**](OfferProcessingStatusType.md) |  | [optional] 
**notes** | [**List[OfferProcessingNoteDTO]**](OfferProcessingNoteDTO.md) | Причины, по которым товар не прошел модерацию. | [optional] 

## Example

```python
from ympa_python_client.models.offer_processing_state_dto import OfferProcessingStateDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferProcessingStateDTO from a JSON string
offer_processing_state_dto_instance = OfferProcessingStateDTO.from_json(json)
# print the JSON string representation of the object
print(OfferProcessingStateDTO.to_json())

# convert the object into a dict
offer_processing_state_dto_dict = offer_processing_state_dto_instance.to_dict()
# create an instance of OfferProcessingStateDTO from a dict
offer_processing_state_dto_from_dict = OfferProcessingStateDTO.from_dict(offer_processing_state_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


