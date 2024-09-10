# GeneratePricesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | Option<**i64**> | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  | [optional]
**campaign_id** | Option<**i64**> | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  | [optional]
**category_ids** | Option<**Vec<i64>**> | Фильтр по категориям на Маркете. | [optional]
**creation_date_from** | Option<[**String**](string.md)> | Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  | [optional]
**creation_date_to** | Option<[**String**](string.md)> | Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


