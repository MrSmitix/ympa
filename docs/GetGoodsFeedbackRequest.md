# GetGoodsFeedbackRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateTimeFrom** | **System.DateTime** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] 
**DateTimeTo** | **System.DateTime** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] 
**ReactionStatus** | [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] 
**RatingValues** | **Int32[]** | Оценка товара. | [optional] 
**ModelIds** | **Int64[]** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] 
**Paid** | **Boolean** | Фильтр отзывов за баллы Плюса. | [optional] 

## Examples

- Prepare the resource
```powershell
$GetGoodsFeedbackRequest = Initialize-ympa_powershell_clientGetGoodsFeedbackRequest  -DateTimeFrom null `
 -DateTimeTo null `
 -ReactionStatus null `
 -RatingValues null `
 -ModelIds null `
 -Paid null
```

- Convert the resource to JSON
```powershell
$GetGoodsFeedbackRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

