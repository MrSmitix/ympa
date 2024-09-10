# GetGoodsFeedbackRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTimeFrom** | **ZonedDateTime** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] [default to nothing]
**dateTimeTo** | **ZonedDateTime** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] [default to nothing]
**reactionStatus** | [***FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] [default to nothing]
**ratingValues** | **Vector{Int64}** | Оценка товара. | [optional] [default to nothing]
**modelIds** | **Vector{Int64}** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] [default to nothing]
**paid** | **Bool** | Фильтр отзывов за баллы Плюса. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


