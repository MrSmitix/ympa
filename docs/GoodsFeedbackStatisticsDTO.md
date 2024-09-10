
# Table `GoodsFeedbackStatisticsDTO`
(mapped from: GoodsFeedbackStatisticsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rating** | rating | int UNSIGNED NOT NULL |  | **kotlin.Int** | Оценка товара. | 
**commentsCount** | commentsCount | long NOT NULL |  | **kotlin.Long** | Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  | 
**recommended** | recommended | boolean |  | **kotlin.Boolean** | Рекомендуют ли этот товар. |  [optional]
**paidAmount** | paidAmount | long |  | **kotlin.Long** | Количество баллов Плюса, которое автор получил за отзыв. |  [optional]






