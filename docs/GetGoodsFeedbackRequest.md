
# Table `GetGoodsFeedbackRequest`
(mapped from: GetGoodsFeedbackRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateTimeFrom** | dateTimeFrom | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  |  [optional]
**dateTimeTo** | dateTimeTo | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  |  [optional]
**reactionStatus** | reactionStatus | long |  | [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  |  [optional] [foreignkey]
**ratingValues** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Int&gt;** | Оценка товара. |  [optional]
**modelIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  |  [optional]
**paid** | paid | boolean |  | **kotlin.Boolean** | Фильтр отзывов за баллы Плюса. |  [optional]





# **Table `GetGoodsFeedbackRequestRatingValues`**
(mapped from: GetGoodsFeedbackRequestRatingValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getGoodsFeedbackRequest | getGoodsFeedbackRequest | long | | kotlin.Long | Primary Key | *one*
ratingValues | ratingValues | int | | kotlin.Int | Foreign Key | *many*



# **Table `GetGoodsFeedbackRequestModelIds`**
(mapped from: GetGoodsFeedbackRequestModelIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getGoodsFeedbackRequest | getGoodsFeedbackRequest | long | | kotlin.Long | Primary Key | *one*
modelIds | modelIds | long | | kotlin.Long | Foreign Key | *many*




