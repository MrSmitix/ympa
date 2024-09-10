# GenerateUnitedMarketplaceServicesReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **int** | Идентификатор бизнеса. | 
**dateTimeFrom** | **\DateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. | [optional] 
**dateTimeTo** | **\DateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**dateFrom** | [**\DateTime**](Date.md) | Начало периода, включительно. | [optional] 
**dateTo** | [**\DateTime**](Date.md) | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**yearFrom** | **int** | Начальный год формирования акта. | [optional] 
**monthFrom** | **int** | Начальный номер месяца формирования акта. | [optional] 
**yearTo** | **int** | Конечный год формирования акта. | [optional] 
**monthTo** | **int** | Конечный номер месяца формирования акта. | [optional] 
**placementPrograms** | [**OpenAPI\Server\Model\PlacementType**](PlacementType.md) | Список моделей, которые нужны в отчете. | [optional] 
**inns** | **string** | Список ИНН, которые нужны в отчете. | [optional] 
**campaignIds** | **int** | Список магазинов, которые нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


