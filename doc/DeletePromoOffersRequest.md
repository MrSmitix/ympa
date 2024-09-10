# openapi.model.DeletePromoOffersRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promoId** | **String** | Идентификатор акции. | 
**deleteAllOffers** | **bool** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. | [optional] 
**offerIds** | **List<String>** | Товары, которые нужно убрать из акции. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


