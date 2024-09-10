# ympa_r_client::GetGoodsFeedbackRequest

Фильтр запроса отзывов в кабинете. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTimeFrom** | **character** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] 
**dateTimeTo** | **character** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] 
**reactionStatus** | [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] [Enum: ] 
**ratingValues** | **set[integer]** | Оценка товара. | [optional] [Max. items: 5] 
**modelIds** | **set[integer]** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] [Max. items: 20] 
**paid** | **character** | Фильтр отзывов за баллы Плюса. | [optional] 


