# openapi.model.GetQuarantineOffersRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **List<String>** | Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] [default to const []]
**cardStatuses** | [**List<OfferCardStatusType>**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] [default to const []]
**categoryIds** | **List<int>** | Фильтр по категориям на Маркете. | [optional] [default to const []]
**vendorNames** | **List<String>** | Фильтр по брендам. | [optional] [default to const []]
**tags** | **List<String>** | Фильтр по тегам. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


