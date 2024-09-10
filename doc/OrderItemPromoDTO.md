# openapi.model.OrderItemPromoDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OrderPromoType**](OrderPromoType.md) |  | 
**discount** | **num** | Размер пользовательской скидки в валюте покупателя.  | [optional] 
**subsidy** | **num** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] 
**shopPromoId** | **String** | Идентификатор акции поставщика.  | [optional] 
**marketPromoId** | **String** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


