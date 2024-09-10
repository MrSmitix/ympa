# GenerateUnitedMarketplaceServicesReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор бизнеса. | 
**date_time_from** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] [default to None]
**date_time_to** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] [default to None]
**date_from** | [***chrono::naive::NaiveDate**](date.md) | Начало периода, включительно. | [optional] [default to None]
**date_to** | [***chrono::naive::NaiveDate**](date.md) | Конец периода, включительно. Максимальный период — 1 год. | [optional] [default to None]
**year_from** | **i32** | Начальный год формирования акта. | [optional] [default to None]
**month_from** | **u32** | Начальный номер месяца формирования акта. | [optional] [default to None]
**year_to** | **i32** | Конечный год формирования акта. | [optional] [default to None]
**month_to** | **u32** | Конечный номер месяца формирования акта. | [optional] [default to None]
**placement_programs** | [**Vec<models::PlacementType>**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] [default to None]
**inns** | **Vec<String>** | Список ИНН, которые нужны в отчете. | [optional] [default to None]
**campaign_ids** | **Vec<i64>** | Список магазинов, которые нужны в отчете. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


