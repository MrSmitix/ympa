# get_goods_feedback_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_time_from** | **char \*** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] 
**date_time_to** | **char \*** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] 
**reaction_status** | **feedback_reaction_status_type_t \*** |  | [optional] 
**rating_values** | **list_t \*** | Оценка товара. | [optional] 
**model_ids** | **list_t \*** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] 
**paid** | **int** | Фильтр отзывов за баллы Плюса. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


