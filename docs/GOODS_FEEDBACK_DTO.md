# GOODS_FEEDBACK_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_id** | **INTEGER_64** | Идентификатор отзыва.  | [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Дата и время создания отзыва. | [default to null]
**need_reaction** | **BOOLEAN** | Нужен ли ответ на отзыв. | [default to null]
**identifiers** | [**GOODS_FEEDBACK_IDENTIFIERS_DTO**](GoodsFeedbackIdentifiersDTO.md) |  | [default to null]
**author** | [**STRING_32**](STRING_32.md) | Имя автора отзыва. | [optional] [default to null]
**description** | [**GOODS_FEEDBACK_DESCRIPTION_DTO**](GoodsFeedbackDescriptionDTO.md) |  | [optional] [default to null]
**media** | [**GOODS_FEEDBACK_MEDIA_DTO**](GoodsFeedbackMediaDTO.md) |  | [optional] [default to null]
**statistics** | [**GOODS_FEEDBACK_STATISTICS_DTO**](GoodsFeedbackStatisticsDTO.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


