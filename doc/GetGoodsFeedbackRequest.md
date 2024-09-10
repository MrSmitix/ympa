# openapi.model.GetGoodsFeedbackRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTimeFrom** | [**DateTime**](DateTime.md) | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  | [optional] 
**dateTimeTo** | [**DateTime**](DateTime.md) | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] 
**reactionStatus** | [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] 
**ratingValues** | **Set<int>** | Оценка товара. | [optional] [default to const {}]
**modelIds** | **Set<int>** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] [default to const {}]
**paid** | **bool** | Фильтр отзывов за баллы Плюса. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


