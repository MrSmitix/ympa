

# GoodsFeedbackDTO

Отзыв о товаре.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbackId** | **Long** | Идентификатор отзыва.  | 
**createdAt** | **OffsetDateTime** | Дата и время создания отзыва. | 
**needReaction** | **Boolean** | Нужен ли ответ на отзыв. | 
**identifiers** | [**GoodsFeedbackIdentifiersDTO**](GoodsFeedbackIdentifiersDTO.md) |  | 
**author** | **String** | Имя автора отзыва. |  [optional]
**description** | [**GoodsFeedbackDescriptionDTO**](GoodsFeedbackDescriptionDTO.md) |  |  [optional]
**media** | [**GoodsFeedbackMediaDTO**](GoodsFeedbackMediaDTO.md) |  |  [optional]
**statistics** | [**GoodsFeedbackStatisticsDTO**](GoodsFeedbackStatisticsDTO.md) |  | 



