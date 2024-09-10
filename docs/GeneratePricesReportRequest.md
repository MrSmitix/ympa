# GeneratePricesReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  | [optional] [default to None]
**campaign_id** | **i64** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  | [optional] [default to None]
**category_ids** | **Vec<i64>** | Фильтр по категориям на Маркете. | [optional] [default to None]
**creation_date_from** | [***chrono::naive::NaiveDate**](date.md) | Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  | [optional] [default to None]
**creation_date_to** | [***chrono::naive::NaiveDate**](date.md) | Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


