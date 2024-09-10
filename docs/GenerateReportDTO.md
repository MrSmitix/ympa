# GenerateReportDTO

Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_id** | **str** | Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. | 
**estimated_generation_time** | **int** | Ожидаемая продолжительность генерации в миллисекундах. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.generate_report_dto import GenerateReportDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateReportDTO from a JSON string
generate_report_dto_instance = GenerateReportDTO.from_json(json)
# print the JSON string representation of the object
print GenerateReportDTO.to_json()

# convert the object into a dict
generate_report_dto_dict = generate_report_dto_instance.to_dict()
# create an instance of GenerateReportDTO from a dict
generate_report_dto_from_dict = GenerateReportDTO.from_dict(generate_report_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


