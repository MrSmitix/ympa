# SkipGoodsFeedbackReactionRequest

Идентификаторы отзывов.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_ids** | **List[int]** | Список идентификаторов отзывов, на которые магазин не будет отвечать. | 

## Example

```python
from ympa_python_client.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SkipGoodsFeedbackReactionRequest from a JSON string
skip_goods_feedback_reaction_request_instance = SkipGoodsFeedbackReactionRequest.from_json(json)
# print the JSON string representation of the object
print(SkipGoodsFeedbackReactionRequest.to_json())

# convert the object into a dict
skip_goods_feedback_reaction_request_dict = skip_goods_feedback_reaction_request_instance.to_dict()
# create an instance of SkipGoodsFeedbackReactionRequest from a dict
skip_goods_feedback_reaction_request_from_dict = SkipGoodsFeedbackReactionRequest.from_dict(skip_goods_feedback_reaction_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


