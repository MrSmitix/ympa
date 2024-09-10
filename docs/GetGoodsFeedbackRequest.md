# WWW::OpenAPIClient::Object::GetGoodsFeedbackRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetGoodsFeedbackRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_time_from** | **DATE_TIME** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] 
**date_time_to** | **DATE_TIME** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] 
**reaction_status** | [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] 
**rating_values** | **ARRAY[int]** | Оценка товара. | [optional] 
**model_ids** | **ARRAY[int]** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] 
**paid** | **boolean** | Фильтр отзывов за баллы Плюса. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


