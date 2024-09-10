# goods_feedback_comment_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор комментария к отзыву.  | 
**text** | **char \*** | Текст комментария. | 
**can_modify** | **int** | Может ли продавец изменять комментарий или удалять его. | [optional] 
**parent_id** | **long** | Идентификатор комментария к отзыву.  | [optional] 
**author** | [**goods_feedback_comment_author_dto_t**](goods_feedback_comment_author_dto.md) \* |  | 
**status** | **goods_feedback_comment_status_type_t \*** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


