# GenerateUnitedNettingReportRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Int64** | Идентификатор бизнеса. | [default to nothing]
**dateTimeFrom** | **ZonedDateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] [default to nothing]
**dateTimeTo** | **ZonedDateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] [default to nothing]
**dateFrom** | **Date** | Начало периода, включительно. | [optional] [default to nothing]
**dateTo** | **Date** | Конец периода, включительно. Максимальный период — 1 год. | [optional] [default to nothing]
**bankOrderId** | **Int64** | Номер платежного поручения. | [optional] [default to nothing]
**bankOrderDateTime** | **ZonedDateTime** | Дата платежного поручения. | [optional] [default to nothing]
**placementPrograms** | [**Vector{PlacementType}**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] [default to nothing]
**inns** | **Vector{String}** | Список ИНН, которые нужны в отчете. | [optional] [default to nothing]
**campaignIds** | **Vector{Int64}** | Список магазинов, которые нужны в отчете. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


