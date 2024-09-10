# GoodsFeedbackDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_id** | **i64** | Идентификатор отзыва.  | 
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время создания отзыва. | 
**need_reaction** | **bool** | Нужен ли ответ на отзыв. | 
**identifiers** | [***models::GoodsFeedbackIdentifiersDto**](GoodsFeedbackIdentifiersDTO.md) |  | 
**author** | **String** | Имя автора отзыва. | [optional] [default to None]
**description** | [***models::GoodsFeedbackDescriptionDto**](GoodsFeedbackDescriptionDTO.md) |  | [optional] [default to None]
**media** | [***models::GoodsFeedbackMediaDto**](GoodsFeedbackMediaDTO.md) |  | [optional] [default to None]
**statistics** | [***models::GoodsFeedbackStatisticsDto**](GoodsFeedbackStatisticsDTO.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


