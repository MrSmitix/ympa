# GeneratePricesReportRequest

Данные, необходимые для генерации отчета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.  | [optional] 
**campaign_id** | **int** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.  | [optional] 
**category_ids** | **List[int]** | Фильтр по категориям на Маркете. | [optional] 
**creation_date_from** | **date** | Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**creation_date_to** | **date** | Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.generate_prices_report_request import GeneratePricesReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GeneratePricesReportRequest from a JSON string
generate_prices_report_request_instance = GeneratePricesReportRequest.from_json(json)
# print the JSON string representation of the object
print GeneratePricesReportRequest.to_json()

# convert the object into a dict
generate_prices_report_request_dict = generate_prices_report_request_instance.to_dict()
# create an instance of GeneratePricesReportRequest from a dict
generate_prices_report_request_from_dict = GeneratePricesReportRequest.from_dict(generate_prices_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


