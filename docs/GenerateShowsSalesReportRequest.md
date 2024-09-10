# GenerateShowsSalesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | Option<**i64**> | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  | [optional]
**campaign_id** | Option<**i64**> | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  | [optional]
**date_from** | [**String**](string.md) | Начало периода, включительно. | 
**date_to** | [**String**](string.md) | Конец периода, включительно. | 
**grouping** | [**models::ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


