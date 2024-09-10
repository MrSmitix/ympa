# ReportInfoDTO

Статус генерации и ссылка на готовый отчет.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ReportStatusType**](ReportStatusType.md) |  | 
**sub_status** | [**ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] 
**generation_requested_at** | **datetime** | Дата и время запроса на генерацию. | 
**generation_finished_at** | **datetime** | Дата и время завершения генерации. | [optional] 
**file** | **str** | Ссылка на готовый отчет. | [optional] 
**estimated_generation_time** | **int** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] 

## Example

```python
from ympa_python_client.models.report_info_dto import ReportInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ReportInfoDTO from a JSON string
report_info_dto_instance = ReportInfoDTO.from_json(json)
# print the JSON string representation of the object
print(ReportInfoDTO.to_json())

# convert the object into a dict
report_info_dto_dict = report_info_dto_instance.to_dict()
# create an instance of ReportInfoDTO from a dict
report_info_dto_from_dict = ReportInfoDTO.from_dict(report_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


