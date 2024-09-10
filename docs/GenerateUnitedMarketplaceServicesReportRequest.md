# ympa_csharp_client.Model.GenerateUnitedMarketplaceServicesReportRequest
Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **long** | Идентификатор бизнеса. | 
**DateTimeFrom** | **DateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**DateTimeTo** | **DateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**DateFrom** | **DateOnly** | Начало периода, включительно. | [optional] 
**DateTo** | **DateOnly** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**YearFrom** | **int** | Начальный год формирования акта. | [optional] 
**MonthFrom** | **int** | Начальный номер месяца формирования акта. | [optional] 
**YearTo** | **int** | Конечный год формирования акта. | [optional] 
**MonthTo** | **int** | Конечный номер месяца формирования акта. | [optional] 
**PlacementPrograms** | [**List&lt;PlacementType&gt;**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] 
**Inns** | **List&lt;string&gt;** | Список ИНН, которые нужны в отчете. | [optional] 
**CampaignIds** | **List&lt;long&gt;** | Список магазинов, которые нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

