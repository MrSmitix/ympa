
# Table `GenerateShowsSalesReportRequest`
(mapped from: GenerateShowsSalesReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateFrom** | dateFrom | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. | 
**dateTo** | dateTo | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. | 
**grouping** | grouping | long NOT NULL |  | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  |  [foreignkey]
**businessId** | businessId | long |  | **kotlin.Long** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  |  [optional]
**campaignId** | campaignId | long |  | **kotlin.Long** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  |  [optional]







