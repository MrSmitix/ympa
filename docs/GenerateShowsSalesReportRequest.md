# WWW::OpenAPIClient::Object::GenerateShowsSalesReportRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GenerateShowsSalesReportRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**campaign_id** | **int** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**date_from** | **DATE** | Начало периода, включительно. | 
**date_to** | **DATE** | Конец периода, включительно. | 
**grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


