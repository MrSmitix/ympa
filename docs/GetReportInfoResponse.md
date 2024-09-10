# GetReportInfoResponse

Ответ на запрос информации об отчете.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**ReportInfoDTO**](ReportInfoDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_report_info_response import GetReportInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetReportInfoResponse from a JSON string
get_report_info_response_instance = GetReportInfoResponse.from_json(json)
# print the JSON string representation of the object
print(GetReportInfoResponse.to_json())

# convert the object into a dict
get_report_info_response_dict = get_report_info_response_instance.to_dict()
# create an instance of GetReportInfoResponse from a dict
get_report_info_response_from_dict = GetReportInfoResponse.from_dict(get_report_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


