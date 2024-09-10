# ympa_r_client::GenerateShowsSalesReportRequest

Данные, необходимые для генерации отчета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **integer** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**campaignId** | **integer** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**dateFrom** | **character** | Начало периода, включительно. | 
**dateTo** | **character** | Конец периода, включительно. | 
**grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | [Enum: ] 


