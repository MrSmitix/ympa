# GenerateBoostConsolidatedRequest

Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса. | 
**date_from** | **date** | Начало периода, включительно. | 
**date_to** | **date** | Конец периода, включительно. | 

## Example

```python
from ympa_python_client.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateBoostConsolidatedRequest from a JSON string
generate_boost_consolidated_request_instance = GenerateBoostConsolidatedRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateBoostConsolidatedRequest.to_json())

# convert the object into a dict
generate_boost_consolidated_request_dict = generate_boost_consolidated_request_instance.to_dict()
# create an instance of GenerateBoostConsolidatedRequest from a dict
generate_boost_consolidated_request_from_dict = GenerateBoostConsolidatedRequest.from_dict(generate_boost_consolidated_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


