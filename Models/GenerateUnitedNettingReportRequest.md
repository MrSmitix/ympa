# GenerateUnitedNettingReportRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **businessId** | **Long** | Идентификатор бизнеса. | [default to null] |
| **dateTimeFrom** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] [default to null] |
| **dateTimeTo** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] [default to null] |
| **dateFrom** | **date** | Начало периода, включительно. | [optional] [default to null] |
| **dateTo** | **date** | Конец периода, включительно. Максимальный период — 1 год. | [optional] [default to null] |
| **bankOrderId** | **Long** | Номер платежного поручения. | [optional] [default to null] |
| **bankOrderDateTime** | **Date** | Дата платежного поручения. | [optional] [default to null] |
| **placementPrograms** | [**List**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] [default to null] |
| **inns** | **List** | Список ИНН, которые нужны в отчете. | [optional] [default to null] |
| **campaignIds** | **List** | Список магазинов, которые нужны в отчете. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

