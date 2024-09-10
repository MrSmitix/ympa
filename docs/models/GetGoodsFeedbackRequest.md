

# GetGoodsFeedbackRequest

Фильтр запроса отзывов в кабинете. 

The class is defined in **[GetGoodsFeedbackRequest.java](../../src/main/java/org/openapitools/model/GetGoodsFeedbackRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTimeFrom** | `OffsetDateTime` | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  |  [optional property]
**dateTimeTo** | `OffsetDateTime` | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  |  [optional property]
**reactionStatus** | `FeedbackReactionStatusType` |  |  [optional property]
**ratingValues** | `Set&lt;Integer&gt;` | Оценка товара. |  [optional property]
**modelIds** | `Set&lt;Long&gt;` | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  |  [optional property]
**paid** | `Boolean` | Фильтр отзывов за баллы Плюса. |  [optional property]








