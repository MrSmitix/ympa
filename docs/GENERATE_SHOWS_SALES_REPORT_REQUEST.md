# GENERATE_SHOWS_SALES_REPORT_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **INTEGER_64** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] [default to null]
**campaign_id** | **INTEGER_64** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] [default to null]
**date_from** | [**DATE**](DATE.md) | Начало периода, включительно. | [default to null]
**date_to** | [**DATE**](DATE.md) | Конец периода, включительно. | [default to null]
**grouping** | [**SHOWS_SALES_GROUPING_TYPE**](ShowsSalesGroupingType.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


