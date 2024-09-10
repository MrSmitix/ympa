# GENERATE_UNITED_NETTING_REPORT_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **INTEGER_64** | Идентификатор бизнеса. | [default to null]
**date_time_from** | [**DATE_TIME**](DATE_TIME.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] [default to null]
**date_time_to** | [**DATE_TIME**](DATE_TIME.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] [default to null]
**date_from** | [**DATE**](DATE.md) | Начало периода, включительно. | [optional] [default to null]
**date_to** | [**DATE**](DATE.md) | Конец периода, включительно. Максимальный период — 1 год. | [optional] [default to null]
**bank_order_id** | **INTEGER_64** | Номер платежного поручения. | [optional] [default to null]
**bank_order_date_time** | [**DATE_TIME**](DATE_TIME.md) | Дата платежного поручения. | [optional] [default to null]
**placement_programs** | [**LIST [PLACEMENT_TYPE]**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] [default to null]
**inns** | [**LIST [STRING_32]**](STRING_32.md) | Список ИНН, которые нужны в отчете. | [optional] [default to null]
**campaign_ids** | **LIST [INTEGER_64]** | Список магазинов, которые нужны в отчете. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


