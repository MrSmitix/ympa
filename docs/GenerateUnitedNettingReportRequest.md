# GenerateUnitedNettingReportRequest

Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса. | 
**date_time_from** | **datetime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**date_time_to** | **datetime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**date_from** | **date** | Начало периода, включительно. | [optional] 
**date_to** | **date** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**bank_order_id** | **int** | Номер платежного поручения. | [optional] 
**bank_order_date_time** | **datetime** | Дата платежного поручения. | [optional] 
**placement_programs** | [**List[PlacementType]**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] 
**inns** | **List[str]** | Список ИНН, которые нужны в отчете. | [optional] 
**campaign_ids** | **List[int]** | Список магазинов, которые нужны в отчете. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateUnitedNettingReportRequest from a JSON string
generate_united_netting_report_request_instance = GenerateUnitedNettingReportRequest.from_json(json)
# print the JSON string representation of the object
print GenerateUnitedNettingReportRequest.to_json()

# convert the object into a dict
generate_united_netting_report_request_dict = generate_united_netting_report_request_instance.to_dict()
# create an instance of GenerateUnitedNettingReportRequest from a dict
generate_united_netting_report_request_from_dict = GenerateUnitedNettingReportRequest.from_dict(generate_united_netting_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


