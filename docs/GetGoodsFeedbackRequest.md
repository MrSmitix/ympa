# ympa_csharp_client.Model.GetGoodsFeedbackRequest
Фильтр запроса отзывов в кабинете. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateTimeFrom** | **DateTime** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] 
**DateTimeTo** | **DateTime** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] 
**ReactionStatus** | **FeedbackReactionStatusType** |  | [optional] 
**RatingValues** | **List&lt;int&gt;** | Оценка товара. | [optional] 
**ModelIds** | **List&lt;long&gt;** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] 
**Paid** | **bool** | Фильтр отзывов за баллы Плюса. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

