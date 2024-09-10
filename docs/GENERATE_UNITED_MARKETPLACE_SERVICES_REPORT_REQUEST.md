# GENERATE_UNITED_MARKETPLACE_SERVICES_REPORT_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **INTEGER_64** | Идентификатор бизнеса. | [default to null]
**date_time_from** | [**DATE_TIME**](DATE_TIME.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] [default to null]
**date_time_to** | [**DATE_TIME**](DATE_TIME.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] [default to null]
**date_from** | [**DATE**](DATE.md) | Начало периода, включительно. | [optional] [default to null]
**date_to** | [**DATE**](DATE.md) | Конец периода, включительно. Максимальный период — 1 год. | [optional] [default to null]
**year_from** | **INTEGER_32** | Начальный год формирования акта. | [optional] [default to null]
**month_from** | **INTEGER_32** | Начальный номер месяца формирования акта. | [optional] [default to null]
**year_to** | **INTEGER_32** | Конечный год формирования акта. | [optional] [default to null]
**month_to** | **INTEGER_32** | Конечный номер месяца формирования акта. | [optional] [default to null]
**placement_programs** | [**LIST [PLACEMENT_TYPE]**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] [default to null]
**inns** | [**LIST [STRING_32]**](STRING_32.md) | Список ИНН, которые нужны в отчете. | [optional] [default to null]
**campaign_ids** | **LIST [INTEGER_64]** | Список магазинов, которые нужны в отчете. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


