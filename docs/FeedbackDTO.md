# ympa_r_client::FeedbackDTO

Отзыв пользователя Яндекс Маркета об указанном магазине.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор отзыва. | [optional] 
**createdAt** | **character** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**text** | **character** | Комментарий автора отзыва. | [optional] 
**state** | [**FeedbackStateType**](FeedbackStateType.md) |  | [optional] [Enum: ] 
**author** | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] 
**pro** | **character** | Достоинства магазина, описанные в отзыве. | [optional] 
**contra** | **character** | Недостатки магазина, описанные в отзыве. | [optional] 
**comments** | [**array[FeedbackCommentDTO]**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**shop** | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] 
**resolved** | **character** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**verified** | **character** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**recommend** | **character** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**grades** | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] 
**order** | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] 


