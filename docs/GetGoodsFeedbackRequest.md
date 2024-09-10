# OpenapiClient::GetGoodsFeedbackRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date_time_from** | **Time** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] |
| **date_time_to** | **Time** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] |
| **reaction_status** | [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] |
| **rating_values** | **Array&lt;Integer&gt;** | Оценка товара. | [optional] |
| **model_ids** | **Array&lt;Integer&gt;** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] |
| **paid** | **Boolean** | Фильтр отзывов за баллы Плюса. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetGoodsFeedbackRequest.new(
  date_time_from: null,
  date_time_to: null,
  reaction_status: null,
  rating_values: null,
  model_ids: null,
  paid: null
)
```

