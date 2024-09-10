# FeedbackDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор отзыва. | [optional] [default to None]
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional] [default to None]
**text** | **String** | Комментарий автора отзыва. | [optional] [default to None]
**state** | [***models::FeedbackStateType**](FeedbackStateType.md) |  | [optional] [default to None]
**author** | [***models::FeedbackAuthorDto**](FeedbackAuthorDTO.md) |  | [optional] [default to None]
**pro** | **String** | Достоинства магазина, описанные в отзыве. | [optional] [default to None]
**contra** | **String** | Недостатки магазина, описанные в отзыве. | [optional] [default to None]
**comments** | [**Vec<models::FeedbackCommentDto>**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**shop** | [***models::FeedbackShopDto**](FeedbackShopDTO.md) |  | [optional] [default to None]
**resolved** | **bool** | Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] [default to None]
**verified** | **bool** | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  | [optional] [default to None]
**recommend** | **bool** | Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  | [optional] [default to None]
**grades** | [***models::FeedbackGradesDto**](FeedbackGradesDTO.md) |  | [optional] [default to None]
**order** | [***models::FeedbackOrderDto**](FeedbackOrderDTO.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


