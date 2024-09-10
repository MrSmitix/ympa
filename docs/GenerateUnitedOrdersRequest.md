# ympa_csharp_client.Model.GenerateUnitedOrdersRequest
Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **long** | Идентификатор бизнеса. | 
**DateFrom** | **DateOnly** | Начало периода, включительно. | 
**DateTo** | **DateOnly** | Конец периода, включительно. Максимальный период — 1 год. | 
**CampaignIds** | **List&lt;long&gt;** | Список магазинов, которые нужны в отчете. | [optional] 
**PromoId** | **string** | Идентификатор акции, товары из которой нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

