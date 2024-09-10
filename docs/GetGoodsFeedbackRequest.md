# GetGoodsFeedbackRequest

Фильтр запроса отзывов в кабинете. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_time_from** | **datetime** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] 
**date_time_to** | **datetime** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] 
**reaction_status** | [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] 
**rating_values** | **List[int]** | Оценка товара. | [optional] 
**model_ids** | **List[int]** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] 
**paid** | **bool** | Фильтр отзывов за баллы Плюса. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_goods_feedback_request import GetGoodsFeedbackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetGoodsFeedbackRequest from a JSON string
get_goods_feedback_request_instance = GetGoodsFeedbackRequest.from_json(json)
# print the JSON string representation of the object
print GetGoodsFeedbackRequest.to_json()

# convert the object into a dict
get_goods_feedback_request_dict = get_goods_feedback_request_instance.to_dict()
# create an instance of GetGoodsFeedbackRequest from a dict
get_goods_feedback_request_from_dict = GetGoodsFeedbackRequest.from_dict(get_goods_feedback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


