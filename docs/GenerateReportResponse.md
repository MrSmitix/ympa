# GenerateReportResponse

Ответ на запрос генерации отчета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GenerateReportDTO**](GenerateReportDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.generate_report_response import GenerateReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateReportResponse from a JSON string
generate_report_response_instance = GenerateReportResponse.from_json(json)
# print the JSON string representation of the object
print(GenerateReportResponse.to_json())

# convert the object into a dict
generate_report_response_dict = generate_report_response_instance.to_dict()
# create an instance of GenerateReportResponse from a dict
generate_report_response_from_dict = GenerateReportResponse.from_dict(generate_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


