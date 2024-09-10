# GenerateUnitedMarketplaceServicesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор бизнеса. | 
**date_time_from** | Option<**String**> | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional]
**date_time_to** | Option<**String**> | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional]
**date_from** | Option<[**String**](string.md)> | Начало периода, включительно. | [optional]
**date_to** | Option<[**String**](string.md)> | Конец периода, включительно. Максимальный период — 1 год. | [optional]
**year_from** | Option<**i32**> | Начальный год формирования акта. | [optional]
**month_from** | Option<**i32**> | Начальный номер месяца формирования акта. | [optional]
**year_to** | Option<**i32**> | Конечный год формирования акта. | [optional]
**month_to** | Option<**i32**> | Конечный номер месяца формирования акта. | [optional]
**placement_programs** | Option<[**Vec<models::PlacementType>**](PlacementType.md)> | Список моделей, которые нужны в отчете.  | [optional]
**inns** | Option<**Vec<String>**> | Список ИНН, которые нужны в отчете. | [optional]
**campaign_ids** | Option<**Vec<i64>**> | Список магазинов, которые нужны в отчете. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


