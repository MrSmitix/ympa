# GoodsFeedbackDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_id** | **i64** | Идентификатор отзыва.  | 
**created_at** | **String** | Дата и время создания отзыва. | 
**need_reaction** | **bool** | Нужен ли ответ на отзыв. | 
**identifiers** | [**models::GoodsFeedbackIdentifiersDto**](GoodsFeedbackIdentifiersDTO.md) |  | 
**author** | Option<**String**> | Имя автора отзыва. | [optional]
**description** | Option<[**models::GoodsFeedbackDescriptionDto**](GoodsFeedbackDescriptionDTO.md)> |  | [optional]
**media** | Option<[**models::GoodsFeedbackMediaDto**](GoodsFeedbackMediaDTO.md)> |  | [optional]
**statistics** | [**models::GoodsFeedbackStatisticsDto**](GoodsFeedbackStatisticsDTO.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


