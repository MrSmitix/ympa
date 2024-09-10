
# Table `GoodsFeedbackDTO`
(mapped from: GoodsFeedbackDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**feedbackId** | feedbackId | long NOT NULL |  | **kotlin.Long** | Идентификатор отзыва.  | 
**createdAt** | createdAt | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время создания отзыва. | 
**needReaction** | needReaction | boolean NOT NULL |  | **kotlin.Boolean** | Нужен ли ответ на отзыв. | 
**identifiers** | identifiers | long NOT NULL |  | [**GoodsFeedbackIdentifiersDTO**](GoodsFeedbackIdentifiersDTO.md) |  |  [foreignkey]
**statistics** | statistics | long NOT NULL |  | [**GoodsFeedbackStatisticsDTO**](GoodsFeedbackStatisticsDTO.md) |  |  [foreignkey]
**author** | author | text |  | **kotlin.String** | Имя автора отзыва. |  [optional]
**description** | description | long |  | [**GoodsFeedbackDescriptionDTO**](GoodsFeedbackDescriptionDTO.md) |  |  [optional] [foreignkey]
**media** | media | long |  | [**GoodsFeedbackMediaDTO**](GoodsFeedbackMediaDTO.md) |  |  [optional] [foreignkey]










