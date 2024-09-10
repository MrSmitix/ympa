# feedback_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор отзыва. | [optional] 
**created_at** | **char \*** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**text** | **char \*** | Комментарий автора отзыва. | [optional] 
**state** | **feedback_state_type_t \*** |  | [optional] 
**author** | [**feedback_author_dto_t**](feedback_author_dto.md) \* |  | [optional] 
**pro** | **char \*** | Достоинства магазина, описанные в отзыве. | [optional] 
**contra** | **char \*** | Недостатки магазина, описанные в отзыве. | [optional] 
**comments** | [**list_t**](feedback_comment_dto.md) \* | Переписка автора отзыва с магазином. | 
**shop** | [**feedback_shop_dto_t**](feedback_shop_dto.md) \* |  | [optional] 
**resolved** | **int** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**verified** | **int** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**recommend** | **int** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**grades** | [**feedback_grades_dto_t**](feedback_grades_dto.md) \* |  | [optional] 
**order** | [**feedback_order_dto_t**](feedback_order_dto.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


