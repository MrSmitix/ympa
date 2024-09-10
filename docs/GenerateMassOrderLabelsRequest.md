# GenerateMassOrderLabelsRequest

Данные, необходимые для генерации файла. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор кабинета. | 
**order_ids** | **List[int]** | Список идентификаторов заказов. | 

## Example

```python
from ympa_python_client.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateMassOrderLabelsRequest from a JSON string
generate_mass_order_labels_request_instance = GenerateMassOrderLabelsRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateMassOrderLabelsRequest.to_json())

# convert the object into a dict
generate_mass_order_labels_request_dict = generate_mass_order_labels_request_instance.to_dict()
# create an instance of GenerateMassOrderLabelsRequest from a dict
generate_mass_order_labels_request_from_dict = GenerateMassOrderLabelsRequest.from_dict(generate_mass_order_labels_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


