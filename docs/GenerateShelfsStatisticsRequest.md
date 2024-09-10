# GenerateShelfsStatisticsRequest

Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса. | 
**date_from** | **date** | Начало периода, включительно. | 
**date_to** | **date** | Конец периода, включительно. | 
**attribution_type** | [**ShelfsStatisticsAttributionType**](ShelfsStatisticsAttributionType.md) |  | 

## Example

```python
from ympa_python_client.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateShelfsStatisticsRequest from a JSON string
generate_shelfs_statistics_request_instance = GenerateShelfsStatisticsRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateShelfsStatisticsRequest.to_json())

# convert the object into a dict
generate_shelfs_statistics_request_dict = generate_shelfs_statistics_request_instance.to_dict()
# create an instance of GenerateShelfsStatisticsRequest from a dict
generate_shelfs_statistics_request_from_dict = GenerateShelfsStatisticsRequest.from_dict(generate_shelfs_statistics_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


