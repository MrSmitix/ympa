# GetGoodsFeedbackRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_time_from** | Option<**String**> | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  | [optional]
**date_time_to** | Option<**String**> | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional]
**reaction_status** | Option<[**models::FeedbackReactionStatusType**](FeedbackReactionStatusType.md)> |  | [optional]
**rating_values** | Option<**Vec<i32>**> | Оценка товара. | [optional]
**model_ids** | Option<**Vec<i64>**> | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional]
**paid** | Option<**bool**> | Фильтр отзывов за баллы Плюса. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


