# GenerateShowsSalesReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **int** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. | [optional] 
**campaignId** | **int** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. | [optional] 
**dateFrom** | [**\DateTime**](Date.md) | Начало периода, включительно. | 
**dateTo** | [**\DateTime**](Date.md) | Конец периода, включительно. | 
**grouping** | [**OpenAPI\Server\Model\ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


