

# GenerateShowsSalesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Long** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  |  [optional]
**campaignId** | **Long** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  |  [optional]
**dateFrom** | [**Date**](Date.md) | Начало периода, включительно. | 
**dateTo** | [**Date**](Date.md) | Конец периода, включительно. | 
**grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | 




