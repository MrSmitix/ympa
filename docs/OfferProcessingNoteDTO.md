# OfferProcessingNoteDTO

Причины, по которым товар не прошел модерацию.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OfferProcessingNoteType**](OfferProcessingNoteType.md) |  | [optional] 
**payload** | **str** | Дополнительная информация о причине отклонения товара.  | [optional] 

## Example

```python
from ympa_python_client.models.offer_processing_note_dto import OfferProcessingNoteDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferProcessingNoteDTO from a JSON string
offer_processing_note_dto_instance = OfferProcessingNoteDTO.from_json(json)
# print the JSON string representation of the object
print(OfferProcessingNoteDTO.to_json())

# convert the object into a dict
offer_processing_note_dto_dict = offer_processing_note_dto_instance.to_dict()
# create an instance of OfferProcessingNoteDTO from a dict
offer_processing_note_dto_from_dict = OfferProcessingNoteDTO.from_dict(offer_processing_note_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


