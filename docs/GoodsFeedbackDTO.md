# ympa_r_client::GoodsFeedbackDTO

Отзыв о товаре.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbackId** | **integer** | Идентификатор отзыва.  | 
**createdAt** | **character** | Дата и время создания отзыва. | 
**needReaction** | **character** | Нужен ли ответ на отзыв. | 
**identifiers** | [**GoodsFeedbackIdentifiersDTO**](GoodsFeedbackIdentifiersDTO.md) |  | 
**author** | **character** | Имя автора отзыва. | [optional] 
**description** | [**GoodsFeedbackDescriptionDTO**](GoodsFeedbackDescriptionDTO.md) |  | [optional] 
**media** | [**GoodsFeedbackMediaDTO**](GoodsFeedbackMediaDTO.md) |  | [optional] 
**statistics** | [**GoodsFeedbackStatisticsDTO**](GoodsFeedbackStatisticsDTO.md) |  | 


