# FeedbackDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор отзыва. | [optional]
**created_at** | Option<**String**> | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional]
**text** | Option<**String**> | Комментарий автора отзыва. | [optional]
**state** | Option<[**models::FeedbackStateType**](FeedbackStateType.md)> |  | [optional]
**author** | Option<[**models::FeedbackAuthorDto**](FeedbackAuthorDTO.md)> |  | [optional]
**pro** | Option<**String**> | Достоинства магазина, описанные в отзыве. | [optional]
**contra** | Option<**String**> | Недостатки магазина, описанные в отзыве. | [optional]
**comments** | [**Vec<models::FeedbackCommentDto>**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**shop** | Option<[**models::FeedbackShopDto**](FeedbackShopDTO.md)> |  | [optional]
**resolved** | Option<**bool**> | Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional]
**verified** | Option<**bool**> | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  | [optional]
**recommend** | Option<**bool**> | Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  | [optional]
**grades** | Option<[**models::FeedbackGradesDto**](FeedbackGradesDTO.md)> |  | [optional]
**order** | Option<[**models::FeedbackOrderDto**](FeedbackOrderDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


