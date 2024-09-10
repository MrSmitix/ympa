
# GenerateShowsSalesReportRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. |  |
| **dateTo** | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. |  |
| **grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  |  |
| **businessId** | **kotlin.Long** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  |  [optional] |
| **campaignId** | **kotlin.Long** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  |  [optional] |



