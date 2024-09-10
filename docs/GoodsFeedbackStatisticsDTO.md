# ympa_r_client::GoodsFeedbackStatisticsDTO

Статистическая информация по отзыву.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rating** | **integer** | Оценка товара. | [Max: 5] [Min: 1] 
**commentsCount** | **integer** | Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  | 
**recommended** | **character** | Рекомендуют ли этот товар. | [optional] 
**paidAmount** | **integer** | Количество баллов Плюса, которое автор получил за отзыв. | [optional] 


