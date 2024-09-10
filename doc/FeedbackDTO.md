# openapi.model.FeedbackDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отзыва. | [optional] 
**createdAt** | [**DateTime**](DateTime.md) | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional] 
**text** | **String** | Комментарий автора отзыва. | [optional] 
**state** | [**FeedbackStateType**](FeedbackStateType.md) |  | [optional] 
**author** | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] 
**pro** | **String** | Достоинства магазина, описанные в отзыве. | [optional] 
**contra** | **String** | Недостатки магазина, описанные в отзыве. | [optional] 
**comments** | [**List<FeedbackCommentDTO>**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | [default to const []]
**shop** | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] 
**resolved** | **bool** | Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**verified** | **bool** | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  | [optional] 
**recommend** | **bool** | Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  | [optional] 
**grades** | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] 
**order** | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


