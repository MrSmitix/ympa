# GenerateGoodsFeedbackRequest

Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса. | 

## Example

```python
from ympa_python_client.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateGoodsFeedbackRequest from a JSON string
generate_goods_feedback_request_instance = GenerateGoodsFeedbackRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateGoodsFeedbackRequest.to_json())

# convert the object into a dict
generate_goods_feedback_request_dict = generate_goods_feedback_request_instance.to_dict()
# create an instance of GenerateGoodsFeedbackRequest from a dict
generate_goods_feedback_request_from_dict = GenerateGoodsFeedbackRequest.from_dict(generate_goods_feedback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


