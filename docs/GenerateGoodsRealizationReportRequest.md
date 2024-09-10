# GenerateGoodsRealizationReportRequest

Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор кампании. | 
**year** | **int** | Год. | 
**month** | **int** | Номер месяца. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateGoodsRealizationReportRequest from a JSON string
generate_goods_realization_report_request_instance = GenerateGoodsRealizationReportRequest.from_json(json)
# print the JSON string representation of the object
print GenerateGoodsRealizationReportRequest.to_json()

# convert the object into a dict
generate_goods_realization_report_request_dict = generate_goods_realization_report_request_instance.to_dict()
# create an instance of GenerateGoodsRealizationReportRequest from a dict
generate_goods_realization_report_request_from_dict = GenerateGoodsRealizationReportRequest.from_dict(generate_goods_realization_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


