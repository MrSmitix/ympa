

# GenerateShowsSalesReportRequest

Данные, необходимые для генерации отчета.

The class is defined in **[GenerateShowsSalesReportRequest.java](../../src/main/java/org/openapitools/model/GenerateShowsSalesReportRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  |  [optional property]
**campaignId** | `Long` | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  |  [optional property]
**dateFrom** | `LocalDate` | Начало периода, включительно. | 
**dateTo** | `LocalDate` | Конец периода, включительно. | 
**grouping** | `ShowsSalesGroupingType` |  | 







