# GenerateShowsSalesReportRequest

Данные, необходимые для генерации отчета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**campaign_id** | **int** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**date_from** | **date** | Начало периода, включительно. | 
**date_to** | **date** | Конец периода, включительно. | 
**grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | 

## Example

```python
from ympa_python_client.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateShowsSalesReportRequest from a JSON string
generate_shows_sales_report_request_instance = GenerateShowsSalesReportRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateShowsSalesReportRequest.to_json())

# convert the object into a dict
generate_shows_sales_report_request_dict = generate_shows_sales_report_request_instance.to_dict()
# create an instance of GenerateShowsSalesReportRequest from a dict
generate_shows_sales_report_request_from_dict = GenerateShowsSalesReportRequest.from_dict(generate_shows_sales_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


