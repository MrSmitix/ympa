# GENERATE_PRICES_REPORT_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **INTEGER_64** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.  | [optional] [default to null]
**campaign_id** | **INTEGER_64** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.  | [optional] [default to null]
**category_ids** | **LIST [INTEGER_64]** | Фильтр по категориям на Маркете. | [optional] [default to null]
**creation_date_from** | [**DATE**](DATE.md) | Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null]
**creation_date_to** | [**DATE**](DATE.md) | Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


