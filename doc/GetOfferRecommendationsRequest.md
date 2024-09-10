# openapi.model.GetOfferRecommendationsRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **List<String>** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] [default to const []]
**cofinancePriceFilter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**recommendedCofinancePriceFilter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**competitivenessFilter** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


