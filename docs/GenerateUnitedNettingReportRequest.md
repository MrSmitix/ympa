# GenerateUnitedNettingReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Int!** | Идентификатор бизнеса. | [default to null]
**dateTimeFrom** | **String!** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] [default to null]
**dateTimeTo** | **String!** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] [default to null]
**dateFrom** | **String!** | Начало периода, включительно. | [optional] [default to null]
**dateTo** | **String!** | Конец периода, включительно. Максимальный период — 1 год. | [optional] [default to null]
**bankOrderId** | **Int!** | Номер платежного поручения. | [optional] [default to null]
**bankOrderDateTime** | **String!** | Дата платежного поручения. | [optional] [default to null]
**placementPrograms** | [**PlacementType**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] [default to null]
**inns** | **String!** | Список ИНН, которые нужны в отчете. | [optional] [default to null]
**campaignIds** | **Int!** | Список магазинов, которые нужны в отчете. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


