# GenerateShowsSalesReportRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **businessId** | **Long** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] [default to null] |
| **campaignId** | **Long** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] [default to null] |
| **dateFrom** | **date** | Начало периода, включительно. | [default to null] |
| **dateTo** | **date** | Конец периода, включительно. | [default to null] |
| **grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

