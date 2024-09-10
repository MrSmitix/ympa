# openapi.model.GetCampaignOffersRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **List<String>** | Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     | [optional] [default to const []]
**statuses** | [**List<OfferCampaignStatusType>**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] [default to const []]
**categoryIds** | **List<int>** | Фильтр по категориям на Маркете. | [optional] [default to const []]
**vendorNames** | **List<String>** | Фильтр по брендам. | [optional] [default to const []]
**tags** | **List<String>** | Фильтр по тегам. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


