# GET_GOODS_FEEDBACK_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_time_from** | [**DATE_TIME**](DATE_TIME.md) | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] [default to null]
**date_time_to** | [**DATE_TIME**](DATE_TIME.md) | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] [default to null]
**reaction_status** | [**FEEDBACK_REACTION_STATUS_TYPE**](FeedbackReactionStatusType.md) |  | [optional] [default to null]
**rating_values** | **LIST [INTEGER_32]** | Оценка товара. | [optional] [default to null]
**model_ids** | **LIST [INTEGER_64]** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] [default to null]
**paid** | **BOOLEAN** | Фильтр отзывов за баллы Плюса. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


