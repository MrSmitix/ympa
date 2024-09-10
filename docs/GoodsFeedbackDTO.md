# WWW::OpenAPIClient::Object::GoodsFeedbackDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GoodsFeedbackDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_id** | **int** | Идентификатор отзыва.  | 
**created_at** | **DATE_TIME** | Дата и время создания отзыва. | 
**need_reaction** | **boolean** | Нужен ли ответ на отзыв. | 
**identifiers** | [**GoodsFeedbackIdentifiersDTO**](GoodsFeedbackIdentifiersDTO.md) |  | 
**author** | **string** | Имя автора отзыва. | [optional] 
**description** | [**GoodsFeedbackDescriptionDTO**](GoodsFeedbackDescriptionDTO.md) |  | [optional] 
**media** | [**GoodsFeedbackMediaDTO**](GoodsFeedbackMediaDTO.md) |  | [optional] 
**statistics** | [**GoodsFeedbackStatisticsDTO**](GoodsFeedbackStatisticsDTO.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


