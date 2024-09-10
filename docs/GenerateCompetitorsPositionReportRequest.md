# GenerateCompetitorsPositionReportRequest

Данные, необходимые для генерации отчета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса. | 
**category_id** | **int** | Идентификатор категории. | 
**date_from** | **date** | Начало периода, включительно. | 
**date_to** | **date** | Конец периода, включительно. | 

## Example

```python
from ympa_python_client.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateCompetitorsPositionReportRequest from a JSON string
generate_competitors_position_report_request_instance = GenerateCompetitorsPositionReportRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateCompetitorsPositionReportRequest.to_json())

# convert the object into a dict
generate_competitors_position_report_request_dict = generate_competitors_position_report_request_instance.to_dict()
# create an instance of GenerateCompetitorsPositionReportRequest from a dict
generate_competitors_position_report_request_from_dict = GenerateCompetitorsPositionReportRequest.from_dict(generate_competitors_position_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


