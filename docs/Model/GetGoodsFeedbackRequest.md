# GetGoodsFeedbackRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTimeFrom** | **\DateTime** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты. | [optional] 
**dateTimeTo** | **\DateTime** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. | [optional] 
**reactionStatus** | [**OpenAPI\Server\Model\FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] 
**ratingValues** | **int** | Оценка товара. | [optional] 
**modelIds** | **int** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). | [optional] 
**paid** | **bool** | Фильтр отзывов за баллы Плюса. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


