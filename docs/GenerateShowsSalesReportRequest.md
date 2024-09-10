# GenerateShowsSalesReportRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Int64** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] [default to nothing]
**campaignId** | **Int64** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] [default to nothing]
**dateFrom** | **Date** | Начало периода, включительно. | [default to nothing]
**dateTo** | **Date** | Конец периода, включительно. | [default to nothing]
**grouping** | [***ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


