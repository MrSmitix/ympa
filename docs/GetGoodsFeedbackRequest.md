
# GetGoodsFeedbackRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateTimeFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  |  [optional] |
| **dateTimeTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  |  [optional] |
| **reactionStatus** | [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  |  [optional] |
| **ratingValues** | **kotlin.collections.Set&lt;kotlin.Int&gt;** | Оценка товара. |  [optional] |
| **modelIds** | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  |  [optional] |
| **paid** | **kotlin.Boolean** | Фильтр отзывов за баллы Плюса. |  [optional] |



