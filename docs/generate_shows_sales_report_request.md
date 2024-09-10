# generate_shows_sales_report_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **long** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**campaign_id** | **long** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] 
**date_from** | **char \*** | Начало периода, включительно. | 
**date_to** | **char \*** | Конец периода, включительно. | 
**grouping** | **shows_sales_grouping_type_t \*** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


