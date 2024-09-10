

# GetGoodsFeedbackRequest

Фильтр запроса отзывов в кабинете. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateTimeFrom** | **OffsetDateTime** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  |  [optional] |
|**dateTimeTo** | **OffsetDateTime** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  |  [optional] |
|**reactionStatus** | **FeedbackReactionStatusType** |  |  [optional] |
|**ratingValues** | **Set&lt;Integer&gt;** | Оценка товара. |  [optional] |
|**modelIds** | **Set&lt;Long&gt;** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  |  [optional] |
|**paid** | **Boolean** | Фильтр отзывов за баллы Плюса. |  [optional] |



